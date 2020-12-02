package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * - for문
		 * - while문
		 * - do-while문
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식){}
		 * - 포함하고있는 문장들을 정해지 횟수만큼 반복하게 해주는 문장
		 */
		
		
		for(int i = 1; i <= 10; i++){
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행
			//증감식 : 변수를 증가/ 감소시쿄 반복문을 제어
			System.out.println(i);
		}
		
		/*int sum = 0; //1부터 10까지 합계를 저장
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
//		System.out.println(sum);
//		*/
//		sum = 0;
//		for(int i = 1;i <= 10;i++){
//			sum += i;
//		}
//		System.out.println(sum);
//		
		int sum = 0;
		for(int i = 100;i >=1; i--){
			sum += i;
		}
		System.out.println(sum);
		
		
		//1부터 100까지 짝수의 합을 출력해주세요.
		
		/*int a = 0;
		
		for(int i = 1;i <=100; i++){					//for(int i = 2; i <= 100; i+= 2)
			if(i%2 == 0)
				a += i;
		}
		System.out.println(a);*/
		
				
		
		//1부터 100까지 홀수의 합을 출력해주세요.
		
	/*	sum = 0;
		
		for(int i =1 ;i <= 100; i+=2){
			sum +=i;
		}
		System.out.println(sum);
		*/
		
		
		
		//구구단 출력
		/*
		 * 2 * 2 = 2
		 * 2 * 3 = 4
		 * 2 * 4 = 8
		 * ...
		 */
		
		/*for(int i = 1; i <=9; i++){
			System.out.println(2 + "*" + i + "=" + i*2);
		}
		
		//8단 출력
		for(int i = 1; i <= 9; i++){
			System.out.println(8 + "*" + i + "=" + i*8);
		}
		
		//구구단 전체 출력
		for(int j = 2; j <= 9; j++){
			for(int i = 1; i <=9; i++){
				System.out.println(j + "*" + i + "=" + i*j);
			}
		}*/
		
		//구구단 전체를 가로로 출력해주세요.
		/* 2 * 2 = 2		3 * 1 = 3		4 * 1 =4
		 * 2 * 3 = 4		3 * 2 = 6		...				...
		 * 2 * 4 = 8
		 * ...				...
		*/
		
				/*
			for(int i = 1; i <=9; i++){								//뒷수가 바뀔때 출력
				for(int j = 2; j <= 9; j ++){
					System.out.print(j + "*" + i + "=" + i*j + "\t");
				}
				System.out.println();
			}*/
			
		/*
		 * while문
		 * - while(조건식){}
		 * - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 * - 반복횟수가 정확하지 않은 경우에 주로 사용한다.
		 */
			
		int a =1;
		//a에 2씩 몇번을 곱해야 1000이상이 되는지 알아봅시다.
		int count = 0;
		while(a < 1000){
			a *= 2;
			count++;
			System.out.println(count +" : " + a);
		}
		
		/*
		 * do-while문
		 * - do{}while(조건식);					//먼저 실행하고 검사한다는 개념
		 * - 최소한 한번의 수행을 보장한다.				//무조건 한번은 실행한다.
		 */
		
		
		//숫자 맞추기 게임
		/*int answer = (int)(Math.random()*100)+1;
		int input = 0;
		Scanner s = new Scanner(System.in);
		do{
			System.out.print("1~100 사이의 수를 입력하십시오 > ");
			input = Integer.parseInt(s.nextLine());
			
			if(answer < input){
				System.out.println(input + " 보다 작습니다.");
			}else if(input < answer){
				System.out.println(input + " 보다 큽니다.");
			}else{
				System.out.println("정답입니다!!");
			}
		}while(input != answer);*/
		
		//이름붙은 반복문
		/*outer : for(int i = 2; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				if(j == 5){
//					break; //가장 가까운 반복문 하나를 빠져나간다.
//					break outer;//outer라는 이름의 반복문을 빠져나간다.	//한번만 하고 나가겠다.
//					continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다.		//5는 빠져나가겠다.
//					continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다 	//
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
*/		
		//별찍기
		
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		
//		for(int i = 1; i <= 3; i++){
//			for(int j = 1; j<= 5; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){		//변수를 i로둔다
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("*****");
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");
		
		
	/*	for(int i = 1; i <= 5; i++){		//내가한거
			for(int j = i; j <= 5; j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		/*for(int i = 5; i >= 1; i--){			//교수님이한거
			for(int j = 1; j <= i; j++){		
				System.out.print("*");
			}
			System.out.println();
		}*/
	}
}

