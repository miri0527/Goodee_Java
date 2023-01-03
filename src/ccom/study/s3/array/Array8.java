package ccom.study.s3.array;

public class Array8 {

	public static void main(String[] args) {
		int [] ar = {5,9,8,6,7};
		
		//9,8,6,5,3 -> 내림차순
		
		int temp = 0;
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length-i-1; j++) { //5-0-1
				if(ar[j+1] > ar[j]) { //ar[4]>ar[5]
					temp = ar[j+1]; //temp=ar[4]
					ar[j+1] = ar[j]; //ar[4]=ar[5]
					ar[j] = temp;  //ar[5]=temp
					
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		
 	}

}
