package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnection {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SEEK_MENTORE","root","pass");
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("SELECT * FROM PREFERRED_TEACHING_TYPE_LOOKUP G order by g.ORDER_OF_CATEGORY, g.ORDER_IN_CATEGORY");  
		System.out.println("[");
		while(rs.next())  {
			System.out.println("{");
			System.out.println("		value : '"+rs.getString("VALUE")+"',");
			System.out.println("		label : '"+rs.getString("LABEL")+"'");
			System.out.print("	},");			
		}
		System.out.println("]");
		con.close();  		  
	}

}
