
public class Human implements Familyrules,ComapnyRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Human human = new Human();// we can access all method 
          Familyrules father = new Human();// dynamic biding//only we can access familyRules methods
          System.out.println(Human.salary);//because variables are static
          System.out.println(ComapnyRules.salary);// we can call by its className
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enjoy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void watchingTV() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Applyleave() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GoingOffice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CompleteWork() {
		// TODO Auto-generated method stub
		
	}

}
