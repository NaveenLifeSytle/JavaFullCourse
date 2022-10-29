

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {12,123,21,543,78,44,345,22,4453,5};
		int[] sortArr= InsertionSort.sort( arr);
		
		for(int i=0;i<sortArr.length;i++) {
			System.out.print(sortArr[i]+" ");
		}
	}

}
