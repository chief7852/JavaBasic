package Mandoo;

public class Food {
	//속재료
	String dum(String nu){
		switch(nu){
		case "1" : nu = meet;
		break;
		case "2" : nu = dubu;
		break;
		case "3" : nu = onion;
		break;
		case "4" : nu = cabbage;
		break;
		case "5" : nu = egg ;
		break;
		case "6" : nu =koil ;
		break;
		case "7" : nu = ace ;
		break;
		case "8" : nu = chili;
		break;
		case "9" : nu = garlic;
		break;
		case "10" : nu = cheese;
		break;
		case "11" : nu = leek;
		break;
		case "12" : nu = paste;
		break;
		case "13" : nu = mayo;
		break;
		case "14" : nu = ongs;
		break;
		}
		return nu;
	}	//속재료
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
	String dump = "1.돼지고기🍖  2.두부 ⬜️  3.양파🧅  4.양배추🥗  5.계란🥚  6.참기름 🛢️ 7.에이스🍪  \n8.고추🌶  9.마늘🧄  10.치즈🧀  11.대파☄  12.고추장🧄  13.마요네즈🧄  14.옹스🧄";
	//정답 :돼지고기 두부 양파 양배추 참기름 마늘 대파 
	void dump(){
		System.out.println(dump);
	}
		// 반죽재료
	void how(){
		System.out.println("재료를 골라주십시오(원하는 재료 앞의 숫자를 입력해 주십시오)");
		System.out.println();
		System.out.println();
		System.out.print("무엇을 넣을까...?");
		System.out.println();
		System.out.println();
		System.out.print("...>");
	}
	void dump2(){
		System.out.println(dough);
	}	//반죽재료
	String dough = "1.쌀가루   2.밀가루  3.콩가루   4.물   5.쥬스   6.와인   ";
	String rice = "쌀가루  ";
	String wheat = "밀가루  ";
	String soya = "콩가루  ";
	String water = "물  ";
	String juice = "쥬스  ";
	String wine = "와인  ";
	//정답 :밀가루 물 
	String dum2(String nu){
		switch(nu){
		case "1" : nu = rice;
		break;
		case "2" : nu = wheat;
		break;
		case "3" : nu = soya;
		break;
		case "4" : nu = water;
		break;
		case "5" : nu = juice;
		break;
		case "6" : nu = wine;
		break;
		}
		return nu;
	}
		//반죽모양
	String shape = "1.반달모양  2.둥근모양  3.복주머니모양";
	String moon = "반달모양";
	String round = "둥근모양";
	String bag = "복주머니모양";
	
	void dump3(){
		System.out.println(shape);
		System.out.println("모양 골라주십시오(원하는 모양 앞의 숫자를 입력해 주십시오)");
		System.out.println();
		System.out.println();		
		System.out.print("무슨 모양이 좋을까...>");
	}
	String dum3(String nu){
		switch(nu){
		case "1" : nu =moon;
		break;
		case "2" : nu = round;
		break;
		case "3" : nu = bag;
		break;
		}
		return nu;
	}
	String cook = "1.굽기  2.찌기  3.삶기";
	String roast = "굽기";
	String steam = "찌기";
	String boil = "삶기";
	void cooking(){
		System.out.println(cook);
	}
	
	void dump4(){
		System.out.println("요리 방법을 골라주십시오(원하는 방식 앞의 숫자를 입력해주십시오)");
		System.out.println();
		System.out.println();
		System.out.println("어떻게 요리할까...>");
	}
	
	String dum4(String nu){
		switch(nu){
		case "1" : nu = roast;
		break;
		case "2" : nu = round;
		break;
		case "3" : nu = boil;
		break;
		}
		return nu;
	}
}
