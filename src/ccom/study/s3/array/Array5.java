package ccom.study.s3.array;

public class Array5 {

	public static void main(String[] args) {
		int [] ar1 = {1,2,3};
		int [] copy = new int[ar1.length -1]; //2개짜리 만들어짐
		
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = ar1[i]; //ar1에서 copy로 값을 집어넣음
		}
		
		ar1 = copy;
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		

	}

}
