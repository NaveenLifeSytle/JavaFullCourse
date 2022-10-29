
public class CircularLinkedList<T> {
	Node last;
	
	//Inner class
	class Node {
	
		T data;
		Node next;
		// constructor for Node
		      Node(T val) {
		    	  
			       next=null;
			       data=val;
			
		               }
		       }

	//constructor for CircularLinkedList
	
CircularLinkedList(){
		last=null;
}
	
	
	//insertAtBiginning
public void insertAtBegining(T val) {
 Node newNode=new Node(val);
		  
//checking node is empty
	
 if(last==null) {
//in circular linkedList next must point anything,
//in this we inserting first so its next pointing same  Node
	newNode.next=newNode;
	last=newNode;
  }else {
	 
	 newNode.next=last.next;
	 last.next=newNode;
	  
       }
 
 
}
public void insertAtEnd(T val) {
	 Node newNode=new Node(val);
			  
	//checking node is empty
		
	 if(last==null) {
	//in circular linkedList next must point anything,
	//in this we inserting first so its next pointing same  Node
		newNode.next=newNode;
		last=newNode;
	  }else {
		 
		 newNode.next=last.next;
		 last.next=newNode;
		 last=newNode;
	       }
	}

public void display() {
	if(last==null) {
		return;
	}
	Node temp=last.next;
	
	do {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}while(temp!=last.next);
		
	
}

public T deleteAtBegining() {
	if(last==null) {
		throw new IndexOutOfBoundsException("Deletion attempt on EmptyList");
	}
	//delete panra data
	T temp=last.next.data;
	//oru node irunthal
	if(last.next==last) {
		last=null;
		return temp;
	}
	//above one
	else {
	
	last.next=last.next.next;
	 }
	// returning deleting node
	return temp;
	
}
public T deleteAtEnd() {
	if(last==null) {
		throw new IndexOutOfBoundsException("Deletion attempt on EmptyList");
	}
	//delete panra data
	T temp=last.data;
	//oru node irunthal
	if(last.next==last) {
		last=null;
		return temp;
	}
	//above one
	else {
	
	Node temp2=last.next;
	while(temp2.next !=last) {
		temp2=temp2.next;
	         }
	temp2.next=last.next;
	 }
	// returning deleting node
	return temp;
	
}

	
}
