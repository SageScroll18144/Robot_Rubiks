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
			break;

		case "y":
			c.moveAxisYPositive();
			break;
		case "y'":
			c.moveAxisYNegative();
			break;
			
		case "z":
			c.moveAxisZPositive();
			break;
		case "z'":
			c.moveAxisZNegative();
			break;
			
		case "Rw":
			c.moveRw();
			break;
		case "Rw'":
			c.moveRwNegative();
			break;
		case "Rw2":
			c.moveRw2();
			break;
			
		case "Lw":
			c.moveLw();
			break;
		case "Lw'":
			c.moveLwNegative();
			break;
		case "Lw2":
			c.moveLw2();
			break;
			
		case "Uw":
			c.moveUw();
			break;
		case "Uw'":
			c.moveUwNegative();
			break;
		case "Uw2":
			c.moveUw2();
			break;
			
		case "Dw":
			c.moveDw();
			break;
		case "Dw'":
			c.moveDwNegative();
			break;
		case "Dw2":
			c.moveDw2();
			break;
			
		case "Fw":
			c.moveFw();
			break;
		case "Fw'":
			c.moveFwNegative();
			break;
		case "Fw2":
			c.moveFw2();
			break;
			
		case "Bw":
			c.moveBw();
			break;
		case "Bw'":
			c.moveBwNegative();
			break;
		case "Bw2":
			c.moveBw2();
			break;
			
		case "M":
			c.moveM();
			break;
		case "M'":
			c.moveMNegative();
			break;
		case "S":
			c.moveS();
			break;
		case "S'":
			c.moveSNegative();
			break;
			
		case "E":
			c.moveE();
			break;
		case "E'":
			c.moveENegative();
			break;
		}
	}
}
