package com.study.s1.controller;

public class Controller4 {

	public static void main(String[] args) {
		//다중 선택문
		//switch case
		//switch(정수식 또는 문자열) {}
		
		int num=3;
		//케이스에 들어가는 값은 무조건 상수
		switch(num) {
		  case 1:
			  System.out.println("1번 선택");
			  break;
		  case 2:
			  System.out.println("2번 선택");
			  break;
		  case 3:
			  System.out.println("3번 선택");
			  break;
			  
		  default:
			  System.out.println("그 외 나머지");
			  break;
		}
	}
}
