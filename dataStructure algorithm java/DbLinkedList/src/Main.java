
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<Integer> list=new DoublyLinkedList();
		list.insertBeginning(3);
		list.insertBeginning(8);
		list.insertBeginning(6);
		list.insertBeginning(5);


		
	System.out.println(list.size());
	

		list.display();
		System.out.println();
		System.out.println(list.contains(0));
	
		System.out.println();
		list.displayRev();
		System.out.println();
		list.update(0, 10);
		
		list.display();
		
		System.out.println();
		list.displayRev();
		
	}

}
