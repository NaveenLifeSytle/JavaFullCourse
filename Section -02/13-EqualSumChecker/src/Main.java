import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the first num :");
          int num1=sc.nextInt();
		     System.out.println("enter the Second num :");
		     int num2=sc.nextInt();
	        System.out.println("enter the third num :");
	        int num3=sc.nextInt();
	        
		
		boolean isEqual=  EqualSumChecker.hasEqualSum(num1, num2, num3);
		if(isEqual) {
			System.out.println("The Given Numbers are equal");
		}
		else {
			System.out.println("The Given Numbers are notequal");
			}

	
	}

	}


