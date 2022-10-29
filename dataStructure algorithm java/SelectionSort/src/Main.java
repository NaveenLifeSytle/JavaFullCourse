
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {12,33,22,34,1,2,1,33,18,10,34,67,335,423,5555,6789,45655};
		
		int[] sortarr=SelectionSort.sort(arr);
		
		
		
		for(int i=0;i<sortarr.length;i++) {
			System.out.print(sortarr[i]+" ");
		}
		
		
		String[] names= {"naveen","priti","akash","surya","dinesh","battu","priyanka"};
String[] sortname=SelectionSort.sort(names);
		
		
System.out.println();
		
		for(int i=0;i<sortname.length;i++) {
			System.out.print(sortname[i]+" ");
		}
		
		
	}

}
