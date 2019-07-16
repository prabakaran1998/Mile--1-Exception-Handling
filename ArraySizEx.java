package Assesment3Ex;
import java.util.*;
public class ArraySizEx {

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
        		System.out.println(a[i]);
        	}
        }
        }
		catch(Exception e){
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
        
		

	}
}