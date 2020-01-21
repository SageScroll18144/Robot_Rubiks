package cube.user;

import java.util.Scanner;

public class Emulador {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("***EMULADOR DO CUBO MÁGICO!***\nInforme 1-Linguagem do Computador ou 2-Notação de Cubo Mágico.: ");
		String answer = s.nextLine();
		
		System.out.print("Informe o movimento.: ");
		String input;
		
		while(!"end".equals(input = s.nextLine())) {

			System.out.println(input);
			
		}

	}
	
}
