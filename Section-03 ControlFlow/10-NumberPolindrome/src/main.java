import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nl = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number= nl.nextInt();
	boolean poli=	isPalindrome( number);
	if(poli) {
		System.out.println("polindrome");
	}
	else {
		System.out.println("not polindrome");
	}
	}
	
	public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int numberCopy = number;
        int reverse = 0,lastDigit = 0;
        while (numberCopy > 0) {
            lastDigit = numberCopy % 10;
            reverse = reverse * 10 + lastDigit;
            numberCopy /= 10;
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

}
