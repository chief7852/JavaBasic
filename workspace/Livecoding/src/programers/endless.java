package programers;

import java.util.Arrays;




public class endless {

	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"} ;
		String[] completion = { "josipa", "filipa", "marina", "nikola"};
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(int i = 0; i <completion.length; i++)
		{
			if(participant[i] != completion[i])
			{
				answer = participant[i];
			}
		}
		if(answer.equals(""))
		{
			answer = participant[participant.length-1];
		}
		 
	System.out.println(answer);	
	}
}

//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        for(int i = 0; i <participant.length;i++){
//        	for(int j = 0; j <completion.length;j++){
//        		if(participant[i]!=completion[j])
//        		{
//        			answer= participant[i];
//        		}
//        	}
//        }
//        return answer;
//    }
//}