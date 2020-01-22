package cube.test;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cube.language.Translate;

public class traducao {

	private static String[] k =  {"B'", "L", "U'", "R'", "F", "D", "B", "L'", "U", "R", "F'", "D'"};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Translate t = new Translate();
		Scanner s = new Scanner(System.in);
	//	System.out.println(1);
	//	String f = JOptionPane.showInputDialog("hioho");
		String a = s.nextLine();
		s.close();
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String g = br.readLine();
	//	Console console = System.console();
	//	String a = console.readLine();
		
		ArrayList<String> list = new ArrayList<>();
		list.add(a);
		//System.out.println(Arrays.binarySearch(k, a));
		System.out.println(buscaBruta(a));
		System.out.println(t.getTranslationToComputer(k[buscaBruta(a)]));
		System.out.println(t.getMoveToComputer());
		System.out.println(t.getTranslationToCube("2R"));
		System.out.println(t.getMoveToCube());
	}
	private static int buscaBruta(String x) {
		int y = -1;
		for (int i = 0; i < k.length; i++) {
			if(k[i].equals(x)) {
				y = i;
				break;
			}
		}
		return y;
	}
}
