
public class frequencyofEachelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,12,13,13,22,11,11,11,23,11,10,23};
int frr[]=new int[arr.length];
int visited=-1;
for(int i=0;i<arr.length;i++) {
	int count=1;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			count++;
			frr[j]=visited;
		}
	}
	if(frr[i]!=visited) {
		frr[i]=count;
	}
}
System.out.println("-----------------------------------");
System.out.println("element frequently");
System.out.println("------------------------------------");
for(int i=0;i<frr.length;i++) {
	if(frr[i]!=visited) {
		
	System.out.println(" "+arr[i]+ "   | "+frr[i]);
	
	}
}


	}

}
