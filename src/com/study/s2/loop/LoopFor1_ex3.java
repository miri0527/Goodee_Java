package com.study.s2.loop;

import java.util.Scanner;

public class LoopFor1_ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		int sum=0;
		//로그인 시도 총 5번 시도가능
		
		//반복문 종료 후 
		//로그인이 성공 했으면 "환영합니다" 메세지 출력
		//로그인이 실패 했으면 "은행 방문하세요"  메세지 출력
		
		for(int i=0; i<5; i++) {
			System.out.println("아이디를 입력하세요");
			int userId = scanner.nextInt();
			System.out.println("비밀번호를 입력하세요");
			int userPw = scanner.nextInt();
			
			if(userId == id && userPw == pw) {
				i=5;
				sum=1; //참이냐 거짓이냐를 구분
			}
		}
		
		if(sum ==1) {
			System.out.println("환영합니다");
		}else {
			System.out.println("은행 방문하세요");
		}

	}

}
