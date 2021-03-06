package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) 
	{
		/*
		 * 
		 */
		//데이터베이스 접속 정보
				String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소
		String user = "JYS02";	//아이디
		String password = "JAVA";	//비번
		
		//변수들 먼저 생성
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			con = DriverManager.getConnection(url, user, password);	
			
			//쿼리를 문자열로작성
//			String sql = "select * from member where mem_id = ?";	//-2- 쿼리에는 ?넣고
			String sql = "insert into lprod values(?,?,?)";
			ps =con.prepareStatement(sql);	
			
			ps.setInt(1, 11);
			ps.setString(2,"P601");
			ps.setString(3,"식품");
			
//			ps.setString(1, "a001");		//-2-파라미터 인덱스 위치, 뒤에 파라미터 는 널값
//			ps.setInt(parameterIndex, x);
//			ps.setObject(parameterIndex, x);
//			rs = ps.executeQuery();					
			
			int result = ps.executeUpdate();//insert, update,delete 에서사용		
			System.out.println("영향받은 행의 수 : "+ result);
//			ResultSetMetaData md = rs.getMetaData(); //-2- 메타데이터 : 데이터에 대한 데이터
			
//			int ColumnCount = md.getColumnCount();// 컬럼의 수
			
			
//			while(rs.next())	
//			{
//				
//			
//			}
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
				
	}

}
