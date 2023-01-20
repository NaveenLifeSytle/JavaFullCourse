
public class SubtractionOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {
				{1,2,3},
		        {4,5,6},
		        {7,8,9}};

		int[][] c= {
				{1,2,3},
		        {4,5,6},
		        {7,8,9}};
		
		int[][] b=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=a[i][j]-c[i][j];
			}
			
			}
		
		//original
		System.out.println("a matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
	}
		System.out.println("b matrix");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
	}
		
		System.out.println();
		System.out.println("sub");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
	}

	}

}
