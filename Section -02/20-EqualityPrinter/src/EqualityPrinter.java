
public class EqualityPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEqual(10,13,14);
		
	}
	public static void printEqual(int a,int b, int c){
	      if( (a< 0 ) || (b < 0) || (c < 0 ) ){
	          System.out.println("Invalid Value");
	      }
	      else if((a == b) && (b == c) && (c == a)){
	          System.out.println("All numbers are equal");
	      }
	       else if((a != b) && (b != c) && (c != a)){
	          System.out.println("All numbers are different");
	      }
	      else
	      {
	          System.out.println("Neither all are equal or different");
	      }
	  }
	      
	  

}
