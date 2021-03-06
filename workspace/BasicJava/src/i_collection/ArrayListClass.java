package i_collection;

import java.util.ArrayList;
import java.util.Scanner;

import d_array.Array;

public class ArrayListClass 
{
	public static void main(String[] args) 
	{
		/* 
		 * collection 프레임워크
		 * 
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * void add(int index, Object obj) : 지적된 위치에 객체를 추가한다.(끼워넣기)
		 * Object set(int index, Object obj): 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.(수정)
		 * Object get(int index) : 지정된 위치의 객체를 반환한다.(위치반환)
		 * int size() : 저장된 객체의 수를 반환한다.(== length)
		 * boolean remove(int index) :지정된 위치의 객체를 제거한다.(삭제)
		 */
		
		ArrayList sample = new ArrayList();
		
											//(arraylist는 타입상관없이 저장가능)   대신 값을 꺼낼때 타입을 예측할수가없다 
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		
											//따라서 제네릭을 사용하는것을 권장한다. '<>' 이것이 제네릭
		ArrayList<Integer> list = new ArrayList<>();
											//제네릭에는 참조형 타입만가능하다(기본형 사용불가능) Integer는 int를 대신할수 있는 클래스라서 사용가능하다.
		list.add(10);
//		list.add("d");    컴파일에러 
		list.add(20);
		System.out.println(list.add(30));
		System.out.println(list);
		
		
		//1번 인덱스부터 뒤로 밀고 값을 출력한다 [10, 20, 30] =>  [10, 40, 20, 30]
		list.add(1, 40);
		System.out.println(list);		
//		list.add(5,50);					단 인덱스를 완전히 뛰어넘어서  처음과 끝뒤에는 저장할수 없다.
		
		
		Integer before = list.set(2, 50);	//2번인덱스에 값을 저장하고 기존 값을 반환한다.(수정)
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		
		Integer integer = list.get(2);
		System.out.println(integer);
		
		//get은 for문과 잘 맞음
		
		for(int i = 0; i <list.size(); i ++)
		{
			System.out.println(i + " : " + list.get(i));
		}
		
		
		//제거
//		for(int i = 0; i <list.size(); i ++)
//		{
//			System.out.println(i + " : " + list.get(i));
//			
//			list.remove(i);							//삭제하면서 하나씩 당겨온다는걸 생각해야함0 : 10
//																				  //1 : 50
//		}
		
		//값을 제대로 제거하고싶다면 for문을 뒤에서부터 돌려야 제대로 제거할수 있다.
		for(int i = list.size() - 1; 0 <= i ; i--)
		{
			System.out.println(i + " : " + list.get(i));
			
			list.remove(i);
		}
		System.out.println(list);
		
		/* 주로 collection 클래스 사용할떄 많이사용
		 * Wrapper 클래스   : 기본형 타입을 객체로 사용해야 할때 대신 사용하는 클래스
		 * - boolean	 : Boolean
		 * - char		 : Character
		 * - byte		 : Byte
		 * - short		 : Short
		 * - int         : Integer
		 * - long		 : Long
		 * - float       : Float
		 * - double      : Double
		 */
		
		//-Integer
		ArrayList<Integer> li = new ArrayList<>();
		
		li.add(new Integer(10));		//원래는 이렇게 하는게 정석이다
		li.add(10);	//하지만 (오토박싱: 기본형 타입이 wrapper 클래스로 자동변환)를 사용해서 자동형변환을 해준것
		
		Integer _integer = li.get(0);
		int i = li.get(0);	//언박싱 : wrapper 클래스가 기본형 타입으로 자동변환
		
		
		
		//list에 1 ~ 100 사이의 랜덤값을 10개 저장해 주세요.
		int sum = 0;
		for(i = 0; i < 10; i++)
		{
			int random = (int)(Math.random()*100)+1;
			list.add(random);
			sum += list.get(i);
		}
		System.out.println(list);
		
		//list에 저장된 값을 합계와 평균을 구해주세요.
		double avg= 0;
		
		avg = (double)sum/list.size();
//		System.out.println("합계:"+sum);
//		System.out.println("평균:"+avg);
//		
//		
		//list에서 최소값과 최대값을 구해주세요.
		int max = list.get(0);
		int min = list.get(0);
		for( i =0 ; i <list.size()-1;i++)
		{
			
			if(list.get(i) < min)
			{
				min = list.get(i);
			}
			if(list.get(i) > max)
			{
				max = list.get(i);
				
			}
			
		}
		System.out.println("max" +max +"min"+ min);
		
		
		
		//list를 오름차순으로 정렬해주세요.
		int temp = 0;
		for(i = 0 ; i <list.size();i++)
		{
			for(int j = 0 ; j <list.size(); j++)
			{
				if(list.get(j) > list.get(i))
				{
					temp = list.set(i,list.get(j) );
					list.set(j, temp);
				}
			}
		}
		
//		System.out.println(list);
		
		//삽입정렬
//		for(i = 1; i < list)
		
		
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		ArrayList<Integer> _list = new ArrayList<>();
		_list.add(10);
		_list.add(20);
		_list.add(30);
		
		list2.add(_list);
		
		_list = new ArrayList<>();
		_list.add(40);
		_list.add(50);
		list2.add(_list);
		
		for(i = 0; i < list2.size(); i++)
		{
			ArrayList<Integer> tempList = list2.get(i);
			for(int j = 0; j < tempList.size(); j++)
			{
			System.out.print(tempList.get(j)+ "\t");	
			}
			System.out.println();
		}
	}
}
