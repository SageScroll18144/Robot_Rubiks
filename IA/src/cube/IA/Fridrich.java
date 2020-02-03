package cube.IA;

import cube.language.Translate;
import cube.language.TranslateCompound;
import cube.language.TranslateDoubleSimple;
import cube.move.Movimento;

public class Fridrich {
	
	private Movimento m;
	private TranslateCompound t = new TranslateCompound(m);
	private Translate ts = new Translate();
	private TranslateDoubleSimple tds = new TranslateDoubleSimple(m);
	
	public Fridrich(Movimento m) {
		this.m = m;
	}
	
	// .... APLICAR A TROCA DE EIXO .....
	
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
				performsMovements("R U' R' Dw R' U2 R U2' R' U R");
				
		}//Dd2	
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == center &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && //err
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == adj_center 			
				) {
				//U R U' R' Dw' L' U L
				performsMovements("U R U' R' Dw' L' U L");
			
		}//Dd3 CENTRO TROCADO
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == center &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == adj_center && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1	 				
				) {		
				//U' L' U L Dw R U' R'
				m.moveAxisYNegative();
				performsMovements("U' L' U L Dw R U' R'");
				m.moveAxisYPositive();
		}//Fd1
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 5 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == center && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4
				) {
				//R2 U2 R' U' R U' R' U2 R'
			performsMovements("R2 U2 R' U' R U' R' U2 R'");
		}//Fd2
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == center && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4
				) {
				//F' L' U2 L F R U R'
				performsMovements("F' L' U2 L F R U R'");
		}//Fd3 CENTRO TROCADO
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == center && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4
				) {
			//x+
				//L' U' L U L' U' L
				m.moveAxisYNegative();
				performsMovements("L' U' L U L' U' L");
				m.moveAxisYPositive();
			//x-
		}//Fd4
		else if(Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == center && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1	
				) { 
				//R U' R' U R U' R'
				performsMovements("R U' R' U R U' R'");
		}//Rd1
		else if(Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == adj_center &&		
				Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 5	
				) {
				//R U2' R U R' U R U2 R2
				performsMovements("R U2' R U R' U R U2 R2");
		}//Rd2
		else if(Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == adj_center &&	
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5
				) {
				//R U' R' F' L' U2 L F
			performsMovements("R U' R' F' L' U2 L F");
				
		}//Rd3 centro trocado?
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == adj_center
				) {
				//L' U L U' L' U L
			//x+
			m.moveAxisYNegative();
			performsMovements("L' U L U' L' U L");
			m.moveAxisYPositive();
				//x-
		}//Rd4
		else if(Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 4 && 
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == adj_center &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1	
				) {
				//R U R' U' R U R'
			performsMovements("R U R' U' R U R'");
		}//U1
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 5 &&
				
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2
				) {
				//R U R' U' R U R' U' R U R'
			performsMovements("R U R' U' R U R' U' R U R'");
		}//U2
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5 &&
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2	
				) {
				//R U' R' y L' U2 L *
			performsMovements("R U' R' y L' U2 L");
		}//U3 centro trocado?
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&	
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2
				) {
				//L' U2 L U L' U' L
			m.moveAxisYNegative();
			performsMovements("L' U2 L U L' U' L");
			m.moveAxisYPositive();
		}//U4
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(5, center).length()-1)) == 1 &&
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 && 
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2
				) {
				//U2 R2 U2 R' U' R U' R2
			performsMovements("U2 R2 U2 R' U' R U' R2");
		}//U5 CENTRO TROCADO
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&				
				Integer.parseInt(String.valueOf(m.getPos(3, 2).charAt(m.getPos(3, 2).length()-1))) == adj_center && 
				Integer.parseInt(String.valueOf(m.getPos(2, 2).charAt(m.getPos(2, 2).length()-1))) == 4				
				) {
				//L' U2 L U' L' U L
			m.moveAxisYNegative();
			performsMovements("L' U2 L U' L' U L");
			m.moveAxisYPositive();
		}//U6
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(5, 3).length()-1)) == 1 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 0).charAt(m.getPos(2, 0).length()-1))) == 4
				) {
				//R U R' U R U' R'
			performsMovements("R U R' U R U' R'");
		}//U7 centro trocado
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 0).charAt(m.getPos(2, 0).length()-1))) == 4
				) {
				//L' U' L U' L' U L
			m.moveAxisYNegative();
			performsMovements("L' U' L U' L' U L");
			m.moveAxisYPositive();
		}//U8
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == center &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 4 &&				
				Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1
				) {
				//R U2 R' U R U' R'
			performsMovements("R U2 R' U R U' R'");
		}//U9 centro trocado
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2
				) {
				//U2 L2 U2 L U L' U L2
			m.moveAxisYNegative();
			performsMovements("U2 L2 U2 L U L' U L2");
			m.moveAxisYPositive();
		}//U10
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, 4, center).charAt(m.indexof(adj_center, 4, center).length()-1)) == 2
				) {
				//R U2 R' U' R U R'
			performsMovements("R U2 R' U' R U R'");
		}//R1	centro trocado
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 5 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U L' U L U2 L' U L
			m.moveAxisYNegative();
			performsMovements("U L' U L U2 L' U L");
			m.moveAxisYPositive();
		}//R2 centro trocado
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U L' U' L Dw' L U L'
			m.moveAxisYNegative();
			performsMovements("U L' U' L Dw' L U L'");
			m.moveAxisYPositive();
		}//R3 centro trocado
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U' L' U L
			m.moveAxisYNegative();
			performsMovements("U' L' U L");
			m.moveAxisYPositive();
		}//R4 centro trocado
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U L' U2 L Dw' L U L'
			m.moveAxisYNegative();
			performsMovements("U L' U2 L Dw' L U L'");
			m.moveAxisYPositive();
		}//R5
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//R U' R' U Dw R' U' R
			performsMovements("R U' R' U Dw R' U' R");
		}//R6
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U' R U' R' U R U R'
			performsMovements("U' R U' R' U R U R'");
		}//R7
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 1).charAt(m.getPos(2, 1).length()-1))) == center &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//R U R'
			performsMovements("R U R'");
		}//R8
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 1).charAt(m.getPos(2, 1).length()-1))) == adj_center &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//Dw R' U2 R U2 R' U R 
			performsMovements("Dw R' U2 R U2 R' U R");
		}//R9
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 3).charAt(m.getPos(2, 3).length()-1))) == center &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U' R U R' U R U R'
			performsMovements("U' R U R' U R U R'");
		}//R10 centro trocado
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 3).charAt(m.getPos(2, 3).length()-1))) == adj_center &&
				
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center, 4).charAt(m.indexof(center, adj_center, 4).length()-1)) == 2
				) {
				//U L' U' L U2 L' U L
			m.moveAxisYNegative();
			performsMovements("U L' U' L U2 L' U L");
			m.moveAxisYPositive();
		}//F1
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 5 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
				//U' R U' R' U2 R U' R'
			performsMovements("U' R U' R' U2 R U' R'");
		}//F2
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 5 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U' R U R' Dw R' U' R
			performsMovements("U' R U R' Dw R' U' R");
		}//F3
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U R U' R'
			performsMovements("U R U' R'");
			
		}//F4
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 3 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U' R U2 R' Dw R' U' R
			performsMovements("U' R U2 R' Dw R' U' R");
		}//F5 centro trocado
		else if(Character.getNumericValue(m.indexof(adj_center, center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(adj_center, center).charAt(m.indexof(adj_center, center).length()-1)) == 1 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//L' U L U' Dw' L U L'
			m.moveAxisYNegative();
			performsMovements("L' U L U' Dw' L U L'");
			m.moveAxisYPositive();
		}//F6 centro trocado
		else if(Character.getNumericValue(m.indexof(center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(center, adj_center).charAt(m.indexof(center, adj_center).length()-1)) == 1 &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U L' U L U' L' U' L
			m.moveAxisYNegative();
			performsMovements("U L' U L U' L' U' L");
			m.moveAxisYPositive();
		}//F7 centro trocado
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 3).charAt(m.getPos(2, 3).length()-1))) == adj_center &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//L' U' L
			m.moveAxisYNegative();
			performsMovements("L' U' L");
			m.moveAxisYPositive();
		}//F8 centro trocado
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 3).charAt(m.getPos(2, 3).length()-1))) == center &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//Dw' L U2 L' U2 L U' L'
			m.moveAxisYNegative();
			performsMovements("Dw' L U2 L' U2 L U' L'");
			m.moveAxisYPositive();
		}//F9 CENTRO TROCADO
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 1).charAt(m.getPos(2, 1).length()-1))) == adj_center &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U L' U' L U' L' U' L
			m.moveAxisYNegative();
			performsMovements("U L' U' L U' L' U' L");
			m.moveAxisYPositive();
		}
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 1).charAt(m.getPos(2, 1).length()-1))) == center &&
		
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(5)) == 4 &&
				Character.getNumericValue(m.indexof(4, center, adj_center).charAt(m.indexof(4, center, adj_center).length()-1)) == 2
				) {
			//U' R U R' U2 R U' R'
			performsMovements("U' R U R' U2 R U' R'");
		}/*
		else {
			m.spinRightFront(2);
		}*/
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
			performsMovements("R U R' U R U2 R'");
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
			performsMovements("R' U' R U' R' U2 R");
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
			performsMovements("R U R' U R U' R' U R U2 R'");
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
			performsMovements("R U2 R2 U' R2 U' R2 U2 R");
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
			performsMovements("R' F' L F R F' L' F");
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
			performsMovements("Rw U R U' L' U R' U'");
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
			performsMovements("R2 D' R U2 R' D R U2 R");
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
			performsMovements("R U R' U' R' F R F'");
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
			performsMovements("F R U R' U' F'");
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
			performsMovements("Fw R U R' U' Fw'");
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
			performsMovements("R' U' F' U F R");
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
			performsMovements("Rw U2 R' U' R U' Rw'");
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
			performsMovements("Rw' U2 R U R' U Rw");
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
			performsMovements("Rw U R' U R U2 Rw'");
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
			performsMovements("Rw' U' R U' R' U2 Rw");
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
			performsMovements("F U R U' R' U R U' R' F'");
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
			performsMovements("F R' F' R U R U' R'");
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
			performsMovements("F R U R' U' R U R' U' F'");
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
			performsMovements("F' L' U' L U L' U' L U F");
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
			performsMovements("Rw' U2 R U R' U' R U R' U Rw");
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
			performsMovements("Rw U R' U R U' R' U R U2 Rw'");
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
			performsMovements("Rw U' Rw2 U Rw2 U Rw2 U' Rw");
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
			performsMovements("Rw' U Rw2 U' Rw2' U' Rw2 U Rw'");
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
			performsMovements("Rw U R' U' M U R U' R'");
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
			performsMovements("R U R' U' M' U R U' Rw'");
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
			performsMovements("R U B' U' R' U R B R'");
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
			performsMovements("R' U' F U R U' R' F' R");
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
			performsMovements("L U2 L2 B L B' L U2' L'");
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
			performsMovements("R' U' R' F R F' U R");
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
			performsMovements("R U R2 U' R' F R U R U' F'");
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
			performsMovements("R' U2 R2 U R' U R U2 x' U' R' U x");
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
			performsMovements("R U R' U R Dw' R U' R' F'");
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
			performsMovements("Rw' U' Rw U' R' U R U' R' U M U Rw");
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
			performsMovements("R U R' U R U' R' U' R' F R F'");
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
			performsMovements("L' U' L U' L' U L U L F' L' F");
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
			//R' F R U R' F' R y' R U' R'
			performsMovements("R' F R U R' F' R y' R U' R'");
		}//37
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0
				 
				) {
			//Rw U' Rw' U' Rw U Rw' y' R' U R
			performsMovements("Rw U' Rw' U' Rw U Rw' y' R' U R");
		}//38
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0
				 
				) {
			//Rw U M U R' U' Rw U' Rw
			performsMovements("Rw U M U R' U' Rw U' Rw");
		}//39
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0
				 
				) {
			//Lw' U' M U' L U Lw' U Lw
			performsMovements("Lw' U' M U' L U Lw' U Lw");
		}//40
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&	
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 
				 
				) {
			//R' F R U R' U' F' U R
			performsMovements("R' F R U R' U' F' U R");
		}//41
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&	
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 
				 
				) {
			//R B' R' U' R U B U' R'
			performsMovements("R B' R' U' R U B U' R'");
		}//42
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&	
				
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0  &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 
				 
				) {
			//F R U R' U' F' y F R U R' U' F'
			performsMovements("F R U R' U' F' y F R U R' U' F'");
		}//43
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&	
				
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0  &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 
				 
				) {
			//Rw U R' U R' F R F' R U2 Rw'
			performsMovements("Rw U R' U R' F R F' R U2 Rw'");
		}//44
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0  &&
						
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 
				 
				) {
			//R U R' U' R U' R' F' U' F R U R'
			performsMovements("R U R' U' R U' R' F' U' F R U R'");
		}//45
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 5).charAt(m.getPos(4, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0  &&
						
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 
				 
				) {
			//Fw R U R2 U' R' U R2 U' R' Fw'
			performsMovements("Fw R U R2 U' R' U R2 U' R' Fw'");
		}//46
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0  &&
						
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 
				 
				) {
			//R U R' U R U2 R' F R U R' U' F'
			performsMovements("R U R' U R U2 R' F R U R' U' F'");
		}//47
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0  &&
						
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 
				 
				) {
			//R' U' R U' R' U2 R F R U R' U' F'
			performsMovements("R' U' R U' R' U2 R F R U R' U' F'");
		}//48
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 7).charAt(m.getPos(4, 7).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0  &&
					
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0 
				 
				) {
			//R' U' R U Lw U' Lw' R' U' R U B
			performsMovements("R' U' R U Lw U' Lw' R' U' R U B");
		}//49
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 3).charAt(m.getPos(4, 3).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 1).charAt(m.getPos(4, 1).length()-1))) == 0  &&
					
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 
				 
				) {
			//R U R' U' R' F R2 U R' U' F'
			performsMovements("R U R' U' R' F R2 U R' U' F'");
		}//50
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0  &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 
				 
				) {
			//Rw U R' U R U2 Rw2 U' R U' R' U2 Rw
			performsMovements("Rw U R' U R U2 Rw2 U' R U' R' U2 Rw");
		}//51
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0  &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				 
				) {
			//Rw U2 R' U' R U' Rw2 U2 R U R' U Rw
			performsMovements("Rw U2 R' U' R U' Rw2 U2 R U R' U Rw");
		}//52
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0  &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0  &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				 
				) {
			//R U2 R2' F R F' U2' R' F R F'
			performsMovements("R U2 R2' F R F' U2' R' F R F'");
		}//53 *
		else if(Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0  &&
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 2).charAt(m.getPos(5, 2).length()-1))) == 0  &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				 
				) {
			//F R U R' U' S R U R' U' Fw'
			performsMovements("F R U R' U' S R U R' U' Fw'");
		}//54
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0  &&
				Integer.parseInt(String.valueOf(m.getPos(2, 6).charAt(m.getPos(2, 6).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(3, 0).charAt(m.getPos(3, 0).length()-1))) == 0  &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				 
				) {
			//Fw R U R' U' Fw' U' F R U R' U' F'
			performsMovements("Fw R U R' U' Fw' U' F R U R' U' F'");
		}//55
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0  &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 2).charAt(m.getPos(1, 2).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(3, 6).charAt(m.getPos(3, 6).length()-1))) == 0  &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 0).charAt(m.getPos(5, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				 
				) {
			//Fw R U R' U' Fw' U F R U R' U' F'
			performsMovements("Fw R U R' U' Fw' U F R U R' U' F'");
		}//56
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0  &&
				Integer.parseInt(String.valueOf(m.getPos(2, 8).charAt(m.getPos(2, 8).length()-1))) == 0  &&	
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(1, 8).charAt(m.getPos(1, 8).length()-1))) == 0 &&			
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	

				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				 
				) {
			//R U R' U R' F R F' U2 R' F R F'
			performsMovements("R U R' U R' F R F' U2 R' F R F'");
		}//57
		else if(Integer.parseInt(String.valueOf(m.getPos(4, 8).charAt(m.getPos(4, 8).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 0).charAt(m.getPos(4, 0).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(4, 2).charAt(m.getPos(4, 2).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(4, 6).charAt(m.getPos(4, 6).length()-1))) == 0  &&	
				
				Integer.parseInt(String.valueOf(m.getPos(2, 7).charAt(m.getPos(2, 7).length()-1))) == 0  &&
				Integer.parseInt(String.valueOf(m.getPos(1, 5).charAt(m.getPos(1, 5).length()-1))) == 0 &&
				Integer.parseInt(String.valueOf(m.getPos(3, 3).charAt(m.getPos(3, 3).length()-1))) == 0 &&	
				Integer.parseInt(String.valueOf(m.getPos(5, 1).charAt(m.getPos(5, 1).length()-1))) == 0 
				 
				) {
			//M U R U R' U' M2 U R U' Rw'
			performsMovements("M U R U R' U' M2 U R U' Rw'");
		}
		else {
			m.moveAxisZNegative();
		}
	}

	private void PLL() {
		int centerOne = Character.getNumericValue(m.getPos(1, 4).charAt(m.getPos(1, 4).length() -1));
		int centerTwo = Character.getNumericValue(m.getPos(2, 4).charAt(m.getPos(2, 4).length() -1));
		int centerThree = Character.getNumericValue(m.getPos(3, 4).charAt(m.getPos(3, 4).length() -1));
		int centerFive = Character.getNumericValue(m.getPos(5, 4).charAt(m.getPos(5, 4).length() -1));
		
		//Caso U horário
		if(Character.getNumericValue(m.getPos(3, 3).charAt(m.getPos(3, 3).length() -1)) == centerOne &&
				Character.getNumericValue(m.getPos(1, 5).charAt(m.getPos(1, 5).length() -1)) == centerTwo &&
				Character.getNumericValue(m.getPos(2, 7).charAt(m.getPos(2, 7).length() -1)) == centerThree
				) {
			//R' U R' U' R' U' R' U R U R2
				
		}//Caso U anti-horário
		else if(Character.getNumericValue(m.getPos(3, 3).charAt(m.getPos(3, 3).length() -1)) == centerTwo &&
				Character.getNumericValue(m.getPos(1, 5).charAt(m.getPos(1, 5).length() -1)) == centerThree &&
				Character.getNumericValue(m.getPos(2, 7).charAt(m.getPos(2, 7).length() -1)) == centerOne
				) {
			//R2 U' R' U' R U R U R U' R
		}
		
		//Caso A horário
		
		//Caso A anti-horário
		
		
		//Caso H
		else if (Character.getNumericValue(m.getPos(3, 3).charAt(m.getPos(3, 3).length() -1)) == centerOne &&
				Character.getNumericValue(m.getPos(1, 5).charAt(m.getPos(1, 5).length() -1)) == centerThree &&
				Character.getNumericValue(m.getPos(2, 7).charAt(m.getPos(2, 7).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(5, 1).charAt(m.getPos(5, 1).length() -1)) == centerOne
				) {
			//M2 U M2 U2 M2 U M2
			
		}//Caso Z
		else if (Character.getNumericValue(m.getPos(3, 3).charAt(m.getPos(3, 3).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(1, 5).charAt(m.getPos(1, 5).length() -1)) == centerTwo &&
				Character.getNumericValue(m.getPos(2, 7).charAt(m.getPos(2, 7).length() -1)) == centerOne &&
				Character.getNumericValue(m.getPos(5, 1).charAt(m.getPos(5, 1).length() -1)) == centerThree
				) {
			//M2 U M2 U M´ U2 M2 U2 M´ U2
			
		}//Caso T
		else if(Character.getNumericValue(m.getPos(3, 3).charAt(m.getPos(3, 3).length() -1)) == centerOne &&
				Character.getNumericValue(m.getPos(1, 5).charAt(m.getPos(1, 5).length() -1)) == centerThree &&
				Character.getNumericValue(m.getPos(2, 8).charAt(m.getPos(2, 8).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(5, 2).charAt(m.getPos(5, 2).length() -1)) == centerTwo
				) {
			//R U R' U' R' F R2 U' R' U' R U R' F'
			
		}//Caso F
		else if(Character.getNumericValue(m.getPos(2, 7).charAt(m.getPos(2, 7).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(5, 1).charAt(m.getPos(5, 1).length() -1)) == centerTwo &&
				Character.getNumericValue(m.getPos(2, 8).charAt(m.getPos(2, 8).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(5, 2).charAt(m.getPos(5, 2).length() -1)) == centerTwo
				) {
			//R' U' F' R U R' U' R' F R2 U' R' U' R U R' U R
			
		}
		
		//Caso Y
		
		//Caso E
		else if(Character.getNumericValue(m.getPos(2, 6).charAt(m.getPos(2, 6).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(5, 0).charAt(m.getPos(5, 0).length() -1)) == centerTwo &&
				Character.getNumericValue(m.getPos(2, 8).charAt(m.getPos(2, 8).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(5, 2).charAt(m.getPos(5, 2).length() -1)) == centerTwo
				) {
			//x' R U' R' D R U R' D' R U R' D R U' R' D' x
			
		}
		
		//Caso V
		
		//Caso R1
		else if(Character.getNumericValue(m.getPos(1, 2).charAt(m.getPos(1, 2).length() -1)) == centerThree &&
				Character.getNumericValue(m.getPos(3, 0).charAt(m.getPos(3, 0).length() -1)) == centerOne &&
				Character.getNumericValue(m.getPos(3, 3).charAt(m.getPos(3, 3).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(5, 1).charAt(m.getPos(5, 1).length() -1)) == centerThree
				) {
			//L U2' L' U2 L F' L' U' L U L F L2 U
			
		}//Caso R2
		else if(Character.getNumericValue(m.getPos(1, 2).charAt(m.getPos(1, 2).length() -1)) == centerThree &&
				Character.getNumericValue(m.getPos(3, 0).charAt(m.getPos(3, 0).length() -1)) == centerOne &&
				Character.getNumericValue(m.getPos(1, 5).charAt(m.getPos(1, 5).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(5, 1).charAt(m.getPos(5, 1).length() -1)) == centerOne
				) {
			//R' U2 R U2' R' F R U R' U' R' F' R2 U'
			
		}//Caso J1
		else if(Character.getNumericValue(m.getPos(2, 6).charAt(m.getPos(2, 6).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(2, 7).charAt(m.getPos(2, 7).length() -1)) == centerOne &&
				Character.getNumericValue(m.getPos(1, 5).charAt(m.getPos(1, 5).length() -1)) == centerTwo &&
				Character.getNumericValue(m.getPos(5, 0).charAt(m.getPos(5, 0).length() -1)) == centerTwo
				) {
			//F2' R U Lw' U2 Rw U' L U L2 x2
			
		}//Caso J2
		else if(Character.getNumericValue(m.getPos(2, 8).charAt(m.getPos(2, 8).length() -1)) == centerFive &&
				Character.getNumericValue(m.getPos(2, 7).charAt(m.getPos(2, 7).length() -1)) == centerThree &&
				Character.getNumericValue(m.getPos(3, 3).charAt(m.getPos(3, 3).length() -1)) == centerTwo &&
				Character.getNumericValue(m.getPos(5, 2).charAt(m.getPos(5, 2).length() -1)) == centerTwo
				) {
			//F2' L' U' Rw U2' Lw' U R' U' R2 x2
		}
		
	}
	
	public void caseF2L() {
		F2L();
	}
	public void caseOLL() {
		OLL();
	} 
	
	public void casePLL() {
		PLL();
	}
	
	private void performsMovements(String inputs) {
		for (String input : inputs.split(" ")) {
			if(input.length() == 2 && input.charAt(input.length()-1) == '2' && (input.charAt(0) == 'M' || input.charAt(0) == 'S' || input.charAt(0) == 'E' || input.charAt(0) == 'x' ||input.charAt(0) == 'y'||input.charAt(0) == 'z')) {
				t.cases(input.substring(0,input.length()-1));
				t.cases(input.substring(0,input.length()-1));
			}else if(input.length()>1 && input.charAt(1) == '2') {
				tds.cases(input);
			}else if(input.charAt(0) == 'x' || input.charAt(0) == 'y' || input.charAt(0) == 'z' || input.charAt(0) == 'M' || input.charAt(0) == 'S' ||input.charAt(0) == 'E' || (input.length() > 1 && input.charAt(1) == 'w')) {
				t.cases(input);
			}else if(ts.getTranslationToComputer(input).charAt(1) == 'R'){
				m.spinRightFront(Character.getNumericValue(ts.getTranslationToComputer(input).charAt(0)));
			}else if(ts.getTranslationToComputer(input).charAt(1) == 'L') {
				m.spinLeftBack(Character.getNumericValue(ts.getTranslationToComputer(input).charAt(0)));
			}
		}
	}
}