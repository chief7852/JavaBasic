package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Board {
	static Scanner s = new Scanner(System.in);

	static ArrayList<HashMap<String, String>> Table = new ArrayList<>();
	static HashMap<String, String> table = new HashMap<>();

	static ArrayList<String> inside = new ArrayList<>();
	static ArrayList<String> title = new ArrayList<>();
	static ArrayList<String> writer = new ArrayList<>();
	static ArrayList<String> date = new ArrayList<>();
	int num = Table.size();
	int rank = 0;
	int tru = 3;
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
		b.inside_base();
		int num = Table.size();


		while(true)
		{


			b.print();
			String ch = s.nextLine();

			switch(ch)
			{
			case "1" : b.quiry();
			String con = s.nextLine();
			b.contents(con);
			String con2 = s.nextLine();
			switch(con2)
			{
			case "1" :b.mod(con);
			break;

			case "2" :b.quiry2();  //삭제
			String de = s.nextLine();
			b.del(de,con);
			break;

			case "3" :break;
			}
			break;

			case "2" :
				System.out.print("제목 : ");
				title.add(s.nextLine());
				table.put("제목", title.get(b.tru));
				System.out.print("내용 : ");
				inside.add(s.nextLine());
				System.out.print("작성자 : ");
				writer.add(s.nextLine());
				table.put("작성자", writer.get(b.tru));
				System.out.print("작성일(Month/day) : ");
				date.add(s.nextLine());
				table.put("작성일",date.get(b.tru));
				Table.add(table);
				b.tru++;
				break;
			case "3" : System.out.println("종료되었습니다.");
			System.exit(0);


			case "4" :  b.rech();
			String i = s.nextLine();
			b.reserch(i);
			String impor  = s.nextLine();
			b.impor(impor);
			break;
			default : break;
			}

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
		System.out.println("1.제목으로 찾기 \t");
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
				System.out.println("---------------------------------");
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
		System.out.println("               .                ");
		System.out.println("               .                ");
		System.out.println("               .                ");
		for(int i = Table.size()-1; i >=0;i--)
		{


			System.out.print(i+1);
			System.out.print("\t"+title.get(i));
			System.out.print("\t"+writer.get(i));
			System.out.print("\t"+date.get(i));

			System.out.println();
			System.out.println("--------------------------------");

		}



		System.out.println("=================================");
		System.out.println("1.조회	 2.등록	 3.종료    4.찾기");
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



	void quiry()
	{

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("몇번으로 조회하시겠어요?");

	}
	void quiry2()
	{

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("정말 삭제하시겠나요? 1.삭제 2.취소");

	}

	//내용조회
	void contents(String con)
	{
		int i = Integer.parseInt(con)-1;
		System.out.println("=======================");
		System.out.println("제목 :"+title.get(i));
		System.out.println("작성자 :"+writer.get(i));
		System.out.println("내용 :"+inside.get(i));
		System.out.println("작성일 :"+date.get(i));
		System.out.println("=======================");
		System.out.println("1.수정하기  2.삭제하기  3.홈으로");

	}

	//내용물 견본
	void inside_base ()
	{
		inside.add("너무 힘들었어요 \n 그래도 한번 수정으로 다시 할수있어서 다행이에요");
		inside.add("너무너무 힘들었어요 \n 그래도 한번 수정으로 다시 할수있어서 다행이에요");
		inside.add("너무넘 힘들었어요 \n 그래도 한번 수정으로 다시 할수있어서 다행이에요");
	}


	void mod(String con)
	{
		String temp1 ="";
		String temp2 ="";
		temp1 = title.get(Integer.parseInt(con)-1);
		temp2 = inside.get(Integer.parseInt(con)-1);
		while(true)
		{

			int i = Integer.parseInt(con)-1;
			System.out.println("=======================");
			System.out.println("제목 :"+title.get(i));
			System.out.println("작성자 :"+writer.get(i));
			System.out.println("내용 :"+inside.get(i));
			System.out.println("작성일 :"+date.get(i));
			System.out.println("=======================");
			System.out.println("1.제목  2.내용 3.확인 4.취소");
			String chi = s.nextLine();
			switch(chi)
			{
			case "1": 
				System.out.print("제목 :");
				String re = s.nextLine();
				title.set(i, re);
				break;
			case "2": 
				System.out.print("내용 :");
				re = s.nextLine();
				inside.set(i, re);
				break;
			case "3":
				return;

			default : break;

			case "4" : title.set(i,temp1);
			inside.set(i, temp2);
			break;

			}
			
		}
	}

	//삭제하기
	void del(String de,String con)
	{
		switch(de)
		{
		case "1" :title.remove(Integer.parseInt(con)-1);
		table.remove(Integer.parseInt(con)-1);
		Table.remove(Integer.parseInt(con)-1);
		writer.remove(Integer.parseInt(con)-1);
		date.remove(Integer.parseInt(con)-1);
		tru--;
		break;
		case "2" :break;
		}
	}
}



