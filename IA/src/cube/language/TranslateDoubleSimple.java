package cube.language;

import cube.move.Movimento;

public class TranslateDoubleSimple {

	private Movimento m;
	private Translate ts = new Translate();
	private String input = null;
	private static String[] languageCube = {"B'", "L", "U'", "R'", "F", "D", "B", "L'", "U", "R", "F'", "D'"};
	
	public TranslateDoubleSimple(Movimento m) {
		this.m = m;
	}
	
	public void cases(String inputs) {
		if(inputs.length() < 3) {
			input = String.valueOf(inputs.charAt(0));
		}else {
			input = String.valueOf(inputs.charAt(0)) + String.valueOf(inputs.charAt(2));
		}
		if(ts.getTranslationToComputer(languageCube[buscaBruta(input)]).charAt(1) == 'R'){
			m.spinRightFront(Character.getNumericValue(ts.getTranslationToComputer(languageCube[buscaBruta(input)]).charAt(0)));
			m.spinRightFront(Character.getNumericValue(ts.getTranslationToComputer(languageCube[buscaBruta(input)]).charAt(0)));
		}else if(ts.getTranslationToComputer(languageCube[buscaBruta(input)]).charAt(1) == 'L') {
			m.spinLeftBack(Character.getNumericValue(ts.getTranslationToComputer(languageCube[buscaBruta(input)]).charAt(0)));
			m.spinLeftBack(Character.getNumericValue(ts.getTranslationToComputer(languageCube[buscaBruta(input)]).charAt(0)));
		}
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
