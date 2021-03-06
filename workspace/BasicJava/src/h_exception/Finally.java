package h_exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {
		
	public static void main(String[] args) {
		/*
		 * finally
		 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
		 * - finally는 예외의 발생 여부와 상관없이 가장 마지막에 수행된다.
		 * 
		 * 자동 자원 반환
		 * - try(변수선언;변수선언) {} catch(Exception e) {}
		 * - 사용후 반환이 필요한 객체를 try의 () 안에서 선언하면 try 블럭 종료시 자동으로 반환된다.
		 */
		
		FileInputStream fis = null; // 파일읽기 클래스
		
		try{
			fis = new FileInputStream("d:/file.txt");
//			fis.close();		//반드시 실행해야하는것인데  그냥넘어가면 안되니깐 finally 를 만들어넣는다.
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			try {
				fis.close();		//얘하나 땜에 많은코드작성하기 귀찮아서 나온게 자동자원반환
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		 //예외 발생 :try => catch => finally
		 //예외 미발생 :try => finally
		
		
		//자동 자원 반환 (JDK1.7부터나옴)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
			String str = "뭐시여";
			
			byte[] bytes = str.getBytes();
			
			for(int i = 0 ; i < bytes.length; i++){
				fos.write(bytes[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
