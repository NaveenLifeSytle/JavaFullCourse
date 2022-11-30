package busreserve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();  
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		int userOption=1;
		Scanner sc=new Scanner(System.in);
		
		for(Bus b:buses) {
			
			b.displayBusInfo();
		}
		
		while(userOption==1) 
		    {
			System.out.println("enter 1 to book 2 to exit");
	userOption=sc.nextInt();
	
	             if(userOption==1) {
		Booking booking = new Booking();
		if(booking.isAvailable(bookings,buses)) {
			bookings.add(booking);
			System.out.println("ur booking is confirmed");
		}else {
			System.out.println("sorry bus is full try another date or other bus");
		}
	               }
		   }
		

	}

}
