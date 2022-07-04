import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner nl = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number= nl.nextInt();
		
		boolean isPerfect=isPerfectNumber(number);
		
		if(isPerfect) {
			System.out.println("The Perfact Number");
		}
		else {
			System.out.println("not Perfect Number");
		}
	}
	public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int result = 0;
        for (int i = 1; i<number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        if (result == number) {
            return true;
        } else {
            return false;
        }
    }
}
