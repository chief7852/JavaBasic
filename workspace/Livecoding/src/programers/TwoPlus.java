package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TwoPlus {
	public int[] solution(int[] numbers) {
	       int num = 0;
			ArrayList<Integer> temp = new ArrayList<>();
			
	        for(int i =0 ; i <numbers.length;i++)
	        {
	        	for(int j = i+1; j <numbers.length; j++)
	        	{
	        		if(temp.contains(numbers[i]+numbers[j])==false)
	        		{
	        			temp.add(numbers[i]+numbers[j]);
	        		}
	        	}
	        }
	        int[] answer= new int[temp.size()];
	        for(int i = 0; i <temp.size();i++)
	        {
	        	answer[i] = temp.get(i);
	        }
	        
	        
	        return answer;
	    }
	 
	 
	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		int num = 0;
		ArrayList<Integer> temp = new ArrayList<>();
		
        for(int i =0 ; i <numbers.length;i++)
        {
        	for(int j = i+1; j <numbers.length; j++)
        	{
        		if(temp.contains(numbers[i]+numbers[j])==false)
        		{
        			temp.add(numbers[i]+numbers[j]);
        		}
        	}
        }
        int[] answer= new int[temp.size()];
        for(int i = 0; i <temp.size();i++)
        {
        	answer[i] = temp.get(i);
        }
        
	}
}
