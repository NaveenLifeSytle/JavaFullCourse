
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

public Case getTheCase() {
	return theCase;
}

public Moniter getMonitor() {
	return monitor;
}

public Motherboard getMotherboards() {
	return motherboards;
}


}
