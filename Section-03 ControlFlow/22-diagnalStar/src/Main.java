import java.util.Scanner;

public class Main {
	 public static final String INVALID_MESSAGE = "Invalid Value";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nl = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number= nl.nextInt();
		printSquareStar(number);
	}
	 

	    public static void printSquareStar(int number) {
	        if (number < 5)  {
	            System.out.println(INVALID_MESSAGE);
	        } else {
	            for (int i = 1; i <= number; i++) {
	                for (int j = 1; j <= number; j++) {
	                    if ((i == 1) || (i == number) || (j == 1) || (j== number) || (i == j) || (i + j == number + 1) ) {
	                        System.out.print("*");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	                System.out.println();
	            }


	        }
	    } 

}
