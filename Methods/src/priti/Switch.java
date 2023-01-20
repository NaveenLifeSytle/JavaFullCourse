package priti;
import java.util.Scanner;

public class Switch {

	static int num1;
	static int num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc= new Scanner(System.in);
		System.out.println("enter first num");
		 num1=sc.nextInt();
		System.out.println("enter Second num");
		 num2=sc.nextInt();
		
		System.out.println("enter option (+ add - sub * mul / div)");
		
		char day=sc.next().charAt(0);
		
		//create 4 methods 
		//1 method name add
		//2nd name sub
			switch(day) {
			
			case '+':
			add();
			break;
			case '-':
				System.out.println(num1-num2);
			case '*':
				System.out.println(num1*num2);
				
				default:
					System.out.println(num1/num2);
					
			}
		}


	private static void add() {
		System.out.println(num1+num2);
		
	}
	private static void sub() {
		System.out.println(num1-num2);
		
	}
	private static void mul() {
		System.out.println(num1*num2);
		
	}
	private static void div() {
		System.out.println(num1/num2);
		
	}
}