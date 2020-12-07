

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		//탄수화물 중독 자가진단 테스트
		Scanner s  = new Scanner(System.in);
		int O = 0;
		int X = 0;
		System.out.println("==========탄수화물 중독 자가진단테스트==========");
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다O/X : ");
		String c1 = s.nextLine();
			if(c1.equals("O")){
				O++;
			}else{
				X++;
			} 
		System.out.print("밥,빵,과자 드 음식을 먹기시작하면 끝이 없다O/X : ");
		String c2 = s.nextLine();
			if(c2.equals("O")){
			O++;
			}else{
			X++;
			}
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다O/X : ");
		String c3 = s.nextLine();
			if(c3.equals("O")){
				O++;
			}else{
				X++;
			}
		System.out.print("정말 배고프지 않더라도 먹을때가 있다O/X : ");
		String c4 = s.nextLine();
			if(c4.equals("O")){
				O++;
			}else{
				X++;
			}
		System.out.print("저녁을 먹고 간식을 먹지않으면 잠이 오지않는다O/X : ");
		String c5 = s.nextLine();
			if(c5.equals("O")){
				O++;
			}else{
				X++;
			}
		System.out.print("스트레스를 받으면 자꾸 먹고싶어진다O/X : ");
		String c6 = s.nextLine();
			if(c6.equals("O")){
				O++;
			}else{
				X++;
			}
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다O/X : ");
		String c7 = s.nextLine();
			if(c7.equals("O")){
				O++;
			}else{
				X++;
			}
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다O/X : ");
		String c8 = s.nextLine();
			if(c8.equals("O")){
				O++;
			}else{
				X++;
			}
		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다O/X : ");
		String c9 = s.nextLine();
			if(c9.equals("O")){
				O++;
			}else{
				X++;
			}
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못간다O/X : ");
		String c10 = s.nextLine();
			if(c10.equals("O")){
				O++;
			}else{
				X++;
			}
			
			System.out.println("O의값:"+O+"  X의값은"+X);
			
		if(O==3){
			System.out.println("주의!\n위험한 수준은 아니지만 관리필요");
		}else if(O<=6){									//else if(4 <= O && O =< 6) 이게 더 알기쉬움
			System.out.println("위험!\n탄수화물 섭취 줄이기 위한\n식습관 개선이 필요함");
		}else if(O>=7){
			System.out.println("중독!\n전문의 상담이\n필요함");
		}else{
			System.out.println("노상관");
		}

	}

}
