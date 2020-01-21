package cube.test;


import cube.move.Movimento;

public class Teste{
    
  
	//FELIPE MITO!
	
    public static void main(String[] args) {
    
        int[][] novo = {{0,0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1,1},{2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3},{4,4,4,4,4,4,4,4,4},{5,5,5,5,5,5,5,5,5}};  
        
     //   novo[1][6] = 9;
     
        Movimento c = new Movimento(novo);
        c.print();
        System.out.println("-----------------------------------");
       /* c.moveAxisXNegative();
        c.moveAxisXPositive();
        c.moveAxisYNegative();
        c.moveAxisYPositive();
        c.moveAxisZPositive();
        c.moveAxisZNegative();*/
      //  c.spinLeftBack(2);
       // c.spinRightFront(2);
       // c.spinRightFront(2);
       // c.spinRightFront(2);
        //c.spinRightFront(2);
        //c.spinRightFront(2);
        
        
        c.moveMNegative();
      //  c.moveAxisXNegative();
       // c.moveAxisZPositive();
        System.out.println(c.getMove());
        c.print();
       
        /* for (int i = 0; i < 3; i++) {
        	c.spinRightFront(2);
            c.spinRightFront(5);
            c.spinRightFront(1);
            c.spinRightFront(3);
        	
		}
        
              
      //  c.spinLeftBack(0);
        c.print();
        ArrayList<String> move = c.getMove();
        System.out.println();
        for (int i = 0; i < move.size(); i++) {
			System.out.print(move.get(i) + "\t");
		}
        System.out.println();
        //System.out.println(c.getPosCentral(5, 0));
        System.out.println(c.indexof(4, 2, 1)); 
        System.out.println(c.indexof(4, 2, 3));
        System.out.println(c.indexof(4, 5, 1));
        System.out.println(c.indexof(4, 5, 3));*/
        
        
    }

}