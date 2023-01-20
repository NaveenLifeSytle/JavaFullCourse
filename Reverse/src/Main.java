
public class Main {
	public static void main(String[] args) {
		
		//123
		int number=1;
		int remainder;
		int reverse=0;
		
	
		
		while(number!=0){
			//14 
			
			remainder=number%10;// 
			reverse=reverse*10+remainder;//1
			number=number/10;//
		}
		
		
		System.out.println(reverse);
		
		
	} 

}
