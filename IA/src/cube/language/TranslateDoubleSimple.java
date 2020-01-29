package cube.language;

import cube.move.Movimento;

public class TranslateDoubleSimple {

	private Movimento m;
	private Translate ts = new Translate();

	public TranslateDoubleSimple(Movimento m) {
		this.m = m;
	}
	
	public void cases(String input) {
		if(ts.getTranslationToComputer(input).charAt(1) == 'R'){
			m.spinRightFront(Character.getNumericValue(ts.getTranslationToComputer(input).charAt(0)));
		}else if(ts.getTranslationToComputer(input).charAt(1) == 'L') {
			m.spinLeftBack(Character.getNumericValue(ts.getTranslationToComputer(input).charAt(0)));
		}
	}
	
}
