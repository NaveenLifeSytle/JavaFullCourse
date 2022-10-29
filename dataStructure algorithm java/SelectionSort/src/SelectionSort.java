
public class SelectionSort {

	
	public static  int[] sort(int[] arr ) {
		
		
		
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
			
				if(arr[j]<min) {
					min=arr[j];
				minIndex=j;
					
				}
				
			}
			int temp=arr[i];
			
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
		}
		
		return arr;
		
	}
	
	public static  String[] sort(String[] arr ) {
		
		
		
		for(int i=0;i<arr.length-1;i++) {
			String min=arr[i];
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
			      
				if(arr[j].compareTo(min)<0) {
					min=arr[j];
				minIndex=j;
					
				}
				
			}
			
			String temp=arr[i];
			
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		
		return arr;
		
	}

	
}
