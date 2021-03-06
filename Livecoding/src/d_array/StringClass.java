package d_array;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
			
/*			 * String
			 * - 여러개의 문자를 사용하기 쉽게 만들어 놓은 클래스
			 * 
			 * String의 주요 메서드
			 * - equals() : 문자열의 내용이 같은지 반환한다.
			 * - length() : 문자열의 길이를 반환한다.							//몇글자인지
			 * - charAt() : 특정 인덱스에 위치한 문자를 반환한다.					//인덱스 번호의 위치한 문자 하나를 알려준다
			 * - substring() : 문자열의 특정부분을 잘라서 반환한다.				//()이안에는 index2개가 들어간다(보통)
			 * - indexOf() : 문자열 내의 특정 문자의 인덱스를 반환한다.				//() 문자열 내에 찾고싶은 문자를 찾아서 위치를 알려준다.
			 * - contains() : 문자열이 특정한 문자열을 포함하고 잇는지 반환한다.		// 참과 거짓으로 찾아낸다.
			 * - split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환하다.	// , 를기준을 나눠서 배열형태로 변화시켜준다
			 * - trim() : 문자열 앞뒤의 공백을 제거해 반환한다.					// 앞과뒤 공백제거
			 * - valieOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다.			
*/			 
		
		boolean equals = "문자열".equals("문자열");
		System.out.println(equals);
		
		//equals사용시 주의사항 : null이 있을수 있는 변수를 앞에 두지 않는다.(eqials말고 모든 메소드들 다 안됨)
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2));		//문자열에는 .equals 메소드가 존재하지만
//		System.out.println(str2.equals(str1));		//null에는 메소드가 존재하지않는다.
		
		
		String str = "12345";
		int length = str.length();			//length는 int타입으로 길이를 알려준다.
		for(int i = 0; i <length; i++){
			char charAt = str.charAt(i);
			System.out.println(charAt);
		}
		
		
		//문자열 뒤집기
		String rev = "";//12345
		for(int i = str.length() -1 ; 0 <= i ; i--){
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		
		str = "0123456789";
		String sub1 =str.substring(3); 					//3번인덱스부터 잘라서 반환한다
		System.out.println(sub1);
		String sub2 = str.substring(5,8);
		//5번 인덱스부터 8번 인덱스 전까지 잘라서 반환한다.
		System.out.println(sub2);
		
		
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지"); // 오렌지의 시작 인덱스를 반환한다.
		System.out.println(index);
		
		//substring과 indexOf를 조합해서 문자열 자르기
				String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"
				};
		for(int i = 0; i <menu.length; i++){
			String name = menu[i].substring(0,menu[i].indexOf(" "));
			System.out.println(name);
		}
		
		for(int i = 0; i <menu.length; i++){
			String name = menu[i].substring(0,menu[i].indexOf(" "));
			System.out.println(name);
			//가격만 잘라서 int타입 변수에 저장해주세요.
			int price2 =  Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1,menu[i].indexOf("원")));
			System.out.println(price2);
		}
		
		str = "abc";
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		//오렌지가 몇번 index에 포함되어있는지 찾기
		for(int i = 0 ; i< menu.length; i++){
			if(menu[i].contains("오렌지")){
				System.out.println("오렌지는" + i + "번 index에 있습니다.");
			}
		}
		
		
		str = "a/b/c";
		String[] split = str.split("/");		//split으로 나눠서 배열형태로 저장한다.
		System.out.println(Arrays.toString(split));
		
		
		//메뉴명과 가격 나누기
		for(int i = 0; i <menu.length; i++){
			split = menu[i].split(" ");
			System.out.println("메뉴명 :" + split[0] +" / 가격 :"+ split[1]);
		}
		
		
		str = " 문자열 ";
		String trim = str.trim();
		System.out.println("[" + str + "] -> [" + trim + "]");
		
		
		String Id = " myId";
		String password = "mypassword ";
		System.out.println(Id);
		System.out.println(password);
		System.out.println(Id.trim());
		System.out.println(password.trim());
		
		
		
		int number = 10;
		str = number +"";				//편법
		str = String.valueOf(number);	//정석
		System.out.println(str);
		
	}

}
