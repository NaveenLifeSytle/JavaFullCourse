
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list=new LinkedList<>();
			list.insertBeginning("harish");//0
			list.insertBeginning("naveen");//1
			list.insertBeginning("surya");//2
			list.insertBeginning("ganpathy");//3
		
			list.update(2,"akash");
		list.display();
		System.out.println();
		System.out.println(list.contains(" surya"));
		list.reverse();
		list.display();
		
		

		
//		System.out.println(list.contains("111"));
//		
//		
//list.display();


	}

}
