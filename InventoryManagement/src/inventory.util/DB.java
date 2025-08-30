package inventory.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	//DB 연결
	private static final String URL = "jdbc:oracle:thin:@loaclhost:1521:xe";
	private static final String USER = "inventory";
	private static final String PASSWORD = "1234";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
