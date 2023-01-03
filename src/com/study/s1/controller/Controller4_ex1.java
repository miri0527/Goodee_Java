package com.study.s1.controller;

import java.util.Scanner;

public class Controller4_ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//범위를 판단할 경우: if
		//같다를 판단할 경우: if,switch
		
		while(true) {
			System.out.println("평균을 입력");
			int avg = scanner.nextInt();
			char grade=  ' ';
			
			if(avg>100) {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			switch(avg/10) {
			 case 9 : case 10 :
				 grade = 'A';
				 	break;
				 	
			 case 8 :
				 grade='B';
				 	break;
				 	
			 case 7 :
				 grade='C';
				 break;
				 
			 default : 
				grade = 'F';
				break;
			}
			
			System.out.println("학점은: " + grade);
			break;

		}
		
	}

}
