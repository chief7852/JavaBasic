package Break;

import java.util.Scanner;

public class Ex5_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주십시오 > ");
		String num = sc.nextLine();
		String sub[] = num.split("");
		String joke = "";
		int temp =1;
		for(int i = num.length(),j=0; i >= 0 ;i--,j++){
					
			if(j ==temp*3&& i !=num.length()-1){
				System.out.print(",");
				joke += num.charAt(i);
				temp++;
			}
			System.out.print(sub[i]);
		}
	
		
	}
}


