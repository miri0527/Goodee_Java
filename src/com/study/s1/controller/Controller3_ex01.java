package com.study.s1.controller;

import java.util.Random;
import java.util.Scanner;

public class Controller3_ex01 {

	public static void main(String[] args) {
		//1.HP보충 2.MP(보충) 3.공격 4.마법2 5.턴을 넘기기
		//HP는 최댜 40이 끝
		//보충 시 랜덤하게 0~40사이의 숫자를 받아서 HP에 더하기
		//MP동일
				
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String name = "핫팩";
		int hp = 20; //초기값
		int hpResult = 0;
		
		int mp = 20; //초기값
		int mpResult=0;
		
		
		String monsterName = "오크";
		int monsterHp = 10;
		int monsterMp = 10;
		
		while(true) {
			System.out.println("1.HP보충 2.MP(보충) 3.공격 4.마법2 5.턴을 넘기기");
			int num = scanner.nextInt();
				if(num == 1) {
					int hpRandom = random.nextInt(40); //0-39
					hpResult = hp + hpRandom;
					if(hpResult > 40) {
						System.out.println(40);
					}else {
						System.out.println(hpResult);
					}
					
					
				}else if(num == 2) {
					int mpRandom = random.nextInt(40);
					mpResult = mp + mpRandom;
					
					if(mpResult > 40) {
						System.out.println(40);
					}else {
						System.out.println(mpResult);
					}
					
					
			   }else if(num == 3) {
				   //주문을 외우기
				   //3씩 감소
				   //0-5이하의 수치를 공격
				   int a = random.nextInt(6); //내가 데미지를 주는 수치
				   monsterHp-=a;
				  System.out.println(name + "은(는)" + monsterName + "에게 " + a + " 의 데미지를 주었다");
				   
			   }else if(num == 4) {
				   //주문을 외우기
				   //5씩 감소
				   //0-10이하의 수치를 공격
				   int a = random.nextInt(11); //내가 데미지를 주는 수치
				   monsterHp-=a;
				   System.out.println(name + "은(는)" + monsterName + "에게 " + a + " 의 데미지를 주었다");
				  
			   }else if(num == 5) {
				   System.out.println("턴을 넘깁니다");
				   
			   }else {
				 	System.out.println("번호가 없습니다 다시 입력해주세요");
			    }
				
			continue;
			
		  }
		
	}

}
