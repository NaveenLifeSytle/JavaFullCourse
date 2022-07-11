
public abstract class Parent {// put a class a abstract because some method abstract

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Parent parent = new Parent(); // we cant create  a object because class is abstract .
		run(); // we can use static methods
	}

	public abstract void study();// abtract method
	
	public void eat() {
		System.out.println("parent eating");
	}
	public static void run() {
		
	System.out.println("Running");
	}
}
