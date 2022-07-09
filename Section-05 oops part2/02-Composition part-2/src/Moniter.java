
public class Moniter {
	private String model;
	private String Manufacturer;
	private int size;
	private Resolution nativeResulation;
	public Moniter(String model, String manufacturer, int size, Resolution nativeResulation) {
		super();
		this.model = model;
		Manufacturer = manufacturer;
		this.size = size;
		this.nativeResulation = nativeResulation;
	}
	public void drawPixelat(int x, int y, String color) {
		System.out.println("Drawing pixel art "+x+","+" in color "+color);
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public int getSize() {
		return size;
	}
	public Resolution getNativeResulation() {
		return nativeResulation;
	}
}
