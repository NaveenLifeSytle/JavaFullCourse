
public class smallestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {
				10,12,3334,22,11,44,22,33,45,5,53432,45
		};
		
		int min=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("min ="+min);
		
	}

}
