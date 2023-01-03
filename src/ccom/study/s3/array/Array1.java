package ccom.study.s3.array;

public class Array1 {

	public static void main(String[] args) {
		//기본타입 
		//숫자(정수형 -> byte.short,int,long,실수형 -> float,double), 
		//문자(char), 논리형(boolean)
		//reference type
		//String
		//배열 -> 그림그려보기
		
		double d1 = 1.2; //변수선언 + 초기화
		d1 = 5.3;
		//stack에 들어감
		
		//변수선언 공식
		//데이터타입 변수명;
		if(d1 > 0) {
			int num=10;
		}
		
		//배열선언 공식
		//모을려고 하는 데이터타입 [] 변수명
		
		double [] array = {1.2,5.2,6.3}; //double 배열 타입
		double [] ar = new double[2]; //몇개의 데이터를 넣을지가 들어감 new -> Heap영역에 저장
		int [] ar2 = new int[3];
		//array = d1; //->에러
		//Heap에 들어감
		System.out.println(d1);
		System.out.println(array); //메모리의 주소값
		//첫번째 방: 0 두번째 방: 1 세번째 방: 2 ....
		
		
		ar[0] = 3.3;
		ar[1] = 5.2; 
		
		System.out.println(ar[0]);
		System.out.println(ar2[0]); //Heap영역에 만들어지는 것들은 초기화가 반자동으로 이루어진다
		
		int [] ar3 = {1,2,3}; //보통 반복문이랑 같이 쓰임
		int ar4 [] = {2,3,4};
		//index
		for(int i=0;i<ar3.length; i++ ) { //for문 횟수가 정해져있을 때
			System.out.println(ar3[i]);
		}
		
		
		
		
		
	}

}
