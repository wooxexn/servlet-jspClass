package movie;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/realMovie")
public class MovieServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//영화정보 (모델)
		
		MovieService service = new MovieService();
		ArrayList<Movie> list = service.getMoveListAll();
		
		req.setAttribute("list", list);
		
		
		req.getRequestDispatcher("WEB-INF/views/realMovielist.jsp").forward(req, resp);
	}
	
	
	
	

}
