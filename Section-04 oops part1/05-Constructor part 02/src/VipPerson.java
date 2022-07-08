
public class VipPerson {

	private String name;
	private double CreditLimit;
	private String emailAddress;
	public VipPerson() {
		this("naveen",100000,"hackernaveen0011@gmail.com");
	}
	
	public VipPerson(String name, double creditLimit, String emailAddress) {
	
		this.name = name;
		this.CreditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	public VipPerson(String name, double creditLimit) {
		this(name,creditLimit,"hackernaveen@gmail.com");
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return CreditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	
	
	
	
}
