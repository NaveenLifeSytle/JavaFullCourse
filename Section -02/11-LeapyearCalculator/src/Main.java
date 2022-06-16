import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the year");
		int year=sc.nextInt();
		
		boolean isLp=LeapYear.isLeapYear(year);
		
		if(isLp) {
			System.out.println("leap year😍");
		}
		else {
			System.out.println("not leap year🐱‍👤🐱");
		}

	}

}
