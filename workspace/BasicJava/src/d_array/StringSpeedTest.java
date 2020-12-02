package d_array;

public class StringSpeedTest {

	public static void main(String[] args) {
//			String str = "a";					//문자열은  +=로 붙이면 새로운 문자로 만들어 내서 메모리 효율이 극악이다.
			
			
//			long start = System.currentTimeMillis();
//			for(int i =0; i <200000; i++){
//				str += "a";
//			}
//			long end = System.currentTimeMillis();
//			System.out.println(end - start +"ms");
					
		
		
		
		StringBuffer sb = new StringBuffer("a");				//스트링을 위한 메소드 문자열의 메모리사용 극단적으로 줄일수있음
		
		long start = System.currentTimeMillis();
		for(int i =0; i <1000000000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end -start +"ms");
		
	}

}
