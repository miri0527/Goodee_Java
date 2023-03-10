package com.iu.s4.objects.ex1;

import java.util.Scanner;

public class StudentInput {
	//findStudent
	//학생배열을 받아서
	//학생의 번호를 입력받아서 일치하는 학생을 리턴
	//없으면 null
	
	public Student findStudent(Student [] students) { //메서드에 없는 외부 데이터를 집어넣는것 -> 매개변수
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 번호를 입력받으세요");
		int num2 = scanner.nextInt(); 
		
		Student student = new Student();
		
		for(int i=0; i<students.length; i++) { //1.최미리 2.안녕
			if(students[i].num == num2) {
				student = students[i]; //
				return student;
			}
		}
		return student;
		 
	}
	
	//setStudent -> 메서드
	//학생한명 객체를 생성해서, 이름,번호,국어,영어,수학 입력
	//총점 평균

	
	public Student [] setStudent(Student [] students) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
			
			System.out.println("이름 입력");
			student.name = scanner.next();
			System.out.println("번호 입력");
			student.num = scanner.nextInt();
			System.out.println("국어 입력");
			student.kor = scanner.nextInt();
			System.out.println("영어 입력");
			student.eng = scanner.nextInt();
			System.out.println("수학 입력");
			student.math = scanner.nextInt();
			
			student.total = student.kor + student.math + student.eng;
			student.avg = student.total/3.0;
		
			Student [] newStudents = new Student[students.length + 1];
			for(int i=0; i<students.length; i++) {
				newStudents[i] = students[i];
			}
			
			newStudents[students.length] = student; //마지막 인덱스에 대입
			return newStudents;
		
	}
	
	//setAllStudents
		//매개변수로 학생배열을 받아서
		//배열의 수만큼 학생 객체를 생성해서 이름,번호,국어,영어,수학 입력
		//총점 평균
		//학생 객체를 배열에 대입
	
	public void setAllStudents(Student[] students) {
		Scanner scanner= new Scanner(System.in);
			Student student;
		for(int i=0; i<students.length; i++) {
			student = new Student(); //Student에서 들고오기
			System.out.println(i+1 + "번째 학생 이름을 입력하세요");
			student.name = scanner.next();
			System.out.println(i+1 + "번째 번호를 입력하세요");
			student.num = scanner.nextInt();
			System.out.println(i+1 + "번째 국어 점수를 입력하세요");
			student.kor = scanner.nextInt();
			System.out.println(i+1 + "번째 영어 점수를 입력하세요");
			student.eng = scanner.nextInt();
			System.out.println(i+1 + "번째 수학 점수를 입력하세요");
			student.eng = scanner.nextInt();
			
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total / students.length;
			
			students[i] = student;
			
		}
		
		for(int i=0; i<students.length; i++) {
//			student = new Student();
//			student = students[i];
			
			System.out.println(i+1 + "번째 학생의 총점은 " + students[i].total);
			System.out.println(i+1 + "번째 학생의 평균은 "+ students[i].avg);
		}
		
	}
	
	
}
