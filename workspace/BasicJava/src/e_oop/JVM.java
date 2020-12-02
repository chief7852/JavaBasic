package e_oop;

public class JVM {

	public static void main(String[] args) {
		/*
		 * JVM(Java Virtual Machine)
		 * - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
		 * - 운영체제 -> JVM -> 자바 프로그램
		 * - 장점 : 운영체제에 상관없이 실행할 수 있다.
		 * - 단점 : 속도가 느리다.
		 * 
		 * JVM 메모리 구조
		 * - Method Area(메서드 영역) : 클래스 멤버가 저장된다.
		 * - Call Stack(호출스택) : 현재 호출되어 있는 메서드가 저장된다.
		 * - Heap : 객체가 저장된다.
		 */
		
		//1. 프로그램 실행시 main(), classVar, classMethod()가 MethodArea에 저장됨(static들 먼저 실행)
		//2. main()이 호출되어  CallStack에 저장됨
		
		System.out.println(classVar);
		//3. System클래스의 out이 MethodArea에 저장됨
		//4. println()이 호출되어 CallStack에 저장됨
		//5. println()이 classVar를 출력 후 CallStack에서 삭제됨
		
		classMethod();
		//6. classMethod()가 호출되어 CallStack에 저장됨
		//7. instanceVar는 메모리에 존재하지 않기 떄문에 사용될 수 없음
		//8. println()이 호출되어 CallStack에 저장됨
		//9. println()이 classVar를 출력 후 CallStack에서 삭제됨
		//10. classMethod()의 실행이 종료되어 CallStack에서 삭제됨
		
		JVM jvm = new JVM();		//메인메서드안에있는 지역변수
		//11. JVM객체가 Heap에 저장됨
		//12. Jvm변수가 CallStack에 생성되고, JVM객체의 주소가 저장됨
		
		System.out.println(jvm.instanceVar);
		//13. println()이 호출되어 CallStack에 저장됨
		//14. println()이 instanceVar를 출력 후 CallStack에서 삭제됨;
		
		jvm.instanceMethod();
		//15. instaceMethod()가 호출되어 CallStack에 저장됨
		//16. println()이 호출되어 CallStack에 저장됨
		//17. println()이 instanceVar를 출력 후 CallStack에서 삭제됨
		//18. println()이 호출되어 CallStack에 저장됨
		//19. println()이 classVar를 출력 후 CallStack에서 삭제됨
		//20. instanceMethod()의 실행이 종료되어 CallStack 에서 삭제됨
		
		jvm = null;
		//21. jvm변수에 null이 저장됨
		//22. 어디에서도 주소를 탐조하지 않는 JVM객체는  GarvageClloctor에의해 삭제됨
		
		//23. main()의 실행이 종료되어 CallStack에서 삭제됨
		//24. 프로그램이 종료되고 MethodArea의 데이터가 삭제됨
		
	}
	int instanceVar;
	static int classVar;
	
	void instanceMethod(){						//객체생성을 하면 나타나는 메서드라  둘다사용가능
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	static void classMethod(){					//stactic은 프로그램 시작과 같이 실행되기에 사용할수없음 ▽
//		System.out.println(instanceVar);		//아직 메모리에 올라가지 않은 상태
		System.out.println(classVar);
	}
}










