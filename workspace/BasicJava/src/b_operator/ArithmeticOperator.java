package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술연산자										
		 * - 사칙연산 : +,-,*,/,%(나머지)					
		 * - 복합연산자:+=, -=, *=, /=, %=					
		 * - 증감연산자 : ++, --							
		 */
		int result = 10 +20 - 30 * 40 / 50 % 60;
		//곱하기와 나누기가 더하기 뺴기보다 우선 순위가 높다.				//나머지도 곱하기 나누기와 똑같음
		System.out.println(result);
		
		
		//나머지 연산
		result = 10/3;				//답 3
		System.out.println(result);	//3.33333.. 이 연산의 결과여야 하지만 타입이 int라 정수만 표현.
		result = 10%3;				//답 1
		System.out.println(result);
		
		/*//5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		
		int q;
		int w;
		int e;
		int r;
		int t;
		
		q = 1+1 ;
		System.out.println(q);
		w = 1-1;
		System.out.println(w);
		e = 2*2;
		System.out.println(e);
		r = 2/2;
		System.out.println(r);
		t = 6%3;
		System.out.println(t);
		*/
		
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
		result = result + 3;
		System.out.println(result);
		
		result += 3;
		System.out.println(result);
		
		result -= 5;
		System.out.println(result);
		
		result *= 2;
		System.out.println(result);
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		
		//result = result + 10;
		result +=10;
		System.out.println(result);
		//result = result - 2 * 3;
		result -= (2 * 3);
		System.out.println(result);
		//result = result % 5;
		result %= 5;
		System.out.println(result);
		
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다.
		int i = 0;
		
		++i;				//전위형 : 변수의 값을 읽어오기 전에 1증가된다.
		i++;				//후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		--i;				
		i--;				
		
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; // 표현범위가 더 큰 타입으로 형변환 된다. //(double)_int + _double;
		System.out.println(result2);
		
		long _long = 100L;
		_long += _int;
		System.out.println(_long);
		//_int = _int + _long;		//연산결과도 int 여야함   ->_int = _int +(int)_long;
		
		byte _byte =5;
		short _short = 10;
		int result3 = _byte + _short; // int보다 작은 타입은 int로 형변환된다.
		System.out.println(result3);
		
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);	//문자를 java가 숫자로 기억하기때문에 유니코드로 계산된다.

		//오버플로, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127;
		b++;
		System.out.println(b);		//-128
		b--;
		System.out.println(b);		//127
		
		//타입을 선택할 때 연산의 범위를 고려해야한다.
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값/ 123456
		//4. 3번의 결과값- 654321
		//5. 4번의 결과값 % 123456
		
		long goal = 123456 + 654321;
		
		goal *= 123456;
		goal /= 123456;
		goal -= 654321;
		goal %= 123456;
		System.out.println(goal);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		
		int a = 1;
		int s = 2;
		int d = 4;
		
		int f = a + s + d;
		
		double g = f / 3.0;
		System.out.println(" 합계 :" + f + " 평균 : " + g);
		
		//반올림
		/*g = Math.round(g);				//소수점 첫번째 자리에서 반올림함.
		System.out.println(g);*/
		g = Math.round(g*100)/100.0; 	//소수점 셋째 자리에서 반올림할수 있음.
		System.out.println(g);
		
		//랜덤
		int random = (int)(Math.random() * 100) + 1;	//1~100
		System.out.println(random);						//int random = (int)(Math.random() 
														//는 0.0~0.9999999....까지 표현해준다.
	
		
	}

}
