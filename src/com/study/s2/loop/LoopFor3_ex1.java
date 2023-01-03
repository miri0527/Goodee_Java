package com.study.s2.loop;

import java.util.Scanner;

public class LoopFor3_ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//분과 초를 입력받아서
		//해당 분 초가 되면 반복문을 모두 종료
		
		System.out.println("분을 입력하세요");
		int miniute = scanner.nextInt();
		System.out.println("초를 입력하세요");
		int second = scanner.nextInt();
		boolean check = false;
		
//		for(int b=0; b<60; b++) {
//			for(int s = 0; s<60; s++) {
//				if(b > miniute) { //3
//					break;
//				}
//				if(b == miniute) {
//					 if(s>second) {
//						 break;
//					 }
//				}
//				
//				System.out.println(b + "분 " + s + "초");
//			}		
//		}
		
//		for(int b=0; b<60; b++) {
//			for(int s=0; s<60; s++) {
//				System.out.println(b + "분 " + s+ "초");
//				
//				if(miniute == b && second == s) {
//					//s=60;
//					//b=60;
//					check = true;
//					break;
//				}
//			}
//			
//			if(check) {
//				break;
//			}
//		}

	}

}
//2분 3초 ->
//0분0초~0분 59초
//1분0초~1분 59초
//2분0초~2분 3초
