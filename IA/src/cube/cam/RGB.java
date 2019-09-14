package cube.cam;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class RGB {
	private static int[][] cubo = new int[6][9];
	
	public static void rgb(BufferedImage image, int face) throws IOException {
		/*
		 * IR NO LAB PEGAR A CAMERA E ANALIZAR O RETORNO DO MÉTODO RGB E ESCREVER UM 'IF ELSE' OU UM 'SWITCH CASE' 
		 * 
		 */
		//leitura rgb da imagem	
		int x = 0;
		Color color; 
		//image.getSubimage(0, image.getHeight(), (temos que definir), image.getHeight()); a imagem passar a ser agora essa subimagem!
		while(x<cubo[face].length) {
			for (int i = image.getHeight()/6; i <= image.getHeight(); i+=image.getHeight()/3) {
				for (int j = image.getWidth()/6; j <= image.getWidth(); j+=image.getWidth()/3) {
					color = new Color(image.getRGB(i, j));
					String hex = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());	
					if (hex.equals("")) {cubo[face][x] = 0;}
					else if (hex.equals("")) {cubo[face][x] = 1;}
					else if (hex.equals("")) {cubo[face][x] = 2;}
					else if (hex.equals("")) {cubo[face][x] = 3;}
					else if (hex.equals("")) {cubo[face][x] = 4;}
					else if (hex.equals("")) {cubo[face][x] = 5;}
					x++;
				}
			}
		}
	}
	public static int[][] retorno(){return cubo;}
}