package programers;

import java.util.Arrays;

public class divisor_ARRAY {

	public static void main(String[] args) {
		int arr[] = {3,2,6};
		int divisor = 10;
		int temp[] = new int[arr.length];
		int[] answer ={};
		int x = 0;
		for(int i = 0 ; i <arr.length;i++)
		{
			if(arr[i]%divisor == 0)
			{
				temp[i] =arr[i];
				x++;
			}
			System.out.println(temp[i]);
		}
		answer = new int[x];
		int y = 0;
		for(int i = 0; i < temp.length;i++)
		{
			if(temp[i] != 0)
			{
				answer[y] = temp[i];
				y++;
			}
		}
		if(x == 0) {answer = new int[1];
		answer[0] = -1;}
		System.out.println(Arrays.toString(answer));
	}

}
