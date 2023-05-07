package requestdispatcher_sendredirect;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/test")
public class TestClass  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().print("<h1>This is TestClass Servlet");
		
		//RequestDispatcher dispatcher=req.getRequestDispatcher("demo");loaded inside a obj  
		//dispatcher.include(req,resp);//sending here to demo req dispatcher
		
		req.getRequestDispatcher("index.html").forward(req,resp);//in the place of demo u can write index.jsp and it is for reqdispatcher
		//resp.getWriter().print("<h1> This is Democlass servlet</h1>");
		
	}

}
//and learn diff b/w forward and include method