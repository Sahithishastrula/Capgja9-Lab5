package Lab5Ex3;
import java.util.*;
class EmployeeException extends Exception{

	public EmployeeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		System.out.println(message+"Salary is low Exception");
	}
	
}

public class EmployeeExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input:");
		String name=sc.nextLine();
		int sal=sc.nextInt();
		try {
			if(sal<3000)
				throw new EmployeeException("Employee Exception ");
			else
				System.out.println(name+":"+sal);
		}
		catch(EmployeeException e) {
			System.out.println("caught exception");
			System.out.println(e.getMessage());
		}

	}

}
