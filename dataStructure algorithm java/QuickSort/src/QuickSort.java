
public class QuickSort {

	
	public static int[] sort(int[] arr,int low,int high){
		
		if(low<=high)
		{
		
		
		int start=low;
		int end=high;
		
		int mid = (low+high)/2;
		int pivet=arr[mid];
		while(start<=end) {
		     while(arr[start]<pivet) {
			   start++;
		      }
		        while(arr[end]>pivet) {
			  end--;
		      }
		        if(start<=end) {
		        	int temp=arr[start];
		        	arr[start]=arr[end];
		        	arr[end]=temp;
		        	 start++;
				     end--;
		        }
		        sort(arr,low,end);
				sort(arr,start,high);
		      }
		}
		return arr;
		
		}
		
	      
	
	}
