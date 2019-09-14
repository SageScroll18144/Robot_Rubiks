package cube.test;

import cube.move.Movimento;

public class TesteIndexAndGet {
	public static void main(String[] args) {

		 int[][] novo = {{0,0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1,1},{2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3},{4,4,4,4,4,4,4,4,4},{5,5,5,5,5,5,5,5,5}};  
	        
	        Movimento c = new Movimento(novo);
	            
        	c.spinRightFront(2);
        	c.print();
        	String g = c.indexof(4, 2);
        	String f = c.getPos(4, 1);
        	System.out.println("\n"+c.indexof(4, 2));
        	System.out.println("\n"+c.indexof(2, 4));
        	System.out.println(c.getPos(4, 1));
        	System.out.println(g.charAt(5));
        	System.out.println(g.charAt(15));
        	System.out.println(f.charAt(37));
        	
        	
    
	        	
			
	}
}
