
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printYearsAndDays(1000000l);
	}
	 public static void printYearsAndDays(long minutes){
	      if(minutes < 0){
	          
	          System.out.println("Invalid Value");
	          
	      } else{
	     
	      long years = minutes / 525600;
	      long minutesRemaining =(minutes %  525600);
	      long days=minutesRemaining / 1440;
	      
	      System.out.println(minutes+" min = "+ years+" y and "+days+" d");
	      }
	      
	  }
}
