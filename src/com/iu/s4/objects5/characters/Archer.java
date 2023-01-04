package com.iu.s4.objects5.characters;

public class Archer extends Character { //상속은 class간의 관계를 설정
	
	private int dex;
	
	public Archer() {
		super(); //기본생성자 호출
		//super(""); //매개변수 있는 생성자 호출
	}
	
	@Override
	public void attack() {
		
	}
	
	public void shoot() {
		System.out.println("활쏘기");
		System.out.println(this.getName());
	}
	
	public void move() {
		System.out.println("이동~~");
	}
	

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}


	

	

}
