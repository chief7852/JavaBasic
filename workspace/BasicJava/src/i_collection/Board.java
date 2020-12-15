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
		
		
		Scanner s = new Scanner(System.in);
		Board b = new Board();
		
		int num = Table.size();
		int tru = 0;
		
		while(true)
		{
			
			b.print();
			String ch = s.nextLine();
			
			switch(ch)
			{
			case "1" : b.rech();
						String i = s.nextLine();
						b.reserch(i);
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
	
	
	static void basedb()
	{
		table.put("제목", "아이고 이게뭐라고");
		table.put("작성자", "힘들레이옹");
		table.put("작성일", "12/1");
		Table.add(table);
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
		System.out.println("1.제목으로 찾기 2.날짜별로 찾기 3.작가별로 찾기\t");
		System.out.println("====================================\t");
		System.out.print(">");
	}
	
	//제목별로 찾기
	void titler(String tre)
	{
		for(int i = 0; i <title.size();i++)
		{
			if(title.contains(tre))
			{
				System.out.print("\t"+Table.get(i));
				
			}
		}
	}
	
	
	//프린트하기ㅉㄴ
	void print()
	{
		System.out.println("-------------------------------");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("-------------------------------");
		
		for(int i = 0; i <Table.size();i++)
		{
			
			System.out.print(num);
			
				System.out.print("\t"+title.get(i));
				System.out.print("\t"+writer.get(i));
				System.out.print("\t"+date.get(i));
			
			System.out.println();

		}
		
		
		
		System.out.println("-------------------------------");
		System.out.println("1.조회	   2.등록	 3.종료");
	}
	
}


	
