import java.util.Comparator;

public class CompartorDemo  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		
		//by alphabets
		/////////////////////////////////////////////////
		/////////////////////////////////////////////////
		
		//int s3=s1.compareTo(s2);
		//ascending
//		if(s3>0) {
//			return 1;
//		}
//		else if(s3<0) {
//			return -1;
//		}
//		else 
//			
//		return 0;
	
		
		//descending
//		if(s3>0) {
//			return -1;
//		}
//		else if(s3<0) {
//			return 1;
//		}
//		else 
//			
//		return 0;
//////////////////////////////////////////////
////////////////////////////////////
		
		// by length(small to big)
//		if(s1.length()>s2.length()) {
//			return 1;
//		}
//		else if(s1.length()<s2.length()) {
//			return -1;
//		}
//		else
//			return 0;
		// by length(big to small)
		
		if(s1.length()>s2.length()) {
			return -1;
		}
		else if(s1.length()<s2.length()) {
			return 1;
		}
		else
			return 0;
	}

}
