
public class Mobile {
	String mobileName; int ram; int price;
	public Mobile(String mobileName, int ram, int price) {
		this.mobileName=mobileName;
		this.ram=ram;
		this.price=price;
	}
	public String toString() {
		return " "+this.mobileName+" "+this.ram+" "+this.price;
	}

}
