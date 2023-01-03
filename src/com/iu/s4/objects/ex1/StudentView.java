package com.iu.s4.objects.ex1;


public class StudentView {
	//viewList
	//학생들을 받아서 학생의 모든 정보를 출력
	
	//1.학생 한명 출력   2.학생 모든 정보 출력 코드짜기
	public void viewList(Student[] student) {
		for(int i=0; i<student.length; i++) {
			System.out.println("Name: " + student[i].name);
			System.out.println("Num: " + student[i].num);
			System.out.println("Kor: " + student[i].kor);
			System.out.println("Eng: " + student[i].eng);
			System.out.println("Math: " + student[i].math);
			System.out.println("Total: " + student[i].total);
			System.out.println("Avg: " + student[i].avg);
		}
	}
	
	//viewOne 메서드
	//학생 한명을 받아서 학생의 모든 정보를 출력
	
	
	public void viewOne(Student student) {
		System.out.println("Name: " + student.name);
		System.out.println("Num: " + student.num);
		System.out.println("Kor: " + student.kor);
		System.out.println("Eng: " + student.eng);
		System.out.println("Math: " + student.math);
		System.out.println("Total: " + student.total);
		System.out.println("Avg : " + student.avg);
	}
}
