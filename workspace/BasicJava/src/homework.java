

import java.util.Scanner;

public class homework {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		String ID;
		int pw;
		String name;
		int age;
		double hei;
		
		System.out.println("============회원가입============\n");
		
		System.out.print("아이디>");
		ID =  sc.nextLine();
		
		
		System.out.print("비밀번호(4자리숫자)>");
		pw = Integer.parseInt(sc.nextLine());
		
		
		System.out.print("이름>");
		name = sc.nextLine();
		
		
		System.out.print("나이>");
		age = Integer.parseInt(sc.nextLine());
		
		
		System.out.print("키");
		hei = Double.parseDouble(sc.nextLine());
		
		System.out.println("============================");
		System.out.println("아이디:" + ID);
		System.out.println("비밀번호:" + pw);
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("키:" + hei +"cm");
		System.out.println("============================");
	}
}
