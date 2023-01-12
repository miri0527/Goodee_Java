package com.iu.s4.objects;

import java.util.Scanner;

public class ObjectMain3 {

	public static void main(String[] args) {
		//객체 생성해야 접근 가능
		
		//n명의 학생 객체 생성
		Scanner scanner = new Scanner(System.in); //객체 생성하는 것
		System.out.println("학생 수를 입력하세요");
		
		int count = scanner.nextInt(); //2 입력
		//Student student = null; //클래스도 데이터타입
		
		Student[] students = new Student[count];
		//Student[] students2 = new Student[count];
		
	    Student student; //내가 원하는 수 만큼 객체 생성
		for(int i=0; i<students.length; i++) {
			student = new Student(); //students.length의 개수만큼 객체 생성해야함
			System.out.println(i+1 + "번째 학생의 이름을 입력하세요");
			
			student.name = scanner.next();
			students[i] = student; //학생객체를 객체 배열에 넣기
		}
		
		for(int i=0; i<students.length; i++) {
			//System.out.println(students[i]);
			System.out.println(students[i].name);
			//System.out.println(students2[i].name); //에러 -> heap은 자동으로 null값이 생성되는데 꺼내려고 보니까 값이 없어서 nullpointer에러가 뜬다
		}
		//System.out.println(student.name);
		System.out.println("종료");

	}

}
