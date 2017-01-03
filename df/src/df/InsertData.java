package df;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.*;

public class InsertData {

	public static void main(String[] args) {
		try{
			Class.forName("org.h2.Driver");
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1","sa1","sa1");		
		PreparedStatement psmt=conn.prepareStatement("insert into Student values (?,?,?)");
     Scanner scan = new Scanner(System.in);
     
     System.out.println("enter the student ID");
     int studentid =scan.nextInt();

     System.out.println("enter the student name");
     String studentname =scan.next();
     
     System.out.println("enter the course");
     String course =scan.next();
     
     psmt.setInt(1,studentid);
     psmt.setString(2,studentname);
     psmt.setString(3,course);
     int row_eff=psmt.executeUpdate();
    
	System.out.println(row_eff+ "row effected");
	psmt.close();
	conn.close();
		}
	catch(Exception e)
	{
		System.out.println("Exception Arised"+e);
	}

}
}
