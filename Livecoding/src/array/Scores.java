package array;

import java.util.Arrays;

public class Scores {

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
		//점수랜덤으로 주기
//		int score[] = new int[7];
//		for(int i = 0; i < score.length; i++){
//			score[i] = (int)(Math.random()*100)+1;
//		}
		//우리반 학생 이름 배열
		String[] Cm = {"정지수","이현기","윤지혜","정이삭","박세현","오세일","장병길","배수진","김지훈","임태준","최희수","전형섭","김혜정","송수미","진예은","양지수","김도윤","김보현","원정훈","문선준","진유리","김동익","이진수","박초원","김보미"};
		//과목 및 비고
		
		String[] subjects = {"국어","영어","수학","사회","과학","Oracle","Java"};
		int table[][] = new int[25][10];
		int sum[] = new int[table.length];			//일반 합계
		for(int i = 0; i < table.length;i++){		//행(학생+과목합계+과목평균)
			for(int j = 0; j < table[i].length;j++){//열(과목+합계+평균)	
				if(i < 25 && j < 7){					//학생수와 과목수 만큼의 table배열값에만 랜덤값을준다.
					table[i][j] = (int)(Math.random()*100)+1;	//학생들의 과목별 점수를 1~100까지 랜덤한값으로 부여한다.
					
				}			sum[i] += table[i][j];	//일반합계를 계산하는 식
				
			}
//			System.out.println(Cm[i]+Arrays.toString(table[i]));
//			System.out.println(Cm[i]+Arrays.toString(sum));
//			System.out.printf("%s  %d		%d		%d		%d		%d		%d		%d",Cm[i],table[i][j]);
		}
		//for문 첫번째 끝나는자리
		//과목합계와 평균 배열만들기
//		int temp = 0;
//		int[][] sum = new int[2][7];			//과목합계와 평균 배열만들기
//		for(int i = 0;i < sum.length; i++){		//행 합계, 평균
//			for(int j = 0; j < sum[i].length;j++){//과목들
//				temp += table[j][i];
//				sum[i][j] = temp;
//			}
//			
//			System.out.println(Arrays.toString(sum[i]));
//		}	
//		
	}
}

