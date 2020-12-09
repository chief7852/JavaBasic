package g_oop2;

public abstract class SampleAbstractParent
{
	/*
	 * 추상메서드,추상클래스,인터페이스
	 */
	void method()
	{			//일반 메서드
		
	}
	//추상 메스드 : 선언부만 있고 구현부는 없는 메서드	, 부모클래스의 역할로 만들기위해
	//추상메서드가 필요한이유 :
	abstract void abstractMethod();	
	//추상메서드를 하나라도 가지고있는 클래스는 추상클래스여야한다.public abstract class
}


// 상속받는 클래스를 만들어준다.(컴파일 에러가뜨는데 추상메서드의 값을 넣어주면 사라진다)
class SampleAbstractChild extends SampleAbstractParent
{
	//추상메서드상속받았기에 오버라이드 해서 내용을 넣어준다.
	@Override
	void abstractMethod() {
		System.out.println("추상메서드를 상속받아 내용을 만들어줌.");
		
	}
	
}



