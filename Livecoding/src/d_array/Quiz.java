package d_array;

import java.util.Arrays;


public class Quiz {

	public static void main(String[] args) {
		// 거스름돈 동전 갯수
		int money = (int)(Math.random() * 500) *10;
		int[] coin = {500 , 100, 50, 10};
		System.out.println(money);
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
																					//==========복습대상====
		for(int i = 0; i <coin.length; i++){
			System.out.println(coin[i]+"원 : " + money/coin[i] + "개");
			money = money % coin[i];
		}
		
		
//		int[] a = new int[coin.length];
//		int[] temp = new int[coin.length];
//		for(int i = 0; i <coin.length; i++){
//			a[i] = temp[i]/coin[i];
//			temp[i] = money%coin[i];
//		}
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(temp));
																					
																					
																					
		//그래프 그리기===============================================
		int[] arr = new int[20];
		for(int i = 0; i <arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		//그래프 정답풀이									이해못함
		int[] count = new int[5];
		for(int i = 0; i < arr.length; i++){
			count[arr[i]-1]++;
		}
		for(int i = 0; i < count.length; i++){
			System.out.print(i + 1 + " : ");
			for(int j = 0; j <count[i]; j++){
				System.out.print("*");
			}
			System.out.println(" " + count[i]);
		}
	
		
		
		
		
		
		
		
		
		
//		int[] sum = new int[5];							/내가한 그래프만들기
//	
//		for(int i = 0; i <arr.length; i++){
//			for(int j = 0; j <sum.length; j++){
//			if(arr[i]==j+1){
//				sum[j]++;
//				}
//			}
//			
//		}
//		//for(int i = 0; i <; i++){
//		for(int j = 0; j <sum.length;j++){
//			for(int i = 0; i <sum[j]; i++){
//				System.out.print("*");
//				}System.out.println();
//		}
//
//		==========================================================================================
		/*
		 * 1~5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요ㅕ
		 * 
		 * 1 : *** 3
		 * 2 : **** 4
		 * 3 : ** 2
		 * 4 : *****5
		 * 5 : * 1
		 */
	}

}
