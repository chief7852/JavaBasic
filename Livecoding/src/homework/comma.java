package homework;

import java.util.Scanner;

public class comma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 해 주세요 : ");
		String str = sc.nextLine();
		StringBuffer str2 = new StringBuffer("");
		
		for(int i=0 ; i<str.length(); i++){     //////////////////////////////////
			if((str.length()-i)%3==0 && i!=0)   // 숫자를 앞부터 뒤까지 읽으면서				//
				str2.append(",");               // 숫자길이-i 가 3으로 나누어 떨어질 떄마다		//
			str2.append(str.charAt(i));         // 쉼표를 찍습니다						//
		}                                       //////////////////////////////////
		
		System.out.println(str2);
	}

}
