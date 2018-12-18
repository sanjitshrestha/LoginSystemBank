package login.atmsystem.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImpl implements CustomerDAO {
	static Connection con;
	static PreparedStatement ps;

	@Override
	public int insertCustomerInfo(CustomerInfo c) {
		
		int status = 0;
		try {
			con = MyConnectionProvider.getCon();
			ps = con.prepareStatement("insert into customerinfo value(?,?)");
			ps.setString(1, c.getUsername());
			ps.setString(2, c.getPassword());
			ps.setString(3, c.getName());
			status = ps.executeUpdate();
			con.close();
					
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}

	@Override
	public CustomerInfo getCustomerInfo(String userid, String pass) {
		
		CustomerInfo c = new CustomerInfo();
		
		try {
			con = MyConnectionProvider.getCon();
			ps = con.prepareStatement("select * from customerinfo where userid = ? and password = ?");
			ps.setString(1, userid);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				c.setUsername(rs.getString(1));
				c.setPassword(rs.getString(2));
				c.setName(rs.getString(3));
			}
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return c;
	}

}
