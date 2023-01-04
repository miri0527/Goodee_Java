package com.iu.s4.objects3.p1;

public class Member {
	
	//비만관리 회원등록
	private String name;
	private int age;
	private double height;
	private double weight;
	private boolean check;
	
	public boolean isCheck() {
		return check;
	}

	
	public void setCheck(boolean check) {
		this.check = check;
	}

	public Member() {
		
	}
	
	public Member(int age) {
		if(age > 0 || age<200) {
			this.age = age;
		}
	}
	
	
	
	
	//set+변수명의 첫글자를 대문자로 바꾼 것
	public void setAge(int age) { //setter메서드
		if(age>0 && age<200) {
			this.age = age;
		}
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		if(height > 0 && height < 250) {
			this.height = height;
		}
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//get+변수명의 첫글자를 대문자로 바꾼 것
	public int getAge() { //getter메서드
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void info() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
}
