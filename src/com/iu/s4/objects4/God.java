package com.iu.s4.objects4;

public final class God { //클래스앞에 final은 상속에서 이 클래스는 사용하지마라
	private static final String MY_NAME = ""; //더 이상 값이 바뀌지 않는 상수처럼 사용하여라, 변수명 대문자로 이름짓기 
	
	private  static God god;
	
	private God() {}
	
	public static God getInstance() { //객체를 만들려고 해도 private 이기 때문에 객체 없이 만들수있는 없기때문에 static안에 객체를 생성해서 return 해준다
		
		if(God.god == null) {
			god = new God();
		}
		
		return God.god; //= new God() 객체를 생성한 주소 호출 
		//god이 null이 아니면 계속 god 값이 리턴됨
	}

	public final String getName() { //상속 시 오버라이딩 하지마라
		return MY_NAME;
	}

	public void setName(String name) {
		this.MY_NAME = name;
	}
	//final,abstract,static -> 그 외 지정자
	//abstract 
	//클래스 선언부 -> 클래스는 상속해서 사용
	//멤버메서드 선언 -> 오버라이딩 사용
	
}
