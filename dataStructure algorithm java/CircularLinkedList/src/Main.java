
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		CircularLinkedList<String> list=new CircularLinkedList<>();
		
		list.insertAtBegining("naveen");
//		list.insertAtBegining("priti");
//		list.insertAtBegining("akash");
//		list.insertAtBegining("dinesh");
//		list.insertAtBegining("priyanka");
//		list.insertAtBegining("vijay");


		list.display();
		System.out.println();
		System.out.println("Deleting Node "+list.deleteAtBegining());
		
		
		
		list.display();
	
//		
//		System.out.println();
//		System.out.println("Deleting Node "+list.deleteAtEnd());
//		
//		
//		
//		list.display();
//		list.insertAtBegining("priti");
	}

}
