import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
	Scanner nl = new Scanner(System.in);
			
			System.out.println("Enter the number");
			int number= nl.nextInt();
			int largestPrime=getLargestPrime( number);
			System.out.println("largest Prime Number : "+largestPrime);
			
			System.out.println(Math.sqrt(5.2642960518099695));
	}
	public static final int INVALID_MESSAGE = -1;

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return INVALID_MESSAGE;
        }
        int maxPrime = -1;
        while (number % 2 == 0) {
            maxPrime = 2;
            number >>= 1;
        }
        for (int i = 3; i <=Math.sqrt(number); i += 2) {
        	System.out.println(number);
            while (number % i == 0) {
                maxPrime = i;
                number /= i;
               
            }
            
        }
        System.out.println(number);
       if (number > 2) {
            maxPrime = number;
       }
        return maxPrime;


    }

}
