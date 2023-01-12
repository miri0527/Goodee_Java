package com.study.s3.array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		//키보드로부터 삭제하고 싶은 값을 입력받기
		Scanner scanner = new Scanner(System.in);
		
		int [] ar = {8,5,13,9,6}; //5 ar[2]
		int [] copy = new int[ar.length -1];//4 { , , ,}
		int idx = 0;
		
		System.out.println("삭제하고 싶은 값을 입력하세요");
		int remove = scanner.nextInt();
		
		for(int i=0; i<ar.length; i++) { //0,1,2,3
			if(ar[i] == remove) { //두번째가 13이라면
				continue;
			}
			copy[idx] = ar[i];
			idx++;
		}
		ar=copy;
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
