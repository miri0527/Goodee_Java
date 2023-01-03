package com.study.s2.loop;

import java.util.Scanner;

public class LoppFor1_ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 학생 수를 입력 받고
		// 학생 수 만큼 점수를 입력받아서
		// 총 합계 출력

		
//		
//		  System.out.println("학생 수를 입력받으세요"); int student = scanner.nextInt();
//		  
//		  System.out.println("점수를 입력하세요"); int score [] = new int[student];
//		  
//		  int sum=0;
//		  
//		  for(int i=0; i<score.length; i++) { score[i] = scanner.nextInt();
//		  sum+=score[i]; } System.out.println("학생의 총합 점수는: " +sum + "입니다");
//		 
		 
//		while (true) {
//			System.out.println("학생 수를 입력받으세요");
//			int student = scanner.nextInt();
//			int sum = 0;
//
//			for (int i = 0; i < student; i++) {
//				System.out.println(i + 1 + "번쨰 학생의 점수를 입력하세요");
//				int score = scanner.nextInt();
//				sum += score;
//			}
//
//			if (sum == 0) {
//				System.out.println("학생수를 입력하지 않았습니다 다시 입력하세요");
//				continue;
//			} else {
//				System.out.println("합계는 " + sum + " 입니다");
//				break;
//			}
//		}
//      --------------------------------------------------------------------------------		
//	
		System.out.println("초를 입력하세요");
		int second = scanner.nextInt();
		
		for(int i=0; i<60; i++) {
			System.out.println(i + "초");
			
			if(second == i) {
				i += 60;	
			}
		}
//		
//		System.out.println("종료");
		
//		System.out.println("초를 입력하세요");
//		int second = scanner.nextInt();
//		
//		for(int i=0; i<60; i++) {
//			
//			if(second > i-1) {
//				System.out.println(i + "초");
//			}
//		}
//		
//		System.out.println("종료");
		
		

	}

}
