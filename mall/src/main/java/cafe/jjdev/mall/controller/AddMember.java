package cafe.jjdev.mall.controller;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.sql.*;
import java.sql.*;
import com.sun.corba.se.pept.transport.Connection;

import cafe.jjdev.mall.service.Member;
import cafe.jjdev.mall.service.MemberDao;
@WebServlet("/AddMember")
public class AddMember extends HttpServlet{
	MemberDao memberDao;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		memberDao = new MemberDao();
		Member member = new Member();
		try {
			int row = memberDao.insertMember(member);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(member.getId());
		request.getRequestDispatcher("WEB-INF/jsp/addMember.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
