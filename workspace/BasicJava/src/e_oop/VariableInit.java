package e_oop;

public class VariableInit {

	//명시적 초기화
	int var = 10;
	static int staticVar = 20;
	
	//초기화 블럭'{}' <=얘가 초기화블럭
	{
		var = 30;
	}
	
	static{
		staticVar = 40;
	}
	
	/*++
	 * 생성자
	 * - 클래스와 같은 이름의 메서드
	 * - 인스턴스 변수를 초기화하기 위해 사용한다					//static이 붙어있지않은 변수
	 * - 클래스에 생성자는 반드시 하나 이상 존재해야 한다.
	 * - 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다.
	 * - 생성자는 리턴타입이 없다.
	 */
	
	VariableInit(){
		
	}
}
