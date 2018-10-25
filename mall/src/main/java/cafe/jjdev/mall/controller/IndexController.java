package cafe.jjdev.mall.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cafe.jjdev.mall.service.Member;

@WebServlet("/index")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public IndexController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. router @WebServlet("/index")
		//2. modelȣ�� :DAO�� ����
		//view rend... (template)
		//forward(request,response) to WEB-INF/jsp/index.jsp
		System.out.println("call");
		Member member = new Member();
		
		request.setAttribute("model", "hello world");
		member.setNo(1);member.setId("guest");member.setLevel(0);
		request.setAttribute("member", member); //${member.id}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�¿�");
		list.add("����");
		request.setAttribute("list", list); // ${list}
		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
