
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimensions dimension = new Dimensions(20,20,5);
Case theCase=new Case("220b","Dell","240",dimension);

//Resolution nativeResolution=new Resolution(720,1080);
Moniter monitor = new Moniter("27 inch beast ","Acer",27,new Resolution(720,1080));

Motherboard theMotherboard = new Motherboard(" b-450m pro -Vdh Max","MSI",4,2,"updated");

Pc pc = new Pc(theCase,monitor,theMotherboard);

pc.getMonitor().drawPixelat(1500, 1200, "red");
pc.getMotherboards().loadProgram("window 2.0");
pc.getTheCase().pressPowerButton();
	}

}
