package cube.user;

import java.util.Scanner;

import cube.move.Movimento;
import cube.language.TranslateCompound;
import cube.language.TranslateDoubleSimple;
import cube.language.Translate;

public class Emulador {
	
	private static String[] languageCube = {"B'", "L", "U'", "R'", "F", "D", "B", "L'", "U", "R", "F'", "D'"};
	
	public static void main(String[] args) {
		
		int[][] cube = {{0,0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1,1},{2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3},{4,4,4,4,4,4,4,4,4},{5,5,5,5,5,5,5,5,5}};  
		
		Movimento m = new Movimento(cube);
		TranslateCompound t = new TranslateCompound(m);
		Translate ts = new Translate();
		TranslateDoubleSimple tds = new TranslateDoubleSimple(m);
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
						m.spinLeftBack(Character.getNumericValue(input.charAt(0)));
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
				if(input.length() > 1 && input.charAt(1) == '2') {
					tds.cases(input);
				}
				else if(input.charAt(0) == 'x' || input.charAt(0) == 'y' || input.charAt(0) == 'z' || input.charAt(0) == 'M' || input.charAt(0) == 'S' ||input.charAt(0) == 'E' || (input.length() > 1 && input.charAt(1) == 'w')) {
					t.cases(input);
				}else if(ts.getTranslationToComputer(languageCube[buscaBruta(input)]).charAt(1) == 'R'){
					m.spinRightFront(Character.getNumericValue(ts.getTranslationToComputer(languageCube[buscaBruta(input)]).charAt(0)));
				}else if(ts.getTranslationToComputer(languageCube[buscaBruta(input)]).charAt(1) == 'L') {
					m.spinLeftBack(Character.getNumericValue(ts.getTranslationToComputer(languageCube[buscaBruta(input)]).charAt(0)));
				}
				m.print();
				System.out.print("Informe o movimento ou 'end' como valor para sair do programa.: ");
			}
		}else {
			System.err.println("\nVALOR FORA DO BLOCO LÓGICO");
		}
		s.close();
		System.out.println(m.getMove());
	}
	private static int buscaBruta(String x) {
		int y = -1;
		for (int i = 0; i < languageCube.length; i++) {
			if(languageCube[i].equals(x)) {
				y = i;
				break;
			}
		}
		return y;
	}
}
