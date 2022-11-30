package busreserve;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		busNo=no;
		this.ac=ac;
		capacity=cap;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void displayBusInfo() {
		System.out.println("bus No "+busNo +" Ac "+ac+" Total capacity:"+capacity);
	}

}
