package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {
	
		public static boolean validate(String name, String pass) {
			boolean status = false;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelab", "root", "root");

				PreparedStatement ps = con.prepareStatement("select * from login");
				

				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					String name1=rs.getString(1);
					String password=rs.getString(2);
					if(name.compareToIgnoreCase(name1)== 0 &&  pass.compareToIgnoreCase(password)==0) {
						return true;
					}
				}

			} catch (Exception e) {
				System.out.println(e);
			}
			return status;
		}
}
