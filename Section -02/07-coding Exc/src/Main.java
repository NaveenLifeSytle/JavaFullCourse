/* if we declare the method as a static ,we can easy call the method in
another class by just using the name of the claas.metho(); */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

	}

}
