package Mandoo;

import java.util.Arrays;
import java.util.Scanner;



public class game_start {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Instruction a = new Instruction();
		
		
		String soge = "\n\n흠...한동네에 만두집이 두개인건 곤란해..\n\n"
				+ "만두맛으로 승부를 결정하자! 진정한 고향만두의 맛을 보여 주겠어!\n\n";
	
		for(int i = 0 ; i< soge.length();i++){
			
			long end = System.currentTimeMillis();
			long start = System.currentTimeMillis();
			while((end-start)<100)
				end=System.currentTimeMillis();
			System.out.print(soge.charAt(i));
		}
		
		
		
		System.out.println("  0.게임시작\t 1.게임설명");
		int input = s.nextInt();
		
		switch(input){
		case 0 : break;

		case 1 :a.Start();
		System.out.println("  0.게임시작 ");
		input = s.nextInt();
		if(input == 0){
			break;
		}
		}
		
		
		a.loding();
		


		
		
		
		
		
	}

}
