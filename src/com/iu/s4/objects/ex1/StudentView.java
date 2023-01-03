package com.iu.s4.objects.ex1;


public class StudentView {
	//viewList
	//학생들을 받아서 학생의 모든 정보를 출력
	
	//1.학생 한명 출력   2.학생 모든 정보 출력 코드짜기
	public void view(Student[] students) {
		for(int i=0; i<students.length; i++) {
			Student student = students[i];
			
//			System.out.println("Name: " + students[i].name);
//			System.out.println("Num: " + students[i].num);
//			System.out.println("Kor: " + students[i].kor);
//			System.out.println("Eng: " + students[i].eng);
//			System.out.println("Math: " + students[i].math);
//			System.out.println("Total: " + students[i].total);
//			System.out.println("Avg: " + students[i].avg);
			
			this.view(student);
			
			
		}
	}
	
	//viewOne 메서드
	//학생 한명을 받아서 학생의 모든 정보를 출력
	
	public void view(Student student) {
		System.out.println("Name: " + student.name);
		System.out.println("Num: " + student.num);
		System.out.println("Kor: " + student.kor);
		System.out.println("Eng: " + student.eng);
		System.out.println("Math: " + student.math);
		System.out.println("Total: " + student.total);
		System.out.println("Avg : " + student.avg);
	}
}
