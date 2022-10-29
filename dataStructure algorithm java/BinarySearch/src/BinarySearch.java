
public class BinarySearch {

	public static int binarySearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		boolean asc= arr[start]<arr[end];
		if(asc) {
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(target>arr[mid]) 
				start=mid+1;
			
			else if(target<arr[mid]) 
				end=mid-1;
			
			else 
			
				return mid;
			
		}
		
		
		return -1;
	}else {
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(target>arr[mid]) 
				end=mid-1;
			
			else if(target<arr[mid]) 
		
				start=mid+1;
			
			else 
			
				return mid;
			
		          }
		
		
		return -1;
		
	}
		
		
		
	}
	
	//soreted list la thaan itha panna mudiyum
	//oru value ah kandhupidikkanum half half ah split
	//panni based on the condition
	
	// middle = (start+end)/2 
	
	
}
