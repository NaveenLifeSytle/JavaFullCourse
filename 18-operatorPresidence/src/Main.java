
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  double myFirstValue = 20.00d;
	        double mySecondValue = 80.00d;
	        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
	        System.out.println("MyValuesTotal = " + myValuesTotal);
	        double theRemainder = myValuesTotal % 40.00d;
	        System.out.println("theRemainder = " + theRemainder);
	        boolean isNoRemainder = (theRemainder == 0) ? true : false;
	        System.out.println("isNoRemainder = " + isNoRemainder);
	        if (!isNoRemainder) {
	            System.out.println("Got some remainder");
	        }

	}

}
