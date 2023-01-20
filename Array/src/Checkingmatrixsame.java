
public class Checkingmatrixsame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {
				{1,2,3},
		        {4,5,6},
		        {7,8,9}};

		int[][] b= {
				{1,2,3},
		        {4,5,6},
		        {7,8,9}};
		

		int aRow=a.length;
		int aColumn=a[0].length;
		
		int bRow=b.length;
		int bColumn=b[0].length;
		
	boolean flag=true;
		if(aRow !=bRow ||  aColumn != bColumn ) {
			
			
			System.out.println("not equal");
		}
		else{
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b.length;j++){
					if(a[i][j]!=b[i][j]) {
						flag=false;
						break;
					}
				}
			}
		}
		
		if(flag) {
			System.out.println("matrix is equal");
		}else {
			System.out.println("not equal");
		}
		
	}

}
