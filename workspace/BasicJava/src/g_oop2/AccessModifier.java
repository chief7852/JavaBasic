package g_oop2;

public/*public : 접근제어자*/ class AccessModifier {
	
	public String publicVar = "public : 접근제한이 없음";
	/*
	 * 다른 어떤클래스에서도 사용가능
	 */
	protected String protectedVar = "protected :같은 패키지 + 상속받은 클래스에서 접근가능";
	/*
	 * 같은패키지내에서 사용가능,같은패키지가 아니라도 상속받으면 가능하다.
	 */
	String defaultVar = "default : 같은 패키지에서만 접근 가능";		//생략해야 default이다.
	/*
	 * 같은 패키지에서만 접근가능
	 */
	private String privateVar = "private : 클래스 내에서만 접근가능";
	/*
	 * 같은 클래스 내에서만 사용가능
	 */
	
	//메서드에도 붙일수있음
	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	
	//위 내용들을 main 메소드로 사용해봄
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		//시간 객체생성
		Time t = new Time();
		
//		t.hour = 9;
//		t.minute = 380;      		            //사용자가 올바르지 않게 데이터를 넣어도
//		t.second = -30;                         //올바르게 만들방법
		                                        //메서드를 중계해서 출력하면 메서드에 제한할수있는 로직을 넣어
												//만들어본다.
		//이렇게하면 메서드를 통해서 변수에 접근한다.
		//메서드들에 이상한값이 접근할수없게 로직을 만들면 제대로 된값을 만들어낼수있다.
		t.setHour(23);
		t.setMinute(59);
		t.setSecond(55);
		System.out.println(t.getTime());
		/*
		 * 접근 제어자를 사용하는 이유
		 * - 데이터를 보호하기위해 
		 * - 사용하는데 불필요한 멤버를 숨기기 위해		(?)
		 */
		//시간 실행
		t.clock();
		
	}
	
	
}
