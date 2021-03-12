package Lab5Ex2;
import java.util.*;
class NameException extends Exception{
	public NameException(String s) {
		System.out.println(s+"Invalid Name : Missing required parameters");
	}
}
public class NameExcExamp {
	public static void nameCheck(String fn,String ln) throws NameException {
		if(fn==null || ln==null ) {
			throw new NameException("Naming Exception");
		}
		else {
			System.out.println(fn+" "+ln);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input:");
		String firstName=sc.nextLine();
		String lastName=sc.nextLine();
		try {
			if(firstName=="" || lastName=="" ) {
				throw new NameException("Naming Exception");
			}
			else {
				System.out.println(firstName+" "+lastName);
			}
		}
		catch(NameException e) {
			System.out.println("Caught Exception");
			System.out.println(e.getMessage());
		}

	}

}
