import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	public static Connection getConnection() {
	
	try {
		
	String driverName = "oracle.jdbc.driver.OracleDriver";	
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "system";
	String password = "root";
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
