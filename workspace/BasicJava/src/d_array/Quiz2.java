package d_array;

import java.util.Arrays;

public class Quiz2 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		/*
		 * 1~5 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 * [1, 3, 3, 2, 1, 4, 5, 5, 1, 3]
		 * [1, 3, 2, 4, 5]
		 */
		//정답풀이
		int a = 0;
		int index = 0;
		int[] temp = new int[5];			//일단 나중에 변경할 생각하고 만들어놓기
		for(int i = 0; i < arr.length; i++){
			boolean flag = false;
			for(int j = 0; j < temp.length; j++){
				if(arr[i] == temp[j]){			//같은게 있는ㄴ지 찾아야함
					flag = true;
				}
			}
		if(!flag){						//중복되지 않을때 새로운배열에 저장한다.
			temp[index++] = arr[i];
		}		
	}
		System.out.println(Arrays.toString(temp));		//지금은 빈공간에 0이 들어가버린다.
		
		
		int[] result = new int[index];
		for(int i = 0; i <result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
}
	
}
