package cube.test;

import cube.communication.Writer;
import cube.move.Movimento;

public class IATest {
	public static void main(String[] args) {

        int[][] novo = {{0,0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1,1},{2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3},{4,4,4,4,4,4,4,4,4},{5,5,5,5,5,5,5,5,5}};  
       
		//introduz a lista capturada na classe Movimento
		Movimento f = new Movimento(novo);
		
		/**IA**/
		f.spinRightFront(5);
		f.print();
		
		boolean[] quinas = {false, false, false, false};
		int branco = 4;
		int step = 0;
		for (int i = 1; i < 8; i+=2, step++) {
			if(f.getPos(4, i).charAt(15) == '4') {quinas[step] = true;}
		}
		for (int i = 0; i < quinas.length; i++) {
			
			if(quinas[i] == false) {
				int pos = (2*i)+1;
				String indicie = f.indexof(branco, FaceAdjacente(pos));
				String t = f.getPos(4, pos);
				int elemento = Integer.parseInt(String.valueOf(t.charAt(t.length()-1)));
				//System.out.println(elemento);
				//System.out.println(elemento.charAt(elemento.length()-1));
				String go = f.indexof(elemento, elementoAdjacente(pos, f));
				if (Character.getNumericValue(indicie.charAt(5)) == FaceAdjacente(pos)) {
					CubeUp(pos, f);
				}
				else if(((Character.getNumericValue(indicie.charAt(5)) == 2 || Character.getNumericValue(indicie.charAt(5)) == 5) && (Character.getNumericValue(indicie.charAt(15)) == 3 || Character.getNumericValue(indicie.charAt(15)) == 5)) || (!(Character.getNumericValue(indicie.charAt(5)) == 2) || !(Character.getNumericValue(indicie.charAt(5)) == 5) && (Character.getNumericValue(indicie.charAt(15)) == 1 || Character.getNumericValue(indicie.charAt(15)) == 7))) {
					while(go.charAt(15) != indicie.charAt(15)) {
						f.spinRightFront(branco);
						go = f.indexof(elemento, elementoAdjacente(prox(pos), f));
						//go = f.indexof((int)(f.getPos(branco, pos).charAt(37)), elementoAdjacente((int)(f.getPos(branco, pos).charAt(37)), f));
					}
					while(Character.getNumericValue(indicie.charAt(5)) != branco) {
						f.spinRightFront(FaceAdjacente(pos));
						indicie = f.indexof(branco, FaceAdjacente(pos));
					}
				}
			quinas[i] = true;
			}
		}
		
		/**Fim da IA**/
		
		//Manda para o python
		f.print();
	
	//	Writer.writer(f.getMove());
	//	Runtime.totalMemory();
	}
	private static void CubeUp(int pos, Movimento f) {
		if (pos == 1) {
			f.spinLeftBack(2);
			f.spinLeftBack(4);
			f.spinRightFront(1);
			f.spinRightFront(4);
		}
		else if (pos == 3) {
			f.spinLeftBack(1);
			f.spinRightFront(4);
			f.spinRightFront(1);
			f.spinLeftBack(4);
		}
		else if (pos == 5) {
			f.spinLeftBack(3);
			f.spinLeftBack(4);
			f.spinLeftBack(2);
			f.spinRightFront(4);
		}
		else if (pos == 7) {
			f.spinLeftBack(5);
			f.spinRightFront(4);
			f.spinLeftBack(1);
			f.spinLeftBack(4);
		}
		
	}
	private static int elementoAdjacente(int posElemento, Movimento f) {
		int[] array = {1,3,5,7};
		int[] inv = {7,5,3,1};
		String a = "";

		for (int i = 0; i < array.length; i++) {
			if(array[i] == posElemento) {
				a = f.getPos(FaceAdjacente(posElemento), inv[i]);
				break;
			}
		}
		return Integer.parseInt(String.valueOf(a.charAt(a.length()-1)));
		
	}
	private static int FaceAdjacente(int posElemento) {
		int ii = 0;
		switch (posElemento) {
			case 1: ii = 2; break;
			case 3: ii = 1; break;
			case 5: ii = 3; break;
			case 7: ii = 5; break;			
		}
		return ii;
	}
	private static void alinhamento(Movimento f) {
		while(FaceAdjacente(1) != elementoAdjacente(1, f)) {
			f.spinRightFront(4);
		}
	}
	private static int prox(int pos) {
		int[] array = {1,5,7,3};
		int r = 0;
		for (int i = 0; i < array.length; i++) {
			if(pos >= 3) {r = array[0];}
			else if(array[i] == pos) {r = array[i+1];}
		}
		return r;
	}
	
	
}