package programers;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;



public class decimal {
	public static void main(String[] args) {
		int n = 5;
		int answer = 0;
		int temp =0;
		ArrayList<Integer> ang = new ArrayList<>();
		for(int i = 2; i <= n; i++)
		{
			answer = 0;
			for(int j = 2; j <= n;j++)
			{
				if(i >= j&&i%j==0 )
				{
					
						answer++;
					
				}
			}
			if(answer == 1)
			temp++;
		}

		answer = temp;
		
		System.out.println(answer);
	}
}