package com.iu.s4.objects;

public class ObjectMain2 {

	public static void main(String[] args) {
		//객체 생성
		
		Sword s1 = new Sword(); //s1 -> 참조변수,지역변수
		s1.name = "집행검"; //String으로 선언되어있기에 reference 타입
		s1.price = 50000;
		s1.damage = 50
				; //int로 선언되어있기에 primitive타입 , 멤버변수(인스턴스 변수) -> Heap영역에 만들어짐 -> 객체 생성 시 만들어짐 
		s1.level = 3; //-> 객체를 가리키는 참조변수가 없을 때 사라짐 멤버 변수가 더 오래 산다
		s1.life = 500;
		
		Knight knight = new Knight();
		knight.name="물주먹";
		knight.hp = 100;
		knight.staminer = 50;
		knight.dex = 30;
		knight.wiz =10;
		
		knight.sword = s1;
		System.out.println(knight.sword.name); //knight가 들고있는 칼의 이름
		
		//변수 선언
		Sword s2 = null; //지역변수, 참조변수 -> 초기화를 해줘야함
		
		System.out.println(s2.damage); //객체를 생성해야 에러가 안뜸

		//지역변수는 초기화 하지 않으면 사용이 불가능
		//멤버변수는 반자동으로 초기화가 된다
	}

}
