package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {//과제
		// 1~10 사이의 랜덤값을 500번 생성하고, 각숫자가 생성된 횟수를 출력해 주세요.
		// 위 문제의 최소값, 최대값, 발생횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		//최솟값 최댓값을 입력받고 랜덤값도 입력받기;
		
		
		//최소값 최대값, 발생횟수 입력받기.
		Scanner s = new Scanner(System.in);
		
		System.out.println("최소값을 입력해 주십시오 > ");
		int min = Integer.parseInt(s.nextLine());
		System.out.println("최대값을 입력해 주십시오 > ");
		int max = Integer.parseInt(s.nextLine());
		System.out.println("발생횟수 입력해 주십시오 > ");
		int ocr = Integer.parseInt(s.nextLine());
		
		//랜덤값으로 x배열로 만들고 y배열은 갯수만 맞춘다.
		int x[] = new int[ocr];
		int y[] = new int[max-min+1];
		
		for(int i = 0; i<ocr; i++){
			x[i] = (int)(Math.random()*(max-min+1))+min;
				
			
			y[x[i]-min]++;		//갯수 세기
//				for(int j = 0; j < (max-min+1);j++  ){
//					if(x[i] == j+1){y[j]++;}
//						
//					}
				}
		System.out.println(Arrays.toString(y));                                                                              
	}

}
