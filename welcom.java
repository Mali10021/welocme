import java.util.Scanner;

public class welcom {

	public static void main(String[] args) {
		
		String firstName, lastName;
		
		Scanner read = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		firstName = read.next();
		
		
		System.out.print("Enter Last Name: ");
		lastName = read.next();
		
		System.out.println("Welcome to my github, Mr." + firstName + " " + lastName);

	}

}
