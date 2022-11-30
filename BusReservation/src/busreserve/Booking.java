package busreserve;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	private String passengerName;
	private int busNo;
	private Date date;
	public Booking() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Passenger");
		 passengerName = sc.next();
		 System.out.println("enter the bus number");
		 busNo=sc.nextInt();
		 System.out.println("enter date dd-mm-YYYY");
		 String dateInput=sc.next();
		 SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy"); 
		 
		      try {
			date=dateformat.parse(dateInput);
		           } catch (ParseException e) {
			      
			        e.printStackTrace();
		}
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {

		int capacity=0;
		int booked=1;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busNo) {
				capacity=bus.getCapacity();
			}
		}
		for(Booking b:bookings) {
			if(b.busNo==busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<=capacity ? true:false;
	}
	
	
  }

