package pracdb;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 에이콘학생정보를 제공하는 서비스 => 서블릿
@WebServlet("/acornlist2")
public class DBServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	
    	//
    	AcornDAO dao = new AcornDAO();
    	ArrayList <Acorn> list = dao.getAcornList();
    	
    	System.out.println(list);
    	
    	//서블릿해서 직접 응답하기
    	//jsp(view)를 사용해서 응답하기 - 서블릿(Controller), jsp(view) , model(데이터) => mvc2
    	
   
    	req.setAttribute("list", list);
    	req.getRequestDispatcher("WEB-INF/views/list.jsp").forward(req,resp);
    	
    }
}

