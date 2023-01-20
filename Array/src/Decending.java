
public class Decending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[] {
				10,12,3334,22,11,44,22,33,45,5,53432,45
		};
		int temp;
	
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
			}
			
		}
		
		System.out.println("decending");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
