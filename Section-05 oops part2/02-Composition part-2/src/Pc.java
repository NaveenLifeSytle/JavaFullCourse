
public class Pc {
	private Case theCase;
	private Moniter monitor;
	private Motherboard motherboards;

	public Pc(Case theCase, Moniter monitor, Motherboard motherboards) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboards = motherboards;
	}

	public void powerUp() {
		//getTheCase().pressPowerButton(); ippadiyum pannalam *****ipartant****
		theCase.pressPowerButton();
		drawLogo();
	}
	private void drawLogo() {
		//fancy graphics
		monitor.drawPixelat(1200, 50, "yellow");
		
	}

	private Case getTheCase() {
		return theCase;
	}

	private Moniter getMonitor() {
		return monitor;
	}

	private Motherboard getMotherboards() {
		return motherboards;
	}
}
