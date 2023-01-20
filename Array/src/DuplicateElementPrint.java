
public class DuplicateElementPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,12,7,11,11,23,44,11,22,45,22};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				System.out.println(arr[j]);
			}
		}
		
	}

}
