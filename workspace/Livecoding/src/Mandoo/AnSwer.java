package Mandoo;

import java.util.Arrays;

public class AnSwer {
	//정답
	String meet = "돼지고기 ";
	String dubu = "두부 ";
	String onion = "양파 ";
	String cabbage = "양배추 ";
	String egg = "계란 ";
	String koil = "참기름 ";
	String ace = "에이스 ";
	String chili = "고추 ";
	String garlic = "마늘 ";
	String cheese = "치즈 ";
	String leek = "대파 ";
	String paste = "고추장 ";
	String mayo = "마요네즈 ";
	String ongs = "옹스 ";
	String rice = "쌀가루  ";
	String wheat = "밀가루  ";
	String soya = "콩가루  ";
	String water = "물  ";
	String juice = "쥬스  ";
	String wine = "와인  ";
	String[] ans1 ={meet,dubu,onion,cabbage,koil,garlic,leek};
	String[] ans2 = {wheat,water};
	String roast = "굽기";
	String steam = "찌기";
	String boil = "삶기";
	String moon = "반달모양";
	String round = "둥근모양";
	String bag = "복주머니모양";
	String moon1 = moon+roast;
	String round1 = round+steam;
	String bag1 = bag+boil;
	
	
	Instruction a = new Instruction();
		void ending(){
			System.out.println("속재료 : 돼지고기 두부 양파 양배추 참기름 마늘 대파");
			System.out.println("반죽 : 밀가루 물");
			System.out.println("모양과 요리방법 :반달모양-굽기,\n 둥근모양-찌기 ,\n 복주머니모양-삶기");
			System.out.println("\n=================================");
		}
		
		
		void answer(String[] temp1,String[] temp2,String sum3,String sum4){
			String a = sum3+sum4;
			Arrays.sort(ans1);
			Arrays.sort(ans2);
			if(Arrays.equals(ans1,temp1)&&Arrays.equals(ans2,temp2))
			{
				if(a.equals(moon1)||a.equals(round1)||a.equals(bag1))
				{
					String i1 ="역시!!!\n고향만두를 따라올 만두는 없지.. ㅎㅎㅎ";
					this.a.UI(i1);
				}
				else
				{
				String i2 = "\n흠....요리방법이 이상해 ..";
				this.a.UI(i2);
				}
				
			}
			else if(Arrays.equals(ans1,temp1)==false&&Arrays.equals(ans2,temp2)==true){
				if(a.equals(moon1)||a.equals(round1)||a.equals(bag1))
				{
					String i3 = "\n흠....만두속만 바꾸면 괜찮을것 같은데..";
					this.a.UI(i3);
				}
		}else if(Arrays.equals(ans1,temp1)==true&&Arrays.equals(ans2,temp2)==false){
			if(a.equals(moon1)||a.equals(round1)||a.equals(bag1))
			{
				String i4 = "\n흠....만두피만 바꾼다면 아마..";
				this.a.UI(i4);
			}
		 }else{
			 String i2 = "\n흠....요리방법이 이상해 ..";
		 }
	}
}
