package com.study.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//1. 학생 수 입력
		//2. 학생 수 만큼 이름 입력 : a,b
		//3. 학생 수 만큼 학생의 번호,국어,영어,수학 입력
		//   a 학생의 번호 :
		//   a 학생의 국어 : 
		//   a 학생의 영어 : ....
		//   총점 평균 계산
		//모든 학생의 정보 출력
		//   이름   번호   국어   영어   수학  총점  평균
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("학생 수를 입력하세요");
		int student = scanner.nextInt();
		
		String [] name = new String[student];
		
		int [] num = new int[student];
		int [] korean = new int[student];
		int [] english = new int[student];
		int [] math = new int[student];
		int [] sum= new int[3];
		double[] avg= new double[2];
		
		    
			for(int i=0; i<name.length; i++) {
				System.out.println("학생 이름을 적으세요");
				name[i] = scanner.next();
				System.out.println("학생 번호를 입력하세요");
				num[i] = scanner.nextInt();
				System.out.println(name[i] + "의 국어 수학 영어 점수를 입력하세요");
				korean[i] = scanner.nextInt();
				math[i] = scanner.nextInt();
				english[i] = scanner.nextInt();
				sum[i] = korean[i] + math[i] + english[i];
				avg[i] = sum[i]/3;
			}
			System.out.println("이름 \t번호 \t국어 \t수학 \t영어 \t총점 \t평균");
			for(int i=0; i<name.length; i++) {
				System.out.print(name[i] + "\t");
				System.out.print(num[i] + "\t");
				System.out.print(korean[i] + "\t");
				System.out.print(math[i] + "\t");
				System.out.print(english[i] + "\t");
				System.out.print(sum[i] + "\t");
				System.out.println(avg[i]);
			}
			
	 
	}

}
