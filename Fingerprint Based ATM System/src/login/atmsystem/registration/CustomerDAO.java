package login.atmsystem.registration;

public interface CustomerDAO {
	
	public int insertCustomerInfo(CustomerInfo c);
	public CustomerInfo getCustomerInfo(String username, String pass);
}
