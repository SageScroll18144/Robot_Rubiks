package cube.IA;

import java.io.IOException;

//import cube.communication.Send;
import cube.communication.Writer;
import cube.move.Movimento;

public class Xadrez {

	public static void main(String[] args) throws IOException {
		int[][] cubo = {{0,0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1,1},{2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3},{4,4,4,4,4,4,4,4,4},{5,5,5,5,5,5,5,5,5}};      
		Movimento c = new Movimento(cubo);

		c.spinLeftBack(4);
		c.spinRightFront(0);
		c.spinLeftBack(1);
		c.spinRightFront(3);
		c.spinLeftBack(4);
		c.spinRightFront(0);
		c.spinLeftBack(1);
		c.spinRightFront(3);
		c.spinLeftBack(4);
		c.spinRightFront(0);
		c.spinLeftBack(1);
		c.spinRightFront(3);
	
		//Send.Listports();

		//Send.send(c.getMove(), "/dev/ttyUSB0");//ENVIA A SEQUENCIA DOS MOVIMENTOS
		Writer.writer(c.getMove());
		System.out.println("Enviado!");
	
	}	
	
}