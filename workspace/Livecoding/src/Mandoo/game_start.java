package Mandoo;

import java.util.Arrays;
import java.util.Scanner;



public class game_start {

	public static void main(String[] args) {
		int hint = 0;
		Scanner s = new Scanner(System.in);
		Instruction a = new Instruction();
		Food b = new Food();
		AnSwer audit = new AnSwer();
		
		while(true){
		//인트로
		String soge = "\n\n흠...한동네에 만두집이 두개인건 곤란해..\n\n"				 //
				+ "만두맛으로 승부를 결정하자! 진정한 고향만두의 맛을 보여 주겠어!!\n\n";     //
		System.out.println("=================================");            //	soge 값을 하나하나 시간딜레이 시켜 출력하게
		for(int i = 0 ; i< soge.length();i++){                              //	만들었다.
			//
			long end = System.currentTimeMillis();                          //
			long start = System.currentTimeMillis();                        //
			while((end-start)<100)                                          //
				end=System.currentTimeMillis();                             //
			System.out.print(soge.charAt(i));                               //	한자 한자 출력시키기.
		}                                                                   //
		System.out.println("\n=================================\n");          //
		//
		//게임 설명
		if(hint == 0){														//한번 실패하면 그다음에는 정답알려줌
		System.out.println("  0.게임시작\t 1.게임설명");
		}else{
			System.out.println("  0.게임시작\t 1.게임설명\t 2.정답보기");
		}
		System.out.println("\n=================================");
		System.out.print(">");
		String input = s.nextLine();

		switch(input){														//게임 시작과 설명으로 넘어가게
		case "0" : break;													//입력받는다.
		case "2": audit.ending();
		System.out.println(" 게임을 시작하려면 Enter키를 입력하십시오.. ");
		input = s.nextLine();
		break;
		case "1" :a.Start();
		System.out.println(" 게임을 시작하려면 Enter키를 입력하십시오.. ");
		input = s.nextLine();
			break;
		}	

		//ui만들어 보고싶어서 만든 로딩화면
		a.loding();															//Instruction 클래스에 있는 로딩화면을 가져옴



		//재료 입력받기
		String sum1 = "";
		
		sum1 = "";
		String nu;
		String[] temp1 = new String[7];
		int i1 = 1;
		while(i1 <= 7){

			System.out.print("들어간 재료 :"+sum1+"\n=================================");								//입력받은 재료를 food클래스에서 가져와서
			System.out.println();                                           //sum 값에 저장해서 출력함으로써
			b.dump();                                                       //자신이 넣었던게 뭐였는지 볼수있게 만들음
			b.how();                                                        //
			
			nu = s.nextLine();
			if(nu.equals("0")){
				i1 = 1;
				temp1 = new String[7];
				sum1 = "";
				continue;
			}if(nu.equals("h")){
				System.out.println("힌트: ★넣으면 이상할것 같은것만 안넣으면됩니다★");
				continue;
			}
			temp1[i1-1]=b.dum(nu);
			System.out.println();
			System.out.println();
			sum1 = sum1 + b.dum(nu);
			i1++;
		
		}
		System.out.println("들어간 재료 :"+sum1+"\n=================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\n=================================");
		String cook1 = "재료 다듬는중🔪🔪🔪🔪\n재료손질 완료\n";
		a.UI(cook1);
		System.out.println("=================================");
		System.out.println();
		System.out.println();
		System.out.println();
		
		//만두피 만들기 로 넘어가는 단계
		String manu = "만두피";
		a.nextLevel(manu);
		String sum2 = "";
		nu = "";
		String[] temp2 = new String[2];
		i1 = 1;
		while(i1 <= 2){
			System.out.print("들어간 재료 :"+sum2+"\n=================================");								//입력받은 재료를 food클래스에서 가져와서
			System.out.println();
			b.dump2();
			b.how();
			nu = s.nextLine();
			if(nu.equals("0")){
				i1 = 1;
				temp2 = new String[2];
				sum2 = "";
				continue;
			}if(nu.equals("h")){
				System.out.println("힌트: ★넣으면 이상할것 같은것만 안넣으면됩니다★");
				continue;
			}
			System.out.println();
			b.dum2(nu);
			System.out.println();
			System.out.println();
			sum2 = sum2 + b.dum2(nu);
			temp2[i1-1] =b.dum2(nu);
			i1++;
		}
		System.out.println("들어간 재료 :"+sum2+"\n=================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\n=================================");
		String cook2 = "반죽중🙌🙌🙌🙌\n완료\n";
		a.UI(cook2);
		System.out.println("=================================");
		System.out.println();
		System.out.println();
		System.out.println();
		
		//반죽모양잡기
		manu = "반죽모양";
		a.nextLevel(manu);
		b.dump3();
		nu = s.nextLine();
		b.dum3(nu);
		System.out.println();
		System.out.println();
		String sum3 = b.dum3(nu);
		System.out.println("만두모양 :"+sum3+"\n=================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\n=================================");
		String cook3 = "만두 빚는중🥟🥟🥟🥟\n만두빚기 완료\n";
		a.UI(cook3);
		System.out.println("=================================");
		System.out.println();
		System.out.println();
		System.out.println();
		
		//요리하기
		manu = "요리방법";
		a.nextLevel(manu);
		b.cooking();
		b.dump4();
		nu = s.nextLine();
		b.dum4(nu);
		System.out.println();
		System.out.println();
		String sum4 = b.dum4(nu);
		System.out.println("요리방법 :" + sum4+"\n=================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\n=================================");
		String cook4 = "조리중🧑‍🍳🧑‍🍲🧑🗑\n"+sum4+"완료\n";
		a.UI(cook4);
		System.out.println("=================================");  
		System.out.println();
		System.out.println();
		System.out.println();
		//심사받기
		
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		
		audit.answer(temp1, temp2, sum3, sum4);
		System.out.println();
		System.out.println();

		
		//다시하기
		hint++;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("다시하시려면 아무키나 눌러주세요..(n.프로그램 종료)\n>");
		input =s.nextLine();
		if(input.equals("n")){
			System.out.println("");
			Ending n = new Ending();
			n.ending();
			break ;
		}else
			
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		continue;
		}
		
	}

}
