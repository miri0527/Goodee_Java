package com.iu.s4.objects2;

public class Car {
	
	String company = "BMW"; 
	String name;
	int price;
	String color;
	
	
	{
		//초기화 블럭 -> 멤버 변수의 초기화 때 보통 사용
		System.out.println("초기화 블럭: " + this.company);
		this.company = "AUDI";
	}
	
	public Car() {
		//this("Black"); //생성자에서 다른 생성자 호출
		System.out.println("생성자 : " + this.company);
		this.company = "Kia";
		this.name = "스포티치";
		this.price = 3500;
		
		this.color = "Black";
	}
	
	public Car(String color) {
		this(color, 3500);
//		this.company = "Kia";
//		this.name = "스포티치";
//		this.price = 3500;
//		this.color = color; //태어날 때 부터 입력한 컬러
	}
	
	public Car(String color, int price) {
		this(color, price,"스포티치");
//		this.company = "Kia";
//		this.name = "스포티치";
//		this.color = color;
//		this.price = price;
	}
	
	public Car(String color, int price, String name) {
		this.company = "Kia";
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public void info() {
		System.out.println("Name : " + this.name);
		System.out.println("Company : " + this.company);
		System.out.println("Price : " + this.price);
		System.out.println("Color : " + this.color);
	}
}
