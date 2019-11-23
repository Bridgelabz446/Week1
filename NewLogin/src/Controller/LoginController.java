package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Repository.Login;



public class LoginController extends HttpServlet {
	
			private static final long serialVersionUID = 1L;

			public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				response.setContentType("text/html");
				PrintWriter out = response.getWriter();

				String n = request.getParameter("name");
				String p = request.getParameter("pass");

				if (Login.validate(n, p)) {
					response.sendRedirect("Registration.jsp");
					out.print("welcome");
//					rd.forward(request, response);
		} else {
			out.print("Sorry username or password error");
					RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");					rd.include(request, response);
			}

				out.close();
			}
	
	}


