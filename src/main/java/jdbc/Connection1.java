package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;






// Class to understand JDBC
public class Connection1 {

	private Driver dr;
	private Connection Conn;
	
	public Connection1() {
		try {
			this.dr= new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(dr);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		return this.Conn;
	}
	
	public void setConnection(String db_name) {
		try {
			String name = "jdbc:mysql://hostname/"+db_name;
			this.Conn = DriverManager.getConnection("jdbc:mysql://root@localhost/db_test","root@localhost","Sparrow@2011");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	@Test
	public void Testconnectivity() {
		try {
		this.setConnection("db_test");
		Connection con = getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from table01");
		while(rs.next()) {
			
			System.out.println("result "+ rs.getString(4));
		}
		rs.close();
		st.close();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			
		}
		
		
		
	}
	
}
