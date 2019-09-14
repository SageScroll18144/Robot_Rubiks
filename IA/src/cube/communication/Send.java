package cube.communication;

import java.util.ArrayList;

import jssc.SerialPort;
import jssc.SerialPortException;

public class Send {
	public static void send(ArrayList<String> moves, String porta) throws SerialPortException{    
        
		SerialPort serialPort = new SerialPort(porta);
        serialPort.openPort();
        serialPort.setParams(SerialPort.BAUDRATE_9600, 
                             SerialPort.DATABITS_8,
                             SerialPort.STOPBITS_1,
                             SerialPort.PARITY_NONE);
       
        int count = 0;
        String read = "f";
        while(true) {
        	read  = serialPort.readString();
        	if(count == 0) {
        		read = "1";
        	}
        	else if(count >= moves.size()) {
        		break;
        	}
        	
        	System.out.println(read);
        	if(read.equals("1")) {
        		serialPort.writeString(moves.get(count));
        		System.out.println(moves.get(count));
        		count++;
        		read = "6";
        	}
        }
        System.out.println("end");
        serialPort.closePort();
        
	}
}