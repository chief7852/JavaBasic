package d_array;

import java.util.Arrays;

public class Subject2 {

	public static void main(String[] args) {
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
		//2~5사이 랜덤한 수 만들기
		int min =2;
		int max =5;
		int rand = (int)(Math.random()*(max - min))+min;
		System.out.println("랜덤한 수 : "+rand+"\n");
		
		//2~5사이의 난수로 나누어 떨어지는 배열 찾기
		int index = 0;								//정답배열의 갯수를 받을 빈상자이다.
		int[] temp = new int[100];					//0의 값이 100개만큼의 배열을 만든다(임시)여기에 arr배열에서 rand의 배수값만 들어가는것을 넣을거다.
		for(int i = 0; i <arr.length; i++){			//arr배열 만큼 반복한다.100번
			if(arr[i]%rand == 0){	
				temp[i] = arr[i];					//arr[i]의 값이 rand의 배수라면 temp[i]의 값은 arr[i]로 채워진다.
				index++;
			}
		}
		System.out.println("난수배열 찾기 : "+Arrays.toString(temp)+"\n");
		
		
		//0으로 나타나는 배열을 제외시키고 정답배열에 새롭게 넣었다. 
		int[] result = new int[index];		
		int in = 0;									//오류가 자꾸 나서 만들었다 결국 index값과 같다..
		for(int i = 0;i <temp.length; i++){			
			if(temp[i] != 0){						//만약 temp배열의 값이 0이 아니면
				result[in] = temp[i];				//result배열의 값과 같다
					in++;
				}
			
		}
		System.out.println("정답배열 찾기 : "+Arrays.toString(result)+"\n");
		
		//정렬시키기		//선택정렬
		for(int i = 0; i <result.length-1; i++){
		int min2 = i;
		for(int j = i+1; j < result.length; j++){
			if(result[min2]>result[j]){
				min2 = j;
				
			}
		}
				int temp2 = result[i]; 
				result[i] = result[min2];
				result[min2] = temp2;
		
		}System.out.println("선택정렬하기 : "+Arrays.toString(result));
	}

}
