import java.util.Arrays;


public class Rarray {

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
		
		//버블정렬
		int temp;
		for(int i = 1; i < arr.length; i++){
			int max = i;
			int j;
				for(j = 0; j <arr.length-1; j++){
					if(arr[max]<arr[j]){
						max = j;
					}
				} temp = arr[max];
				  arr[max] = arr[j];
				  arr[j] = temp;
				
		}System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		//석차구하기
		
//		int[] rank = new int[arr.length];
//		for(int i = 0; i <rank.length; i++){
//				rank[i] = 1;
//		}
//			for(int i = 0; i <rank.length; i++){
//				for(int j = 0; j <rank.length; j++){
//					if(arr[i]<arr[j]){
//						rank[i]++;
//					}
//				}
//				
//			}
//			System.out.println(Arrays.toString(rank));
//			
//			
//			
		//선택정렬
		
//		for(int i = 0; i <arr.length-1;i++){
//			int min = i;
//			for(int j = i+1; j <arr.length; j++){
//				if(arr[min]>arr[j]){
//						min = j;	
//				}
//			}	int temp = arr[i];
//				arr[i] = arr[min];
//				arr[min] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
		
		
		
		
	}

}
