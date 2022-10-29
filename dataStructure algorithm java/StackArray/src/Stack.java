
public class Stack<T> {
	private static int max_size=32;
	private T arr[]=(T[])new Object[max_size];

	private int size=-1;
	int top;
	
	Stack(){
		top=-1;
	}
	
	public void push(T val) 
	{
		if(top == max_size-1) 
            throw new IndexOutOfBoundsException("stack overflow");

			arr[++top]=val;
		
		
	}
	
	public T pop() {
		if(top==-1)
			throw new IndexOutOfBoundsException("stack underflow");
		return arr[top--];
	}
	
	
public T peek() {
		if(top==-1)
			throw new IndexOutOfBoundsException("stack underflow");
		return arr[top];
		
		}
public boolean isEmpty() {
	
	return top==-1;
}

public void display() {
	if(top==-1)
		throw new IndexOutOfBoundsException("stack underflow");
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=null) {
		System.out.println(arr[i] +" ");
		}
	}
}
	
	
}
