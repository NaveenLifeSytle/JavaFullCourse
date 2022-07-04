import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner nl = new Scanner(System.in);
		
		System.out.println("Enter the number 1");
		int number1= nl.nextInt();

		System.out.println("Enter the number 2");
		int number2= nl.nextInt();
		
		System.out.println("Enter the number 3");
		int number3= nl.nextInt();
		
		 boolean asSameLast=hasSameLastDigit(number1, number2,number3);
		 
	if(asSameLast) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	}
	 public static boolean hasSameLastDigit(int n1, int n2, int n3){
	      if( (n1<10 || n1>1000) || (n2<10 || n2>1000 ) || (n3<10 || n3>1000)){
	        return false;
	      }
	      
	      if(((n1%10) == (n2%10)) || ((n1%10) == (n3%10)) || ((n2%10) == (n3%10))) {
	        return true;
	      }
	      return false;
	    }
	    public static boolean isValid(int number){
	      if(number>=10 && number<=1000){
	        return true;
	        
	      }
	      else 
	      return false;
	    }
}
