package cube.IA;

import cube.move.Movimento;

public class Fridrich {
	
	private int[][] cube = new int[6][9];
	
	public Fridrich(int[][] cube) {
		int j = 0, i = 0;
		while(j<(cube.length)){
	        for (int var : cube[j]) {
	            this.cube[j][i] = var;
	            i++;
	            if(i>8){
	                i = 0;
	                j++;
	                break;
	            }
	        }
	    }
	}
	
	// .... APLICAR A TROCA DE EIXO .....
	Movimento m = new Movimento(cube);
	
	/*
	 * OBS.: A COR DOS CUBINHOS NÃO VAI MUDAR, O QUE MUDA APENAS É O EIXO DO CUBO
	 * 
	 * 
	 */
	
	
	public void F2L() {
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
		}//Dd2	
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 3 &&
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(3, 5).length()-1)) == 1 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 				
				) {
				//U R U' R' Dw' L' U L
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
			
		}//Fd1
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 &&
				Character.getNumericValue(m.indexof(3, 5).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(3, 5).charAt(m.indexof(5, 3).length()-1)) == 5 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 3 && 
		
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5
				) {
				//R2 U2 R' U' R U' R' U2 R'
		}//Fd2
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 4).charAt(m.getPos(4, 4).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 3 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 3 &&
				Character.getNumericValue(m.indexof(5, 3).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(5, 3).charAt(m.indexof(5, 3).length()-1)) == 5 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 3 && 
				
				Integer.parseInt(String.valueOf(m.getPos(3, 4).charAt(m.getPos(3, 4).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 5).charAt(m.getPos(3, 5).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 7).charAt(m.getPos(3, 7).length()-1))) == 5 && 
				Integer.parseInt(String.valueOf(m.getPos(3, 8).charAt(m.getPos(3, 8).length()-1))) == 5 
				) {
				
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
