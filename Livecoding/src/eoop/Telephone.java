package eoop;

import java.util.Arrays;
import java.util.Scanner;

public class Telephone {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Telephone tel = new Telephone();
		int temp[] = new int[10];
		int x = 0;
		while(true){
		System.out.println("_______________________________");
		System.out.println("|       _______________       |");
		System.out.println("|_____||               ||_____|");
		System.out.println("      /                 \\");
		System.out.println("     /                   \\");
		System.out.println("    |                     |");
		System.out.println("    |_____________________|");
		
		System.out.println("(<,>)키를 입력해서 번호를 위 아래로 내릴수 있습니다");
		String Unum = s.nextLine();
		System.out.println(":"+tel.num);
		System.out.println();
		
		
	
	
		switch(Unum){
		
		case ">": tel.numup(Unum);
			System.out.println(tel.num);
			break;
		case "<" :tel.numdown(Unum);
			System.out.println(tel.num);
			break;
		case "0" :temp[x] = tel.num;
					x++;
					tel.num =0;
			break;
			}
		System.out.println(Arrays.toString(temp));	
		}
	}
		
		
		
		
	
	int i = 0;
	int num = 0;
	int[] Pnum = new int[10];
	
	final int MAX_NUM =9;
	final int MIN_NUM =0;

	
	void numup(String num){
			if(num.equals(">")&&this.num<MAX_NUM){
				this.num = this.num+1; 
			}
	}
	
	void numdown(String num){
		if(num.equals("<")&&this.num>MIN_NUM){
			this.num = this.num-1; 
			}
	}
	
	
	
	void Pick(String pick){
		if(pick == "0"){
			Pnum[i] = this.num;
			i = i+1;
		}
	}
	
	void visual(){
		
	}
	
	
}
