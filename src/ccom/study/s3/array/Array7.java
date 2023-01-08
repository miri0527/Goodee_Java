package ccom.study.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []ar = {5,1,4};
		boolean check = true;
		//1 -> 데이터추가
		  //0번 인덱스에 추가
		//2 -> 데이터삭제
		  //0번 인덱스 삭제
		//3 -> 종료   3번 누르기 전까진 반복
		
		while(check) {
			System.out.println("1.데이터추가 2.데이터삭제 3.종료");
			int num = scanner.nextInt();
			
			if(num == 1) {
				System.out.println("추가할 데이터를 입력하세요");
				int data = scanner.nextInt(); //데이터 추가
				int [] copy = new int[ar.length + 1];
				for(int i=0; i<ar.length; i++) {
					copy[i+1] = ar[i];
					copy[0] = data;
				}
				
				ar = copy;
//				for(int i=0; i<ar.length; i++) {
//					System.out.println(ar[i]);
//				}
				
			}else if(num == 2) {
				int [] copy = new int[ar.length-1];
				for(int i=0; i<copy.length; i++) {
					copy[i] = ar[i+1];
				}
				ar = copy;
//				for(int i=0; i<ar.length; i++){
//					System.out.println(ar[i]);
//				
//			}
				
		   }else if(num == 3) {
			   check = false;
		   }
			
			for(int i=0; i<ar.length; i++) {
				System.out.println(ar[i]);
			}

	}
  
   }
}
