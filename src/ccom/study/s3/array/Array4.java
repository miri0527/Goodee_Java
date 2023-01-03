package ccom.study.s3.array;

public class Array4 {

	
	public static void main(String[] args) {
		int [] ar1 = {1,2,3};
		//새로운 배열 생성
		//깊은 복사 -> 값 자체를 복사
		int [] copy = new int[ar1.length+1]; //ar1개수가 변할 수 있다는 가정하에 생성
		
		for(int i=0; i<ar1.length; i++) {
			copy[i] = ar1[i];
		}
		
		copy[copy.length-1] =4;
		
		ar1 = copy;
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}

	}

}
