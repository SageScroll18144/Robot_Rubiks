package cube.IA;

import java.io.IOException;
import java.util.Scanner;

import cube.communication.Writer;
import cube.move.Movimento;

public class CasosEspeciais {

	public static void main(String[] args) throws IOException {
		//Adição
		int[][] cubo = new int[6][9];
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < cubo.length; i++) {
			System.out.println("Digite os elementos da face " + i);
			for (int j = 0; j < cubo[i].length; j+=3) {
				String[] input = s.nextLine().split(" ");
				for (int j2 = 0; j2 < input.length; j2++) {
					for (String is : input) {
						cubo[i][j+j2] = Integer.parseInt(is);
					}
				}
			}
		}
		
		//introduz a lista capturada na classe Movimento
		Movimento c = new Movimento(cubo);
		
		if (Xadrez(cubo) == true) {
			System.out.println("Xadrez!\n");
			for (int i = 0; i < 3; i++) {
		      	c.spinRightFront(2);
		        c.spinRightFront(5);
		        c.spinRightFront(1);
		        c.spinRightFront(3);    	
			}
		}
		else if(Meios(cubo) == true){
			System.out.println("Meios!\n");
			c.spinRightFront(1);
			c.spinRightFront(3);
			c.spinRightFront(5);
			c.spinRightFront(2);
			c.spinLeftBack(0);
			c.spinLeftBack(4);
			c.spinRightFront(1);
			c.spinRightFront(3);
		}
		else if(ZigZag(cubo) ==  true) {
			System.out.println("Zig-Zag!\n");
			for (int i = 0; i < 3; i++) {
				c.spinLeftBack(4);
				c.spinRightFront(0);
				c.spinLeftBack(1);
				c.spinRightFront(3);
			}
		}
		else {
			System.out.println("NÃO É NENHUM DOS CASOS CITADOS\n");
		}
		
		c.print();
		System.out.println();
		System.out.println(c.getMove());
		Writer.writer(c.getMove());
	}
	
	
	private static boolean Xadrez(int[][] cubo) {
		boolean retorno = true;
		int j = 0;
		for (int i  = 3; i < cubo[4].length; i+=2, j+=2) {
			if(cubo[4][i] == cubo[4][1] && cubo[4][j] != cubo[4][1] && cubo[4][j] != cubo[4][0]) {
				retorno = true;
			}
			else {
				retorno = false;
				break;
			}
		}
		
		return retorno;
	}
	private static boolean Meios(int[][] cubo) {
		boolean retorno = true;
		if(cubo[4][0] != cubo[4][4]) {
			for (int i = 0; i < cubo[4].length; i++) {
				if(i == 4) {continue;}
				else if(cubo[4][0] != cubo[4][i]) {
					retorno = false;
					break;
				}
			}
		}else {
			retorno = false;
		}
		return retorno;
	}
	private static boolean ZigZag(int[][] cubo) {
		boolean retorno = false;
		int[] order = {1,3,5,7,8};
		int i = 4;
		int j = 0;
		while(true) {
			if(j>=cubo[4].length) {break;}
			if(cubo[4][0] == cubo[4][order[j]] && cubo[4][2] == cubo[4][i] && cubo[4][order[j]] != cubo[4][i]) {
				retorno = true;
			}
			else {
				retorno = false;
				break;
			}
			j++;
			i+=2;
		}
		return retorno;
	}
	
}