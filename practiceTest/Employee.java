package practiceTest;
import java.util.*;
public class Employee {

	private String firstName;
	private String lastName;

	public Employee(String fname, String lname) {
		this.firstName=fname;
		this.lastName =lname;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");

		String fname=sc.nextLine();

		System.out.println("Enter Last Name");
		String lname=sc.nextLine();

		Employee e = new Employee(fname,lname);

		System.out.println(e.firstName);
		System.out.println(e.lastName);

		System.out.println(e);

	}




}
