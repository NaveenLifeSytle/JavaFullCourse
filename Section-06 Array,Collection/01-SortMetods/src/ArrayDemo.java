import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args){
		int[] list1= {10,20,30,40};
		int[] list2= {10,20,30,40};
		
		Integer[] ls= {20,12,23};
		System.out.println(ls);
		List list=new ArrayList();
		list.add(ls);
		System.out.println(list);
		
		Tree t1 = new Tree("tree1");
		Tree t2 = new Tree("tree2");
		Tree t3 = new Tree("tree3");
		
		Tree[] trees = {t1,t2,t3};
		
		Arrays.sort(trees);
		
	}
}
