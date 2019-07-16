package Assesment3Ex;
import java.util.*;
public class IntString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int s3=0;
try{
System.out.println("Enter an Integer");
String s1=s.next();
int s2=Integer.parseInt(s1);
  s3=s2*s2;
System.out.println(s3);

}

catch(NumberFormatException e){
System.out.println("Entered string is not in valid format for an integer");
}

}
}
