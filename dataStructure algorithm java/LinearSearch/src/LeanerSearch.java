
public class LeanerSearch<T> {
	
	public static int find(int arr[],int target) {
		for(int  i=0;i<arr.length;i++) 
			if(arr[i]==target) {
				return i;
			}
		return -1;
			
	}
	
	public static boolean contains(int arr[],int target) {
		for(int  i=0;i<arr.length;i++) 
			if(arr[i]==target) {
				return true;
			}
		return false;
			
	}
	
	public static int find(String str,char target) {
		for(int  i=0;i<str.length();i++)
			
			if(str.charAt(i)==target)
		return i;
		
		return -1;
			
	}
	public static boolean contains(String str,char target) {
		for(int  i=0;i<str.length();i++)
			
			if(str.charAt(i)==target)
		return true;
		
		return false;
			
		
	}

	public static int[] find(int[][]  arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int column=0;column<arr[row].length;column++) {
				if(arr[row][column]==target) {
					return new int[] {row,column};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	
	public static int maxValue(int[] arr) {
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				
			}
		}
		return max;
	}
	
	public static int minValue(int[] arr) {
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
	
			}
		}
		return min;
	}
	
	

	public static int CountString(String str,char target) {
		int count=1;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==target) {
				count+=1;
			}
		}
		return -1;
	}
	
	public static  void fourDigitNumber(int[] arr) {
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]/1000>0) {
				System.out.println(arr[i]+" ");
			}
		}
		
	}
	
}
