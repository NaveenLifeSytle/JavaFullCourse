import java.util.Comparator;

public class ComparatorDemo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Mobile s1=(Mobile)o1;
		Mobile s2=(Mobile)o2;
		// identyfy int 
//		if(s1.ram> s2.ram) {
//			return -1;
//			
//		}
//		else if(s1.ram< s2.ram) {
//			return 1;
//			
//		}
//		return 0;
		
		// identyfy String
		int s3=s1.mobName.compareTo(s2.mobName);// its will give tree results(possitive,nagative,nutral)
		
		if(s3>0) {
			return -1;
		}
		else if(s3<0){
				return 1;
			}
		else 
			return 0;
	}

}
