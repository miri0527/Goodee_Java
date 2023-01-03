package com.iu.s4.objects;

public class ObjectsMain {

	public static void main(String[] args) {
		System.out.println("Start");
		//main은 프로그램을 실행 목적
		//Test 목적
		//main은 어느 클래스 안에 있던지 상관 없음
		
		//학생 한명 생성
		//객체 생성
		//변수 선언과 거의 동일
		//클래스명 변수명 = new 클래스명(); 객체 생성
		Student student = new Student() ; //student변수에 Student를 담는다
		student.name="test"; //student의 이름 String은 null로 초기화가 이루어짐 
		student.num=20; //student의 num
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg); //Heap에 만들어진 애들은 초기화가 자동으로 이루어짐
		
		//학생 객체 생성
		Student student2 = new Student(); 
		student2.name = "iu"; //"test"
		student.num = 30; //20
		
		System.out.println(student == student2); //이름과 번호가 같아도 주소값이 달라서 다르다
		
		student = student2;
		System.out.println(student.name); //iu
		student.name = "winter";
		System.out.println(student2.name); //winter -> 같아졌기 때문에 대입을 해도 같이 이동한다
		
		//가비지 collector
		
		
		
		
		System.out.println("Finish");

	}

}
