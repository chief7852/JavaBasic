package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int r1 = (int)(Math.random()*9)+1;
		int r2 = (int)(Math.random()*9)+1;
		int r3 = (int)(Math.random()*9)+1;
		
		
		while(r1 == r2){
			r2 = (int)(Math.random()*9)+1;
		}while(r3 == r2||r3 == r1){
			r3 = (int)(Math.random()*9)+1;
		}
		
		System.out.println(r1+" "+r2+" "+r3);
		int S=0;
		int B=0;
		int O=0;
		int n1=0;
		int n2=0;
		int n3=0;
		System.out.println("=========베이스볼 게임을 시작하겠습니다.===========\n");
		while(S != 3){
			System.out.print("1~9까지중복되지 않는 숫자를 입력하시오 첫째자리 수 >");
			n1 = s.nextInt();
			System.out.print("1~9까지중복되지 않는 숫자를 입력하시오 둘째자리 수 >");
			n2 = s.nextInt();
			System.out.print("1~9까지중복되지 않는 숫자를 입력하시오 셋째자리 수 >");
			n3 = s.nextInt();
			S=0;
			B=0;
			O=0;
			
			if(n1  == r1){
				S += 1;
			}else if(n1 == (r2)){
				B +=1;
			}else if(n1 == (r3)){
				B +=1;
			}else{
				O +=1;
			}
			if(n2  == r2){
				S +=1;
			}else if(n2 == (r1)){
				B +=1;
			}else if(n2 == (r3)){
				B +=1;
			}else{
				O +=1;
			}
			if(n3  == r3){
				S +=1;
			}else if(n3 == (r1)){
				B +=1;
			}else if(n3 == (r2)){
				B +=1;
			}else{
				O +=1;
			}
		System.out.println("\t\t"+S+"S"+B+"B"+O+"O\n");
		if(S!=3){System.out.println("\t다시 한번 해주세요!");}
		}
		System.out.println("============정답입니다! 게임을  종료하겠습니다!============");
		
		
		
		//교순
		
		while(true){
			System.out.print("3자리 숫자>");
			int input = Integer.parseInt(s.nextLine());
			int i3 = input%10;
			
		}
	
	
	
	}
}








