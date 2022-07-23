import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mobile mobile1 = new Mobile(8,15000,"redmi");
		Mobile mobile2 = new Mobile(10,15000,"aealme");
		Mobile mobile3 = new Mobile(12,15000,"poco");
		
		ArrayList mobile=new ArrayList();
		mobile.add(mobile1);
		mobile.add(mobile2);
		mobile.add(mobile3);
		
	
		ComparatorDemo comparatorDemo = new ComparatorDemo();
		
		Collections.sort(mobile, comparatorDemo);
		System.out.println(mobile);
		
	}

}
