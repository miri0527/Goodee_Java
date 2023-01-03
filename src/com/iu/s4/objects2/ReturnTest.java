package com.iu.s4.objects2;

import java.util.Random;

public class ReturnTest {
	
	//return을 만나면 그 즉시 메서드 종료
	//return 다음에 코드 작성 시 에러
	//void 리턴할 께 없다
	
	public void t1() {
		System.out.println("return이 없을 때는 void");
	}
	
	
	public int t2() {
		Random random = new Random();
		System.out.println("return은 int");
		return random.nextInt(50); //0~50 미만
	}
	
	public int [] t3() {
		int [] a = {1,2,3};
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		return a;
	}
}
