import java.util.Scanner;

class DynamicArray{
	
	private int arr[];
	private int size;
	private int capacity;
	private static final int intialCapacity=16;
	private static Scanner scanner=new Scanner(System.in);
	DynamicArray(){
		size=0;
		arr=new int[intialCapacity];
		capacity=intialCapacity;
		
	}
	
	public void add(int val) {
		if(size==capacity)
			expandArray();
		arr[size++]=val;
	}
	
	public void expandArray() {
		capacity*=2;
		arr=java.util.Arrays.copyOf(arr,capacity);
		
	}

	public void display() {
		System.out.println("element in the print state");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public void insertAtPos(int pos, int val) {
		// TODO Auto-generated method stub
		if(size==capacity)
			expandArray();
		for(int i=size-1; i>=pos;i--) {
			arr[i+1]=arr[i];
		}
		arr[pos]=val;
		size++;
	}

	public void deleteAtPos(int pos) {
		// TODO Auto-generated method stub
		for(int i=pos+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		if(capacity>intialCapacity && capacity>3* size) {
			shrinkArray();
		}
	}

	private void shrinkArray() {
		// TODO Auto-generated method stub
		capacity/=2;
		
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	public void insertFirst() {
		// TODO Auto-generated method stub
		int pos=0;
		
System.out.println("enter the value:");
		int val=scanner.nextInt();
		
		if(size==capacity)
			expandArray();
		for(int i=size-1; i>=pos;i--) {
			arr[i+1]=arr[i];
		}
		arr[pos]=val;
		size++;
	}
	public int length() {
		return size;
	}
	
	public void deleteEnd() {
//		int pos=size-1;
//		for(int i=pos+1;i<=size;i++) {
//			arr[i-1]=arr[i];
//		}
		size--;
	if(capacity>intialCapacity && capacity>3* size) {
		shrinkArray();
	}
	}
	
	public void deleteFirst() {
		int pos=0;
		for(int i=pos+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		if(capacity>intialCapacity && capacity>3* size) {
			shrinkArray();
		}
	}
	
	public void get(int pos) {
		
		System.out.println(arr[pos]);
	}
	
	public void update(int pos,int val) {
		arr[pos]=val;
	}
	
	public void search(int val) {
		
		for(int i=0;i<size;i++) {
			if(arr[i]==val) {
			System.out.print(i);
			break;
			}
		}
		System.out.println("-1");
		
	}
}
public class DynamicArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int val,pos;
		Scanner scanner=new Scanner(System.in);
		DynamicArray list=new DynamicArray();
		while(true) {
			
			System.out.println("\n-----------------------list menu--------------\n");
			System.out.println("1.Insert at End\n");
			System.out.println("2.Dispaly the list\n");
			System.out.println("3.Insert at specified posisition\n");
			System.out.println("4.delete from the specified position\n");
			System.out.println("5.Exit\n");
			System.out.println("\n-------------------------------------\n");
			System.out.println("enter ur choice\n");
			
			int choice=scanner.nextInt();
			
			switch(choice) {
			
			case 1: System.out.println("Enter the data:");
			val=scanner.nextInt();
			list.add(val);
			break;
			case 2:  list.display();
			break;
			
			case 3:
				System.out.println("enter the position(starts at 0):");
				pos=scanner.nextInt();
				System.out.println("ente the value:");
				val=scanner.nextInt();
				list.insertAtPos(pos,val);
				break;
				
			case 4:
				System.out.println("enter the position(starts at 0):");
				pos=scanner.nextInt();
				if(pos<0) {
					System.out.println("invalid position ");
					break;
				}
				list.deleteAtPos(pos);
				break;
				
			case 5:System.exit(0);	
			
			default:System.out.println("inavalid choice");
				
			
			}
			
			
			
		}
		
	}

}
