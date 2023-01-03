package com.iu.s4.objects;

public class MethodTest {
	
	//메서드 선언 공식
	//1.public static void main(String[]args) {}
	//  public -> 접근지정자 [static -> 그외지정자] void->리턴타입 main->메서드명([매개변수들 선언]) {}
    //                       써도되고 안써도되는 것 써도되고 안써도됨
  //   접근지정자: public
	// 그외지정자 : 생략
	// 리턴타입  : void
	// 메서드명  : 작명
	// 매개변수  : 생략
	public void t1() {  //메서드선언 메서드의 header, 선언부
		//{} -> 메서드의 body, 내용
		//제어문, 반복문, 등등등
		System.out.println("t1 메서드 실행시작");
		int num=10;
		System.out.println("T1 Num : " + num);
		
		
		System.out.println("t1 메서드 종료");
		
	} 
	
	//t2 메서드 선언
	public void t2() {
		System.out.println("t2 메서드 실행시작");
		int num = 20;
		System.out.println("T2 Num: " + num);
		
		System.out.println("t2 메서드 종료");
	}
 
}