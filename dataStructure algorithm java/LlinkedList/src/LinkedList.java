
public class LinkedList {
  Node head;
  
	
	class Node{
		int data;
		Node next;
		Node(int val){
			data=val;
			next=null;
		}
	}

	LinkedList(){
		head=null;
		
	}

	public void insertBeginning(int val) {
		
		Node newNode=new Node(val);
		
		//when list empty
		
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
	}public void insertEnd(int val) {
		
		Node newNode=new Node(val);
		
		//when list empty
		
		 Node temp=head;
		 
		 while(temp.next!=null) {
			
			temp=temp.next;
			
			if(temp.next==null) {
				temp.next=newNode;
				return;
			}
		 }
		
		
	}
	
	public void display() {
		Node temp=head;//start from head
		while(temp!=null){//null implies head of the node;
			System.out.print(temp.data+" ");
			temp=temp.next;//jump
		}
	}

	public void insertAtPos(int pos, int val) {
		// TODO Auto-generated method stub
		if(pos==0) {
			insertBeginning(val);
			return;
		}
		Node newNode= new Node(val);
		Node temp=head;
		for(int i=1;i<=pos-1;i++) {
			temp=temp.next;
			if(temp==null) {
				throw new IndexOutOfBoundsException("invalid pos"+pos);
				
			}
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
	}

	public void deleteAtPos(int pos) {
		if(pos==0) {
			deleteAtBegining(pos);
		}
	    
		Node temp=head;
		Node prev=null;
		
		for(int i=0;i<=pos;i++) {
			prev=temp;
			temp=temp.next;
		}
		
		prev=temp.next;
	}
	
	
	private void deleteAtBegining(int pos) {
		if(head==null) {
			throw new IndexOutOfBoundsException("Deletion attempt on EmptyList");
		}
		
			
			head=head.next;
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
			}
		 }
	}
		 public int get(int pos) {
			 
			 
			 Node temp=head;//start from head
				      int data=-1;
					//null implies head of the node;
					for(int i=0;i<size();i++) {
						if(i==pos) {
                         data= temp.data;
					
		                  }
					temp=temp.next;//jump
				}
					return data;
		 
		 }
		 
public void update(int pos,int val) {
			 
			 
			 Node temp=head;//start from head
				      
					//null implies head of the node;
					for(int i=0;i<size();i++) {
						if(i==pos) {
                         temp.data=val;
					
		                  }
					temp=temp.next;//jump
				}
		
		 }

public int search(int val) {
	 
	 
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
public boolean contains(int val) {
	 
	 
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


		 
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
}