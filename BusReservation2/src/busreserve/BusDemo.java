package busreserve;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
            
		BusDAO busdao = new BusDAO();
		try {
		busdao.displayBusInfo();
		int userOption=1;
		Scanner sc=new Scanner(System.in);
		
	
		while(userOption==1) 
		    {
			System.out.println("enter 1 to book 2 to exit");
	userOption=sc.nextInt();
	
	             if(userOption==1) {
		Booking booking = new Booking();
		if(booking.isAvailable()) {
			BookingDAO bookingdao=new BookingDAO();
			bookingdao.addBooking(booking);
			System.out.println("ur booking is confirmed");
		}else {
			System.out.println("sorry bus is full try another date or other bus");
		}
	   }
	           
		   }
		 sc.close();
		}catch(Exception e) {
			   System.out.println(e);
		   }
		   

		

	}

}
