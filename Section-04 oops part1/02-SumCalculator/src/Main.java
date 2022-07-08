import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator=new Calculator();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first Number");
		Double firstNumber=sc.nextDouble();
		System.out.println("enter the second number");
		Double secondNumber=sc.nextDouble();
		
		calculator.setFirstNumber(firstNumber);
		calculator.setSecondNumber(secondNumber);
		
		double devision=calculator.getAddition();
		System.out.println(devision);
		
	}

}
