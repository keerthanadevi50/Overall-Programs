package df;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class showTable {
	public static void main(String[] args)
	{
		try
		{
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1","sa1","sa1");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from student");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"	");
			System.out.println(rs.getString(2)+"		");
			System.out.println(rs.getString(3)+"			");
		}
		stmt.close();
		conn.close();
	}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}

}

}
