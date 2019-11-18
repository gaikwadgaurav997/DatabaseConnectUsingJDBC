import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmt = null;
		Connection conn = null;
		try {
		conn = DbUtil.getConnection();
		if(conn!=null)
			System.out.println("Connected");
		
		String sql = "insert into employee_gaurav values(2, 10, 'diksha', 7800260170)";
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Data updated");
		stmt.close();
		conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Statement not executed");
		}
		
	}

}
