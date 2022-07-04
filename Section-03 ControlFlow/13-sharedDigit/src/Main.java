import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
Scanner nl = new Scanner(System.in);
		
		System.out.println("Enter the number 1");
		int number1= nl.nextInt();

		System.out.println("Enter the number 2");
		int number2= nl.nextInt();
		
		 boolean shared=hasSharedDigit(number1, number2);
		 
	if(shared) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	}
	 public static boolean hasSharedDigit(int n1, int n2){
	      if((n1<10 || n1>99) || (n2<10 || n2>99)) {
	        return false;
	      }
	      int firstleft=n1/10;
	     int firstright=n1 % 10;
	      int secondleft=n2/10;
	      int secondright=n2 % 10;
	      if(firstleft==secondleft || firstleft==secondright || firstright==secondright ||firstright==secondleft){
	        return true;
	      }  
	      return false;
	      
	    }

}
