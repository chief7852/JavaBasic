package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) :지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) :지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 */
		//객체생성
		HashMap<String, Object> map = new HashMap<>();		//Object로 설정하면 어떤 타입이든 상관없이 넣을수있다.
		
		//저장		--Map에는 순서라는 개념이 없음
		map.put("a",10);		//a=10;
		map.put("b", "홍길동");	//b="홍길동";
//		map.put("c", new Scanner(System.in)); //String c = new Scanner(System.in);
	
		
		
		map.put("b", "이순신"); 	//덮어쓴다.
		
//		System.out.println(map);
		
		//제거
		map.remove("c");
		
		
		
		
		
		//형변환해서 불러오기
		Object value = map.get("b");
//		System.out.println(value);
		int value1 = (Integer)map.get("a");
		String value2 = (String)map.get("b");
		
		//키 불러오기
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
		{
			System.out.println(key + " : " + map.get(key));
		}
		

		
		ArrayList<Integer> kew = new ArrayList<>();
		kew.add(456456421);
		for(int a : kew)
		{
			
		}
		
		
		
		//회원테이블
		//아이디, 비밀번호, 이름, 전화번호
		/*
		 * id		password	name	tel
		 * admin	admin123	관리자	010-1111-1111
		 */
		
		HashMap<String, String> user = new HashMap<>();
		user.put("id","admin");
		user.put("password","admin123");
		user.put("name","관리자");
		user.put("tel","010-1111-1111");
		
//		System.out.println(user);
		
		//테이블 만들기;
		ArrayList<HashMap<String, String>> table1 = new ArrayList<>();
		table1.add(user);
		
		user = new HashMap<>();
		user.put("id","admin2");
		user.put("password","admin2123");
		user.put("name","관리자2");
		user.put("tel","010-1112-1111");
		
		table1.add(user);
		
		System.out.println(table1);
		
//		Set<String> Table1 = user.keySet();
		
		
		for(int i = 0; i < table1.size(); i ++)
		{
			HashMap<String , String > hashMap1 = table1.get(i);
			Set<String> keySet2 = hashMap1.keySet();
			for(String key1 : keySet2)
			{
				System.out.println(key1 + " : " + hashMap1.get(key1));
			}
			System.out.println("----------------------------");
			System.out.println("-------------------------------");
		}
	}

	private static void Table1(Set<String> table2) {
		// TODO Auto-generated method stub
		
	}
}
