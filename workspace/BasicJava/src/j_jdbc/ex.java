package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex {

	public static void main(String[] args) {
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
			String sql = "select * from JOBS";
			ps =con.prepareStatement(sql);			//쿼리에 정보를 담고있는 클래스
			
			//쿼리실행		(2가지방법)
			rs = ps.executeQuery();					//select에서사용
			
//			int result = ps.executeUpdate();//insert, update,delete 에서사용		//영향받은 행(row)의 수를 리턴한다
			
			//출력
			while(rs.next())//select에서만 사용		//rs.next()는 rs가다음행이있는지없는지 확인하는 메서드
			{
				String jobID = rs.getString(1);		//인덱스로 값을 가져오기(인덱스는 1부터 시작)
				String jobTitle = rs.getString("JOB_TITLE");//컬럼명으로 값을 가져오기
				System.out.println("JOB_ID : "+ jobID + " / JOB_TITLE : " + jobTitle);
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
