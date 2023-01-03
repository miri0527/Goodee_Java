package com.study.s2.loop;

public class LoopFor3 {

	public static void main(String[] args) {
		int multipy = 0;
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				multipy = i*j;
				System.out.print(i + "*" + j + "=" + multipy + "  ");
		 }
			System.out.println("");
	 }
		
   }

}
