package home;

public class machine_inside {

	void coke(int money){
		 if(money >= 500){
			System.out.println("이용해 주셔서감사합니다 거스름돈 : "+
							     (money-500)+"원 받아가십시오.");
		}else if(money == 500){
			System.out.println("이용해 주셔서감사합니다");
		}else System.out.println((500-money)+"원 부족합니다.");
		return;
	}
	
}
