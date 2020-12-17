package j_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class JDBCboard
{
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	private static final Date Date = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소
	String user = "JYS02";	//아이디
	String password = "JAVA";	//비번
	static int number = 4;	
	
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public static void main(String[] args) 
	{
		
		JDBCboard a =new JDBCboard();
		Scanner s = new Scanner(System.in);
		
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		 */
		System.out.println("대덕 자바 게시판입니다");
		System.out.print("접속자 이름을 입력해 주십시오>");
		String id = s.nextLine();
		
		while(true)
		{
			a.UI();
			String UIp = s.nextLine();
			
			switch(UIp)
			{
			case "1" :	System.out.println("불러오고싶은 번호를 눌러주세요");
			            int pick = Integer.parseInt(s.nextLine());
			            a.Look(pick);
			            break;
			case "2" : System.out.println("제목");
					   String title = s.nextLine();
					   System.out.println("내용");
					   String content = s.nextLine();
					   
						a.insert(number, title, content, id);
						break;
			case "3" : System.out.println("종료되었습니다.");
						System.exit(0);
			case "4" :
			}
		}
			
			
	}
	
	
	
	void login()
	{
		
	}
	
	
	void UI()
	{
		System.out.println("=================================");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("=================================");
		System.out.println("               .                ");
		System.out.println("               .                ");
		System.out.println("               .                ");
		try {
			con = DriverManager.getConnection(url, user, password);	//드라이버 관리해주는 클래스를 연결하는거임
			
			
			String sql = "select * FROM TB_JDBC_BOARD order by 1 desc ";
			ps =con.prepareStatement(sql);			
			
			
			rs = ps.executeQuery();					
			
			while(rs.next())
			{
				String BOARD_NO = rs.getString(1);		
				String TITLE = rs.getString(2);		
				String CONTENT = rs.getString(3);		
				String USER_ID = rs.getString(4);		
				String REG_DATE = rs.getString(5);		
				
				System.out.println(BOARD_NO+TITLE+CONTENT+USER_ID+REG_DATE);
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		System.out.println("=================================");
		System.out.println("1.조회	 2.등록	 3.종료    4.찾기");
	}
	
	
	
	//조회
	void Look(int pick)
	{
		try {
	  		con = DriverManager.getConnection(url, user, password);	
	  		String sql = "select * FROM TB_JDBC_BOARD WHERE board_no = ?";
	  		ps =con.prepareStatement(sql);	
	  		rs = ps.executeQuery();
	  		
	  		
	  		while(rs.next())
	  		{
	  			String look = rs.getString(pick);
	  			System.out.print(look);
	  		}
	  		
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
	
	
	//등록
	void insert(int no,String title,String content,String id)
	{
		long curr = System.currentTimeMillis();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		String datetime2 = sdf2.format(new Date(curr));
		
	  	try {
	  		con = DriverManager.getConnection(url, user, password);	
	  		String sql = "insert into TB_JDBC_BOARD values(?,?,?,?,?)";
	  		ps =con.prepareStatement(sql);	
	  		
	  		ps.setInt(1, no);
	  		ps.setString(2,title);
	  		ps.setString(3,content);
	  		ps.setString(4,id);
	  		ps.setString(5, datetime2);
	  		ps.executeUpdate();
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
	  	number++;
	}
	
	
	//삭제
	void delet(int no)
	{
		long curr = System.currentTimeMillis();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		String datetime2 = sdf2.format(new Date(curr));
		
	  	try {
	  		con = DriverManager.getConnection(url, user, password);	
	  		String sql = "DELETE FROM TB_JDBC_BOARD WHERE board_no = ?";   
	  		ps =con.prepareStatement(sql);	
	  		
	  		ps.setInt(1, no);
	  		ps.executeUpdate();
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
