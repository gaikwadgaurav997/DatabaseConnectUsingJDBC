import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmt = null;
		Connection conn = null;
		try {
		conn = DbUtil.getConnection();
		if(conn!=null)
			System.out.println("Connected");
		
		String sql = "select * from employee_gaurav";
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			
		}
//		System.out.println("Data updated");
		stmt.close();
		conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Statement not executed");
		}
		
	}

}
