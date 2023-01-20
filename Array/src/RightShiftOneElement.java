
public class RightShiftOneElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar= {1,2,3,4,5};
		
		int lt=ar[ar.length-1];

	
		for(int i=ar.length-1;i>0;i--) {
			 //4 3 2 
				ar[i]=ar[i-1];//4 3 2 1
				
		}
		ar[0]=lt;
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+" ");
		}
	}

}
