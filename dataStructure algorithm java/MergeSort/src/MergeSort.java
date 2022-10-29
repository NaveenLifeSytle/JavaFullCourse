import java.util.Arrays;

public class MergeSort {

	
	public static int[] mergeSort(int[] arr) {
		
		if (arr.length==1) 
			
			return arr;
		
		int mid=arr.length/2;
		
		int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
		
		
		int[] right=mergeSort(Arrays.copyOfRange(arr,mid, arr.length));
		
		return merge(left,right);
	}

	private static int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int[] joined=new int[left.length+right.length];
		
	
		
		int i=0,k=0,j=0;
		
		while(i<left.length && j< right.length) {
			if(left[i]<right[j]) {
				
				joined[k++]=left[i++];
			}else {
				joined[k++]=right[j++];
			}
			
		}
			while(i<left.length)
				joined[k++]=left[i++];
			while(j<right.length)
				joined[k++]=right[j++];
			
			
			return joined;
		
		
	}
}
