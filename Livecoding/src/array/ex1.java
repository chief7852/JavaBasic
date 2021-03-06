package array;

import java.util.Arrays;

public class ex1 {

	public static void main(String[] args) {
		/*
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
		//반 학우들 이름의 배열만들기
		String[] cm = {"정지수","이현기","윤지혜","정이삭","박세현","오세일","장병길","배수진","김지훈","임태준","최희수","전형섭","김혜정","송수미","진예은","양지수","김도윤","김보현","원정훈","문선준","진유리","김동익","이진수","박초원","김보미"};
		
		//과목들 배열만들기
		String[] subject = {"국어","영어","수학","사회","과학","Oracle","Java"};
		
		//사람마다 과목별로 성적을 랜덤값으로 주기 1~100사이
		int[][] score = new int[cm.length][subject.length];
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j <score[i].length; j++){
				score[i][j] = (int)(Math.random()*101);
			}
		}
		//사람마다 받은 점수의 합계와 평균값 구하기
		int[] namesum = new int[score.length];
		double[] nameAvg = new double[cm.length];
		for(int i = 0;i <score.length;i++){
			for(int j = 0;j <score[i].length;j++){
				namesum[i] += score[i][j];
			}
			nameAvg[i] = (Math.round((double)namesum[i]/cm.length*100))/100.0;
		}
		
		//석차구하기
		int[] rank =new int[score.length];
		for(int i = 0; i <score.length;i++){
			rank[i]=1;
			for(int j =0;j <score.length;j++){
				if(namesum[i]<namesum[j]){
					rank[i]++;
				}
			}
		}
		//과목별 합계와 평균값 구하기
		int[] subname = new int[subject.length];
		double[] subAvg = new double[subject.length];
		for(int i = 0;i < score[i].length;i++){
			for(int j = 0; j <score.length;j++){
				subname[i] += score[j][i];
			}
			subAvg[i] = Math.round((double)subname[i]/score.length*100)/100.0;
		}
		//정렬
		for(int i = 0; i <namesum.length-1;i++){
			int max = i;
			for(int j =i+1;j <namesum.length;j++){
				if(namesum[max]<namesum[j]){
					max = j;
				}
			}
			int temp[] = score[i];
			score[i] = score[max];
			score[max] = temp;
			
			int temp2 = namesum[i];
			namesum[i] = namesum[max];
			namesum[max] = temp2;
			
			double temp3 = nameAvg[i];
			nameAvg[i] = nameAvg[max];
			nameAvg[max] = temp3;
			
			int temp4 = rank[i];
			rank[i] = rank[max];
			rank[max] = temp4;
			
			
			//출력
		}	
		for(int i = 0; i < subject.length; i++){
			System.out.print("\t"+subject[i]);
		}
		System.out.println("\t합계\t평균\t석차");
		
		for(int i =0; i <score.length;i++){
			System.out.print(cm[i]+"\t");
			for(int j =0; j <score[i].length;j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(namesum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}
		System.out.print("과목합계\t");
		for(int i = 0; i <subname.length;i++){
			System.out.print(subname[i]+"\t");
		}
		System.out.println();

		System.out.print("과목평균\t");									//과목평균 :을 출력하고
		for(int i = 0; i < subAvg.length; i++){									//과목평균 배열의 갯수만큼 반복하며 과목 평균값들을 출력한다.
			System.out.print(subAvg[i] + "\t");
		}
	}
}
