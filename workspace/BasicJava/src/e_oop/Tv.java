package e_oop;

public class Tv {
	
	public static void main(String[] args) {
		ScanUtil s =new ScanUtil();
		Tv tv = new Tv();
		
		System.out.println("전원을 키시겠습니까?(on/off)");
		String power = ScanUtil.nextLine();
		System.out.println(tv.Power(power));
		
		
		
	}
	
	
	
	
	//전원
	String Power(String power){
		
		if(power.equals("on")){
			System.out.println("티비가 켜졌습니다.");
		}else if(power.equals("off")){
			System.out.println("티비가 꺼졌습니다.");
		}else{
			System.out.println("응답없음 재시도 바랍니다.");
		}
		return power;
	}
	
	//볼륨
	void Volume(int volume,String v_updown){
		if(v_updown.equals("up")&& volume<100){
			volume++;
		}else if(v_updown.equals("down")&& volume>0){
			volume--;
		}else{
			System.out.println("응답할수 없습니다.");
			return;
		}
		System.out.println("소리 크기"+volume);
		return;
	}
	//채널
	void Channel(int channel,String c_updown){
		if(c_updown.equals("up")){
			channel++;
		}else if(c_updown.equals("down")){
			channel--;
		}
		System.out.println(channel+"번 채널");
	}
	
	
}
