package com.iu.s4.objects2;

public class OverTest {
	
	//매개변수 두개를 받아서 + 한 결과를 return
	//오버로딩 ->이름, 매개변수 타입
//	public void hap(int b, int a) {
//		System.out.println(a+b);
//	}
	
	
	public int hap(int a, int b) { //리턴해주면 무조건 호출에 변수에 넣어줌
		return  a+b;
	}
//	
//	public double hap(int a, double b) {
//		return a+b;
//	}
//	
//	public String hap(String a, int b) {
//		return a+b;
//	}
}
