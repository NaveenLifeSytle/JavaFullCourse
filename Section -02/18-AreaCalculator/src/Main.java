
public class Main {
	  public static void main(String[] args) {
	  
	double a1=area(12);
    double a2=area(12,13);
    System.out.println(a1);
    System.out.println(a2);
	  }
	public static double area(double radius){
        
	     if(radius < 0){
	         return -1.0;
	     }
	     double PI=Math.PI;
	       return (radius * radius * PI);
	 
	    }
	
	     public static double area(double x, double y){
	         if((x < 0) || (y < 0)){
	               return -1.0;
	         }
	        return  (x * y);
	        
	   
	  }
	    
}
