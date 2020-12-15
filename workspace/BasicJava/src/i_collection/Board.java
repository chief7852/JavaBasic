package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Board {
	static Scanner s = new Scanner(System.in);
	
	static ArrayList<HashMap<String, String>> Table = new ArrayList<>();
	static HashMap<String, String> table = new HashMap<>();
	
	static ArrayList<String> title = new ArrayList<>();
	static ArrayList<String> writer = new ArrayList<>();
	static ArrayList<String> date = new ArrayList<>();
	int num = Table.size();
	int rank = 0;
	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 */
		
		/*
		 *  -------------------------------
		 *  번호  제목 		작성자	작성일
		 *  -------------------------------
		 *  4    안녕하세요  홍길동      12/15
		 *  3    안녕하세요  홍길동      12/15
		 *  2    안녕하세요  홍길동      12/15
		 *  1    안녕하세요  홍길동      12/15
		 *  -------------------------------
		 *  1.조회		2.등록		3.종료
		 */
		
		//게시판만들기
		
		title.add("아이고 ");
		title.add("거짓말");
		title.add("에고");
		writer.add("힘들레이옹");
		writer.add("넘힘덩");
		writer.add("예시");
		date.add("12/1");
		date.add("12/2");
		date.add("12/3");
		
		Table.add(table);
		Table.add(table);
		Table.add(table);
		Scanner s = new Scanner(System.in);
		Board b = new Board();
		
		int num = Table.size();
		int tru = 3;
		
		while(true)
		{
			
			
			b.print();
			String ch = s.nextLine();
			
			switch(ch)
			{
			case "1" : b.rech();
						String i = s.nextLine();
						b.reserch(i);
						String impor  = s.nextLine();
						b.impor(impor);
						continue;
			case "2" :
					  System.out.print("제목 : ");
					  title.add(s.nextLine());
					  table.put("제목", title.get(tru));
					  System.out.print("작성자 : ");
					  writer.add(s.nextLine());
					  table.put("작성자", writer.get(tru));
					  System.out.print("작성일(Month/day) : ");
					  date.add(s.nextLine());
					  table.put("작성일",date.get(tru));
					  Table.add(table);
					  tru++;
					  continue;
			case "3" : break;
			default : continue;
			}
			break;
		}
		
	}
	
	
	
	
	//조회 선택지
	String reserch(String i)
	{
		Board b = new Board();
		switch(i)
		{
		case "1":System.out.print("제목을 입력해주세요 : ");
				String tre = s.nextLine();
				b.titler(tre);
		}
		return i;
	}
	
	void rech()
	{
		System.out.println("====================================\t");
		System.out.println("1.제목으로 찾기 2.작성자별로 찾기\t");
		System.out.println("====================================\t");
		System.out.print(">");
	}
	
	//제목별로 찾기
	void titler(String tre)
	{
		System.out.println("=================================");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("=================================");
		
		for(int i = Table.size()-1; i >=0;i--)
		{
			
			if(title.get(i).contains(tre)){
				
			System.out.print(i+1);
				System.out.print("\t"+title.get(i));
				System.out.print("\t"+writer.get(i));
				System.out.print("\t"+date.get(i));
			
			System.out.println();
			System.out.println("=================================");
			System.out.println("1.처음으로\t2.정보보기");
			System.out.println("=================================");
			System.out.println();
			System.out.println();
			
			}
		}
		
	}
	
	
	//프린트하기ㅉㄴ
	void print()
	{
		Board b = new Board();
		System.out.println("=================================");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("=================================");
		
		for(int i = Table.size()-1; i >=0;i--)
		{
			
			
			System.out.print(i+1);
				System.out.print("\t"+title.get(i));
				System.out.print("\t"+writer.get(i));
				System.out.print("\t"+date.get(i));
			
			System.out.println();
			System.out.println("--------------------------------");
			
		}
		System.out.println("               .                ");
		System.out.println("               .                ");
		System.out.println("               .                ");
		
		
		System.out.println("=================================");
		System.out.println("1.조회	   2.등록	 3.종료");
	}
	
	// 에고 정보
	void impor(String a)
	{
		switch(a)
		{
		case "2" : System.out.println("줄거리 :아이고 힘들다..");
		break;
		}
		
	}
	
	
}


	
