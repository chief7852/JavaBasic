package home;

import java.util.Arrays;
import java.util.Scanner;

public class homeW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주십시오 > ");
		String num = sc.nextLine();

		for(int i =0; i < num.length();i++){
			if((num.length()-i)%3==0&&i!=0){
				System.out.print(",");
			}
			System.out.print(num.charAt(i));
		}
		//이제 answer값이 받은 spring값을 가지고있다.,를 어떻게 출력할것인가.
		//0~sub.length만큼 값이 있는데 0번째 배열은 빈칸이니 1부터 출력해야하는데 어떻게할까
		//4글자 이상일 때 3번째에 ,를 찍는다.

	}

}