package Mandoo;

public class FoodChoice {
	String dum(String nu){
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
	}
}
