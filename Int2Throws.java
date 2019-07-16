package Assesment3Ex;

import java.util.Scanner;

public class Int2Throws {		 
	static void Exception(){
		try{
		Scanner s = new Scanner(System.in);
	     System.out.print("Enter the number: ");
	     int n = s.nextInt();
	     int n1= 0;
	      n=n/n1;
          throw new ArithmeticException("e"); 
		}
		catch(ArithmeticException e){
			System.out.println("Exception inside the function Exception()\n");
		    throw e;
		}
}
	public static void main(String[] args)
	{
		try{
			 Exception();
			}
			catch(ArithmeticException e){
				System.err.println("Exception caught in main\n");
	}			
}
}

