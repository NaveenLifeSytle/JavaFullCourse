package javaBasics;

import java.util.Scanner;

public class exp {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		
//		for(int i=1;i<=num;i++) {
//			
//			sum=sum+15;
//			// 1 * 15 = 15 
//			System.out.println(i+" * 15 = "+sum);
//			
//		}
		
//		int i=1;
//		
//		while( i<=num) { 
//			sum=sum+15;
//			System.out.println(i+" * 15 = "+sum);
//			i++;
//			
//		}
		
		int sum=0;
		int i=1;
		do {
			
			// 1 * 15 = 15;
			sum=sum+15;
			System.out.println(i +" * 15 = "+sum );
			i++;
		}while(i<=num);
		
		
		
	}

}
