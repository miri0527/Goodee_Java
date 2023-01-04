package com.iu.s4.objects3.p2;

import com.iu.s4.objects3.p1.Secret; //Secret이라는 클래스는 이 패키지애 있다는걸 명시

public class SecretMain {

	public static void main(String[] args) {
		
		Secret secret = new Secret();
		com.iu.s4.objects3.p2.Secret secret2 = new com.iu.s4.objects3.p2.Secret(); 
		//같은 이름의 클래스가 있는데 하나의 메인 안에서 다른 패키지를 받아오려면 한개는 무조건 명시 해줘야한다   
		secret.s1();
		
		//System.out.println(secret.money); -> 오류
		System.out.println(secret.point);
		Test test = new Test();
		System.out.println(test.point);

	}

}
