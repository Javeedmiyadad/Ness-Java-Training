package jdbc;

import java.sql.*;

public class connection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javeed", "root", "");
			
			
			//For fetching data from database
			
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from employee");
//            while (rs.next())
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4));
//		
            
//            For inserting data into the table database
            
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, 9);
			ps.setString(2, "javeed");
			ps.setString(3, "xebia");
     		ps.setInt(4, 20000);
			int rs = ps.executeUpdate();
			System.out.println(rs + " "+"records inserted");
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}
}

