import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Java Map Interface
	//	A map contains values on the basis of key, i.e. key and value pair.
		//Each key and value pair is known as an entry. A Map contains unique keys.

	//	A Map is useful if you have to search, update or delete elements on the basis of a key.
		
		//A Map doesn't allow duplicate keys, but you can have duplicate values. 
		//HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
		
		
		
		//HashMap-HashMap is the implementation of Map, but it doesn't maintain any order.
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(001, "akash");
		hm.put(002, "ashly");
		hm.put(002, "ashly");
		hm.put(003, "gointhan");
		Set keySet = hm.keySet();
		System.out.println(keySet);
		
		Collection values = hm.values();
		
		System.out.println(values);
		Set s2=hm.entrySet();
		System.out.println();
		Iterator it = s2.iterator();
		
		while(it.hasNext()) {
			Map.Entry ms=(Map.Entry)it.next();
			if(ms.getValue().equals("gointhan")) {
				ms.setValue("okash");
			}
		}
		System.out.println(hm);
		
		//LinkedHashMap	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
	LinkedHashMap hms=new LinkedHashMap();
		
		hms.put(001, "akash");
		hms.put(002, "ashly");
		hms.put(002, "ashly");
		hms.put(003, "gointhan");
		Set keySets = hms.keySet();
		System.out.println(keySets);
		
		Collection valuess = hms.values();
		
		System.out.println(valuess);
		Set s2s=hm.entrySet();
		System.out.println();
		Iterator its = s2s.iterator();
		
		while(its.hasNext()) {
			Map.Entry mss=(Map.Entry)its.next();
			if(mss.getValue().equals("gointhan")) {
				mss.setValue("okash");
			}
		}
		System.out.println(hms);
		
	}

}
