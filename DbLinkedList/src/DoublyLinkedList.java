import java.util.Iterator;

 class DoublyLinkedList<T> implements Iterable <T> {
  Node head;
  Node tail;
	
	class Node{
		T data;
		Node next;
		Node previous;
		Node(T val){
			data=val;
			next=null;
			previous=null;
		}
	}

	DoublyLinkedList(){
		head=null;
		tail=null;
		
	}

	public void insertBeginning(T val) {
		
		Node newNode=new Node(val);
		
		//when list empty
		
		if(head==null ) {
			head=newNode;
			tail=newNode;
			
		}else {
			head.previous=newNode;
			newNode.next=head;
			head=newNode;
			
		}
	}public void insertEnd(T val) {
		
//		Node newNode=new Node(val);
//		
//		//when list empty
//		
//		 Node temp=head;
//		 
//		 while(temp.next!=null) {
//			
//			temp=temp.next;
//			
//			if(temp.next==null) {
//				temp.next=newNode;
//				newNode.previous=temp;
	         //	tail=newNode;
//				return;
//			}
//		 }
		
		//or
		Node newNode=new Node(val);
		 Node temp=tail;
		if(tail.next==null) {
			temp.next=newNode;
			newNode.previous=temp;
			newNode.next=null;
		}
		tail=newNode;
	}
	
	public void display() {
		if(head==null) {
			System.out.println("list is empty");
		}
		Node temp=head;//start from head
		while(temp!=null){//null implies head of the node;
			System.out.print(temp.data+" ");
			temp=temp.next;//jump
		     }
		}
		
		public void displayRev() {
			if(tail==null) {
				System.out.println("list is empty");
			}
			Node temp=tail;//start from head
			while(temp!=null){//null implies head of the node;
				System.out.print(temp.data+" ");
				temp=temp.previous;//jump
			}
	}

	public void insertAtPos(int pos, T val) {
		// TODO Auto-generated method stub
		if(pos==0) {
			insertBeginning(val);
			return;
		}
		Node newNode= new Node(val);
		Node temp=head;
		Node temp2;
		for(int i=1;i<=pos-1;i++) {
			temp=temp.next;
			if(temp==null) {
				throw new IndexOutOfBoundsException("invalid pos"+pos);
				
			}
		}
		
		//below two methods are correct
		
		//met 1
//		temp2=temp.next;
//		newNode.next=temp.next;
//	    temp2.previous=newNode;
//		temp.next=newNode;
//		newNode.previous=temp;
		
		
		//met2
		
		newNode.next=temp.next;
		
		temp.next.previous=newNode;
		if(temp==tail) {
			tail=newNode;
		}else {
		temp.next=newNode;
		newNode.previous=temp;
		}
	  }
		
	
	

	public void deleteAtPos(int pos) {
		if(pos==0) {
			deleteAtBegining();
			return;
		}
	    
		Node temp=head;
		Node prev=null;
		
		for(int i=1;i<=pos;i++) {
			prev=temp;
			temp=temp.next;
		}
		if(prev.next.next !=null) {
		prev.next=temp.next;
		temp.next.previous=prev;
		}else {
			temp.previous=null;
			prev.next=null;
			tail=prev;
		
			
		}
	}
	
	
	public void deleteAtBegining() {
		if(head==null) {
			throw new IndexOutOfBoundsException("Deletion attempt on EmptyList");
		}
		
			
			head=head.next;
			head.previous=null;
			return;
		
		
	}
	
	
	
	
	public int size() {
		int count=0;
		Node temp=head;//start from head
		while(temp!=null){//null implies head of the node;
			count++;
			temp=temp.next;//jump
		}
		
		return count;
	}
	
	
	public void deleteAtEnd() {
		
		
		 Node temp=head;
		 Node prev=null;
		 while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
			if(temp.next==null) {
				prev.next=null;
				temp.previous=null;
			}
			tail=prev;
		 }
	}
		 public int get(int pos) {
			 
			 
			 Node temp=head;//start from head
				      T data = null;
					//null implies head of the node;
					for(int i=0;i<size();i++) {
						if(i==pos) {
                         data= temp.data;
					
		                  }
					temp=temp.next;//jump
				}
					return (int) data;
		 
		 }
		 
public void update(int pos,T val) {
			             //2
			 
			 Node temp=head;//start from head
				      
					//null implies head of the node;
					for(int i=0;i<size();i++) {
						if(i==pos) {
                         temp.data=val;
					
		                  }
					temp=temp.next;//jump
				}
		
		 }

public int search(T val) {
	 
	 
	 Node temp=head;//start from head
		     int pos=-1;
			//null implies head of the node;
			for(int i=0;i<size();i++) {
				if(temp.data==val) {
                
					return pos=i;
			
                 }
			temp=temp.next;//jump
		}
   
			return pos;
			
}
public boolean contains(T val) {
	 
	 
	 Node temp=head;//start from head
		     int pos=-1;
			//null implies head of the node;
			for(int i=0;i<size();i++) {
				if(temp.data==val) {
               
					return true;
			
                }
			temp=temp.next;//jump
		}
  
			return false;
			
}

public void reverse() {
	Node prev=null;
	Node current=head;
	Node next=head.next;
	while(current!=null) {
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	}
	head=prev;
}

@Override
public Iterator<T> iterator() {
	// TODO Auto-generated method stub
	return new Iterator<T>() {
Node temp=head;
		@Override
		public boolean hasNext() {
		
			return temp!=null;
		}

		@Override
	
		public T next() {
			
			T val=temp.data;
			temp=temp.next;
			return val;
		}};
}


		 
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
}

