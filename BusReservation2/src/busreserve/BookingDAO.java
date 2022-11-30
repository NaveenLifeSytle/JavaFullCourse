package busreserve;
import java.sql.*;
import java.util.Date;

public class BookingDAO {

	public int getBookedCount(int busNo, Date date) throws SQLException{
		// TODO Auto-generated method stub
		
		String query="select count(passenger_name) from booking where bus_no=? and travel_date=? ";
		Connection con=DbConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqlDate= new java.sql.Date(date.getTime());
		pst.setInt(1, busNo);
		pst.setDate(2, sqlDate);
		ResultSet rs = pst.executeQuery();
		rs.next();

	return rs.getInt(1);
	}

	public void addBooking(Booking booking) throws SQLException {
	String query=	"insert into booking values(?,?,?)";
		// TODO Auto-generated method stub
		Connection con=DbConnection.getConnection();
		java.sql.Date sqlDate= new java.sql.Date(booking.getDate().getTime());
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setString(1,booking.getPassengerName());
		pst.setInt(2, booking.getBusNo());
		pst.setDate(3,sqlDate);
		pst.executeUpdate();
	}

}
