package cube.test;

import java.io.IOException;

import cube.communication.Send;
import cube.move.Movimento;
import jssc.SerialPortException;

public class Horario {
	public static void main(String[] args) throws IOException, SerialPortException {
		 int[][] cubo = {{0,0,0,
			 			  0,0,9,
			 			  0,0,0},{1,1,1,
			 				      1,1,9,
			 				      1,1,1},			 {2,2,2,
			 				  						  2,2,9,
			 				  						  2,2,2},{3,3,3,
			 				  							      3,3,9,
			 				  							      3,3,3},
				 																			 {4,4,4
			 				  																 ,4,4,9,
			 				  																  4,4,4},
				 																			 
				 																			 {5,5,5,
			 				  																  5,5,9,
			 				  																  5,5,5}};  
	       Movimento c = new Movimento(cubo);
	    c.print();
		c.moveAxisY();
		c.print();
		//c.spinRightFront(1);
		//c.spinLeftBack(3);
		//c.spinRightFront(2);
		//c.spinRightFront(0);
		//c.print();
		//Send.send(c.getMove(), "/dev/ttyUSB0");
		//Send.Listports();
	}
}
