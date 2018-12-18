package login.atmsystem.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginRegister() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerDAO cd = new CustomerDAOImpl();
		String userName = request.getParameter("username");
		String password = request.getParameter("password1");
		String submitType = request.getParameter("submit");
		
		CustomerInfo c =  new CustomerInfo();
		c = cd.getCustomerInfo(userName, password);
		//System.out.println(c.getUsername()+c.getPassword()+c.getName());
		
		if(submitType.equals("login") && c != null && c.getName() != null) {
			request.setAttribute("message", c.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		
		else if(submitType.equals("register")) {
			
			c = new CustomerInfo();
			c.setName(request.getParameter("name"));
			c.setPassword(password);
			c.setUsername(userName);
			cd.insertCustomerInfo(c);
			
			request.setAttribute("successMessage", "Registration done, please login to continue!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		else {
			request.setAttribute("message", "Data Not Found, Click on Register!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

}
