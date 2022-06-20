
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         boolean temp=isCatPlaying(true,39);
         System.out.println(temp);
	}
	public static boolean isCatPlaying(boolean summer, int temperature){
	      if(summer == true){
	         if( temperature >=25 && temperature <= 45){
	             return true;
	         }
	         else{
	             return false;
	         }
	         
	         
	      }
	       else {
	      
	         if( temperature  >=25 && temperature <= 35){
	             return true;
	         }
	         else{
	             return false;
	          } 
	      }
	      
	  }

}
