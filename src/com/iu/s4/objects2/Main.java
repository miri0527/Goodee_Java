package com.iu.s4.objects2;

public class Main {

	public static void main(String[] args) {
		ReturnTest returnTest = new ReturnTest();
		
		returnTest.t1(); //int a대압하면 에러 -> return한게 없기 때문 
		int n = returnTest.t2(); //returnTest.t2메서드에 n을 대입시켜라
		
		System.out.println(n);
		
		int [] r = returnTest.t3();
		

	}

}
