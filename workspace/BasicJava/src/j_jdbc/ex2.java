package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex2 {
	public static void main(String[] args) {
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소
	String user = "JYS02";	//아이디
	String password = "JAVA";	//비번
	
	//변수들 먼저 생성
	Connection con = null;
//	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	try {
		con = DriverManager.getConnection(url, user, password);	//드라이버 관리해주는 클래스를 연결하는거임
		
		//쿼리를 문자열로작성
		String sql = "select * from TB_JDBC_BOARD";
		Statement ps =con.createStatement();
		rs = ps.executeQuery(sql);			
		

		
		if(rs.next()){

		String name = rs.getString("TITLE");
		System.out.println(name);
		}
		

		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		if(rs != null) try { rs.close(); } catch(Exception e) {}
//		if(ps != null) try { ps.close(); } catch(Exception e) {}
		if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}
}
