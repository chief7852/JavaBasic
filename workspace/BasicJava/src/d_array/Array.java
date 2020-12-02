package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//Sysout + ctrl + Spacebar : System.out.println()
		//라인삭제 : Ctrl + D
		//라인복사 : Ctrl + Alt + 방향키 (위/아래)
		//라인이동 : Alt + 방향키(위/아래)
		
		
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.						//값을 변수에 직접저장하는게 아니라 변수의 밖에 변수를 저장해서 그 주소를 가져오는것이다.
		 * - 인덱스로 값을 구분한다.					//1,2,3,4 값들의 위치를 가지고 구분하는걸 인덱스라고한다.
		 * - 길이를 변경할 수 없다.				
		 */
		
		//(1)
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.		//타입뒤에 붙이면 배열
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.	//5는 배열의 길이 int5개를 저장하겠다는 뜻.
		//배열  초기화시 기본값이 저장된다. ex){0,0,0,0,0}
		/*
		 * 예) 정수: 0 \ 실수 : 0.0 \ 문자 : ' ' (0) \논리 : false \참조형 : null
		 */
		
		
		//(2)
		array = new int[]{1, 2, 3, 4, 5}; 	//[]안에길이를 저장하지 말고 {} 안에 직접 입력해주는 방법도있다. == 배열의길이가 5
		
		
		//(3)
//		array = {1, 2, 3, 4, 5}; 		//컴파일 에러	뜸
		//선언과 초기화를 동시에 해야한다.
		int[] arrat2 = {1, 2, 3, 4, 5};		//선언과 초기화를 동시에 해줄수있다.
		
		System.out.println(array[0]);		//변수뒤에 [] 이게 인덱스 ,0 부터 시작한다		배열길이 저장과 헷갈리지 말것
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		//저장
		array[0] = 10;				
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		
		int sum = 0;
		for(int i = 0; i < array.length; i++){			//length 는 배열의 길이를 알려주는 변수
			sum += array[i];
		}
		System.out.println("합계 : "+ sum);
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] mine = new int[10];
		
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		for(int i = 0; i< mine.length; i ++){
			mine[i] =(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(mine));		//배열 출력Arrays.toString
		
		//배열에 저장된 모든값의 합계와 평균을 구해주세요.
		sum = 0;
		double avg = 0;
		
		for(int i = 0; i <mine.length; i++){
			sum += mine[i];
		}
		avg = (double)sum / mine.length;								//========다시 생각해보기
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		
		/*
		 * 최소값과 최대값을 저장할 변수를 만들고 0번 인덱스의 값을 저장한다.
		 * 배열의 모든값을 비교하기위해 0번인덱스부터 마지막인덱스까지 반복한다.
		 * 최소값과 배열의 모든 인덱스값을 비교해 더 작은 값을 만나면 최소값으로 저장한다.
		 * 최대값과 배열의 모든 인덱스값을 비교해 더 큰 값을 만나면 최대값으로 저장한다.
		 */
		
		int min= mine[0];
		int max= mine[0];
		for(int i = 0; i <mine.length; i++){
			if(min>mine[i]){
				min = mine[i];
			}
			if(max < mine[i]){
				max = mine[i];
			}
		}
		System.out.println("최댓값 : "+max + "최소값 : "+ min);
		
		
		
		
		
//		//배열 섞기
//		int[] shuffle = new int[10];
//		for(int i = 0; i < shuffle.length; i++){
//			shuffle[i] = i + 1 ;
//		}
//		System.out.println(Arrays.toString(shuffle));
//		
//		
//		
//		//배열의 값을 섞어주세요.
//		for(int i = 0; i < 100; i++){
//			//0~9사이의 랜덤한 인덱스를 발생시킨다.
//		int index =(int)(Math.random()*shuffle.length);
//			//0번 인덱스의 값과 랜덤한 인덱스의 값을 바꾼다.
//		int temp = shuffle[0];
//		shuffle[0] = shuffle[index];
//		shuffle[index] = temp;
//		}
//		System.out.println(Arrays.toString(shuffle));
//
//


//		1~10 사이의 랜덤값을 500번 생성하고, 각숫자가 생성된 횟수를 출력해 주세요.
		int random[] = new int[500];
		int count[] = new int[10];
		for(int i =0; i < 500; i++){
			random[i]  = (int)(Math.random()*10)+1;
				count[random[i] - 1]++;
		}
	
			System.out.println(Arrays.toString(count));
			
			
//			
//			//교수님
//			
//			int[] count = new int[10];
//			 
//			for(int i =0; i < 500; i++){
//			random[i] = (int)(Math.random()*10)+1;			   
//			   count[random - 1]++;
//			}
//			System.out.println(Arrays.toString(count));
//			
//			 if (num == 1) count[0]++;
	}

}



