package Mandoo;

public class Ending {
	
	void ending(){
		for(int i = 0 ; i <1000; i++){
			long end = System.currentTimeMillis();
			long start = System.currentTimeMillis();
			while((end-start)<10)
				end=System.currentTimeMillis();
			if(i%2 == 0){
				System.out.println("\n\n\n\n\n");
				System.out.println("ヽ(｀Д´)ﾉ 고생하셨습니다.");
				System.out.println("\n\n\n\n\n");
			}else if(i%2 != 0){
				System.out.println("\n\n\n\n\n");
				System.out.println("ヽ(｀Д´)ノ고생하셨습니다.");
				System.out.println("\n\n\n\n\n");
			}
			
		}
	
	}
}
