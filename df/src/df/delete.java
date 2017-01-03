package df;

	import java.sql.*;
	import java.util.*;

	public class delete {

		public static void main(String[] args) {
			try
			{
				Class.forName("org.h2.Driver");
				Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1","sa1","sa1");
				
				PreparedStatement psmt=conn.prepareStatement("delete from Student where studentid=?");
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter the StudentId :");
				int sid=scan.nextInt();
				
				psmt.setInt(1,sid);
				
				int row_eff=psmt.executeUpdate();
				
				System.out.println(row_eff+" row effected");
				
			}
			catch(Exception e)
			{
				System.out.println("Exception Arised:"+e);
			}
			

		}

	}


