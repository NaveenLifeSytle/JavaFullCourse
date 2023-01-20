
public class leftShiftOneElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar= {1,2,3,4,5};
		
		int ft=ar[0];
		  
		
		for(int i=0;i<ar.length-1;i++) 
		{
			 
				ar[i]=ar[i+1];
				
		}
		ar[ar.length-1]=ft;
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+" ");
		}
	}

}
