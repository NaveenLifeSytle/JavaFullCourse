
public class Child1 extends Parent{ //if we dint override a parent abstract methods,its would be consider as a abstract 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Child1 child1 = new Child1();
//		child1.run();
//		child1.eat();
//		child1.play();
//		child1.study();
		
		//Dynamic binding
		Parent child1 = new Child1();
		child1.run();
		child1.eat();
		//child1.play();//play is a child own class parent cant access it.
		child1.study();
	}

	@Override
	public void study() { //must implement it else this class consider as abstract
		// TODO Auto-generated method stub
		System.out.println("studying");
	}

	@Override
	public void eat() {  // override not compolsary
		// TODO Auto-generated method stub
		System.out.println("child eating");
	}

	public void play() {
		System.out.println("playing");
	}
	
}
