package cube.language;

import cube.move.Movimento;

public class TranslateCompound {
	
	Movimento c;
	
	public TranslateCompound(Movimento c) {
		this.c = c;
	}
	
	public void cases(String input) {
		switch (input) {
		case "x":
			c.moveAxisXPositive();
			break;
		case "x'":
			c.moveAxisXNegative();
		default:
			break;
		}
	}
}
