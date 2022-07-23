
public class Mobile {
	int ram;
	int price;
	String mobName;

	public Mobile(int ram, int price, String mobName) {
		this.ram=ram;
		this.price=price;
		this.mobName=mobName;
		
	}
	public String toString() {
		return " "+this.ram+" "+this.price+" "+this.mobName;
	}

}
