package ccom.study.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] ar = {5,1,4};
		boolean check = true;
		int index = 0;
		
		//1 -> 데이터추가
		  //0번 인덱스에 추가
		//2 -> 데이터삭제
		  //0번 인덱스 삭제
		//3 -> 종료   3번 누르기 전까진 반복

		while(check) {
			System.out.println("1.데이터 추가 2.데이터 삭제 3.종료");
			int num = scanner.nextInt();
			if(num == 1) {
				System.out.println("데이터를 추가하세요"); 
					int data=  scanner.nextInt();
					int [] copy = new int[ar.length + 1];  //1개 추가 copy[4]
					
					copy[0] = data;
					for(int i=0; i<ar.length; i++) { //데이터 추가 -> 0번 인덱스에 추가 -> 
						copy[i+1] = ar[i]; //copy[1] = ar[0] copy[2] = ar[1] copy[3] =ar[2] copy[4] = ar[3]
				
				}
					ar = copy;
				
			}else if(num == 2) {
				int remove = scanner.nextInt();
				int[] copy = new int[ar.length-1];
				
				
			}
			for(int i=0; i<ar.length; i++) {
				System.out.println(ar[i]);
			}
		}
	}

}
