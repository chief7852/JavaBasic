package g_oop2;

public class Time {
	
	//private를 넣음으로서 다른 클래스에서 직접 접근 못하게 만든다
	private int hour;
	private int minute;
	private int second;
	
	// source  메뉴에Generate Getters and Setters
	//get과 set을 각각 변수마다 도합 2개씩 만들어준다.(간접적으로 접근할수있게만들어준다)
	
	//get = 읽기
	public int getHour() {
		return hour;
	}
	//set = 저장
	public void setHour(int hour) {
		if(hour < 0){
		this.hour = 0;
		}else if(23 < hour){
			this.hour = 0;
		}else{
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute < 0){
			this.minute = 0;
			}else if(59 < minute){
				this.minute = 0;
				setHour(hour +1 );
			}else{
				this.minute = minute;
			}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second < 0){
			this.second = 0;
			}else if(59 < second){
				this.second = 0;
				setMinute(minute + 1);
			}else{
				this.second = second;
			}
	}
	
	
	
	//시간처럼 보이게 만들어주는 메서드
		String getTime()
		{
			return hour + ":" + minute + ":" + second;
		}

		//1초마다 시간 증가하는것을 출력하는것
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second + 1);
		}
	}
	//stop메소드만들기 사용자가 혼란하지 않게 private로 숨긴다
	private void stop(int interval)
	{
		//Thread.sleep(interval);일정시간동안 멈춤 이 값에서 컴파일 에러surround 클릭  
		try {
			Thread.sleep(interval);
			} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}			
		
	}
	

}











