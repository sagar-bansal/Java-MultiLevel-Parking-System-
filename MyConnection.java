package Pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
	
	static Connection con;
	static Connection connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Ok");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sagar","root","vhuzsdcbtreqw");
			System.out.println("Connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}

	public static void main(String[] args) {
		connect();
		// TODO Auto-generated method stub

	}

}
