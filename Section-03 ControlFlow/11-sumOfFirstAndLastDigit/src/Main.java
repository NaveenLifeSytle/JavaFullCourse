import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner nl = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number= nl.nextInt();
		
		int sumOf=sumFirstAndLastDigit(number);
		System.out.println("SumOfFirstAndLastDigit = "+sumOf);
		

	}
	public static int sumFirstAndLastDigit(int number) {
	    if(number<0)
	    {
	      return -1;
	    }
	        number = Math.abs(number);
	        int sum=0;
	       int first=number%10;
	        int numberCopy = number;
	        int reverse = 0,lastDigit = 0;
	        while (numberCopy> 0) {
	            lastDigit = numberCopy % 10;
	            reverse = reverse * 10 + lastDigit;
	            numberCopy /= 10;
	        }
	        int last = reverse%10;
	        sum =first+last;
	        return sum;
	        
	    }
}
