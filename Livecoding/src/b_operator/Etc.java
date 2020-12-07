package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트연산자
		 * - |, &, ^, ~, <<, >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타연산자
		 * - .(참조연산자) : 특정범위내에 속해 있는 멤버를 지칭할 때 사용한다.	//class안에있는 메소드를 사용할때 사용
		 * - (type) : 형변환
		 * - ?:(삼항연산자) : 조건식? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 */
		//1byte : 01010101		//1byte = 8비트
		
		System.out.println(10 | 15); //| :둘다 0인 경우 0 그외 1			/잘쓰지는 않음.
		//10 : 00001010
		//15 : 00001111
		//	   00001111
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y;//int result = x;
		System.out.println(result);
		
		//주민등록번호 뒤자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 1;
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은" + gender + "입니다.");
		//1이아닌 모든수가 다 여자라고 입력되는 오류가있다.
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println("당신의 성별은" + gender + "입니다.");
		//삼항연산자를 중첩해서 넣으면 오류가 해결된다
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해 주세요.
		Scanner sc = new Scanner(System.in);
	/*	
		System.out.println("첫 숫자를 입력해 주세요>");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자를 입력해 주세요>");
		int num2 = Integer.parseInt(sc.nextLine());
		int big = num1 > num2 ?  num1 : num2;
		System.out.println(big);
		*/
		//숫자를 입력받고, 그숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그외의 숫자를 입력하면 확인불가를 출력해주세여
		
		System.out.println("숫자를 입력해주시오>");
		int num = Integer.parseInt(sc.nextLine());
		//(내가한것)//String gender = num == 1? "남자" : (num == 2 ? "여자":(num == 3 ? "남자" :(num == 4 ? "여자" : "확인불가")));
		/*교수님*/gender = num == 1 || num ==3 ? "남자" :(num == 2 || num==4? "여자" : "확인불가");
		System.out.println(gender);
	}

}
