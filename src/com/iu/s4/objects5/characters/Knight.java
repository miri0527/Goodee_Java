package com.iu.s4.objects5.characters;

public class Knight extends Character implements AttackAble{

	int strong;
	
	Item item = new Staff();
	//Sword sword; -> 칼말고 도끼도 들고싶고 그러면 Item이라는 새로운 변수를 선언하고 Staff 생성자를 생성
	
	@Override
	public void attack() {
		item.a();
		
	}
	
}
