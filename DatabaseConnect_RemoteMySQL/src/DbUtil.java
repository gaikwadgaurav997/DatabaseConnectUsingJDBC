
import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	public static Connection getConnection() {
	
	try {
		
	String driverName = "com.mysql.jdbc.Driver";	
	String url = "jdbc:mysql://remotemysql.com:3306/CmHFJwb6yA";
	String user = "CmHFJwb6yA";
	String password = "TjzomoBZVG";
	Class.forName(driverName);
	
	Connection conn = DriverManager.getConnection(url, user, password);
	return conn;
	}
	catch(Exception e)
	{
		System.out.println("Driver not loaded correctly");
		return null;
		
		
	}
	
	
	}
}

