package Case2;

import java.util.Scanner;

public class ParseInts{
	public static void main(String[] args){
		int val, sum=0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line;
		
		System.out.println("Enter a line of text");
		Scanner scanLine = new Scanner(scan.nextLine());
		
		try{
			while (scanLine.hasNext()){
			try{
				val = Integer.parseInt(scanLine.next());				
				sum += val;
			}catch(NumberFormatException e){
				
			}
		}
		System.out.println("The sum of the integers on this line is " +sum);
		} catch(NumberFormatException e){
			
		}
	}
}