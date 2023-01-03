package com.iu.s4.objects2;

public class Monster {
	
	//멤버변수, instance 변수
	int power = 100;
	int hp;
	
	//생성자 Constructor
	public Monster() {
		//매개변수가 없는 생성자 -> 기본생성자,default Constructor
		this.power = 50;
		this.hp = 60;
		System.out.println("생성자 실행");
		//객체를 만들때 딱 한번 호출
	}
	
	//멤버 메서드, instance method (행위)
	
	public boolean checkValue(Monster monster) {  //boolean -> return타입 
		//나의 power와 같고, 나의 hp가 같다면 true 리턴, 다르면 false
		if(monster.hp == this.hp && monster.power == this.power) {
			return true;
		}else {
			return false;
		}
	}
	
	public void info(int a) { //오버로딩
		
	}
	//공격
	
	//어슬렁
	public void info() {
		System.out.println(this);
		//참조변수 this : class내에서만 사용 가능, 생성된 객체주소를 담음
		
		System.out.println(this.power);
		//this 생략가능
		System.out.println(hp);
		
		this.attack(); //atack메서드 호출 , this 생략가능
	}
	
	public void attack() {
		System.out.println("공격합니다");
		//this.info(); -> 끝나지 않는다(무한반복)
	}
	
	public void setHp(int hp) { //매개변수,지역변수 hp -> stack에 저장 , 멤버변수 hp -> heap에 저장
		this.hp = hp; //this 생략 불가능
		
	}
	
}
