import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		LinkedList li=new LinkedList();
		
		System.out.println("How many numbers u want to add ");
		
		int num=sc.nextInt();
		sc.nextLine();
		
		System.out.println("add number one by one");
		for(int i=0; i<num;i++) {
			li.add(sc.nextLine());
		}
		
		System.out.println(li);
		
		TreeSet treeList = new TreeSet(li);
		System.out.println(treeList);
	}
}
