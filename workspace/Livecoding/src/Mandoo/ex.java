package Mandoo;

import java.util.Arrays;
import java.util.Scanner;

public class ex
{

	public static void main(String[] args) 
	{
		AnSwer j = new AnSwer();
		Food b = new Food();
		Scanner s = new Scanner(System.in);
		
		String sum1 = "";
		String nu;
		String[] ans ={b.meet,b.dubu,b.onion,b.cabbage,b.koil,b.garlic,b.leek};
		String[] temp = new String[7];
		for(int i = 1; i <= 7; i++ ){
			
			System.out.print("들어간 재료 :"+sum1+"\n=================================");								//입력받은 재료를 food클래스에서 가져와서
			System.out.println();                                           //sum 값에 저장해서 출력함으로써
			b.dump();                                                       //자신이 넣었던게 뭐였는지 볼수있게 만들음
			b.how();                                                        //
			//
			nu = s.nextLine();

			
			System.out.println();
			System.out.println();
			sum1 = sum1 + b.dum(nu);
			
			temp[i-1] =b.dum(nu);
			
		}
		System.out.println("들어간 재료 :"+sum1+"\n=================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\n=================================");
		Arrays.sort(temp);
		Arrays.sort(ans);
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.equals(ans, temp));
		
	//split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환하다.
	}
}
