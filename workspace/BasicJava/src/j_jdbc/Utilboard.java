package j_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Utilboard {

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
	       JDBCUtil jdbc = JDBCUtil.getInstance();
		
     	   JDBCboard a =new JDBCboard();
		   Scanner s = new Scanner(System.in);

	    }

}
