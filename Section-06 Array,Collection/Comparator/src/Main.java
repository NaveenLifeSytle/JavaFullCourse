import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1= {10,33,2,123,44};
		int[] n2= {10,33,2,123,44};
		
		String[] name= {"naveen","akash","ashly","venkates","elango","gointhasamy"};
		
		//Arrays.sort(name);
		CompartorDemo cmp=new CompartorDemo();
		
		Arrays.sort(name,cmp);
		
		
		System.out.println(Arrays.toString(name));
		
	}

}
