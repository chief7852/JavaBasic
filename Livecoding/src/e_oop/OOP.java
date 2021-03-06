package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것
		 * - 코드의 재사용성이높고 유지보수가 용이하다.
		 */
		
		
		//객체생성
		SampleClass sc =new SampleClass();
		
		System.out.println(sc.field);
		
		sc.method1();
		
		String returnValue = sc.method2(5);
		System.out.println(returnValue);
		
		sc.flowTest1();
		
		
		
		
		//다음을 한줄씩 계산해서 최종 결과 값을 출력해주세요.
		Calculator s = new Calculator();
		int x = 123456;
		int y = 654321;
		//1. 123456 + 654321
		
		System.out.println(s.plus(x,y));
		//2. 1번의 결과값 * 123456
		double a =s.plus(x,y);
		System.out.println(s.multi(a, x));
		//3. 2번의 결과값 / 123456
		a = s.multi(a, x);
		System.out.println(s.divi(a, x));
		//4. 3번의 결과값 - 654321
		a = s.divi(a, x);
		System.out.println(s.minus(a,y));
		//5. 4번의 결과값 % 123456
		a = s.minus(a,y);
		System.out.println(s.remain(a,x));
		
		
		
		
		/*
		 * 어떤 대상을 잡아 클래스를 만들어 주세요.
		 * 메서드의 내용은 구체적이지 않아도 괜찮습니다.
		 * 파라미터와 리턴타입 위주로 만들어주세요.
		 * 클래스에 메서드를 만들어 보면서 파라미터와 리턴타입을 생각해보는것이 중요합니다.
		 * 만들어진 클래스를 main메서드에서 사용해주세요.
		 * 
		 */
		
		
		
	}

}
