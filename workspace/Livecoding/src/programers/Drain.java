package programers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Drain {

		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			Integer.parseInt(input);
			int sum = 0;
			for(int i = 1; i <= Integer.parseInt(input); i++){
				if(i%3==0){
					sum += i;
				}else if(i%5==0){
					sum += i;
				}
			}
			
			System.out.println(sum);
			System.out.println("Hello Goorm! Your input is " + input);
		
	}
}
