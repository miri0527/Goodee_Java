package com.iu.s4.objects2;

public class CarMain {

	public static void main(String[] args) {
	
		Car c1 = new Car(); //-> 에러 개발자가 생성자를 하나 이상 만들면 컴파일러는 자동으로 생성자를 생성하지 않는다
		
		c1.info();
		
		Car c2 = new Car("Red");
		c2.info();
		
		Car c3 = new Car("White", 3000);
		c3.info();
		
		Car c4 = new Car("Blue", 5000, "K9");
		c4.info();
	}

}
