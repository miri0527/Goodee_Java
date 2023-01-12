package com.study.s3.array;

public class Array5 {

	public static void main(String[] args) {
		int [] ar1 = {1,2,3};
		int [] copy = new int[ar1.length-1]; //2개 만들어짐
		
//		for(int i=0; i<copy.length; i++) {
//			copy[i] = ar1[i]; 
//		}
//		
//		ar1 = copy;
//		
//		for(int i=0; i<ar1.length; i++) {
//			System.out.println(ar1[i]);
//		}
		
		for(int i=0; i<copy.length; i++) {
			if(i == 1) {
				copy[i] = ar1[i+1];
			}else {
				copy[i] = ar1[i];
			}
		}
		
		ar1 = copy;
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}

	}

}
