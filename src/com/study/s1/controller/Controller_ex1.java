package com.study.s1.controller;

import java.util.Scanner;

public class Controller_ex1 {

	public static void main(String[] args) {
		//키보드로부터 국어,영어,수학 점수 입력 받음
		//총점과 평균 계산
		
		//평균이 90점이상이면 A 출력
		//평균이 80점이상이면 B 출력
		//평균이 70점이상이면 C 출력
		//그 외 나머지 F출력
		
		Scanner scanner = new Scanner(System.in);
		int score[] =  new int[3];
		
		int total = 0;
		double avg = 0.0;
		char grade=' ';
		
		System.out.println("국어 영어 수학 점수 입력");
		
		//String score[] = scanner.nextLine().split(" "); //score을 띄어쓰기로 분리
		
		
		while(true) {
			for(int i=0; i<score.length; i++) {
				score[i] = scanner.nextInt();
				total +=score[i];
				avg = total/score.length;
			}
			
			if(avg>=90) {
				grade = 'A';
			}
			if(avg>=80 && avg<90) {
				grade = 'B';
			}
			if(avg>=70 && avg<80) {
				grade = 'C';
			}
			if(avg<70) {
				grade = 'F';
			}
			
			System.out.println("학점은: " + grade + "입니다");
		}
		
	}

}
