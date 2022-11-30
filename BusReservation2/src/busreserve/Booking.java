package busreserve;
import java.sql.SQLException;
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
	public boolean isAvailable() throws SQLException {

	
		
		BusDAO busDao=new BusDAO();
		int capacity = busDao.getcapacity(busNo);
		BookingDAO bookingdao=new BookingDAO();
		
		int booked=bookingdao.getBookedCount(busNo,date);
		
		return booked<capacity;

	}
	
	
  }

