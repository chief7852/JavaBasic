package programers;

import java.util.Arrays;

class ex {
   public static void main(String[] args) {
	   int n = 10;
	   int answer = 0;
       for(int i = 1; i <= n;i++)
       {
       	for(int j = 1; j <= n ;j++)
       	{
       		if(i != 1 && i >=j)
       		{
       			if(i%j == 0&& i==j)
       			{
       				answer++;
       			}
       		}
       	}
       }
       System.out.println(answer);
    	}
}