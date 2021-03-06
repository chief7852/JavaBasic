package e_oop.score;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		//학생의 기본정보 만들기
		Student[] students = new Student[10];
//		Student[] sum = new Student[students.length];
//		System.out.println("\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++){
			Student student = new Student();		//객체생성
//			Student namesum = new Student();
			
			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int)(Math.random() * 101);
			student.eng = (int)(Math.random() * 101);
			student.math = (int)(Math.random() * 101);
			student.sum = student.kor + student.eng+ student.math;
			student.avg = student.sum / 3;
			students[i] = student;
//			student.namesum += student.kor;
			
//			//석차구하기...
//			System.out.println(student.name+"\t"+student.kor+"\t"+student.eng+"\t"+student.math+"\t"
//								+student.sum+"\t"+student.avg);
		}
		//성적관리 프로그램을 완성해주세요.
		for(int i = 0; i <students.length;i++){
			students[i].sum = students[i].kor +students[i].eng +students[i].math;
			students[i].avg = Math.round(students[i].sum/3.0*100)/100.0;
		}
		
		//석차
		for(int i = 0; i <students.length;i++){
			for(int j = 0; j <students.length;j++){
				if(students[i].sum < students[j].sum){
					students[i].rank++;
				}
			}
		}
		
		//정렬
		//정렬
				for(int i = 0; i <students.length-1;i++){
					int min = i;
					for(int j =i+1;j <students.length;j++){
						if(students[j].rank<students[min].rank){
							min = j;
						}
					}
					Student temp = students[i];
					students[i] = students[min];
					students[min] = temp;
				}
				
				//출력
				System.out.println("\t국어\t영어\t수학\t합계\t평균\t석차");
				for(int i = 0; i <students.length;i++){
					System.out.print(students[i].name + "\t");
					System.out.print(students[i].kor + "\t");
					System.out.print(students[i].eng + "\t");
					System.out.print(students[i].math + "\t");
					System.out.print(students[i].sum + "\t");
					System.out.print(students[i].avg + "\t");
					System.out.println(students[i].rank);
				}
				
				//과목별 합계
				int korSum = 0;
				int engSum = 0;
				int mathSum = 0;
				for(int i = 0; i <students.length; i++){
					korSum += students[i].kor;
					engSum += students[i].kor;
					mathSum += students[i].kor;
				}
				
				//과목별 평균
				double korAvg = (double)korSum / students.length;
				double engAvg = (double)engSum / students.length;
				double mathAvg = (double)mathSum / students.length;
				System.out.println("과목합계\t"+ korSum + "\t" + engSum +"\t" + mathSum);
				System.out.println("과목평균\t"+ korAvg + "\t" + engAvg +"\t" + mathAvg);
	}

}
