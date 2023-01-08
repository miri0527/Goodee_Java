package com.study.s2.loop;

public class LoopFor1_ex1 {

	public static void main(String[] args) {
		//0에서 100미만 사이의 짝수만 출력
		//1.첫번째 방법
		for(int i=0; i<100; i+=2) {  
			System.out.println(i);
		}
		
		//2.두번째 방법
		for(int i=0; i<100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("----------");
		
		//0-100미만의 합계를 구하세요
		//0+1+2+.....+99
		
		int sum=0;
		for(int i=0; i<100; i++) {
			sum+=i;
		}
		
		  System.out.println(sum);
		  
		//99에서 0까지의 빼기를 구하세여
		int minus=0;
		for(int i=99; i>0; i--) {
			minus-=i;
		}
		System.out.println(minus);
		
	}

}
