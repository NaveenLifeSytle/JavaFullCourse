import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner nl = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number= nl.nextInt();
		printFactors(number);
		
	}
	public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
        } else {
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.print(i + " ");
            }
        } 
        }
    }
}
