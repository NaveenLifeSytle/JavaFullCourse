import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr={10,14,14,6,2,47,568};
//		
//		System.out.println(LeanerSearch.find(arr, 56));
//		System.out.println(LeanerSearch.contains(arr, 56));
//		String name="naveen";
//		System.out.println(LeanerSearch.find(name, 'a'));
//	
//
//		int[][] twoArr= {
//				{2,5,3},
//				{5,7,3},
//				{8,3,2}
//				
//		};
//		
//	
//		int[] result=LeanerSearch.find(twoArr, 7);
//		System.out.println(Arrays.toString(result));
//		
		int[] dg= {1234,111,2222,4554,55};
		LeanerSearch.fourDigitNumber(dg);
		
		System.out.println( "max value :"+LeanerSearch.maxValue(dg));
		
	
		System.out.println( "min value :"+LeanerSearch.minValue(dg));
	

	String name="naveen";
	
	
	System.out.println("count"+LeanerSearch.CountString(name, 'a'));
	}	
}
