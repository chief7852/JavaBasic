package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 정렬
		 * - 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * - 선택정렬 : 가장작은 숫자를 찾아서 앞으로 보내는 방식
		 * - 버블정렬 : 바로뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i <arr.length; i++){
			arr [i] = (int)(Math.random()*100)+1;
			
		}
		System.out.println(Arrays.toString(arr));

		//삽입정렬 
		/*
		 * 두번째 숫자를 변수에 저장한다.
		 * 앞의 숫자와 비교해서 큰수를 만나면 한칸 뒤로보낸다.
		 * 작은수를 만나면 작은수의 바로 뒷칸에 변수의 값을 저장하고 반복문을 빠져나간다.
		 */
//		for(int i = 1; i <arr.length; i++){
//			boolean flag = false;
//			for(int j = 0; j < i; j++){
//				if(arr[i]<arr[j]){
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}else if(arr[i]>arr[j]){
//					flag = false;
//				}
//			}if(flag){
//				break;
//			}
//		}System.out.println(Arrays.toString(arr));
//	
		
		for(int i = 1; i< arr.length; i++){
			int temp = arr[i];
			int j;
			for(j = i-1; j>=0; j--){
				if(temp < arr[j]){
					arr[j+1] = arr[j];
				}else{
					break;
				}
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		//버블정렬													
//		int temp;
//		for(int i = 0; i <arr.length- 1; i++){
//			//boolean flag = false;			//flag를 불린으로 타입으로 선언함으로서 필요없는 배열계산은 제외시킨다.
//			for(int j = 0; j <arr.length - i -1; j++){					//arr.length - i -1	이거인 이유는
//				if(arr[j]>arr[j+1]){									//배열 계산될때마다 중복되는 자리를 제외하고 계산하기때문
//					temp = arr[j]; 
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//			//flag = true;
//				}		
//			}
//			//if(!flag){				//flag가 true가 아니면 멈추기때문에 메모리를 매우 적게 사용할수있음
//						//break;}			
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		
		//선택정렬

		
//		for(int i = 0; i <arr.length-1; i++){
//			int min = i;
//			for(int j = i+1; j < arr.length; j++){
//				if(arr[min]>arr[j]){
//					min = j;
//					
//				}
//			}
//					int temp = arr[i]; 
//					arr[i] = arr[min];
//					arr[min] = temp;
//			
//		}System.out.println(Arrays.toString(arr));
//		
//		
		
		
//		//석차구하기
//		int[] rank = new int[arr.length];
//		for(int i = 0; i <rank.length; i++){
//			rank[i] = 1;				//기본 등수를 1부터시작
//		}
//		
//		for(int i = 0; i <rank.length; i++){
//			for(int j = 0; j <rank.length; j++){
//				if(arr[i] < arr[j]){
//					rank[i]++;			
//				}
//			}
//		}
//		System.out.println(Arrays.toString(rank));
//		
		
		//선택정
	}

}
