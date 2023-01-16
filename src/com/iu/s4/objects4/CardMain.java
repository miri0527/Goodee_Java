package com.iu.s4.objects4;

public class CardMain {

	public static void main(String[] args) {
		//메서드 영역=static 영역 -> 자바는 static 영역,stack영역,heap영역 
		//static영역 -> 변수 선언을 하지 않았기에 주소를 모름 -> 접근은 클래스명.변수명으로 접근 -> 객체를 만들기도 전에 메모리에 저장
		//어느 변수가 어디에 저장되는지 찾아보기
		System.out.println(Card.size);
		Card.staticMethod();
		
		Card card = new Card();
		card.setShape("Heart");
		card.setColor("Red");
		card.setNumber(1);
		Card.size = 8;
		
		Card card2 = new Card();
		card2.setShape("Spade");
		card2.setColor("Black");
		card2.setNumber(12);
		
		card.info();
		card2.info();

	}

}
