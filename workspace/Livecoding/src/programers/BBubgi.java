package programers;

import java.util.Arrays;

public class BBubgi {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] temp = new int[12];
		
		for(int i  = 0 ; i< numbers.length-1;i++)
		{
			for(int j = 1+i ; j <numbers.length;j++)
			{
					temp[i]=numbers[i]+numbers[j];
			}
			
		}
		System.out.println(Arrays.toString(temp));
		
		//실패
	}
}
