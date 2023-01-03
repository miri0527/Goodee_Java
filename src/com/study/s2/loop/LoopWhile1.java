package com.study.s2.loop;

import java.util.Random;
import java.util.Scanner;

public class LoopWhile1 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		int num=random.nextInt(2);
		
		while(check) {
			System.out.println("숫자를 입력하세요");
			int a = scanner.nextInt();
			
			if(num == a ) {
				System.out.println("맞췄습니다!");
				check =false;
				//break
			}else {
				System.out.println("틀렸습니다");
			}
		}
	}

}
