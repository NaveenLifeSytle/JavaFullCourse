import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the first num :");
           float num1=sc.nextFloat();
		     System.out.println("enter the Second num :");
	        float num2=sc.nextFloat();
		
		boolean isDecimal= DecimalComparator.areEqualByThreeDecimalPlaces(num1, num2);
		
		if(isDecimal) {
			System.out.println("The Given Numbers are equal");
		}
		else {
			System.out.println("The Given Numbers are notequal");
			}

	
	}
	
	
}
