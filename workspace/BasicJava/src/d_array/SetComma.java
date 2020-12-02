package d_array;

import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {
		//교수님 정답풀이
		// 숫자를 입력받아 입력받은 숫자에 3자리마다 콤마(,)를 붙여 출력해 주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주십시오 > ");
		String num = sc.nextLine(); 
		String comma = "";
		
		int count = 0;
		for(int i = num.length()-1; i >= 0; i--){
			comma = num.charAt(i) + comma;
			count++;
			if(count % 3 == 0 && count != num.length()){
				comma = "," + comma;
			}
		}
		System.out.println(comma);
		
	}

}
