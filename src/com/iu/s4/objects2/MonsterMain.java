package com.iu.s4.objects2;

public class MonsterMain {

	public static void main(String[] args) {
		Monster mon1 = new Monster(); //생성자(Constructor)메서드
		//모든 클래스는 하나 이상의 성생자가 있어야함
		//클래스 내에 생성자가 없으면 컴파일러가 기본 생성자를 만들어 줌
		
		mon1.power = 10;
		mon1.hp = 100;
		Monster mon2 = new Monster();
		mon2.power = 10;
		mon2.hp = 100;
		
		System.out.println(mon1 == mon2);
		boolean result = mon1.checkValue(mon2);
		
		System.out.println("Result : " + result);
		
//		System.out.println(mon1); //주소다름
//		mon1.info(); //자기 자신의 객체 주소
//		
//		System.out.println(mon2);
//		mon2.info(); 
	}

}
