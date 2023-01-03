package com.iu.s4.objects;

public class MethodTest3 {
	
	public void t3(int salary, double tax) { 
		//실급여를 계산하는 메서드
		salary = (int)(salary*tax);
		System.out.println("T3: " + salary);
		
		//매개변수로 메인메서드에서 값을 호출할 수 있는 역할을 한다
	}
	
	public void info(Sword sword) {
		//Sword 모든 정보를 출력
		System.out.println(sword.name);
		System.out.println(sword.damage);
		sword.name = "단도";
	}

	
}
