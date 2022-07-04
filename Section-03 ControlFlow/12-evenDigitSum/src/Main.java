import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner nl = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number= nl.nextInt();
		
		int sumOf= getEvenDigitSum(number);
		System.out.println("SumOfEvenDigit = "+sumOf);
	}
	  public static int getEvenDigitSum(int number) {
		    if(number<0)
		    {
		      return -1;
		    }
		        number = Math.abs(number);
		        int sumOfEvenDigit=0;
		       int first=number%10;
		        int numberCopy = number;
		        int reverse = 0,lastDigit = 0;
		        while (numberCopy >0) {
		            lastDigit = numberCopy % 10;
		            if(lastDigit%2==0){
		            sumOfEvenDigit = sumOfEvenDigit + lastDigit;
		            }
		            numberCopy /= 10;
		        }
		        return sumOfEvenDigit;
		        
		    }
}
