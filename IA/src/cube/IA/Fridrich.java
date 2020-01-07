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
	
	
	public void F2L() {
		
		/*
		 * OBS.: PARA OS CENTROS TROCADOS(FACES FRONTAIS), ADAPTAR O MOVIMENTO. POR ISSO NÃO FOI ESCRITO O ARRAY PARA ESTE TIPO DE CASO. 
		 * 		OS CASOS COM OS MOVIMENTOS APRESENTANDO UM * É PORQUÊ TEM QUE REVISAR O MOVIMENTO 
		 * 
		 */
		
		//Dd1
		if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 3 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 5 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 
				) {
				//R U' R' Dw R' U2 R U2' R' U R
				String[] solver = {"R", "U'", "R'", "Dw", "R'", "U2", "R", "U2'", "R'", "U", "R"};
				
		}//Dd2	
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 3 &&
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 && //err
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(3, 5).length()-1)) == 1 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 				
				) {
				//U R U' R' Dw' L' U L
				String[] solver = {"U", "R", "U'"," R'", "Dw'", "L'", "U", "L"};
			
		}//Dd3 CENTRO TROCADO
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 3 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 3 && 
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 1	 				
				) {		
				//U' L' U L Dw R U' R'
				//String[] solver = {"U'", "L'", "U", "L", "Dw", "R", "U'", "R'"};
		}//Fd1
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 &&
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(5, 3).length()-1)) == 5 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4 && 
		
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5
				) {
				//R2 U2 R' U' R U' R' U2 R'
				String[] solver = "R2 U2 R' U' R U' R' U2 R'".split(" ");
		}//Fd2
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 5 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4 && 
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 
				) {
				//F' L' U2 L F R U R'
				String[] solver = "F' L' U2 L F R U R'".split(" ");
		}//Fd3 CENTRO TROCADO
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 

				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(3, 5).length()-1)) == 1 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4 && 
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 
				) {
				//L' U' L U L' U' L
				
		}//Fd4
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 3 && 
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 1	
				) { 
				//R U' R' U R U' R'
				String[] solver = "R U' R' U R U' R'".split(" ");
		}//Rd1
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 5 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(5, 3).length()-1)) == 5	
				) {
				//R U2' R U R' U R U2 R2
				String[] solver = "R U2' R U R' U R U2 R2".split(" ");
		}//Rd2
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 5 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 5
				) {
				//R U' R' F' L' U2 L F
				String[] solver = "R U' R' F' L' U2 L F".split(" ");
				
		}//Rd3 centro trocado?
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 

				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(3, 5).length()-1)) == 1 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 5 && 
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 
				) {
				//L' U L U' L' U L
		}//Rd4
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 5 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 3 && 
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 1	
				) {
				//R U R' U' R U R'
				String[] solver = "R U R' U' R U R'".split(" ");
		}//U1
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(5, 3).length()-1)) == 5 &&
				
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(m.indexof(5, 4, 3).length()-1)) == 2
				) {
				//R U R' U' R U R' U' R U R'
				String[] solver = "R U R' U' R U R' U' R U R'".split(" ");
		}//U2
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 5 &&
				
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(m.indexof(5, 4, 3).length()-1)) == 2	
				) {
				//R U' R' y L' U2 L *
				String[] solver = "R U' R' y L' U2 L".split(" ");
		}//U3 centro trocado?
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(5, 3).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(m.indexof(5, 4, 3).length()-1)) == 2
				) {
				//L' U2 L U L' U' L
		}//U4
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(m.indexof(5, 4, 3).length()-1)) == 2
				) {
				//U2 R2 U2 R' U' R U' R2
				String[] solver = "U2 R2 U2 R' U' R U' R2".split(" ");
		}//U5 CENTRO TROCADO
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 &&
				
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(3, 5).length()-1)) == 1 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 2).charAt(m.getPos(3, 2).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(2, 2).charAt(m.getPos(2, 2).length()-1))) == 4				
				) {
				//L' U2 L U' L' U L
		}//U6
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 &&
				
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 1 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 0).charAt(m.getPos(2, 0).length()-1))) == 4 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 
				) {
				//R U R' U R U' R'
		}//U7 centro trocado
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 &&
				
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(3, 5).length()-1)) == 1 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&

				Integer.parseInt(String.valueOf(m.getPos(2, 0).charAt(m.getPos(2, 0).length()-1))) == 4 

				) {
				//L' U' L U' L' U L
		}//U8
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 3 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 4 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 1
				) {
				//R U2 R' U R U' R'
		}//U9 centro trocado
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(3, 5).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(m.indexof(5, 4, 3).length()-1)) == 2
				) {
				//U2 L2 U2 L U L' U L2
		}//U10
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(5, 4, 3).charAt(m.indexof(5, 4, 3).length()-1)) == 2
				) {
				//R U2 R' U' R U R'
		}//R1	
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(3, 5).length()-1)) == 5 &&
				
				Character.getNumericValue(m.indexof(3, 5, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(3, 5, 4).charAt(m.indexof(3, 5, 4).length()-1)) == 2
				) {
				//U L' U L U2 L' U L
		}//R2
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 5).length()-1)) == 5 &&
				
				Character.getNumericValue(m.indexof(3, 5, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(3, 5, 4).charAt(m.indexof(3, 5, 4).length()-1)) == 2
				) {
				//U L' U' L Dw' L U L'
		}//R3
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(3, 5).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(3, 5, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(3, 5, 4).charAt(m.indexof(3, 5, 4).length()-1)) == 2
				) {
				//U' L' U L
		}//R4
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 &&
				
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(3, 5, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(3, 5, 4).charAt(m.indexof(3, 5, 4).length()-1)) == 2
				) {
				//U L' U2 L Dw' L U L'
		}
	}

	
}