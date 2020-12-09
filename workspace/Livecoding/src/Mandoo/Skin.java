package Mandoo;

public class Skin {
	
	
	String rice = "쌀가루  ";
	String wheat = "밀가루  ";
	String soya = "콩가루  ";
	String water = "물  ";
	String juice = "쥬스  ";
	String wine = "와인  ";
	
	
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
}
