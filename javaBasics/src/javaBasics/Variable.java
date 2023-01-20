package javaBasics;



public class Variable {

	
	
	//A variable name can consist of Capital letters A-Z,
	//lowercase letters a-z digits 0-9, and two special characters such as 
	//_ underscore and $ dollar sign.
	//The first character must not be a digit.
	//Blank spaces cannot be used in variable names.
	//Java keywords cannot be used as variable names.
	//Variable names are case-sensitive.
	//There is no limit on the length of a variable name but by convention,
	//it should be between 4 to 15 chars.
	//Variable names always should exist on the left-hand side of assignment operators.
	
	int cg;
	
	
	//global variable or class variable
	int num=8;
	
	//static variable
	 static int num3=8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// local variable
		int num2=5;
		Variable var=new Variable();
		 var.hello();
		 System.out.println(num3);
		
	}
	
	public  void hello() {
		
		Variable var=new Variable();
		System.out.println(var.num);
		
		System.out.println(num3);
		
	}
	
	
	
	


}
