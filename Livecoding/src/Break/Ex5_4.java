package Break;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		System.out.println(Arrays.toString(numArr));
		
		for( int i=0; i < 100; i++){
			int n = (int)(Math.random()*10);	//0~9중의 한 값을 임의로 얻는다
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}	//main끝

}
