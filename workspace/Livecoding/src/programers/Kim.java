package programers;

public class Kim {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		
		int i = 0;
		while(true){
			if(seoul[i].equals("Kim")){
				
				System.out.println("김서방은 "+(i)+"에 있다");
				break;
			}
			i++;
		}

	}

}
