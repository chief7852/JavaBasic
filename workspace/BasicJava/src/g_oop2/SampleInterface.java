package g_oop2;

public interface SampleInterface 
{
	/*
	 * interface특징
	 * 일반적인 메서드나 변수를 가질수없음
	 * 추상메서드나 상수만 가질수 있음
	 * 사용은 못하고 부모클래스의 역할만 하는 것
	 */
	
	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야한다.
	public static final int NUM1 = 1;
	
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다
	int NUM2 = 2;
	
	//인터페이스의 모든 메서드는 public abstract  제어자를 사용해야한다.
	public abstract void method1();
	
	//모든 메서드의 제어자가 같기때문에 생략이 가능하다.
	void method2();
}


class SampleImplement implements SampleInterface, SampleInterface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
	}

interface SampleInterface2
{
	void method1();
	void method3();
	
}

