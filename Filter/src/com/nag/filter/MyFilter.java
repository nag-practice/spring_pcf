package com.nag.filter;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class MyFilter extends MyGenericFilter{
	public void doFilter(ServletRequest req , ServletResponse res , FilterChain chain) throws IOException , ServletException {
		{
			String password = req.getParameter("password");
			if (password.equals("mypassword"))
			{
				String uri = ((HttpServletRequest)req).getRequestURI();
				chain.doFilter(req, res);
			}
			
			else
			{
				res.setContentType("text/html");
				PrintWriter pw = res.getWriter();
				pw.println("<html>");
				pw.println("<head><title> Wrong Password </title></head>");
				pw.println("<body>");
				pw.println("<h3> Incorect Password </h3>");
				pw.println("</body>");
				pw.println("</html>");
			}
	}

	}
}

