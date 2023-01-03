package com.study.s1.controller;

import java.util.Scanner;

public class Controller2_ex2 {

	public static void main(String[] args) {
		//국어 수학 영어 점수 입력해서 평균 60점 이상이면 합격 단, 한 과목당 40점 미만이면 불합격
		Scanner scanner = new Scanner(System.in);
		
		int score[] = new int[3];
		
		int total=0;
		double avg=0.0;
		
		System.out.println("국어 영어 수학 점수입력");
		
			for(int i=0; i<score.length; i++) {
				score[i] = scanner.nextInt();
				total+=score[i]; //합계 
				avg = total/score.length; //평균
			}
			
			for(int i=0; i<score.length; i++) {
				if(avg>=60) {
					System.out.println("합격");
					if(score[i]>=40) {
						System.out.println("합격");
						break;
					}else {
						System.out.println("불합격");
					}
				}else {
					System.out.println("불합격");
					return;
				}
				
				break;
			}
		
	}

}
