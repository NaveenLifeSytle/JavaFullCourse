import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashSetDemo {

	public static void main(String[] args) {
		
		//not maintain a insertion order not allow duplicates values
		HashSet hs = new HashSet();
		
		hs.add("naveen");
		hs.add("akss");
		hs.add("praveen");
		hs.add("kaveen");
		hs.add("naveen");
		System.out.println(hs);
		//maintain insertion order not allow duplicates values
	LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("nav");
		lhs.add("aks");
		lhs.add("prav");
		lhs.add("kav");
		hs.add("nav");
		System.out.println(lhs);
		//maintain sorting order not allow duplicates values
TreeSet ts = new TreeSet();
		
		ts.add("naveen");
		ts.add("akss");
		ts.add("praveen");
		ts.add("kaveen");
		ts.add("naveen");
		System.out.println(ts);
		// we also do like that
		TreeSet tts=new TreeSet(lhs);
		System.out.println(tts);
	
	}

}
