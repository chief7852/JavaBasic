package e_oop;

public class Tvpro {
	
	boolean power = false;;	//전원
	int channel = 1;    //채널
	int volume	= 5;		//음량
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	//전원버튼
	void power(){
		power = !power;						
		System.out.println(power ? "TV 켜짐 " : "TV 꺼짐");
	}
	//채널변경
	void changeChannel(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;							//this는 전역변수와 지역변수를  구분할수있다.
			}													//this를 붙인것은 전역변수이다.
			System.out.println("채널. " + this.channel);
		}
	}
	
	void channelUp(){
		changeChannel(channel + 1);					//위의 메소드를 재사용(코드재사용)
	}
	
	void channelDown(){
		changeChannel(channel - 1);
	}
	//볼륨
	void volumeUp(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
			showVolume();
		}
	}
	
	void volumeDown(){
		if(power){
			if(volume > MIN_VOLUME){
				volume--;
			}
			showVolume();
		}
	}
	
	//볼륨 시각화 메서드
	void showVolume(){
		System.out.println("음량. ");
		for(int i = MIN_VOLUME +1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("■"); 
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Tvpro tv = new Tvpro();
		
		while(true){
			System.out.println("-------------------------------------");
			System.out.println("1.전원 2.채널변경 3.채널업 4.채널다운");
			System.out.println("5.볼륨업 6.볼륨다운 0.종료");
			System.out.println("-------------------------------------");
			System.out.print("번호입력 >");
			int input = ScanUtil.nextint();
			
			switch  (input) {
			case 1: tv.power(); break;
			case 2:
				System.out.print("변경할 채널 입력>");
				int ch = ScanUtil.nextint();
				tv.changeChannel(ch);
				break;
			case 3: tv.channelUp(); break;
			case 4: tv.channelDown(); break;
			case 5: tv.volumeUp(); break;
			case 6: tv.volumeDown(); break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
			
			}
		}
	}
	
}
