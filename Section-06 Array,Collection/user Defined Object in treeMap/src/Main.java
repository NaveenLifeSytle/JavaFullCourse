import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap tm = new TreeMap();
		
	Mobile mobile1 = new Mobile("iphone",8,70000);
	
	Mobile mobile2 = new Mobile("samsung",8,50000);
	
	Mobile mobile3 = new Mobile("redmi",8,40000);
	
	
	tm.put(001, mobile1);

	tm.put(002, mobile2);

	tm.put(003, mobile3);
	
	Set entrySet = tm.entrySet();
	Iterator i = entrySet.iterator();
	
	while(i.hasNext()) {
		
		Map.Entry mt=(Map.Entry)i.next();
		Object key = mt.getKey();
		Object value = mt.getValue();
		Mobile o2=(Mobile)value;
		if(key.equals(001)) {
			o2.price=10000;
		}
	}
	System.out.println(entrySet);
	}

}
