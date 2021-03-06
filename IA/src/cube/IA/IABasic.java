package cube.IA;

import java.io.IOException;
import java.util.Scanner;

import cube.communication.Writer;
import cube.move.Movimento;

public class IABasic {
	public static void main(String[] args) throws IOException {
		
		//Adição
		
		int[][] cubo = new int[6][9];
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		/*for (int i = 0; i < cubo.length; i++) {
			System.out.println("Digite os elementos da face " + i);
			for (int j = 0; j < cubo[i].length; j+=3) {
				String[] input = s.nextLine().split(" ");
				for (int j2 = 0; j2 < input.length; j2++) {
					for (String is : input) {
						cubo[i][j+j2] = Integer.parseInt(is);
					}
				}
			}
		}*/
		 int[][] novo = {{0,0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1,1},{2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3},{4,4,4,4,4,4,4,4,4},{5,5,5,5,5,5,5,5,5}};  
		
		//introduz a lista capturada na classe Movimento
		Movimento f = new Movimento(novo);//trocar depois pelo array cubo
		Fridrich fridrich = new Fridrich(f);
		
		/* Embaralha 
		f.spinRightFront(2);
		f.spinRightFront(5);
		f.spinRightFront(1);
		//f.spinRightFront(0);
		//f.spinRightFront(2);
		*/
		f.print();
		
		/**IA**/
		
		//Cruz
		
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
				else if ((Character.getNumericValue(indicie.charAt(5)) == 1 && Character.getNumericValue(indicie.charAt(15)) == 3) || (Character.getNumericValue(indicie.charAt(5)) == 3 && Character.getNumericValue(indicie.charAt(15)) == 5) || (Character.getNumericValue(indicie.charAt(5)) == 5 && Character.getNumericValue(indicie.charAt(15)) == 7) || (Character.getNumericValue(indicie.charAt(5)) == 2 && Character.getNumericValue(indicie.charAt(15)) == 1)) {
					while(Character.getNumericValue(indicie.charAt(5)) != 2) {
						f.spinRightFront(0);
						indicie = f.indexof(branco, FaceAdjacente(pos));
					}
					while(Character.getNumericValue(go.charAt(5)) != 2) {
						f.spinRightFront(4);
						go = f.indexof(elemento, elementoAdjacente(prox(pos), f));
						//go = f.indexof((int)(f.getPos(branco, pos).charAt(37)), elementoAdjacente((int)(f.getPos(branco, pos).charAt(37)), f));
					}
					for (int j = 0; j < 2; j++) {f.spinRightFront(2);}
					f.spinLeftBack(2);
					f.spinLeftBack(4);
					f.spinRightFront(1);
					f.spinRightFront(4);
				}
				else if(Character.getNumericValue(indicie.charAt(5)) == 0 && (Character.getNumericValue(indicie.charAt(15)) == 3 || Character.getNumericValue(indicie.charAt(15)) == 5)) {
					if (Character.getNumericValue(indicie.charAt(15)) == 3) {
						while (Character.getNumericValue(go.charAt(15)) != 5) {
							f.spinRightFront(branco);
							go = f.indexof(elemento, elementoAdjacente(prox(pos), f));
							//go = f.indexof((int)(f.getPos(branco, pos).charAt(37)), elementoAdjacente((int)(f.getPos(branco, pos).charAt(37)), f));							
						}
					}
					else if (Character.getNumericValue(indicie.charAt(15)) == 5) {
						while (Character.getNumericValue(go.charAt(15)) != 3) {
							f.spinRightFront(branco);
							go = f.indexof(elemento, elementoAdjacente(prox(pos), f));
							//go = f.indexof((int)(f.getPos(branco, pos).charAt(37)), elementoAdjacente((int)(f.getPos(branco, pos).charAt(37)), f));							
						}
						
					}
					char ant = indicie.charAt(15);
					if(Character.getNumericValue(ant) == 3) {for(int j = 0; j < 2; j++) {f.spinRightFront(3);}}
							
					else {for(int j = 0; j < 2; j++) {f.spinRightFront(1);}}
					
					alinhamento(f);
				}
				else {//if ((indicie.charAt(15) == 1 || indicie.charAt(15) == 7 || indicie.charAt(15) == 5 || indicie.charAt(15) == 3) && indicie.charAt(5) != 0)
					while(go.charAt(15) != indicie.charAt(15)) {
						f.spinRightFront(branco);
						go = f.indexof(elemento, elementoAdjacente(prox(pos), f));
						//go = f.indexof((int)(f.getPos(branco, pos).charAt(37)), elementoAdjacente((int)(f.getPos(branco, pos).charAt(37)), f));
					}
					while(Character.getNumericValue(indicie.charAt(5)) != branco) {
						f.spinRightFront(FaceAdjacente(pos));
						indicie = f.indexof(branco, FaceAdjacente(pos));
					}
					alinhamento(f);
				}
			}
			quinas[i] = true;
		}
		System.err.println("CRUZ\n");
		f.print();
		
		/*****FRIDRICH*******/
		
		//face amarela até encima
		while(!(f.getPos(2, 4).charAt(f.getPos(2, 4).length()-1) == '0')) {
			f.moveAxisXNegative();
		}
		
		//Init F2L
		int color = 0;
		
		f2l:
		while(true) {
			int lenMove = f.getMove().size();
			//F2L
			fridrich.caseF2L();
			//Verificação para passar para o OLL
			for (int i = 0; i < 9; i++) {
				color += Character.getNumericValue(f.getPos(5, i).charAt(f.getPos(5, i).length() -1));
			}
			color = color / 9;
			if(color == 4)
				break f2l;
			else
				color = 0;
			
			//same face, but the face two isn't equals
			if(lenMove == f.getMove().size())
				f.spinRightFront(2);
			//next face
			else if(f.getMove().get(f.getMove().size() - 1).charAt(0) != '2')
				f.moveAxisYNegative();
				
		}
		
		System.err.println("F2L\n");
		f.print();
		System.out.println(f.getMove());
		
		//Init OLL
		while(!(f.getPos(4, 4).charAt(f.getPos(4, 4).length()-1) == '0')) {
			f.moveAxisXNegative();
		}		
		
		int sum = 0;
		oll:
		while(true) {
			int lenMove = f.getMove().size();
			//OLL
			fridrich.caseOLL();
			//Verificação para passar para o PLL
			for (int i = 0; i < 9; i++) {
				sum += Character.getNumericValue(f.getPos(4, i).charAt(f.getPos(4, i).length() -1));
			}
			if(sum == 0) {
				break oll;
			}
			else {
				sum = 0;
			}
			if(lenMove == f.getMove().size())
				f.moveAxisZNegative();
		}
		
		System.err.println("OLL\n");
		f.print();
		System.out.println(f.getMove());
		
		//Init PLL
		int[] sumPll = {0,0,0,0};
		int[] faces = {2,1,5,3};//I'm looking at the face four!
		int[][] cubinhos = {{6,7,8},{2,5,8},{0,1,2},{0,3,6}};
		pll:
		while(true) {
			//PLL			
			fridrich.casePLL();
			//finalize!
			for (int i = 0; i < cubinhos.length; i++) {
				for (int j = 0; j < cubinhos[i].length; j++) {
					sumPll[i] +=  Character.getNumericValue(f.getPos(faces[i], cubinhos[i][j]).charAt(f.getPos(faces[i], cubinhos[i][j]).length() -1));
				}
				sumPll[i] = sumPll[i] / 3;
			}
			
			//saida do loop infinito
			trois:
			for (int i = 0; i < sumPll.length; i++) {
				if(sumPll[i] != Character.getNumericValue(f.getPos(faces[i], 4).charAt(f.getPos(faces[i], 4).length() -1))) {
					break trois;
				}else if(i == sumPll.length - 1) {
					break pll;
				}
			}
			//caso não ocorra a saida...
			for (int i = 0; i < sumPll.length; i++) {
				sumPll[i] = 0;
			}
		}
		
		/**Fim da IA**/
	
		System.err.println("PLL\n");
		f.print();
		System.out.println(f.getMove());
		//Manda para o python
		Writer.writer(f.getMove());
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
