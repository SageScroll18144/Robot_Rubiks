package cube.language;

import cube.move.Movimento;

public class TranslateDoubleSimple {

	private Movimento m;
	private Translate ts = new Translate();

	public TranslateDoubleSimple(Movimento m) {
		this.m = m;
	}
	
	public void cases(String input) {
		if(input.length() < 3) {
			if(ts.getTranslationToComputer(String.valueOf(input.charAt(0))).charAt(1) == 'R'){
				m.spinRightFront(Character.getNumericValue(ts.getTranslationToComputer(String.valueOf(input.charAt(0))).charAt(0)));
				m.spinRightFront(Character.getNumericValue(ts.getTranslationToComputer(String.valueOf(input.charAt(0))).charAt(0)));
			}else if(ts.getTranslationToComputer(String.valueOf(input.charAt(0))).charAt(1) == 'L') {
				m.spinLeftBack(Character.getNumericValue(ts.getTranslationToComputer(String.valueOf(input.charAt(0))).charAt(0)));
				m.spinLeftBack(Character.getNumericValue(ts.getTranslationToComputer(String.valueOf(input.charAt(0))).charAt(0)));
			}
		}else {
			if(ts.getTranslationToComputer(String.valueOf(input.charAt(0)+(input.charAt(2)))).charAt(1) == 'R'){
				m.spinRightFront(Character.getNumericValue(ts.getTranslationToComputer(String.valueOf(input.charAt(0)+(input.charAt(2)))).charAt(0)));
				m.spinRightFront(Character.getNumericValue(ts.getTranslationToComputer(String.valueOf(input.charAt(0)+(input.charAt(2)))).charAt(0)));
			}else if(ts.getTranslationToComputer(String.valueOf(input.charAt(0)+(input.charAt(2)))).charAt(1) == 'L') {
				m.spinLeftBack(Character.getNumericValue(ts.getTranslationToComputer(String.valueOf(input.charAt(0)+(input.charAt(2)))).charAt(0)));
				m.spinLeftBack(Character.getNumericValue(ts.getTranslationToComputer(String.valueOf(input.charAt(0)+(input.charAt(2)))).charAt(0)));
			}
		}
	}
	
}
