
public class QueueList<T> {
	private static final int max=30;
	int front,rear;
	T arr[];
	
	QueueList(){
	
		arr=(T[]) new Object[max];
		front =-1;
		rear = -1;
	}
	
	
	
//	public void enQueue(T val) {
//		if(rear==max-1) 
//			  throw new IndexOutOfBoundsException("queue is full");
//			  if(front==-1) 
//				 front++;
//			  
//			  arr[++rear]=val;  
//		    }
//		
//	public T deQueue(T val) {
//	  
//		if(rear==-1)
//			throw new IndexOutOfBoundsException("queue is full");
//		return arr[front++];
//		
//		
//		    }
	
	
	public void enqueue(T val) {
		if(rear==max-1){
			throw new IndexOutOfBoundsException("queue is full");
		}
		
		arr[++rear]=val;
	} 
		
	public T dequeue() {
		T temp= arr[0];
		if(rear==-1 ) {
			throw new IndexOutOfBoundsException("queue is Empty");
		}
		
		
		for(int i=1;i<=rear;i++) {
			arr[i-1]=arr[i];
			
		}
		rear--;
		
		return temp;
	}
	
	
	
	
	 public void dispaly() 
	    {
	    
		 for(int i=0;i<=rear;i++) {
			 System.out.println(arr[i]+" ");
		 }
	     
	    }

}
