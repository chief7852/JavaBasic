package Mandoo;

public class Instruction {
	
	//게임 시작전
	void loding(){
		for(int i = 0 ; i <10; i++){
			long end = System.currentTimeMillis();
			long start = System.currentTimeMillis();
			while((end-start)<500)
				end=System.currentTimeMillis();
		back(i);	
		}
	}
	
	//게임 불러오는중
	void back(int i){
		if(i%2 == 0){
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("\t🔪👩‍🍳🍳게임 불러오는중🍳👨‍🍳🔪");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println();
			System.out.println();
		}else{
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("\t🔪👩‍🍳🍳게임 불러오는중🍳👨‍🍳🔪");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println();
			System.out.println();
		}
			
		}
	
	//게임방법
	void Start() {
		System.out.println("=====================================");
		System.out.println("1. 만두속 만들기, 만두피만들기, 만두빚기,\n"
				+ "     요리하기의 4단계를 차례로 진행한다.");
		System.out.println("2. 단계 별로 있는 > 칸을 이용해서 그 단계를\n"
				+ "     마무리 한다.");
		System.out.println("3. 만두맛은 만두속, 만두피, 모양에 따른 요리\n"
				+ "     방법에 따라 맛이 결정된다.");
		System.out.println("=====================================");
	}
}
