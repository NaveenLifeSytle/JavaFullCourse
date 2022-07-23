import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "ammaappaGointhan";
		char[] ch=s.toCharArray();
		TreeMap<Character,Integer> treeMap = new TreeMap();
	
		for(char n : ch) {
			if(treeMap.containsKey(n)) {
				treeMap.put(n, treeMap.get(n)+1);
				}
			else {
				treeMap.put(n, 1);
			}
		}
		System.out.println(treeMap);
		
		Set<Map.Entry<Character, Integer>> entrySet = treeMap.entrySet();
		
		for(Entry<Character, Integer> ent:entrySet) {
			
			if(ent.getValue()==1) {
				System.out.println(ent.getKey() +" "+ent.getValue());
			}
			
		}
	}

}
