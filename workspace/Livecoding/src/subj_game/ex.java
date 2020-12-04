package subj_game;

public class ex {

	static void delay(int i){
		//총알 날아가는거 
		
		
		long end = System.currentTimeMillis();
		long start = System.currentTimeMillis();
		while((end-start)<i)
			end=System.currentTimeMillis();
	}
	public static void main(String[] args) {
		ex a = new ex();
		
		String[] bol = new String[20];
		for(int i = 0; i<bol.length;i++){
			bol[i] = "＊";
		}
		
			for(int i=0; i<10; i++){
				long end = System.currentTimeMillis();
				long start = System.currentTimeMillis();
				while((end-start)<200)
					end=System.currentTimeMillis();
				System.out.print(bol[i+1]+(" "));
				
			}
		}		
	}


