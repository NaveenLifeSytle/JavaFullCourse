import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("enter age: ");
          int age=sc.nextInt();
		    
	        
		
		boolean isTeen= TeenNumberChecker.isTeen(age);
		if(isTeen) {
			System.out.println("Teen ");
		}
		else {
			System.out.println("Not Teen");
			}

	}

}
