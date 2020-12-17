package i_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
		/*				//답지
		 *  우리반 모두의 국어, 영어 , 수학, 사회, 과학, Oracle, Java점수를				//우리반은 25명이다.
		 *  0~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요
		 *  		국어			영어			수학			사회			과학			Oracle			Java			합계			평균			석차
		 *  홍길동	90			90			90			90			90			90				90				90			90			1
		 *  홍길동	90			90			90			90			90			90				90				90			90			1
		 *  홍길동	90			90			90			90			90			90				90				90			90			1
		 *  홍길동	90			90			90			90			90			90				90				90			90			1
		 *  홍길동	90			90			90			90			90			90				90				90			90			1
		 *  홍길동	90			90			90			90			90			90				90				90			90			1
		 *  홍길동	90			90			90			90			90			90				90				90			90			1
		 *  과목합계    450			450			450			450			450			450				450				
		 *  과목평균	90.00		90.00		90.00		90.00		90.00		90.00			90.00		
		 */
		//과목 리스트에 넣기
		
		ArrayList<String> subject = new ArrayList();
		String[] sub = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		for(int i = 0; i < sub.length; i++)
		{
			subject.add(sub[i]);
		}
		
	
		//이름 리스트 만들기
		ArrayList<String> name = new ArrayList();
		String[] names = {"정지수","이현기","윤지혜","정이삭","박세현","오세일","장병길"
				 ,"배수진","김지훈","임태준","최희수","전형섭","김혜정","송수미"
				 ,"진예은","양지수","김도윤","김보현","원정훈","문선준","진유리"
				 ,"김동익","이진수","박초원","김보미"};
		for(int i = 0; i < names.length; i++)
		{
			name.add(names[i]);
		}
		
		
		//점수 만들기
		ArrayList<ArrayList<Integer>> subscore = new ArrayList<>();
		
		
		for(int i = 0; i < name.size();i++)
		{
			ArrayList<Integer> namescore = new ArrayList<>();
			for(int j = 0; j < subject.size(); j++)
			{
				
				namescore.add((int)(Math.random()*101));
			}
			subscore.add(namescore);
		}
		
	
		
		
		//학생별 합계구하기
		ArrayList<Integer> sumscore = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i <name.size(); i++)
		{
			sum = 0;
			
			for(int j = 0;j < subject.size(); j++)
			{
				sum += subscore.get(i).get(j);
			}
			sumscore.add(sum);
		}
		
		
		
		//학생별 평균구하기
		ArrayList<Double> avgscore = new ArrayList<>();
		for(int i = 0; i <sumscore.size();i++)
		{
			avgscore.add( Math.round(((double)sumscore.get(i)/subject.size())*100)/100.0);
		}
		
		
		//석차 구하기
		ArrayList<Integer> ranks = new ArrayList<>();
		
		for(int i = 0; i < sumscore.size(); i++){
			ranks.add(1);
			for(int j = 0; j < sumscore.size(); j++){
				if(sumscore.get(i) < sumscore.get(j)){
					ranks.set(i, ranks.get(i) + 1);
				}
			}
		}
		
		
		//정렬
		for (int i = 0; i < ranks.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < ranks.size(); j++) {
				if (ranks.get(j) < ranks.get(min)) {
					min = j;
				}
			}
			String namesc = name.get(i);
			name.set(i, name.get(min));
			name.set(min, namesc);
			
			ArrayList<Integer> list = subscore.get(i);
			subscore.set(i, subscore.get(min));
			subscore.set(min, list);
			
			Integer sum1 = sumscore.get(i);
			sumscore.set(i, sumscore.get(min));
			sumscore.set(min, sum1);
			
			Double avg = avgscore.get(i);
			avgscore.set(i, avgscore.get(min));
			avgscore.set(min, avg);
			
			int rank = ranks.get(i);
			ranks.set(i, ranks.get(min));
			ranks.set(min, rank);
		}
		
		
		//과목별 합계 구하기
		ArrayList<Integer> sumscore2 = new ArrayList<>();
		ArrayList<Double> avgscore2 = new ArrayList<>();
		sum = 0;
		for(int i = 0 ; i <subject.size();i++)
		{
			sum = 0;
			
			for(int j = 0; j < name.size(); j++)
			{
				
				sum += subscore.get(j).get(i);
			}
			sumscore2.add(sum);
			avgscore2.add(Math.round((double)sum / name.size() * 100) / 100.0);
			
		}
		
		//출력
		for(int i = 0 ; i <subject.size();i++){
			System.out.print("\t"+subject.get(i));
		}
		System.out.print("\t합계\t평균\t석차\n");
		
		for(int i = 0 ; i <name.size(); i++)
		{
			System.out.print(name.get(i));
			for(int j = 0; j <subject.size();j++)
			{
				System.out.print("\t"+subscore.get(i).get(j));
			}
			System.out.println("\t"+sumscore.get(i)+"\t"+avgscore.get(i)+"\t"+ranks.get(i));
			
		}
		System.out.print("과목합계");
		for(int i = 0; i <subject.size();i++)
		{
			System.out.print("\t"+sumscore2.get(i));
		}
		System.out.println();
		
		System.out.print("과목평균");
		for(int i = 0; i <subject.size();i++)
		{
			System.out.print("\t"+ avgscore2.get(i));
		}
		 
	}

	
	

}


