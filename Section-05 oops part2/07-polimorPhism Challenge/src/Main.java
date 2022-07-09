class Car{
	
	private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
	public Car(int cylinders, String name) {
		super();
		this.engine = true;
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
	}
	
	public int getCylinders() {
		return cylinders;
	}
	public String getName() {
		return name;
	}
	public String startEngine() {
		return "Car -> startEngine()";
	}
	public String accelerate() {
		return "Car ->accelerate() ";
	}
	public String brake() {
		return "Car ->brake() ";
	}
	
    
}
class Mitsubishi extends Car{

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return " Mitsubishi-> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return " Mitsubishi-> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return" Mitsubishi-> brake()";
	}
	
	
}
class Holden extends Car{

	public Holden(int cylinders, String name) {
		super(cylinders, name);
	
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+ " startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+ " accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+" brake()";
	}
	
	
}
class Ford extends Car{

	public Ford(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+ " startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+ " accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+" brake()";
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.getName());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi.getName());
        
        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.getName());
        

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
        System.out.println(holden.getName());
	}

}
