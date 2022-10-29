package bobbleSort;

public class BobbleSort {

	public static int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
				
			}
		}
		
		return arr;
	}

}
