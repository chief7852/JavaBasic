package e_oop;

import java.util.Scanner;

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
	
	VariableInit(){							//인스턴스변수만 초기화하는걸 권장함
		var = 50;
	//	staticVar = 60;-(클래스변수)
		//값을 공유해야하는 클래스 변수가 객체 생성시 마다 계속 초기화되기 때문에
		//클래스 변수를 생성자에서 초기화하는 것은 좋지 않다.
		
		//생성자 사용 이유
		//초기화에 여러줄의 코드가 필요할 때
		//초기화에 파라미터가 필요할 때++
	}
	
	public static void main(String[] args) {
		Init i = new Init();	//2
		i.a = 10;
		i.b = 20;
		i.c = 30;
		
		Init i2 = new Init();			//5--컴파일 에러가 뜨지 않으려면 파라미터가 없는 생성자를 하나 더만들어주면 된다.
		i2.a = 40;
		i2.b = 50;
		i2.c = 60;
		
		Init i3 = new Init(70,80,90);			//4
		
	}
	
}

class Init{
	int a;					//1
	int b;
	int c;
	
	Init(int a, int b, int c){				//3
		this.a =  a;
		this.b =  b;
		this.c =  c;
		
		//this : 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 사용한다.
	}
	
	
	//오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것
	Init(){									//6				메서드의 이름은 중복되게 사용가능하다
//		a = 10;				//7
//		b = 20;
//		c = 30;
		this(10, 20, 30);				//생성자의 첫번째 라인에만 사용가능
		//this() : 생성자에서 다른 생성자를 호출할 때 사용한다.
	}
}
