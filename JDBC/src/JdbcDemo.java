import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		
		//insertVarRecord();
	
		//insertRecord();
		//insertPreparedRecord();
	//	delete();
	
	
	
	//sp();
		//spwithParameter();
		//spwithParameterOut();
		//commit();
		//batchDemo();
		batchDemoRollBack();
	}
	
	/////////////////////////////////////////////////////////////////////////////
	//read 
	public static void readRecord() throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String userName ="root";
		String password="7614";
		
		String query="select * from employee";
Connection con= DriverManager.getConnection(url, userName, password);
Statement st=con.createStatement();
ResultSet rs = st.executeQuery(query);
while(rs.next()) {
System.out.println("id is "+rs.getInt(1));
System.out.println("name is "+rs.getString(2));
System.out.println("salary is "+rs.getInt(3));
}
con.close();
	}
///////////////////////////////////////////////////////////////////////////////////
	//insert
	
	public static void insertRecord() throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String userName ="root";
		String password="7614";
		
		String query="insert into employee values(4,'priya',2500)";
Connection con= DriverManager.getConnection(url, userName, password);
Statement st=con.createStatement();
int rows = st.executeUpdate(query);

System.out.println("Number of rows affected: "+rows);

con.close();
	}

	
	public static void insertVarRecord() throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String userName ="root";
		String password="7614";
		int id=5;
		String name="varun";
		int salary=30000;
		
		String query="insert into employee values("+ id +",'"+ name +"',"+ salary+")";
Connection con= DriverManager.getConnection(url, userName, password);
Statement st=con.createStatement();
int rows = st.executeUpdate(query);

System.out.println("Number of rows affected: "+rows);

con.close();


//insert using prepared statements



	}
	public static void insertPreparedRecord() throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String userName ="root";
		String password="7614";
		int id=6;
		String name="naveen";
		int salary=3000087;
		
		String query="insert into employee values(?,?,?)";
Connection con= DriverManager.getConnection(url, userName, password);
//Statement st=con.createStatement();
//int rows = st.executeUpdate(query);

PreparedStatement pst= con.prepareStatement(query);
pst.setInt(1, id);
pst.setString(2, name);
pst.setInt(3,salary);
int rows = pst.executeUpdate();

System.out.println("Number of rows affected: "+rows);


System.out.println();

con.close();
	}
	
	//delete
	///////////////////////////////////////////////////////////////////////////////////////////////
	public static void delete() throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String userName ="root";
		String password="7614";
		int id=6;
		
		
		String query="delete from employee where emp_id = "+id;
Connection con= DriverManager.getConnection(url, userName, password);
Statement st=con.createStatement();
int rows = st.executeUpdate(query);

System.out.println("Number of rows affected: "+rows);

con.close();

	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//update
	public static void update() throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String userName ="root";
		String password="7614";
	
		
		
		String query="update employee set salary =150000 where emp_id=1 ";
Connection con= DriverManager.getConnection(url, userName, password);
Statement st=con.createStatement();
int rows = st.executeUpdate(query);

System.out.println("Number of rows affected: "+rows);

con.close();

	}
//	update using prepareStatement
	public static void updatePrepared() throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String userName ="root";
		String password="7614";
	
		int id=2;
		int sal=26666;
		
		String query="update employee set salary = ? where emp_id = ? ";
Connection con= DriverManager.getConnection(url, userName, password);
PreparedStatement pst= con.prepareStatement(query);

pst.setInt(1,sal);
pst.setInt(2,id);
int rows = pst.executeUpdate(query);

System.out.println("Number of rows affected: "+rows);

con.close();

	}
	/////////////////////////////////////////////////////////////////////////////////////////
	
	//callable statement(stored procudure);
	public static void sp() throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String userName ="root";
		String password="7614";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		CallableStatement prepareCall = con.prepareCall("{call getEmp()}");
		ResultSet rs = prepareCall.executeQuery();
	
	
	while(rs.next()) {
		System.out.println("id is "+rs.getInt(1));
		System.out.println("name is "+rs.getString(2));
		System.out.println("salary is "+rs.getInt(3));
		}
		con.close();
			}
