package programers;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n;i++)
        {
        	for(int j = 1; j <= n ;j++)
        	{
        		if(i != 1 && i >j)
        		{
        			if(i%j == 0 && i==j)
        			{
        				answer++;
        			}
        		}
        	}
        }
        return answer;
    }
}
public class decimal {
	public static void main(String[] args) {
		Solution i = new Solution();
		System.out.println(i.solution(8));
	}
}