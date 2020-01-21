package cube.user;

import java.util.Scanner;

import cube.move.Movimento;
import cube.language.TranslateCompound;

public class Emulador {

	public static void main(String[] args) {
		
		int[][] cube = {{0,0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1,1},{2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3},{4,4,4,4,4,4,4,4,4},{5,5,5,5,5,5,5,5,5}};  
	        
		Movimento m = new Movimento(cube);
		TranslateCompound t = new TranslateCompound(m);
		Scanner s = new Scanner(System.in);
		
		System.out.print("***EMULADOR DO CUBO MÁGICO!***\nInforme 1-Linguagem do Computador ou 2-Notação de Cubo Mágico.: ");
		String answer = s.nextLine();
		
		m.print();		
		System.out.print("Informe o movimento ou 'end' como valor para sair do programa.: ");
		
		String input;
		
		if(answer.equals("1")) {
			while(!"end".equals(input = s.nextLine())) {
				if(Character.isDigit(input.charAt(0))) {
					if(input.charAt(1) == 'R') {
						m.spinRightFront(Character.getNumericValue(input.charAt(0)));
					}else if(input.charAt(1) == 'L') {
						m.spinRightFront(Character.getNumericValue(input.charAt(0)));
					}
				}
				else {
					t.cases(input);
				}
				m.print();
				System.out.print("Informe o movimento ou 'end' como valor para sair do programa.: ");		
			}
		}else if(answer.equals("2")) {
			while(!"end".equals(input = s.nextLine())) {
				
				System.out.println(input);
				System.out.print("Informe o movimento ou 'end' como valor para sair do programa.: ");
			}
		}else {
			System.err.println("Valor fora do bloco lógico");
		}
		
		System.out.println(m.getMove());
	}
	
}
