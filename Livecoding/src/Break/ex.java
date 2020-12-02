package Break;


public class ex {
	public static void main(String[] args) {
		//문자열 뒤집기
				String str = "12345";
				String rev = "";//12345
				for(int i = str.length() -1 ; 0 <= i ; i--){
					rev += str.charAt(i);
				}
				System.out.println(rev);
		}
	}

