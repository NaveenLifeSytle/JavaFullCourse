package busreserve;

import java.sql.*;



public class BusDAO {

	public void displayBusInfo() throws SQLException {
		String query="select * from bus";
		 Connection con = DbConnection.getConnection();
		 Statement st= con.createStatement();
		 ResultSet rs =  st.executeQuery(query);
		 
		 while(rs.next()) {
			 System.out.println("bus No: "+rs.getInt(1));

             if(rs.getInt(2)==0)
             
              System.out.println("ac: no ");
             
             else 
            	 System.out.println("AC : YES ");
             
             
			 System.out.println("CAPACITY: "+rs.getInt(3));
			 
			 }
		System.out.println("----------------------------------------");
		
	}

	
	public int getcapacity(int busNo) throws SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String query="select capacity from bus where id=" +busNo;
		Connection con = DbConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
          rs.next();
		return rs.getInt(1);
	
	}


}
