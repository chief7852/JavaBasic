package programers;




public class endless {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"} ;
		String[] completion = {"eden","kiki"};
		String answer = "";
		
		for(int i = 0; i <completion.length;i++){
	        	for(int j = 0; j <participant.length;j++){
	        		if(j == participant.length)
	      
	        			j= j-1;
	        
	        		if(participant[i]!=completion[j])
	        		{
	        			answer= participant[i];
	        		}
	        	}
	        }
		System.out.println(answer);
	}

}


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        for(int i = 0; i <participant.length;i++){
        	for(int j = 0; j <completion.length;j++){
        		if(participant[i]!=completion[j])
        		{
        			answer= participant[i];
        		}
        	}
        }
        return answer;
    }
}