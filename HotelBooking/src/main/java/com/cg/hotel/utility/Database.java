package com.cg.hotel.utility;
import java.sql.Connection;
import java.sql.DriverManager;
public class Database {

	public Connection connection() throws Exception {
		//Loading and registering drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "koushik9");
		return con;
	}
	
}
