package com.iu.s4.objects3.p1;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		Member member2 = new Member(250);
		member.setAge(30);
		member.setName("안녕");
		member.info();
		//member.name = "iu";
//		int age = 0;
//		
//		if(age>0 && age<200) {
//			member.age = age;
//		}
		
	}

}
