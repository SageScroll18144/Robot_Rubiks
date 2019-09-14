package cube.cam;

import java.awt.Color;
import  java.awt.image.BufferedImage ;
import  java.io.File ;
import  java.io.IOException ;

import  javax.imageio.ImageIO ;
import javax.swing.JFrame;

import  com.github.sarxos.webcam.Webcam ;


public  class  Camera {
	
	public Camera() throws IOException{
		JFrame frame = new JFrame("Camera do robo");
		frame.setVisible(true);
		
	}

	public static void main(String [] args) throws IOException {

		new Camera();
		
	}
}