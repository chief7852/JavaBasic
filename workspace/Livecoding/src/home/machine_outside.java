package home;

import java.util.Scanner;

public class machine_outside {

	public static void main(String[] args) {
		machine_inside in = new machine_inside(); 
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		while(true){
		System.out.println("==============================================");
		System.out.println("1.콜라(1500원)"+in.button1500+"  2.환타(1500원)"+in.button1500+"  3.물(1000원)"+in.button1000);
		System.out.println();
		System.out.println("4.커피(1000원)"+in.button1000+"  5.과일쥬스(2000원)"+in.button2000+"\t 0.반환");
		System.out.println("----------------------------------------------");
		System.out.println("현재 투입된 금액  "+money+"원");
		System.out.println("==============================================");
		System.out.print("투입구 ㅡ  ");money = sc.nextInt();
		System.out.println();
		}
		
		

	}

}
