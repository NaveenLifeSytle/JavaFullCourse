import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Persion persion=new Persion();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first name");
	String fName=sc.nextLine();
	persion.setFirstName(fName);
	System.out.println("Enter the LastName");
	String lName=sc.nextLine();
	persion.setLastName(lName);

	String fullName=persion.getFullName();
	System.out.println("fullName:"+fullName);

	}

}
