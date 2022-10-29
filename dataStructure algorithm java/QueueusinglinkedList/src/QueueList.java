

public class QueueList<T> {
Node front;
Node rear;
	
	class Node{
		T data;
		Node next;
		Node(T val){
			data=val;
			next=null;
		}
		
		}
	QueueList(){
		front=null;
		rear=null;
	}
	
	public void enqueue(T val) {
		Node newNode= new Node(val);
		 if(front==null)
		  {
		front=newNode;
		rear=newNode;
		  }else {
			  rear.next=newNode;
			  rear=newNode;
		  }
	}
		 
		 public void dequeue() {
			 if(front==null) {
			throw new IndexOutOfBoundsException("queue is empty");
			 }
			  if(front.next!=null) {
			 front=front.next;
			 
			  }else {
				  front=null;
				  rear=null;
			  }
			  
			 
			 
			 
		 }
		 
		 public void display() {
				Node tmp=front;
				while(tmp!=null) {
					System.out.println(tmp.data+" ");
					tmp=tmp.next;
				}
		 }
}
