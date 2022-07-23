import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList();
		arrayList.add("naveen");
		arrayList.add("akss");
		arrayList.add("praveen");
		arrayList.add("kaveen");
		
		Mobile mobile = new Mobile("Iphone",8,90000);
		Mobile mobile2 = new Mobile("Iphone",8,90000);
		arrayList.add(mobile);
		arrayList.add(mobile2);
		System.out.println(arrayList);
		
		//iterator
//		Iterator i=arrayList.iterator();
//		
//		while(i.hasNext()){
//			//System.out.println(i.next());
//		if(	i.next().equals(mobile2)) {
//			i.remove();
//		}
//		}
//		System.out.println(arrayList);

		//listIterator
		
		ListIterator li = arrayList.listIterator();
		while(li.hasNext()) {
			//System.out.println(li.next());
			
			System.out.println(	li.next());
			
		}
		
	}

}
