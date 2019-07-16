package Assesment3Ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int index;
		try{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of elements in array:\n");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++) 
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter index value of the array you want to acccess:");
        index =s.nextInt();
        for (int i=0;i<n;i++){ 
        	if(a[i]==a[index]){
        		System.out.println("The array element at index "+index+" = "+a[i]);
        		System.out.println("The array element successfully accessed");
        	}
        }  
        }
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(InputMismatchException e){
			System.out.println("java.lang.NumberFormatException");
		}
	}

}
