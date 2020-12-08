package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier/*상속받게하면 protected를 사용할수있음1*/ {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod();		//같은 패키지 + 상속받은 클래스에서 접근가능
		// >2이렇게는 사용불가능
		
//		System.out.println(am.defaultVar);
//		am.defaultMethod();			//같은 패키지에서만 접근 가능
		
//		System.out.println(am.privateVar);
//		am.privateMethod();			//class 가 달라서 안됨
		
		AccessTest at = new AccessTest();	//3 상속받은 클래스와 다르지만 protected가 있는 
											//파일에서 가져오면 사용가능
		
		System.out.println(at.protectedVar);
		at.protectedMethod();
	}
}
