package Mandoo;

import java.util.Scanner;

public class Instruction {
	
	String ans1 = "돼지고기 두부 양파 양배추 참기름 마늘 대파 ";
	String ans2 = "밀가루 물 ";
	String roast = "굽기";
	String steam = "찌기";
	String boil = "삶기";
	//게임 시작전
	void loding(){
		for(int i = 0 ; i <20; i++){
			long end = System.currentTimeMillis();
			long start = System.currentTimeMillis();
			while((end-start)<100)
				end=System.currentTimeMillis();
		back(i);	
		}
	}
	
	//게임 불러오는중
	void back(int i){
		if(i%2 == 0){
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("\t🔪👩‍🍳🍳게임 불러오는중🍳👨‍🍳🔪");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			
		}else{
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("\t🔪👩‍🍳🍳게임 불러오는중🍳👨‍🍳🔪");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			
		}
			
		}
	
	//게임방법
	void Start() {
		System.out.println("======================================");
		System.out.println("\t   |게임 설명|\n");
		System.out.println("1. 원하는 재료들을 숫자 키로 입력해서 선택.");
		System.out.println("2. 만두속 만들기, 만두피만들기, 만두빚기,\n"
				+ "     요리하기의 4단계를 차례로 진행한다.");
		System.out.println("3. 단계 별로 있는 > 칸을 이용해서 그 단계를\n"
				+ "     마무리 한다.");
		System.out.println("4. 만두맛은 만두속, 만두피, 모양에 따른 요리\n"
				+ "     방법에 따라 맛이 결정된다.");
		System.out.println();
		System.out.println("======================================");
	}
	
	//정답
	
	
	//다음단계로 넘어가는것
	Scanner s = new Scanner(System.in);
	void nextLevel(String manu){
		System.out.println("> 키를 눌러 "+manu+"를(을)만들어 주세요");					
		String input = s.nextLine();

		while(true){
			switch(input){
			case ">" : break;
			default :System.out.println("> 키를 눌르면 "+manu +"를(을) 만들러 갈수있습니다.");
			input = s.nextLine();
			}
			break;
		}

		System.out.println();
		System.out.println("================================");
		System.out.println();
	}
	
	//단계별 인터페이스
	void UI(String co){
		for(int i = 0 ; i< co.length();i++){                              
			//
			long end = System.currentTimeMillis();                         
			long start = System.currentTimeMillis();                       
			while((end-start)<100)                                          
				end=System.currentTimeMillis();                            
			System.out.print(co.charAt(i));                              
		}   
	}
}
		//   ヽ(｀Д´)ﾉ    ヽ(｀Д´)ノ