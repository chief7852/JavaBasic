package b_operator;

import java.util.Scanner;

public class SipmleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하십시오>");
		double num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 숫자를 입력하십시오>");
		double num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("첫번째 연산자를 입력하십시오(+,-,*,/,%)>");
		String op  = sc.nextLine();
		
		System.out.println(op.equals("+") ? num1+num2 :(
				op.equals("-") ? num1-num2 :(
						op.equals("*") ? num1*num2 :(
								op.equals("/") ? num1/num2 :
									op.equals("%") ? num1%num2 : ("연산할수 없습니다.")))));					
		
*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 > ");
		int x = Integer.parseInt(s.nextLine());
		System.out.print("연산자");
		String op = s.nextLine();
		System.out.print("첫번째 숫자 > ");
		int y = Integer.parseInt(s.nextLine());
		
		int result = op.equals("+") ? x + y
				:op.equals("+") ? x + y
						:op.equals("+") ? x + y
								:op.equals("+") ? x + y
										: x % y;
		System.out.print("연산자");
		
	}

}







