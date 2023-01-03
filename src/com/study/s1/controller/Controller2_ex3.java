package com.study.s1.controller;

import java.util.Scanner;

public class Controller2_ex3 {
	
	//로그인이 성공 했을 때만 실행
			//급여를 입력
			//정규직이면 1을, 계약직이면 2을 입력
			//실급여 계산
			//정규직: 고용보험 2%, 의료보험 3% 국민연금 1% 산재보험 1%
			//계약직: 원청징수 3.3%
			//실급여 출력

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		String word = "로그인 성공!";
		int result=0; //정규직,계약직 급여 계산 값
		
		
		//키보드로 부터 id,pw를 입력받아서 로그인 처리
		while(true) {
			System.out.println("ID를 입력하세요");
			int userId = scanner.nextInt();
			if(userId!=id) {
				for(int i=0; i<10; i++) {
					System.out.println("아이디가 틀렸습니다. 다시 입력하세요");
					break;
				}
				continue;
			}
			
			for(int i=0; i<10; i++) {
				System.out.println("PW를 입력하세요");
				int userPw = scanner.nextInt();
				
				if(userPw!=pw) {
					for(int j=0; j<10; j++) {
						System.out.println("비밀번호가 틀렸습니다.다시 입력하세요");
						break;
					}
					continue;
				}else {
					System.out.println(word);
					if(word.equals("로그인 성공!")) {
						break;
					}
				}
			}
			
			break;	
		}
		
			System.out.println("급여를 입력하세요");
			int salary = scanner.nextInt(); //급여 입력
				
				while(true) {
					System.out.println("정규직이면 1, 계약직이면 2를 입력하세요");
					int company = scanner.nextInt(); //정규직 계약직 구분
					
						if(company == 1) {
							result = (int)(salary-(salary*(0.02+0.03+0.01+0.01))); 
						}else if(company == 2) {
							result = (int)(salary*0.967);
						}else {
							System.out.println("번호가 없습니다 다시 입력하세요");
							continue;
					    }
						
						System.out.println("수령액: " + result);
					  break;
				  }
		
	  }

}
