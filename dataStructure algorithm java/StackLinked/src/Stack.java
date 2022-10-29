
public class Stack<T> {
  
	Node top;
	
	  Stack(){
		  top=null;
	  }
	class Node {
		T data;
		Node next;
		
		
		Node(T val){
			data=val;
			next=null;
		}
		
		    
	}
	void push(T val) {
		Node newNode=new Node(val);
		if(top==null) {
		top=newNode;
		}else {
		newNode.next=top;
		top=newNode;
		}
	}
	public T pop() {
		if(top==null) 
			throw new IndexOutOfBoundsException("array is empty da  tailee");
	     if(top.next!=null) {
		T tmp=top.data;
		top=top.next;
		return tmp;
	     }else {
	    	 T tmp=top.data;
	    	 top=null;
	    	 return tmp;
	    	 
	     }
		
	}
	
	public void display() {
		Node tmp=top;
		while(tmp!=null) {
			System.out.println(tmp.data+" ");
			tmp=tmp.next;
		}
	}
	
}
