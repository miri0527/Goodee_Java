package com.iu.s4.objects5.characters;

public class Character {
	
	private String name;
	private int hp;
	private int level;
	
	public Character() {} //완벽하게 알기 전까지는 기본 생성자 생성해놓는게 좋음
	
	public void attack() {
		System.out.println("공격");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
}
