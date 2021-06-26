package Case3;

import java.util.Scanner;

public class Factorials {
	public static void main(String[] args){
		String keepGoing = "y";
	    @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	    
	    while (keepGoing.equals("y") || keepGoing.equals("Y")){
	    	System.out.print("Enter an integer: ");
	        
	    	try {
	    		int val = scan.nextInt();       
	            System.out.println("Factorial(" + val + ") = "+ MathUtil.factorial(val));    
	        }catch (IllegalArgumentException ex) {          
	        	System.err.println(ex);
	        }       
	        
	    	System.out.print("Another factorial? (y/n) ");
	    	keepGoing = scan.next();
	   }
	}
}
