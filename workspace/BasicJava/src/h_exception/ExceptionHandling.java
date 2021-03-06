package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * 에러
		 * - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)		--컴퓨터가 알아듣게 변경중 오타등의 이유로 에러발생
		 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것 (버그)  
		 * - 런타임 에러 : 실행 시에 발생되는 에러
		 * 
		 * 런타임 에러
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류 (처리불가)
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 (처리가능)
		 * 
		 * 예외 
		 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외 처리가 강제되지 않는다.
		 * - [RuntimeException 클래스와 그 자식들을 제외한]
		 *   Exception 클래스의 자식들은 예외 처리가 강제된다.		//반드시 해줘야함
		 *   
		 * 예외처리(try-catch)
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try {} catch(Exception e) {}
		 * - try 블럭안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 ()안에는 처리할 예외를 지정해 줄 수 있다.
		 * - 여러종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수있다.
		 * - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지않는다.
		 */

		//2 예외처리법
		
		/* 가장많이보게될 에러들
		 * 
		 * IndexOutOfBoundsException
		 * :9번째가 최대인데 9번째가 넘어가는 값이 들어왔다라는뜻(배열에서)
		 * NullPointerException
		 * :Null에서 참조를 했다는 뜻
		 */
		try{
		int result = 10/0;
		System.out.println(result);
		}catch(ArithmeticException | IndexOutOfBoundsException e){
			e.printStackTrace();  					//에러 메시지를 출력한다.
		}catch(NullPointerException e){
			
		}catch(Exception e){						//Exception e 는 모든 예외처리의 부모 모든 처리가 가능
		}		
		test1();
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
		/*
		 * CallStack		(스택구조)
		 * 
		 * |		|
		 * |  test2 |		--나갈때는 위에서부터 나간다. 밑에있는애들은 위에 애들나가기전 못나감
		 * |  test1 |
		 * |___main_|		-- 밑에서부터 데이터가 차곡차곡쌓인다.
		 * 
		 */
//		System.out.println(10/0);		
		/*
		 * 
java.lang.ArithmeticException: / by zero
	at h_exception.ExceptionHandling.main(ExceptionHandling.java:35)
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at h_exception.ExceptionHandling.test2(ExceptionHandling.java:63)	--얘한테서 나옴(제일최근것을(가능성이높음) 확인해야한다.)
	at h_exception.ExceptionHandling.test1(ExceptionHandling.java:59)
	at h_exception.ExceptionHandling.main(ExceptionHandling.java:53)

		 */
//-------------------------------------------------------------------------------------		
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		/*
		 * 
 java.io.FileNotFoundException: 
	at java.io.FileInputStream.open(Native Method)
	at java.io.FileInputStream.<init>(FileInputStream.java:146)
	at java.io.FileInputStream.<init>(FileInputStream.java:101)
	at h_exception.ExceptionHandling.test2(ExceptionHandling.java:76)		--이중에서 내가 만든값중에 첫번째것이 가능성높음
	at h_exception.ExceptionHandling.test1(ExceptionHandling.java:50)
	at h_exception.ExceptionHandling.main(ExceptionHandling.java:46)

		 */
			
		
	}

}