///////////////////////////////////////////////////////////////////////////////////////////////////
	
	//stored procedure with parameter IN
	public static void spwithParameter() throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String userName ="root";
		String password="7614";
		int id=3;
		
		Connection con=DriverManager.getConnection(url,userName,password);
		CallableStatement prepareCall = con.prepareCall("{call getEmps(?)}");
		prepareCall.setInt(1, id);
		ResultSet rs = prepareCall.executeQuery();
	
	
	while(rs.next()) {
		System.out.println("id is "+rs.getInt(1));
		System.out.println("name is "+rs.getString(2));
		System.out.println("salary is "+rs.getInt(3));
		}
		con.close();
			}
	
///////////////////////////////////////////////////////////////////////////////////////////////////
	
//stored procedure with parameter OUT
public static void spwithParameterOut() throws Exception{
String url="jdbc:mysql://localhost:3306/jdbcDemo";
String userName ="root";
String password="7614";
int id=3;

Connection con=DriverManager.getConnection(url,userName,password);
CallableStatement prepareCall = con.prepareCall("{call getEmpss(?,?)}");
prepareCall.setInt(1, id);
prepareCall.registerOutParameter(2, Types.VARCHAR);

prepareCall.executeUpdate();

System.out.println(prepareCall.getString(2));
con.close();
}
/////////////////////////////////////////////////////////////////////////////////////////////////
//commit and auto commit
public static void commit() throws Exception{
String url="jdbc:mysql://localhost:3306/jdbcDemo";
String userName ="root";
String password="7614";

String query="update employee set salary=60000 where emp_id=1";
String query2="updte employee set salary=60000 where emp_id=2";
Connection con= DriverManager.getConnection(url, userName, password);

con.setAutoCommit(false);
Statement st=con.createStatement();
int rows = st.executeUpdate(query);
System.out.println("rows affected"+rows);

int rows2 = st.executeUpdate(query2);
System.out.println("rows affected"+rows2);

if(rows>0 && rows2>0) {
	con.commit();
}
con.close();
      }
//////////////////////////////////////////////////////////////////////////////
//add batch
public static void batchDemo() throws Exception{
String url="jdbc:mysql://localhost:3306/jdbcDemo";
String userName ="root";
String password="7614";

String query="update employee set salary=40000 where emp_id=1";
String query2="update employee set salary=40000 where emp_id=2";
String query3="update employee set salary=40000 where emp_id=3";
String query4="update employee set salary=40000 where emp_id=4";
Connection con= DriverManager.getConnection(url, userName, password);
con.setAutoCommit(false);

Statement st=con.createStatement();

st.addBatch(query);
st.addBatch(query2);
st.addBatch(query3);
st.addBatch(query4);
int[] executeBatch = st.executeBatch();
try {
for(int i:executeBatch) {
	System.out.println("rows affected "+i);
}
}catch(Exception e) {
System.out.println("exception accurs");
	
}
con.commit();
con.close();
      }

//add batch roll back
public static void batchDemoRollBack() throws Exception{
String url="jdbc:mysql://localhost:3306/jdbcDemo";
String userName ="root";
String password="7614";

String query="update employee set salary=40000 where emp_id=1";
String query2="update employee set salary=40000 where emp_id=2";
String query3="update employee set salary=40000 where emp_id=3";
String query4="update employee set salary=40000 where emp_id=4";
Connection con= DriverManager.getConnection(url, userName, password);
con.setAutoCommit(false);

Statement st=con.createStatement();

st.addBatch(query);
st.addBatch(query2);
st.addBatch(query3);
st.addBatch(query4);
int[] executeBatch = st.executeBatch();

for(int i:executeBatch) {
	    if(i>0) {
	    	
		continue;
		
	    }  else {
	        con.rollback();
	            
	       }
    }

con.commit();
con.close();
      }
/////////////////////////////////////////////////////////////////////////////////

}
