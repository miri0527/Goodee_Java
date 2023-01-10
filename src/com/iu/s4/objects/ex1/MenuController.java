package com.iu.s4.objects.ex1;

import java.util.Scanner;

public class MenuController {

	//start
			//1. 학생 정보 입력
			//2. 수정
			//3. 학생 전체 정보 출력
			//4. 종료
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		System.out.println("학생 수를 입력하세요");
		int count = scanner.nextInt();
		Student [] students = new Student[count]; //Student타입을 받기 위한 배열
		
		StudentView sv = new StudentView();
		StudentInput si = new StudentInput();
		
		
		while(check) {
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 찾기");
			System.out.println("3.학생 전체 정보 출력");
			System.out.println("4.학생 추가");
			System.out.println("5.종료");
			
			int select = scanner.nextInt();
			switch(select) {
			case 1:
				System.out.println("학생 정보 입력");
				si.setAllStudents(students);
				
				break;
			case 2:
				System.out.println("학생을 찾으세요");
				Student student = si.findStudent(students);
				if(student !=null) {
					sv.view(student);
				}else {
					System.out.println("그런 학생은 없어요");
				}
				break;
			case 3:
				sv.view(students); //인자값
				break;
			case 4:
				students = si.setStudent(students); //대입을 해주지 않으면 기존 주소값이 그대로 이기 때문에 대입을 해주어 변경시켜줌 
				break;
			default :
				System.out.println("종료");
				check=false;
				break;
			}
		}
	}
	
	
//	public void add() {
//		System.out.println("등록");
//	}
//	
//	public void update() {
//		System.out.println("수정");
//	}
//	
//	public void delete() {
//		System.out.println("삭제");
//	}
//	
//	public void exit() {
//		System.out.println("종료");
//	}
	
}
