package ccom.study.s3.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int [] ar = new int[3];
		//int [] ar2 = new int[]; -> 몇 개를 만들지 선언해야함
		
		
		//키보드로부터 숫자를 입력 받아서 해당 숫자 만큼 배열 생성
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int [] ar2 = new int[num];
		
		
		for(int i=0; i<ar2.length; i++) {
			System.out.println(i+1 + " 번째 숫자를 입력");
			ar2[i] = scanner.nextInt();
		}
		
		for(int i=0; i<ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
		
		//System.out.println(ar[4]); // ->에러
	}

}
