package com.study.s1.controller;

import java.util.Scanner;

public class Controller2_ex1 {

	public static void main(String[] args) {
		//회원 가입 할 때 입력한 ID,PW
		int id= 1234;
		int pw = 5678;
	
		Scanner scanner = new Scanner(System.in);
		
	
		while(true) {
			System.out.println("아이디를 입력하세요");
			int userId = scanner.nextInt();
			if(userId!=id) {
				for(int i=0; i<10; i++) {
					System.out.println("아이디가 틀렸습니다 다시 입력하세요");
					break;
				}
				continue;
			}
			
			System.out.println("비밀번호를 입력하세요");
			int userPw = scanner.nextInt();
		}
			
		
	}

}
