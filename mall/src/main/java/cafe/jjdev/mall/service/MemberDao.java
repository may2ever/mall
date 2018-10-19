package cafe.jjdev.mall.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	public int insertMember(Member member) throws Exception{
		Connection myconn=null;
		PreparedStatement st = null;
		ResultSet rs=null;
		Context init=new InitialContext();
		DataSource ds=(DataSource)init.lookup("java:comp/env/jdbc/mall");
		myconn=ds.getConnection();
		st = myconn.prepareStatement("select * from member");
		rs = st.executeQuery();
		rs.next();
		member.setNo(rs.getInt(1));
		member.setId(rs.getString(2));
		member.setPw(rs.getString(3));
		member.setLevel(rs.getInt(4));

		
		rs.close();
		st.close();
		myconn.close();
		return 0;
	}
}
