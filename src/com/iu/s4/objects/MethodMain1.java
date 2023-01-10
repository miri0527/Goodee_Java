package com.iu.s4.objects;

public class MethodMain1 {

	public static void main(String[] args) {
		System.out.println("Main Method 실행");
		MethodTest mt = new MethodTest();
		MethodTest3 mt3 = new MethodTest3();
		int salary = 3000000;
		//호출시 매개변수로 보내는 값 -> 인자값
		mt3.t3(salary,0.95);
		mt.t1();
		mt.t2();
		
		Sword sword = new Sword(); //Sword 클래스에서 Sword 변수를 가져오기 위하여 객체 선언
		sword.name = "집행검";
		sword.damage=500;
		
		mt3.info(sword); //mt3의 info메서드 호출 -> 인자값으로 sword 가져옴(sword값만 가져오기로 했기 때문)
		System.out.println(sword.name); //어떤 데이터를 보내는 지에 따라 결과값이 달라진다
		
		System.out.println("main : " + salary); //t3에 선언된 salary는 메서드가 실행되고 삭제, 그리고 main에 있는 salary는 값을 건들인 적이 없으니 그대로 나온다
		//메서드를 호출한다
		//mt.t1(); //main은 일시정지
		//mt.t2();
		
		
		System.out.println("Main Method 종료");
		
	}

}
