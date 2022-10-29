import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr= {12,123,21,543,78,44,345,22,4453,5};
		arr=QuickSort.sort( arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
