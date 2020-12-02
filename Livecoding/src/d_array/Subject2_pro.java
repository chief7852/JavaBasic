package d_array;

import java.util.Arrays;

public class Subject2_pro {

	public static void main(String[] args) {
		//교수님이 하신거
		
		
		
		
		// 나누어 떨어지는 숫자 배열
		/*
		 * 2~5 사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
		 * 5
		 * [5,10,15,20,25...]
		 */
		int[] arr = new int[100];			//100개의 배열에 1~100까지의 랜덤한수를 삽입하는 for문이다
		for(int i = 0; i < arr.length; i++){
				arr[i] = (int)(Math.random() * 100)+1;
						}
		int n = (int)(Math.random()*4)+2;
		int[] temp = new int[100];
		int index=0;
		for(int i = 0; i <arr.length; i++){
			if(arr[i] % n == 0){
				temp[index++] = arr[i];
			}
		}
		
		arr = new int[index];				// 재사용
		for(int i = 0; i <arr.length; i++){
			arr[i] = temp[i];
		}
		for(int i =0; i <arr.length - 1; i++){
			int min = i;
			for(int j = i +1; j <arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int tmp = arr [i];
			arr [i] = arr[min];
			arr [min] = tmp;
			
		}
		System.out.println("n : " +n);
		System.out.println(Arrays.toString(arr));
	}
}