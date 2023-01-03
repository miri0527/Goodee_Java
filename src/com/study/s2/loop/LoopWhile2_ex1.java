package com.study.s2.loop;

import java.util.Random;
import java.util.Scanner;

public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		
		//게임
		//1.로그인
		//2.로그인 한 사용자만 게임 가능
		
		//---------로그인 파트---------
		//1.로그인   2.종료
		// 1.id,pw 입력 후 로그인 판단
		// 2.종료
		
		//--------게임 진행 파트----------
		//1.로그인 성공 했을 때 진행
		//초기 레벨 1로 시작
		//GOLD는 0
		//5렙 달성 시 1000골드 지급
		//10랩 달성 시 2000골드 지급
		//15랩 달성 시 3000골드 지급
		//모든 몬스터의 경험치는 동일 
		//1레벨 -> 2레벨 : 3마리 //만약 레벨이 1씩 증가하면 3마리씩 증가
		//2 -> 3 : 6마리
		//3 -> 4 : 9레벨...
		//14 -> 15 : 52마리
		//만렙달성 축하, 현재 골드 출력
		//몬스터 한마리 잡을 때 마다 '사냥했습니다'라는 메세지 띄우기
		//15레벨이 되면 프로그램 종료
		
		Scanner scanner = new Scanner(System.in);
		
		
		boolean check = true;
		boolean check2 = true;
		String id = "admin";
		int pwd = 1234;
		
		//로그인 판단
		while(check) {
			System.out.println("1.로그인     2.종료");
			int num = scanner.nextInt();
			if(num == 1) {
				for(int i =0; i<10; i++) {
					System.out.println("아이디를 입력하세요");
					String userId = scanner.next();
					if(!(userId.equals(id))) {
						System.out.println("아이디가 틀렸습니다 다시 입력하세요");
						continue;
					}else {
						break;
					}
				}
				for(int i=0; i<10; i++) {
					System.out.println("비밀번호를 입력하세요");
					int userPw = scanner.nextInt();
					if(userPw!=pwd) {
						System.out.println("비밀번호가 틀렸습니다 다시 입력하세요");
						continue;
					}else {
						break;
					}
				}
				
			}else if(num == 2) {
				System.out.println("종료합니다");
				return;
			}
			break;
		}
		
		//게임 진행
		
//		int level = 1; //초기 레벨
//		int gold = 0; //gold 초기값 0
//		int monsterHp = 30; //몬스터의 피
//		int monster = 1; //몬스터 수
//		
//		int a = 5; //"타타탕"일때 주는 데미지
//		int b = 10; //"타타타타탕"일 때 주는 데미지
//		
//		while(level <=15) {
//			System.out.println("주문을 입력하세요");
//			String magic = scanner.next(); //주문 입력
//			
//			for(int i=0; i<10; i++) {
//				if(magic.equals("타타탕")) {
//					
//					monsterHp-=a; //30-5 25
//					if(monsterHp <=0) {
//						level ++;
//						System.out.println("level " + level + "입니다");
//						break;
//					}
//					System.out.println("몬스터의 피는 " + monsterHp);
//				}else if(magic.equals("타타타타탕")) {
//					
//					monsterHp-=b;
//					if(monsterHp <=0) {
//						level++;
//						System.out.println("level " +level + "입니다" );
//						break;
//					}
//					System.out.println("몬스터의 피는 " + monsterHp);
//				}else {
//					System.out.println("주문이 아닙니다 다시 입력하세요");
//				}
//			break;		
//		  }
//		   for(int m = 0; m<level*3; m++) {
//			   
//		   }
////			
////			
//	  }
		
		if(check) {
			int level = 1;
			int gold = 0;
			
			for(level = 1; level<15; level ++) {
				System.out.println("현재 레벨: " + +level);
			
				if(level%5 == 0) {
					System.out.println(level + "랩 달성 축하금");
					gold = gold  + level/5 * 1000;
				}
				if(level == 5) {
					System.out.println("5랩 달성 축하금");
					gold = gold+1000;
				}
				if(level == 10) {
					System.out.println("10랩 달성 축하금");
					gold = gold+2000;
				}
				
				for(int m=0; m<level*3; m++) { //level*3
					System.out.println(m+1 + "번째 사낭 성공");
				}
				System.out.println("축 레벨업");
			} //바깥 for
			System.out.println(level + "랩 달성 축하");
			gold = gold + 3000;
			System.out.println("Gold : " + gold);
		}
   }

}
