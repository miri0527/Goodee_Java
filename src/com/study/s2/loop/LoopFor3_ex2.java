package com.study.s2.loop;

import java.util.Scanner;

public class LoopFor3_ex2 {

	public static void main(String[] args) {
		//배그
		//총알 30발 -> 1탄장
		//캐릭터당 ->  기본 3탄장
		
		//1. 단발로 할꺼냐
		//2. 점사로 할꺼냐 선택
		
		//1번이면 "탕" 30번 반복 출력
		//2번이면 "타타탕" 10번 반복 출력
		
		
		//1. 1번이나 2번을 선택하는 것을 작성
		//2. 1번선택
		//3. 1번을 선택하면 탕 -> 30번 출력
		//4. 다시 1번으로 돌아간다
		
		Scanner scanner = new Scanner(System.in);
		
		
//		for(int i=0; i<3; i++) {
//			System.out.println("");
//			System.out.println("1번이나 2번을 선택하세요");
//			int num=scanner.nextInt();
//			
//			if(num == 1) {
//				for(int j=1; j<=30; j++) {
//					System.out.println(j + "/30" + "탕");
//					if(j==30) {
//						System.out.println("탄창이 다 소비되었습니다");
//					}
//				}
//			}
//			
//			if(num == 2) {
//				for(int j=1; j<=10; j++) {
//					System.out.println(j + "/30 " + "타타탕" + " ");
//					if(j==30) {
//						System.out.println("탄창이 다 소비되었습니다");
//					}
//				}
//			}
//			
//		}
		
		for(int i=0; i<3; i++) {
			System.out.println("1.단발    2.점사");
			int select = scanner.nextInt();
			
			System.out.println(select);
			int count=10;
			String sound = "타타탕";
			
			if(select == 1) {
				sound="탕";
				count = 30;
						
			}
			
			for(int j=0; j<count; j++) {
				System.out.println(j+1 + "번째 총알");
			}
		}
		

	}

}
