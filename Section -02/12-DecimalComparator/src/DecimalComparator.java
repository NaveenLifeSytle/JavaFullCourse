
public class DecimalComparator{
	
    public static boolean areEqualByThreeDecimalPlaces(double firstnumber, double secondnumber){
    
        
        
        if((int) (firstnumber * 1000) == (int) (secondnumber * 1000))
        {
        	
            return true;
        }
        else
        {
        
        return false;
        }
        
    
    }
 
}
