package programers;

import java.util.HashMap;
import java.util.Set;

public class CopyOfsportw {
	public static void main(String[] args)
	{
		int n =3;
		int[] reserve = {1};
		int[] lost = {3};
		
		int answer = 0;
        int[] students = new int[n];
		
		for(int i = 0; i <students.length; i++)
		{
			students[i] = 1;
		}
		
		
		
		for(int i = 0; i <students.length;i++)
		{
			for(int j = 0; j <reserve.length; j++)
			{
				if(reserve[j]== i+1)
				{
					students[i] += 1;
					
				}
			}
			for(int j = 0;j <lost.length;j++)
			{
				if(lost[j] == i+1)
				{
					students[i] -= 1;
				}
			}
			
				
		}
		for(int i =0 ; i <students.length-1;i++)
		{
			for(int j = i; j < students.length;j++)
			{
				if(students[i]<students[j]&&students[j]!=1)
				{
					students[j]--;
					students[i]++;
				}else if(students[i]>students[j]&&students[i]!=1)
				{
					students[j]++;
					students[i]--;
					
				}
			}
		}
		for(int i = 0; i <students.length;i++)
		{
        System.out.println(students[i]);
		}
	}
}
