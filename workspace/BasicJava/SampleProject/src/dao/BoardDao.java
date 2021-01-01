package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class BoardDao {
	
	private static BoardDao instance;
	private BoardDao(){}
	public static BoardDao getInstance(){
		if(instance == null){
			instance = new BoardDao();
		}
		return instance;
	}
	
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	public List<Map<String, Object>> selectBoardList(){
		String sql = "SELECT A.BOARD_NO, A.TITLE, A.CONTENT, B.NICKNAME, A.B_DATE, A.CATEGORY"
				+ " FROM BOARD A"
				+ " LEFT OUTER JOIN USERS B"
				+ " ON A.USER_ID = B.USER_ID"
				+ " ORDER BY A.BOARD_NO DESC";
		
		return jdbc.selectList(sql);
				
	}

}