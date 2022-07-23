import java.util.Arrays;

public class Main {
public static void main(String[] args){
	// primitive type // ascending order
	int[] number= {10,12,54,22,43,123,44};
	
	System.out.println("Before Sorting");
	for(int i:number);
	System.out.println(Arrays.toString(number));
	
	Arrays.sort(number);
	System.out.println("after Sorting");
	for(int i:number);
	System.out.println(Arrays.toString(number));
	
	//non primitive type  //ascending order
String[] names= {"naveen","akash","ashly","venkatesh","meyyappan"};

	
	System.out.println("Before Sorting");
	for(String i: names);
	System.out.println(Arrays.toString(names));
	
	Arrays.sort(names);
	System.out.println("after Sorting");
	for(String i: names);
	System.out.println(Arrays.toString(names));
}

}
