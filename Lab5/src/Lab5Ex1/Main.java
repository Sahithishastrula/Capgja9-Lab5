package Lab5Ex1;
import java.util.*;
class AgeException extends Exception {
	 
	 public AgeException(String str) {
	  System.out.println(str);
	 }
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter ur age :: ");
		  int age = s.nextInt();
		  
		  try {
		   if(age < 18) 
		    throw new AgeException("Invalid age");
		   else
		    System.out.println("Valid age");
		  }
		  catch (AgeException a) {
		   System.out.println(a);
		  }


	}

}
