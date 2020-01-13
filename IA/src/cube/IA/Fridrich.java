package cube.IA;

import cube.move.Movimento;

public class Fridrich {
	
	private int[][] cube = new int[6][9];
	
	public Fridrich(int[][] cube) {
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube[i].length; j++) {
				this.cube[i][j] = cube[i][j]; 
			}
		}
	}
	
	// .... APLICAR A TROCA DE EIXO .....
	Movimento m = new Movimento(cube);
	
	/*
	 * OBS.: A COR DOS CUBINHOS NÃO MUDA. O QUE MUDA APENAS É O EIXO DO CUBO
	 * 
	 * 
	 */
	
	
	private void F2L() {
		
		/*
		 * OBS.: PARA OS CENTROS TROCADOS(FACES FRONTAIS), ADAPTAR O MOVIMENTO. POR ISSO NÃO FOI ESCRITO O ARRAY PARA ESTE TIPO DE CASO. 
		 * 		OS CASOS COM OS MOVIMENTOS APRESENTANDO UM * É PORQUÊ TEM QUE REVISAR O MOVIMENTO 
		 * 
		 */
		
		//Dd1
		int center = Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1)));
		int adj_center = Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1)));//centro da face
		
		if(Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == center &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == adj_center 
				) {
				//R U' R' Dw R' U2 R U2' R' U R
				String[] solver = {"R", "U'", "R'", "Dw", "R'", "U2", "R", "U2'", "R'", "U", "R"};
				
		}//Dd2	
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == center &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && //err
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == adj_center 			
				) {
				//U R U' R' Dw' L' U L
				String[] solver = {"U", "R", "U'"," R'", "Dw'", "L'", "U", "L"};
			
		}//Dd3 CENTRO TROCADO
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == center &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == adj_center && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1	 				
				) {		
				//U' L' U L Dw R U' R'
				//realizar movimento no eixo X positivo
				String[] solver = {"U'", "L'", "U", "L", "Dw", "R", "U'", "R'"};
				// movimentos do array
				//realizar mov no eixo x negativo
		}//Fd1
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 5 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == center && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4
				) {
				//R2 U2 R' U' R U' R' U2 R'
				String[] solver = "R2 U2 R' U' R U' R' U2 R'".split(" ");
		}//Fd2
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == center && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4
				) {
				//F' L' U2 L F R U R'
				String[] solver = "F' L' U2 L F R U R'".split(" ");
		}//Fd3 CENTRO TROCADO
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == center && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4
				) {
			//x+
				//L' U' L U L' U' L
				String[] solver = "L' U' L U L' U' L".split(" ");
			//x-
		}//Fd4
		else if(Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == center && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1	
				) { 
				//R U' R' U R U' R'
				String[] solver = "R U' R' U R U' R'".split(" ");
		}//Rd1
		else if(Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == adj_center &&		
				Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 5	
				) {
				//R U2' R U R' U R U2 R2
				String[] solver = "R U2' R U R' U R U2 R2".split(" ");
		}//Rd2
		else if(Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == adj_center &&	
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5
				) {
				//R U' R' F' L' U2 L F
				String[] solver = "R U' R' F' L' U2 L F".split(" ");
				
		}//Rd3 centro trocado?
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == adj_center
				) {
				//L' U L U' L' U L
			//x+
				String[] solver = "L' U L U' L' U L".split(" ");
				//x-
		}//Rd4
		else if(Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == adj_center &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1	
				) {
				//R U R' U' R U R'
				String[] solver = "R U R' U' R U R'".split(" ");
		}//U1
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 5 &&
				
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2
				) {
				//R U R' U' R U R' U' R U R'
				String[] solver = "R U R' U' R U R' U' R U R'".split(" ");
		}//U2
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5 &&
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2	
				) {
				//R U' R' y L' U2 L *
				String[] solver = "R U' R' y L' U2 L".split(" ");
		}//U3 centro trocado?
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&	
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2
				) {
				//L' U2 L U L' U' L
				String[] solver = "L' U2 L U L' U' L".split(" ");
		}//U4
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(5, center).length()-1)) == 1 &&
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2
				) {
				//U2 R2 U2 R' U' R U' R2
				String[] solver = "U2 R2 U2 R' U' R U' R2".split(" ");
		}//U5 CENTRO TROCADO
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&				
				Integer.parseInt(String.valueOf(m.getPos(3, 2).charAt(m.getPos(3, 2).length()-1))) == adj_center && 
				Integer.parseInt(String.valueOf(m.getPos(2, 2).charAt(m.getPos(2, 2).length()-1))) == 4				
				) {
				//L' U2 L U' L' U L
				String[] solver = "L' U2 L U' L' U L".split(" ");
		}//U6
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(5, 3).length()-1)) == 1 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 0).charAt(m.getPos(2, 0).length()-1))) == 4
				) {
				//R U R' U R U' R'
				String[] solver = "R U R' U R U' R'".split(" ");
		}//U7 centro trocado
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 0).charAt(m.getPos(2, 0).length()-1))) == 4
				) {
				//L' U' L U' L' U L
				String[] solver = "L' U' L U' L' U L".split(" ");
		}//U8
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == center &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 4 &&				
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1
				) {
				//R U2 R' U R U' R'
				String[] solver = "R U2 R' U R U' R'".split(" ");
		}//U9 centro trocado
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2
				) {
				//U2 L2 U2 L U L' U L2
				String[] solver = "U2 L2 U2 L U L' U L2".split(" ");
		}//U10
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2
				) {
				//R U2 R' U' R U R'
				String[] solver = "R U2 R' U' R U R'".split(" ");
		}//R1	centro trocado
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 5 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U L' U L U2 L' U L
				String[] solver = "U L' U L U2 L' U L".split(" ");
		}//R2 centro trocado
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U L' U' L Dw' L U L'
				String[] solver = "U L' U' L Dw' L U L'".split(" ");
		}//R3 centro trocado
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U' L' U L
				String[] solver = "U' L' U L".split(" ");
		}//R4 centro trocado
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U L' U2 L Dw' L U L'
				String[] solver = "U L' U2 L Dw' L U L'".split(" ");
		}//R5
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//R U' R' U Dw R' U' R
				String[] solver = "R U' R' U Dw R' U' R".split(" ");
		}//R6
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U' R U' R' U R U R'
				String[] solver = "U' R U' R' U R U R'".split(" ");
		}//R7
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 1).charAt(m.getPos(2, 1).length()-1))) == center &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//R U R'
				String[] solver = "R U R'".split(" ");
		}//R8
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 1).charAt(m.getPos(2, 1).length()-1))) == adj_center &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//Dw R' U2 R U2 R' U R 
				String[] solver = "Dw R' U2 R U2 R' U R".split(" ");
		}//R9
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 3).charAt(m.getPos(2, 3).length()-1))) == center &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U' R U R' U R U R'
				String[] solver = "U' R U R' U R U R'".split(" ");
		}//R10 centro trocado
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 3).charAt(m.getPos(2, 3).length()-1))) == adj_center &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U L' U' L U2 L' U L
				String[] solver = "U L' U' L U2 L' U L".split(" ");
		}//F1
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 5 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
				//U' R U' R' U2 R U' R'
				String[] solver = "U' R U' R' U2 R U' R'".split(" ");
		}//F2
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U' R U R' Dw R' U' R
			String[] solver = "U' R U R' Dw R' U' R".split(" ");
		}//F3
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U R U' R'
			String[] solver = "U R U' R'".split(" ");
			
		}//F4
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U' R U2 R' Dw R' U' R
			String[] solver = "U' R U2 R' Dw R' U' R".split(" ");
		}//F5 centro trocado
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//L' U L U' Dw' L U L'
			String[] solver = "L' U L U' Dw' L U L'".split(" ");
		}//F6 centro trocado
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U L' U L U' L' U' L
			String[] solver = "U L' U L U' L' U' L".split(" ");
		}//F7 centro trocado
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 3).charAt(m.getPos(2, 3).length()-1))) == adj_center &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//L' U' L
			String[] solver = "L' U' L".split(" ");
		}//F8 centro trocado
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 3).charAt(m.getPos(2, 3).length()-1))) == center &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//Dw' L U2 L' U2 L U' L'
			String[] solver = "Dw' L U2 L' U2 L U' L'".split(" ");
		}//F9 CENTRO TROCADO
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 1).charAt(m.getPos(2, 1).length()-1))) == adj_center &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U L' U' L U' L' U' L
			String[] solver = "U L' U' L U' L' U' L".split(" ");
		}
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 1).charAt(m.getPos(2, 1).length()-1))) == center &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U' R U R' U2 R U' R'
			String[] solver = "U' R U R' U2 R U' R'".split(" ");
		}
		else {
			m.spinRightFront(0);
		}
	}
	/*
	 * Terminando F2L
	 * 
	 */
	
	/*
	 * Gira o Cubo até que face amarela esteja de frente(FACE 4)
	 * 
	 * 
	 */
	private void OLL() {
		//olhando para a face de cima(amarela)
		//1
		if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0
		) {
			//R U R' U R U2 R'			
		}//2
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 2).length()-1))) == 0
				) {
			//R' U' R U' R' U2 R
		}//3
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0
				) {
			//R U R' U R U' R' U R U2 R'
		}//4
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0
				) {
			//R U2 R2 U' R2 U' R2 U2 R
		}//5
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 
				) {
			//R' F' L F R F' L' F
		}//6
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 
				) {
			//Rw U R U' L' U R' U'
		}//7
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 
				) {
			//R2 D' R U2 R' D R U2 R
		}//8
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				) {
			//R U R' U' R' F R F'
		}//9
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				) {
			//F R U R' U' F'
		}//10
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 
				) {
			//Fw R U R' U' Fw'
		}//11
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 
				) {
			//R' U' F' U F R
		}//12
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 3).length()-1))) == 0 
				) {
			//Rw U2 R' U' R U' Rw'
		}//13
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 
				) {
			//Rw' U2 R U R' U Rw
		}//14
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 
				) {
			//Rw U R' U R U2 Rw'
		}//15
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 
				) {
			//Rw' U' R U' R' U2 Rw
		}//16
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 
				) {
			//F U R U' R' U R U' R' F'
		}//17
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 
				) {
			//F R' F' R U R U' R'
		}//18
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 
				) {
			//F R U R' U' R U R' U' F'
		}//19
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&

				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 
				) {
			//F' L' U' L U L' U' L U F
		}//20
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&

				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 
				) {
			//Rw' U2 R U R' U' R U R' U Rw
		}//21
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&

				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 
				) {
			//Rw U R' U R U' R'	U R U2 Rw'
		}//22
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&

				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(3, 0).length()-1))) == 0 
				) {
			//Rw U' Rw2 U Rw2 U Rw2 U' Rw
		}//23
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&

				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(3, 0).length()-1))) == 0 
				) {
			//Rw' U Rw2 U' Rw2' U' Rw2 U Rw'
		}//24
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				) {
			//Rw U R' U' M U R U' R'
		}//25
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				) {
			//R U R' U' M' U R U' Rw'
		}//26
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&				
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 
				) {
			//R U B' U' R' U R B R'
		}//27
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&				
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 
				) {
			//R' U' F U R U' R' F' R
		}//28
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&				
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 
				) {
			//L U2 L2 B L B' L U2' L'
		}//29
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&				
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 
				) {
			//R' U' R' F R F' U R
		}//30
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&				
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0
				 
				) {
			//R U R2 U' R' F R U R U' F'
		}//31
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
						
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&				
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0
				 
				) {
			//R' U2 R2 U R' U R U2 x' U' R' U x
		}//32
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
						
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&				
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0
				 
				) {
			//R U R' U R Dw' R U' R' F'
		}//33
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
						
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0
				 
				) {
			//Rw' U' Rw U' R' U R U' R' U M U Rw
		}//34
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0
				 
				) {
			//R U R' U R U' R' U' R' F R F'
		}//35
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0
				 
				) {
			//L' U' L U' L' U L U L F' L' F
		}//36
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0
				 
				) {
			//
		}
		else {
			m.moveAxisZNegative();
		}
	}
	
}