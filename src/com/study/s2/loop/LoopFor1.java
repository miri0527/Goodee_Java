package com.study.s2.loop;

import java.util.Scanner;

public class LoopFor1 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복문 횟수를 입력하세요");
		
		int num = scanner.nextInt();
		
		for(int i=0; i<num; i+=3) {
			System.out.println("안녕");
		}
		
		System.out.println("프로그램 종료");

	}

}
