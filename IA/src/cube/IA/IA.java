package cube.IA;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.github.sarxos.webcam.Webcam;

import cube.cam.RGB;
import cube.communication.ArduinoSerial;
import cube.move.Movimento;

public class IA {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {	
		System.out.println("**\t\t\t\t\t\t\t**\nDigite o número da face a ser lida\n caso queira finalizar a operação digite 'finish'\n e para sair do programa digite 'exit'.");
		System.out.println("input:\t");
		// pegue a webcam padrão e abra-a
		Webcam webcam =  Webcam.getDefault();
		webcam.open();
		String write;
		Scanner s = new Scanner(System.in);
		while(!"finish".matches(write = "(?i)"+s.nextLine())||!"exit".matches(write = "(?i)"+s.nextLine())) {
			//obter imagem
			BufferedImage image = webcam.getImage();
			RGB.rgb(image, Integer.parseInt(write));
		}
		if(write.matches("(?i)exit")){System.exit(0);}//sai do programa caso a String write for igual a exit
		
		//I.A
		Movimento c = new Movimento(RGB.retorno());
		//DESENVOLVER A I.A
		c.spinLeftBack(0);
		
		
		
		
		
		
		
		
		
		send(c.getMove());//ENVIA A SEQUENCIA DOS MOVIMENTOS
	}
	
	private static void send(ArrayList<String> move) {
		ArduinoSerial arduino = new ArduinoSerial("/dev/ttyUSB0");//configura a porta
		arduino.initialize();
		arduino.send(String.valueOf(move.size()));
		for (int i = 0; i < move.size(); i++) {
			arduino.send(move.get(i));//envia para o arduino
		}
		arduino.send("end");
	}
}
