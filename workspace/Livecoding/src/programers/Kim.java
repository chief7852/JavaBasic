package programers;

class Kim {
    public String solution(String[] seoul) {
        String answer = "";
        int i = 0;
        String a = "";
        String[] temp = {"김서방은 ","에 있다"};
        while(true)
        {
        	if(seoul[i].equals("Kim")){
        		a = seoul[i];
        		break;
        	}
        	i++;
        }
        answer = temp[0] + i + temp[1];
        
        return answer;
    }   
}