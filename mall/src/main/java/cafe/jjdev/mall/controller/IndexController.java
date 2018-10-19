package cafe.jjdev.mall.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. router @WebServlet("/index")
		//2. model호출 :DAO모델 생성
		//view rend... (template)
		//forward(request,response) to WEB-INF/jsp/index.jsp
		RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		request.setAttribute("model", "hello world");
		dispatch.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
