package cube.move;

import java.util.ArrayList;

/**
 * 
 * @author Felipe Ferreira da Silva Santos.
 * Data de finalização: 24/10/2018 - Colégio de Aplicação-UFPE
 * 
 */


public class Movimento{

    private int[][] lista = new int[6][9];
	private ArrayList<String> move = new ArrayList<>();
	char sentido;
    public Movimento(int[][] lista){
        int j = 0, i = 0;
        while(j<(lista.length)){
            for (int var : lista[j]) {
                this.lista[j][i] = var;
                i++;
                if(i>8){
                    i = 0;
                    j++;
                    break;
                }
            }
        }
    }

    public void print(){
        int j = 0, n = 0; 
        System.out.println("FACES  DO CUBO \n");
        while(j<lista.length){
                System.out.println();
                um:
                while (true) {
                    for (int i = 0; i < Math.sqrt(lista[0].length); i++) {
                        System.out.print(lista[j][n] + " ");
                        n++;
                    }
                    break um;
                }
            if(n>=lista[j].length){
                j++;
                n = 0;
                System.out.println();
            }
        }
    }
    public void spinRightFront(int face) {
    	sentido = 'R';
    	//giro dos elementos das face(parâmetro)
    	int[] copy = new int[9];
    	for (int i = 0; i < copy.length; i++) {
			copy[i] = lista[face][i];
		}

    	if(face == 1 || face == 4 || face == 5) {
	    	//elementos dos cantos
			lista[face][2]=copy[0];
	    	lista[face][8]=copy[2];
			lista[face][6]=copy[8];
			lista[face][0]=copy[6];
			//elementos entre os cantos
			lista[face][5]=copy[1];
			lista[face][7]=copy[5];
			lista[face][3]=copy[7];
			lista[face][1]=copy[3];
    	}
    	else if(face == 0 || face == 2 || face == 3){
			//elementos dos cantos
			lista[face][2]=copy[8];
	    	lista[face][8]=copy[6];
			lista[face][6]=copy[0];
			lista[face][0]=copy[2];
			//elementos entre os cantos
			lista[face][5]=copy[7];
			lista[face][7]=copy[3];
			lista[face][3]=copy[1];
			lista[face][1]=copy[5];
		
    	}
		int[] ant = new int[12];

		if (face == 0) {
			int i = 0;
			int faces = 1;
			int y = faces - 1;
			int contador = 0;
			int z = 0;
			//cópia
			for (int j = 6; j < 9; j++) {
				ant[i] = lista[5][j];
				i++;
			}
			while(true) {
				for (int j = 0; j < Math.sqrt(lista[faces].length); j++) {
					if(faces%2 == 0) {ant[i] = lista[faces][j];}
					else {
						ant[i] = lista[faces][y];
						y+=3;	
					}
					i++;
				}
				faces++;
				y = faces - 1;
				if(faces > 3) {break;}		
			}
			//troca
			for (int x = 1; x < 5; x++) {
				if(x==4) {
					x++;
				}
				z = x-1;
				for (int j = 0; j < Math.sqrt(lista[x].length); j++) {
					if(x%2==0){
						lista[x][j] = ant[contador];
					}
					else if(x==5) {lista[x][j+6] = ant[contador];}
					else {
						lista[x][z] = ant[contador];
						z+=3;
					}
					contador++;
				}

			}
		}
		else if(face == 4) {
			//cópia
			int i = 0, i2 = 0;
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {ant[i] = lista[5][j]; i++;}//5,1,2,3
			for (int j = 2; j <= 8; j+=3) {ant[i] = lista[1][j]; i++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {ant[i] = lista[2][j+6]; i++;}
			for (int j = 0; j <= 6 ; j+= 3) {ant[i] = lista[3][j]; i++;}
			//troca
			for (int j = 2; j <= 8; j+=3) {lista[1][j] = ant[i2];i2++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {lista[2][j+6] = ant[i2];i2++;}
			for (int j = 0; j <= 6 ; j+= 3) {lista[3][j] = ant[i2];i2++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {lista[5][j] = ant[i2];i2++;}
		}
		else if(face == 1) {
			//cópia

			int i = 0;
			for (int x = 5; x >= 0; x-=5) {
				for (int j = 6; j >= 0 ; j-=3) {
					if(x == 5) {
						ant[i] = lista[x][j]; i++;
					}
					else {
						ant[i] = lista[x][j+2]; i++;
					}
				}
			}
			for (int x = 2; x <= 4; x+= 2) {for (int j = 0; j <= 6; j+= 3) {ant[i] = lista[x][j]; i++;}}
			//troca
			i = 0;
			for (int x = 0; x <= 6; x+=2) {
				for (int j = 0; j <= 6; j+= 3) {
					if (x == 0) {lista[x][j+2] =  ant[i];i++;}
					else if(x==6) {lista[x-1][j] =  ant[i];i++;}
					else {lista[x][j] =  ant[i];i++;}
				}
			}	
		}
		else if(face == 3) {
			//cópia
			int i = 0;
			for (int x = 5; x >= 0; x-=5) {
				for (int j = 6; j >= 0 ; j-=3) {
					if(x == 5) {
						ant[i] = lista[x][j+2]; i++;
					}
					else {
						ant[i] = lista[x][j]; i++;
					}
				}
			}
			for (int x = 2; x <= 4; x+= 2) {for (int j = 0; j <= 6; j+= 3) {ant[i] = lista[x][j+2]; i++;}}
			//troca
			i = 0;
			for (int x = 0; x <= 6; x+=2) {
				for (int j = 0; j <= 6; j+= 3) {
					if (x == 0) {lista[x][j] =  ant[i];i++;}
					else if(x==6) {lista[x-1][j+2] =  ant[i];i++;}
					else {lista[x][j+2] =  ant[i];i++;}
				}
			}	
			
		}
		else if(face == 2) {
			int i = 0, count = 0;
			//cópia
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {ant[i] = lista[0][j];i++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {ant[i] = lista[1][j];i++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {ant[i] = lista[4][j];i++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {ant[i] = lista[3][j];i++;}
			
			//troca
			i = 1;
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {lista[0][j] = ant[ant.length - i];i++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {lista[1][j] = ant[count];count++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {lista[4][j] = ant[count];count++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {lista[3][j] = ant[count];count++;}
		}
		else if(face == 5) {
			int i = 0, count = 0;
			//cópia
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {ant[i] = lista[0][j+6];i++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {ant[i] = lista[1][j+6];i++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {ant[i] = lista[4][j+6];i++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {ant[i] = lista[3][j+6];i++;}

			//troca
			i = 1;
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {lista[0][j+6] = ant[ant.length - i];i++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {lista[1][j+6] = ant[count];count++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {lista[4][j+6] = ant[count];count++;}
			for (int j = 0; j < Math.sqrt(lista[face].length); j++) {lista[3][j+6] = ant[count];count++;}
		}
		move.add(String.valueOf(face)+String.valueOf(sentido)+ " ");
		
	}
    public void spinLeftBack(int face) {
    	for (int i = 0; i < 3; i++) {spinRightFront(face);}
    	ignoreMove();
    	sentido = 'L';
    	move.add(String.valueOf(face)+String.valueOf(sentido)+ " ");
    }
    public ArrayList<String> getMove(){
    	return move;
    }
    public String indexof(int cubinho , int adjacente) {
    	int pos = 0, face = 0;
    	while(pos == 0) {
	    	if(face == 0) {
	    		int x = 1,  j = 1, i = 1;	
    			while(true) {
					if(j == 1) {x = 1; i = 2;}
					else if(j == 7) {x = j; i = 5;}
					else if(j == 5) {x = 3; i = 1;}
					else if(j == 3) {x = 5; i = 3;}
					if(j>7) {break;}
					else if(lista[face][j] == cubinho && lista[i][x] == adjacente) {pos = j; break;}//retorna a posição de tal elemento
					j+= 2;
    			}
	    	}
	    	else if(face == 1) {
	    		int x = 1,  j = 1, i = 1;	
    			while(true) {
					if(j == 1) {x = 1; i = 2;}
					else if(j == 7) {x = 3; i = 5;}
					else if(j == 5) {x = 3; i = 4;}
					else if(j == 3) {x = 5; i = 0;}
					if(j>7) {break;}
					else if(lista[face][j] == cubinho && lista[i][x] == adjacente) {pos = j; break;}//retorna a posição de tal elemento
					
					j+= 2;
    			}
	    	}
	    	else if(face == 2) {
	    		int j = 1;
				for (int i = 0; i < 5 ; i++,j+=2) {
					if(i == 2) {
						j-=2;
						continue;
					}
					if(lista[face][j] == cubinho && lista[i][1] == adjacente) {pos = j;}//retorna a posição de tal elemento
				}
	    	}
	    	else if(face == 3) {
	    		int x = 1,  j = 1, i = 1;	
    			while(true) {
					if(j == 1) {x = 5; i = 2;}
					else if(j == 7) {x = 5; i = 5;}
					else if(j == 5) {x = 3; i = 0;}
					else if(j == 3) {x = 5; i = 4;}
					if(j>7) {break;}
					else if(lista[face][j] == cubinho && lista[i][x] == adjacente) {pos = j; break;}//retorna a posição de tal elemento
					
					j+= 2;
    			}
	    	}
	    	else if(face == 4) {   		
	    		int x = 1,  j = 1, i = 1;	
    			while(true) {
					if(j == 1) {x = 7; i = 2;}
					else if(j == 7) {x = 1; i = 5;}
					else if(j == 5) {x = 3; i = 3;}
					else if(j == 3) {x = 5; i = 1;}
					if(j>7) {break;}
					else if(lista[face][j] == cubinho && lista[i][x] == adjacente) {pos = j; break;}//retorna a posição de tal elemento
					
					j+= 2;
    			}
	    	}
	    	else if(face == 5) {
	    		int x = 7,  j = 1, i = 1;	
    			while(true) {
					if(j == 1) {i = 4;}
					else if(j == 7) {i = 0;}
					else if(j == 5) {i = 3;}
					else if(j == 3) {i = 1;}
					if(j>7) {break;}
					else if(lista[face][j] == cubinho && lista[i][x] == adjacente) {pos = j; break;}//retorna a posição de tal elemento
					
					j+= 2;
    			}
	    	}
	    	face++;
    	}
    	return "face ".concat(String.valueOf(face-1)).concat(" posição ").concat(String.valueOf(pos));
    }
    public String indexof(int cubinho, int adjacente_cima, int adjacente_ao_lado) {//adjacente_cima->eixo y ; adjacente_ao_lado->eixo x
    	int pos = 0, face = 0;
    	um:
    	while(pos==0) {
    		if(face == 0) {
	    		int x = 1,  j = 0, i = 1, i1 = 0;	
    			while(true) {
					
					if(j == 2) {x = 0; i = 2; i1 = 1;}
					else if(j == 8) {x = 6; i = 5; i1 = 1;}
					else if(j == 6) {x = 8; i = 5; i1 = 3;}
					else if(j == 0) {x = 2; i = 3; i1 = 2;}
					if(j>8) {break;}	
					if(lista[face][j] == cubinho && ((lista[i][x] == adjacente_cima && lista[i1][x] == adjacente_ao_lado) ||(lista[i][x] == adjacente_ao_lado && lista[i1][x] == adjacente_cima))) {pos = j;break um;}//retorna a posição de tal elemento
					j+= 2;
    			}
    		}
    		else if(face == 2) {
    			int x = 1, x1 = 0, j = 0, i = 1, i1 = 0;	
    			while(true) {
					
    				if(j == 0) {x = 0; x1 = 2; i = 1; i1 = 0;}
    				else if(j == 2) {x = 2; x1 = 0;i = 3; i1 = 0;}
					else if(j == 8) {x = 0; x1 = 2; i = 3; i1 = 4;}
					else if(j == 6) {x = 2; x1 = 0; i = 1; i1 = 4;}	
					if(j>8) {break;}	
					if(lista[face][j] == cubinho && ((lista[i][x] == adjacente_cima && lista[i1][x1] == adjacente_ao_lado) ||(lista[i][x] == adjacente_ao_lado && lista[i1][x1] == adjacente_cima))) {pos = j;break um;}//retorna a posição de tal elemento
					j+= 2;
    			}
    		}
    		else if(face == 1) {
    			int x = 1, x1 = 0, j = 0, i = 1, i1 = 0;	
    			while(true) {
					
    				if(j == 0) {x = 2; x1 = 0;i = 0; i1 = 2;}
    				else if(j == 2) {x = 6; x1 = 0;i = 2; i1 = 4;}
					else if(j == 8) {x = 6; x1 = 6; i = 4; i1 = 5;}
					else if(j == 6) {x = 8; x1 = 0; i = 0; i1 = 5;}	
					if(j>8) {break;}	
					if(lista[face][j] == cubinho && ((lista[i][x] == adjacente_cima && lista[i1][x1] == adjacente_ao_lado) ||(lista[i][x] == adjacente_ao_lado && lista[i1][x1] == adjacente_cima))) {pos = j;break um;}//retorna a posição de tal elemento
					j+= 2;
    			}
    		}
    		else if(face == 3) {
    			int x = 1, x1 = 0, j = 0, i = 1, i1 = 0;	
    			while(true) {
					
    				if(j == 0) {x = 8; x1 = 2; i = 2; i1 = 4;}
    				else if(j == 2) {x = 2; x1 = 0; i = 2; i1 = 0;}
					else if(j == 8) {x = 6; x1 = 8; i = 0; i1 = 5;}
					else if(j == 6) {x = 8; x1 = 2; i = 4; i1 = 5;}	
					if(j>8) {break;}	
					if(lista[face][j] == cubinho && ((lista[i][x] == adjacente_cima && lista[i1][x1] == adjacente_ao_lado) ||(lista[i][x] == adjacente_ao_lado && lista[i1][x1] == adjacente_cima))) {pos = j;break um;}//retorna a posição de tal elemento
					j+= 2;
    			}
    		}
    		else if(face == 4) {
    			int x = 1, x1 = 0, j = 0, i = 1, i1 = 0;	
    			while(true) {
					
    				if(j == 0) {x = 2; x1 = 6; i = 1; i1 = 2;}
    				else if(j == 2) {x = 0; x1 = 8; i = 3; i1 = 2;}
					else if(j == 8) {x = 6; x1 = 2; i = 3; i1 = 5;}
					else if(j == 6) {x = 8; x1 = 0; i = 1; i1 = 5;}	
					if(j>8) {break;}	
					if(lista[face][j] == cubinho && ((lista[i][x] == adjacente_cima && lista[i1][x1] == adjacente_ao_lado) ||(lista[i][x] == adjacente_ao_lado && lista[i1][x1] == adjacente_cima))) {pos = j;break um;}//retorna a posição de tal elemento
					j+= 2;
    			}
    		}
    		else if(face == 5) {
    			int x = 1, x1 = 0, j = 0, i = 1, i1 = 0;	
    			while(true) {
					
    				if(j == 0) {x = 8; x1 = 6; i = 1; i1 = 4;}
    				else if(j == 2) {x = 6; x1 = 8;i = 3; i1 = 4;}
					else if(j == 8) {x = 8; x1 = 6; i = 3; i1 = 0;}
					else if(j == 6) {x = 6; x1 = 8; i = 1; i1 = 0;}	
					if(j>8) {break;}	
					if(lista[face][j] == cubinho && ((lista[i][x] == adjacente_cima && lista[i1][x1] == adjacente_ao_lado) ||(lista[i][x] == adjacente_ao_lado && lista[i1][x1] == adjacente_cima))) {pos = j;break um;}//retorna a posição de tal elemento
					j+= 2;
    			}
    		}
    		face++;
    	}
    	return "face ".concat(String.valueOf(face)).concat(" posição ").concat(String.valueOf(pos));
	}
    public String getPos(int face, int posicao) {return "Nessa posição estar o cubinho de cor:\t" + String.valueOf(lista[face][posicao]);}
    public void finishMove() {move.add("end");}
    
    public void moveAxisZNegative() {
    	/*CÓPIAS*/
    	int[] copy = new int[9];
    	int[] copy1 = new int[9];
    	int[] copy2 = new int[36];
    	for (int i = 0; i < copy.length; i++) {
			copy[i] = lista[4][i];
		}
    	for (int i = 0; i < copy1.length; i++) {
			copy1[i] = lista[0][i];
		}
    	//FACE 5
    	int[] ordem = {2,5,8,1,4,7,0,3,6};
    	for (int i = 0; i < copy2.length/4; i++) {
			copy2[i] = lista[5][ordem[i]];
		}
    	//FACE 3    	
    	for (int i = 0; i < copy2.length/4; i++) {
    		copy2[i + 9] = lista[3][ordem[i]];
		}	
    	//FACE 2
    	for (int i = 0; i < copy2.length/4; i++) {
    		copy2[i + 18] = lista[2][ordem[i]];
		}
    	//FACE 1
    	
    	for (int i = 0; i < copy2.length/4; i++) {
    		copy2[i + 27] = lista[1][ordem[i]];
		}
    	/*FACE 4*/
    	//elementos dos cantos
		lista[0][2]=copy1[0];
    	lista[0][8]=copy1[2];
		lista[0][6]=copy1[8];
		lista[0][0]=copy1[6];
		//elementos entre os cantos
		lista[0][5]=copy1[1];
		lista[0][7]=copy1[5];
		lista[0][3]=copy1[7];
		lista[0][1]=copy1[3];

		/*FACE 0*/
		//elementos dos cantos
		lista[4][2]=copy[8];
    	lista[4][8]=copy[6];
		lista[4][6]=copy[0];
		lista[4][0]=copy[2];
		//elementos entre os cantos
		lista[4][5]=copy[7];
		lista[4][7]=copy[3];
		lista[4][3]=copy[1];
		lista[4][1]=copy[5];
		
		int element = 0;		
		for (int i = 3; i > 0; i--) {
			for (int j = 0; j < lista[i].length; j++) {
				lista[i][j] = copy2[element];				
				element++;
			}
		}
		element = 27;
		for (int i = 0; i < lista[5].length; i++) {
			lista[5][i] = copy2[element];
			element++;
		}
		move.add("z' ");
    }
    public void moveAxisZPositive() {
    	for (int i = 0; i < 3; i++) {
			moveAxisXNegative();
		}
    	ignoreMove();
    	move.add("z ");
    }
    public void moveAxisYPositive() {
    	//Face 5
    	int[] canto = {1,5,7,3};
    	int[] quina = {8,6,0,2};
    	for (int i = 0; i < canto.length - 1; i++) {
			lista[5][canto[i]] += lista[5][canto[i+1]];
			lista[5][canto[i+1]] = lista[5][canto[i]] - lista[5][canto[i+1]];
			lista[5][canto[i]] = lista[5][canto[i]] - lista[5][canto[i+1]];
			
			lista[5][quina[i]] += lista[5][quina[i+1]];
			lista[5][quina[i+1]] = lista[5][quina[i]] - lista[5][quina[i+1]];
			lista[5][quina[i]] = lista[5][quina[i]] - lista[5][quina[i+1]];
		}
    	//Face 2
    	int[] canto0 = {3,7,5,1};
    	int[] quina0 = {6,8,2,0};
    	for (int i = 0; i < canto0.length - 1; i++) {
			lista[2][canto0[i]] += lista[2][canto0[i+1]];
			lista[2][canto0[i+1]] = lista[2][canto0[i]] - lista[2][canto0[i+1]];
			lista[2][canto0[i]] = lista[2][canto0[i]] - lista[2][canto0[i+1]];
			
			lista[2][quina0[i]] += lista[2][quina0[i+1]];
			lista[2][quina0[i+1]] = lista[2][quina0[i]] - lista[2][quina0[i+1]];
			lista[2][quina0[i]] = lista[2][quina0[i]] - lista[2][quina0[i+1]];
		}
    	//Face 0;1;4;3
    	int[] faces = {0,1,4,3};
    	
    	for (int i = 0; i < faces.length-1; i++) {
			for (int j = 0; j < lista[faces[i]].length; j++) {
				lista[faces[i]][j] += lista[faces[i+1]][j] ;
				lista[faces[i+1]][j] = lista[faces[i]][j] - lista[faces[i+1]][j];
				lista[faces[i]][j] = lista[faces[i]][j] - lista[faces[i+1]][j];
			}
		}
    	move.add("y ");
    }
    public void moveAxisYNegative() {
    	for (int i = 0; i < 3; i++) {
    		moveAxisYPositive();
		}
    	ignoreMove();
    	move.add("y' ");
    }
    public void moveAxisXNegative() {
    	//Face 5
    	int[] canto = {1,5,7,3};
    	int[] quina = {8,6,0,2};
    	for (int i = 0; i < canto.length - 1; i++) {
			lista[3][canto[i]] += lista[3][canto[i+1]];
			lista[3][canto[i+1]] = lista[3][canto[i]] - lista[3][canto[i+1]];
			lista[3][canto[i]] = lista[3][canto[i]] - lista[3][canto[i+1]];
			
			lista[3][quina[i]] += lista[3][quina[i+1]];
			lista[3][quina[i+1]] = lista[3][quina[i]] - lista[3][quina[i+1]];
			lista[3][quina[i]] = lista[3][quina[i]] - lista[3][quina[i+1]];
		}
    	//Face 2
    	int[] canto0 = {3,7,5,1};
    	int[] quina0 = {6,8,2,0};
    	for (int i = 0; i < canto0.length - 1; i++) {
			lista[1][canto0[i]] += lista[1][canto0[i+1]];
			lista[1][canto0[i+1]] = lista[1][canto0[i]] - lista[1][canto0[i+1]];
			lista[1][canto0[i]] = lista[1][canto0[i]] - lista[1][canto0[i+1]];
			
			lista[1][quina0[i]] += lista[1][quina0[i+1]];
			lista[1][quina0[i+1]] = lista[1][quina0[i]] - lista[1][quina0[i+1]];
			lista[1][quina0[i]] = lista[1][quina0[i]] - lista[1][quina0[i+1]];
		}
    	//Face 0;1;4;3
    	int[] faces = {5,4,2,0};
    	
    	for (int i = 0; i < faces.length-1; i++) {
			for (int j = 0; j < lista[faces[i]].length; j++) {
				lista[faces[i]][j] += lista[faces[i+1]][j] ;
				lista[faces[i+1]][j] = lista[faces[i]][j] - lista[faces[i+1]][j];
				lista[faces[i]][j] = lista[faces[i]][j] - lista[faces[i+1]][j];
			}
		}
    	move.add("x' ");
    }
    public void moveAxisXPositive() {
    	for (int i = 0; i < 3; i++) {
    		moveAxisXNegative();
		}
    	ignoreMove();
    	move.add("x ");
    }
    public void moveRw() {
    	moveAxisXPositive();
    	spinRightFront(1);
    	moveAxisXNegative();
    	move.add("Rw ");
    }
    public void moveRwNegative(){
    	//moveRw();
    	//moveAxisXNegative();
    	moveAxisXNegative();
    	spinLeftBack(1);
    	moveAxisXPositive();
    	move.add("Rw' ");
    }
    public void moveRw2() {
    	moveRw();
    	moveAxisXPositive();
    	moveRw();
    	move.add("Rw2 ");
    }
    public void moveLw() {
    	moveAxisXNegative();
    	spinLeftBack(3);
    	moveAxisXPositive();
    	move.add("Lw ");
    } 
    public void moveLwNegative() {
    	moveAxisXPositive();
    	spinRightFront(3);
    	moveAxisXNegative();
    	move.add("Lw' ");
    }
    public void moveLw2() {
    	moveLw();
    	moveAxisXPositive();
    	moveLw();
    	move.add("Lw2 ");
    }
    public void moveUw() {
    	moveAxisYPositive();
    	spinRightFront(5);
    	moveAxisYNegative();
    	move.add("Uw ");
    }
    public void moveUwNegative() {
    	moveAxisYNegative();
    	spinLeftBack(5);
    	moveAxisYPositive();
    	move.add("Uw' ");
    }
    public void moveUw2() {
    	moveUw();
    	moveAxisYPositive();
    	moveUw();
    	move.add("Uw2 ");
    }
    public void moveDw() {
    	moveAxisYNegative();
    	spinLeftBack(2);
    	moveAxisYPositive();
    	move.add("Dw ");
    }
    public void moveDwNegative() {
    	moveAxisYPositive();
    	spinRightFront(2);
    	moveAxisYNegative();
    	move.add("Dw' ");
    }
    public void moveDw2() {
    	moveDw();
    	moveAxisYNegative();
    	moveDw();
    	move.add("Dw2 ");
    }
    public void moveFw() {
    	moveAxisZPositive();
    	spinLeftBack(0);
    }
    public void moveFwNegative() {
    	moveAxisZNegative();
    	spinRightFront(0);
    }
    public void moveFw2() {
    	moveFw();
    	moveFw();
    }
    private void ignoreMove() {
    	for (int i = 0; i < 3; i++) {
    		move.remove(move.get(move.size()-1));
		}
    }
}