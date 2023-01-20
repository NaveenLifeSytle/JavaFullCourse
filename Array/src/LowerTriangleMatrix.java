
public class LowerTriangleMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr[]= {{10,11,12},
				{13,14,15},
			     {16,17,18}};
		
		int rows=arr.length;
		int column=arr[0].length;
		
		if(rows!=column) {
			System.out.println("not Square matrix");
			
		}
		
		else {
			for(int i=0;i<rows;i++) {
				for(int j=0;j<column;j++) {
					if(j>i) {
						System.out.print("0 ");
					}else {
						System.out.print(arr[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
	}

}
