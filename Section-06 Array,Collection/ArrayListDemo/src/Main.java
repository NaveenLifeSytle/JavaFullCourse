import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		//add
		al.add("akask");
		al.add('i');
		al.add(100);
		al.add("naveen");
		
		ArrayList al2=new ArrayList();
		al2.add("elango");
		al2.add('a');
		al2.add(1003);
		al2.add("naveen");
		
		//add object
		
		//al.add(al2);  //[akask, i, 100, naveen, [elango, a, 1003, naveen]
		
		al.addAll(al2);//[akask, i, 100, naveen, elango, a, 1003, naveen]

		
		System.out.println(al);
		
		// remove
		System.out.println(al.remove(2));//100
		
		System.out.println(al);//[akask, i, naveen, elango, a, 1003, naveen]
		//remove all
		
		System.out.println(al.removeAll(al2));
		
		System.out.println(al);
		////////////////////////////////////////////////////////////////////
		ArrayList al3=new ArrayList();
		
		al3=al2;
		System.out.println(al3);//[elango, a, 1003, naveen]
		al.addAll(al3);
		System.out.println(al);//[akask, i, elango, a, 1003, naveen]
		
		//contains
		System.out.println(al.contains("akask")); //true
		
		//get
		
		System.out.println(al.get(4));//1003
		
		
		///
		ArrayList ar5=new ArrayList();
		ar5.add(10);
		
		ar5.add(10);
		ar5.add(10);
		ar5.add(10);
		
		System.out.println(ar5);// [10, 10, 10, 10]
        
		
		System.out.println(al);//[akask, i, elango, a, 1003, naveen]
		al.addAll(3, ar5);
		System.out.println(al);//[akask, i, elango, 10, 10, 10, 10, a, 1003, naveen]
		
		//subList
		System.out.println(al.subList(1, 4));//bigin inclusive end exclusive  //[i, elango, 10]
		System.out.println(al);//[akask, i, elango, 10, 10, 10, 10, a, 1003, naveen]

	
		//set
	
		al.set(0, "don");
		System.out.println(al);//[don, i, elango, 10, 10, 10, 10, a, 1003, naveen]
		
		// clone
		
		ArrayList cl=(ArrayList)al.clone();
		System.out.println(cl);
	}

}
