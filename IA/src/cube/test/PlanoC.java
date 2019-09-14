package cube.test;

import java.util.Scanner;

import cube.move.Movimento;

public class PlanoC {

	public static void main(String[] args) {
		int[][] cubo = new int[6][9];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < cubo.length; i++) {
			System.out.println("Digite os elementos da face " + i);
			for (int j = 0; j < cubo[i].length; j+=3) {
				String[] input = s.nextLine().split(" ");
				for (int j2 = 0; j2 < input.length; j2++) {
					for (String is : input) {
						cubo[i][j+j2] = Integer.parseInt(is);
					}
				}
			}
		}
		Movimento f = new Movimento(cubo);
		f.print();
	}

}
