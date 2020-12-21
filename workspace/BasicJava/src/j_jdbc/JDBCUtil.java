package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil
{
	
	/*
	 * 
	JDBCUtill instance = JDBCUtil.getInstance();
	
	String sql = "select * from member where mem_id = ?";
	
	List<object> param = new ArrayList();
	param.add("a001");
	
	List<Map<String, Object>> List = jdbc.selectList(sql,param);
	
	System.out.println(list);
	 */
	
	
	//싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴			--디자인패턴:클래스를 설계하는 방식
	private JDBCUtil()
	{
		
	}
	
	//인스턴스를 보관할 변수
	private static JDBCUtil instance;
	
	//인스턴스를 빌려주는 메서드
	public static JDBCUtil getInstance()
	{
		if(instance == null)
		{
			instance = new JDBCUtil();
		}
		return instance;
	}
	
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	String user = "JYS02";	
	String password = "JAVA";
	
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	/*
	 * Map<String, Object> selectOne(String sql)					       --1.물음표가 없는 메소드(한줄)
	 * Map<String, Object> selectOne(String sql, List<Object> param)       --2.물음표가 있는메서드 (? , 파라미터)
	 * List<Map<String, Object>> selectList(String sql)				       --3.여러줄
	 * List<Map<String, Object>> selectList(String sql, List<Object> param)--4.
	 * int update(String sql)											   --5.몇개행이 영향받았는지
	 * int update(String sql, List<Object> param)						   --6.
	 */
	
	//1번예시
	Map<String, Object> selectOne(String sql)
	{
		HashMap<String, Object> hashmap = new HashMap <>();
		try {
			con = DriverManager.getConnection(url,user,password);	//연결객체를 얻고
			ps= con.prepareStatement(sql);							//실행 도구생성
			rs = ps.executeQuery();									//결과 실행
			
			ResultSetMetaData md = rs.getMetaData();
			
			int columnCount = md.getColumnCount();
			
			rs.next();
				
				for(int i = 1; i< columnCount; i++)
				{
				String key = md.getColumnName(i);
				Object value = rs.getObject(key);
				hashmap.put(key,value);
				}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return hashmap;
	}
	
	//2번예시
	public Map<String, Object> selectOne(String sql, List<Object> param)
	{
		HashMap<String, Object> hashmap = new HashMap <>();
		try {
			con = DriverManager.getConnection(url,user,password);
			ps= con.prepareStatement(sql);							
				
			for(int i = 0 ; i < param.size();i++)
			{
			 
		     ps.setObject(i+1, param.get(i));
			}
			
			rs = ps.executeQuery();		
			ResultSetMetaData md = rs.getMetaData();
			
			int columnCount = md.getColumnCount();
		
			while(rs.next())
			{
			for(int i = 1; i< columnCount; i++)
			{
			String key = md.getColumnName(i);
			Object value = rs.getObject(key);
			hashmap.put(key,value);
			
			}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hashmap;
				
	}
	
	//3번
	
	public List<Map<String, Object>> selectList(String sql)
	{
		//쿼리를 조회한 결과
		List<Map<String, Object>> list = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			
			
			rs = ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData();
			
			int columnCount = md.getColumnCount();
			
			while(rs.next())
			{
				Map<String, Object> row = new HashMap<>();
				for(int i = 1; i <=columnCount; i++)
				{
					String key = md.getColumnName(i);
					Object value = rs.getObject(key);
					row.put(key,value);
				}//여기까지 map에 key 로 저장
				list.add(row);
				///마지막으로 list에 저장
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally 
		{
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return list;
	}
	
	
	
	//4번 예시
										//↓얘가 쿼리
	List<Map<String, Object>> selectList(String sql, List<Object> param)
	{
		//쿼리를 조회한 결과
		List<Map<String, Object>> list = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			for(int i = 0 ; i < param.size();i++)
			{
			 
		     ps.setObject(i+1, param.get(i));
			}
			
			rs = ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData();
			
			int columnCount = md.getColumnCount();
			
			while(rs.next())
			{
				Map<String, Object> row = new HashMap<>();
				for(int i = 1; i <=columnCount; i++)
				{
					String key = md.getColumnName(i);
					Object value = rs.getObject(key);
					row.put(key,value);
				}//여기까지 map에 key 로 저장
				list.add(row);
				///마지막으로 list에 저장
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally 
		{
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return list;
	}
	
	//5번 예시
	
	int update(String sql)
	{
		
		try {
			
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally 
		{
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		
		return 0;
		
	}
	
	
	public int update(String sql, List<Object> param){
	try {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement(sql);
		for(int i = 0 ; i < param.size();i++)
		{
		 
	     ps.setObject(i+1, param.get(i));
		}
		int result = ps.executeUpdate();
		
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally 
	{
		if(rs != null) try { rs.close(); } catch(Exception e) {}
		if(ps != null) try { ps.close(); } catch(Exception e) {}
		if(con != null) try { con.close(); } catch(Exception e) {}
	}
	return 0;
	
	
  }
	
	
	//넣는 메서드
	
}
