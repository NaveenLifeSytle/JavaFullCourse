
public class SumOfEachrowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int rows=ar.length;
		int column=ar[0].length;
		
		//sum of rows
		System.out.println("--------------------------------------");
		System.out.println("sum of rows");
		System.out.println("--------------------------------------");
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<rows;j++) {
				sum=sum+ar[i][j];
			}
			System.out.println( "sum of "+(i+1)+ " row | = "+sum);
		}
		System.out.println("--------------------------------------");
		
		System.out.println("\n\n\n\n");
		System.out.println("--------------------------------------");
		System.out.println("sum of columns");
		System.out.println("--------------------------------------");
		for(int i=0;i<column;i++) {
			int sum=0;
			for(int j=0;j<column;j++) {
				sum=sum+ar[j][i];
			}
			System.out.println( "sum of "+(i+1)+ " row | = "+sum);
		}
		System.out.println("--------------------------------------");
	}

}
