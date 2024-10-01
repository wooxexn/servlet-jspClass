package day10;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornlist")
public class AcornList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		// Model - service, dao
		
		AcornService service = new AcornService();
		ArrayList <Acorn>list = service.getList();
		
		req.setAttribute("list", resp);
		
		req.getRequestDispatcher("WEB-INF/views/list.jsp").forward(req,resp);
	}
	

}
