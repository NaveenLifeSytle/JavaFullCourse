import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
Scanner nl = new Scanner(System.in);
		
		System.out.println("Enter the number 1");
		int number1= nl.nextInt();

		System.out.println("Enter the number 2");
		int number2= nl.nextInt();
		
	int gcd=getGreatestCommonDivisor(number1,number2);
	
	System.out.println("the gcd= "+gcd);
	}
	 public static int getGreatestCommonDivisor (int first, int second) {
	        int greatest = 0;

	        if(first>= 10 && second >= 10){

	            for(int i = 1; ((i <= first) && (i <=second)); i++ ){
	                if((first % i == 0) && (second % i == 0)){
	                    greatest = i;
	                }
	            }
	            

	        return greatest;

	        } else
	            
	        return -1;
	    }
}
