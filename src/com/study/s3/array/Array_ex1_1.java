package com.study.s3.array;

import java.util.Scanner;

public class Array_ex1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("학생 수를 입력하세요");
		int student = scanner.nextInt();
		
		String [] name = new String[student];
		
		for(int i=0; i<name.length; i++) {
			System.out.println("학생 이름을 적으세요");
			name[i] = scanner.next();
		}
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
	
    }
}
