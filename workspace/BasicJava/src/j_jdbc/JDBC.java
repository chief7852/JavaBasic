package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args)
	{
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바와 데이터베이스를 연결해주는 라이브러리					..라이브러리란 : 기능사용을위한 class들의 모임?(기능서포트역할)
		 * - Ojdbc : 오라클 JDBC						//다운로드 따로받아야함				
		 * 
		 * JDBC 작성단계
		 * 1. Connection 생성
		 * 2. Statement 생성(쿼리)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기					/끝났을 때 닫아주지 않으면 메모리 차지
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
			con = DriverManager.getConnection(url, user, password);	//드라이버 관리해주는 클래스를 연결하는거임
			
			//쿼리를 문자열로작성
			String sql = "select * from member";
			ps =con.prepareStatement(sql);			//쿼리에 정보를 담고있는 클래스
			
			//쿼리실행		(2가지방법)
			rs = ps.executeQuery();					//select에서사용
			
//			int result = ps.executeUpdate();//insert, update,delete 에서사용		//영향받은 행(row)의 수를 리턴한다
			
			//출력
			while(rs.next())//select에서만 사용		//rs.next()는 rs가다음행이있는지없는지 확인하는 메서드
			{
				String memId = rs.getString(2);		//인덱스로 값을 가져오기(인덱스는 1부터 시작)
				String memPass = rs.getString("MEM_PASS");//컬럼명으로 값을 가져오
				System.out.println("MEM_ID : "+ memId + " / MEM_PASS : " + memPass);
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		
		
		
	}
}
