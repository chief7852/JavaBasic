package a_variable;		//클래스의 위치

import java.util.Scanner;	//T1

public class Variable {				//클래스 : 변수와 메서드로 구성				변수(데이터) 메서드(데이터로 무엇을 할지)

	public static void main(String[] args) {	//메서드 - ()가 붙은것
		//메서드 : 명령문의 집합
		//main메서드 : 프로그램의 시작과 끝			

		
		//주석: 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용한다.)
		
//		한줄주석 : Ctrl + Shift + c  "//"
		
		/*범위주석 : Ctrl + Shift + /(해제: \ )*/
		
		
		//변수:(데이터를 담는 그릇), 필요한 데이터를 가져오기위해 만듦
		
		//데이터의 형태(데이터 타입)와 이름을 작성하면 변수를 만들 수 있다.
		//데이터 타입을 선탤할 때는 표현하고자 하는 데이터에 맞는 타입을 선택해주면 된다.
		//변수이름을 정할때는 표현하고자 하는 데이터의 의미와 부합하는 이름을 지어주면 된다.
		
		//++++++++++필수암기
		/*데이터타입
		 * 
		 * 기본형타입
		 * -정수 : byte(1){메모리절약}, short(2){c언어 호환}, *int(4){효율적+-20억}, long(8){int보다 클때900경}	
		 * -실수 : float(4){7자리,메모리절약}, *double(8){15자리}
		 * -문자 : char(2)
		 * -논리 : boolean(1)
		 */
		
		//*가 아닌 타입들은 
		
		//++++++++++++필수암기
		
		int x;		//정수를 저장할 수 있는 x 라는 이름을 가진 그릇을 만들어라.
		//변수를 만드는 것을 변수 선언이라고 표현한다.
		
//		double x;	//블럭{}안에서 이름이 중복될 수 없다.
		double y;	
		
		//=(대입연산자); 오른쪽의 값을 왼쪽의 변수에 저장
		x = 10; //초기화 : 변수에 처음으로 값을 저장하는 것
		y = 3.14; //변수의 타입에 맞는 값을 저장해야한다.
		
		int abc = 30;	//일반적으로 선언과 초기화를 한번에 한다.
		long l = 40L; 	//접미사 L을 붙여야 long타입이 된다.
		float f = 5.5f; //접미사 f를 붙어야 flat 타입이 된다.
		char c = '한'; //따옴표 안에 반드시 한글자를 넣어야한다.
		boolean b = true; //true , false
		
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		
		byte w = 2;
		
		short h = 23;
		
		int z = 340;
		
		long q = 32L;
		
		float v = 4.12f;
		
		double bts = 36.75;
		
		char d = '오';
		
		boolean po = false;
		
		
		//변수의 값을 변경하기 위해서는 대입연산자를 사용해 변수에 새로운 값을 대입해주면 된다.
		x = 20; //기존에 저장되어 있는 10이라는 값은 사라지고 20이라는 값이 저장된다.
//		int x = 20;//잘못된 예시 / 변수를 만들때만 타입을 붙인다. 변수를 사용하기위해서는 이름만 있으면됨.
		
		y = 5.5;
		
		//위에서 만든 8개의 변수에 새로운 값을 저장해주세요.
		
		w =3;
		
		h = 5;
		
	    z = 32;
	    
		q = 40L;
		
		v = 4.2f;
		
		bts = 3.1;
		
		d = '글';
		
		po = true;
		
		//콘솔창에 출력
		
		System.out.println(100);
		//실행 단축키 : Ctrl +F11 
		System.out.println(x);
		
		//위에서 만든 8개의 변수의 값을 출력해 주세요.
		System.out.println(w);
		System.out.println(h);
		System.out.println(z);
		System.out.println(q);
		System.out.println(v);
		System.out.println(bts);
		System.out.println(d);
		System.out.println(po);
		
//		============================여기서 부터 모름
		//문자열
		String str = "문자열 여러개.."; //클래스는 참조형 타입 데이터이다.
		System.out.println(str);
		
		//문자열과 다른 타입의 데이터가 결합되면 문자열의 결과를 얻는다.
		System.out.println(str + 50);
		System.out.println(10 + 20 + str);	//30문자열 여러개..
		System.out.println(str + 10 + 20);	//문자열 여러개..1020
		
		
		//형변환
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환이라 한다.
		int small = 10;
		long big = 10L;
		
		small = (int)big;
		big = small; //표현 범위가 작은 쪽에서 큰쪽으로의 형변환은 생략이 가능하다.
		
//		+++++++++++++++++++++++++++++
		/*
		 * 명명 규칙
		 * -영문자 대소문자, 한글, 숫자, 특수문자('_','$')를 사용할 수 있다.
		 * -숫자로 시작할 수 없다.
		 * -예약어는 사용할 수 없다.			//자바에서 이미 사용하고 있는 단어 (예.int, long)
		 * -[낙타식 표기법을 사용한다.(mySampleVariable)]				//변수
		 * -[클래스명의 첫 글자는 대문자로 한다.(MySampleClass)]			//클래스
		 */
//		++++++++++++++++++++++++++필수암기

		
		/*
		 * 상수
		 * -값을 변경 할 수 없는 그릇						//								▽ 얘가 리터럴
		 * -리터럴에 의미를 부여하기 위해 사용한다.			//리터럴 : final int MAX_NUMBER = 10
		 */
		final int MAX_NUMBER = 10;					//상수 이름을 지어줄때는 대문자만 사용함.
//		MAX_NUMBER = 20 // 컴파일 에러 발생
		
		//출력
		System.out.print("줄바꿈을 하지 않는다.");		//줄바꿈을 하고싶으면 \n을 넣으면된다.
		System.out.print("줄바꿈을 하지 않는다.\n");
		System.out.print("줄바꿈을\t한다.");			//'\t'는 Tap키다.
		System.out.printf("문자열 : %s, 숫자 : %d", "Hello", 10);	//출력 포멧을 지정한다.
		System.out.println();
		
		//입력
		Scanner sc = new Scanner(System.in);	//입력받기 위한 클래스		/클래스 초기화를 위해 'new 클래스명();'
		//T1다른 패키지에 있는 클래스를 사용할때는 클래스의 위치를 알려줘야한다:import
		//import 단축키: Ctrl +Shift + o
		
	/*	System.out.println("아무거나 입력해 주세요>");
		String str2 = sc.nextLine();								//nextLine 실행되다가 사용자가 입력할때까지 기다린다.
		System.out.println(str2);
		//---------위에는 문자열
*/		
	/*	System.out.print("int 입력>");
		int nextInt = sc.nextInt();				//여기서 enter키보드를 안가져가고
		System.out.println(nextInt);
		System.out.print("문자열 입력>");
		String nextLine = sc.nextLine();		//여기서 사용됨
		System.out.println(nextLine);
		System.out.println("입력 끝!!");*/
										//다만 int형은 버그가 있어서 안쓰는게 좋음
	/*	//버그 고치기
		System.out.print("int 입력>");
		int number = Integer.parseInt(sc.nextLine());//문자열을 입력 받은뒤에 int로 변환해준다		
		System.out.println(number);
		//----------여기는 숫자열	
		*/
		
		//자신의 이름을 저장할 변수를 선언해 주세요.
		
	/*	String name;
		
		//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아 주세요.
		
		System.out.print("이름을 입력하여 주시오>");
		name = sc.nextLine();
		
		
		//자신의 나이를 저장할 변수를 선언해주세요.
		
		int age;
		
		//위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아 주세요.
		
		System.out.print("나이를 입력하여 주시오>");
		age = Integer.parseInt(sc.nextLine());

//		Double.parseDouble(sc.nextLine());
		System.out.println("이름:" + name +  "/나이 : " + age);
				*/
		
		//과제 : 다음과 같은 프로그램을 작성해주세요.
		/*
		 * ===========회원가입===========
		 * 아이디>admin
		 * 비밀번호(4자리숫자)>1234
		 * 이름>홍길동
		 * 나이>30
		 * 키>185.5
		 * ============================
		 * 아이디 : admin
		 * 비밀번호 : 1234
		 * 이름 : 홍길동
		 * 나이 : 30세
		 * 키 : 185.5cm
		 * ============================
		 */
		
		String ID;
		int pw;
		String name;
		int age;
		double hei;
		
		
		System.out.println("============회원가입============\n");
		System.out.println("아이디>");
		ID =  sc.nextLine();
		System.out.println("비밀번호>");
		pw = Integer.parseInt(sc.nextLine());
		System.out.println("이름>");
		name = sc.nextLine();
		System.out.println("나이>");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("키");
		hei = Double.parseDouble(sc.nextLine());
		
		System.out.println("아이디:" + ID);
		System.out.println("비밀번호:" + pw);
		
		
		
		
		
	}
	
}