package cube.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

public class CamReturn {
	 public static void main(String[] args) throws IOException {
		 //BufferedImage image = ImageIO.read(new File("/home/felipe/Documentos/MEU PC/Camera/cubo.jpeg"));
		 Webcam webcam = Webcam.getDefault(); 
		 System.out.println(Webcam.getWebcams());
		 webcam.open();
		 BufferedImage image = webcam.getImage();
		 
		 image  = image.getSubimage((int)(image.getWidth() - image.getWidth()/1.25), 0, (int) (image.getWidth()/1.25), image.getHeight()); 
		 image = imageGrayScale(image);
		 
		 ImageIO.write(image, "PNG", new File("debug.png"));
		 System.out.println(image.getHeight());
		 System.out.println(image.getWidth());
		 Color cor;
		// Color text;
		 float[] hsb = new float[3];
		 float sum = 0;
		 for (int i = image.getHeight()/6; i < image.getHeight(); i+= image.getHeight()/3) {
			 for (int j = image.getWidth()/6; j < image.getWidth(); j+= image.getWidth()/3) {
				 sum = 0;
				 cor = new Color(image.getRGB(j,i));
				 hsb = Color.RGBtoHSB(cor.getRed(), cor.getGreen(), cor.getBlue(), hsb);
				 for (int j2 = 0; j2 < hsb.length; j2++) {sum+=hsb[j2];}
				// String hex = String.format("#%02x%02x%02x", cor.getRed(), cor.getGreen(), cor.getBlue());	
				 //text = Color.getColor(hex);
				 System.out.println(cor.getBlue()*0.114+cor.getGreen()*0.587+cor.getRed()*0.299);
				 System.out.println();
				// System.out.println(sum/3);
				 //System.out.println(hex);
				 //System.out.println(text);
			 }
		 }
		 
		 
		 //String colorS = Integer.toString(image.getRGB(0,0));
		 //System.out.println(colorS);
		 
	}
	private static final String name(int rgb) {
		 String retorno = null;
		 if(rgb>=155 && rgb<=249) {retorno = "red";}
		 else if(rgb>=250 && rgb<=400) {retorno = "orange";}
		 else if(rgb>=369 && rgb<=470) {retorno = "yellow";}
		 else if(rgb>=369 && rgb<=470) {retorno = "green";}
		 else if(rgb>=35 && rgb<=104) {retorno = "blue";}
		 else if(rgb>=530 && rgb<=739) {retorno = "white";}
		 return retorno;
	 }
	private static BufferedImage imageGrayScale(BufferedImage image) {
		BufferedImage imageGray = new BufferedImage(image.getWidth(), image.getHeight(),BufferedImage.TYPE_BYTE_GRAY);  
		Graphics g = imageGray.getGraphics();  
		g.drawImage(image, 0, 0, null);  
		g.dispose();
		return imageGray;
	}
}
