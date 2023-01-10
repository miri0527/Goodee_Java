package com.iu.s4.objects6;

public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

	
		System.out.println("fixRobot에서 작성");

		
		Robot robot = new Robot(); //로봇 몸만 생성
		ArmLeft armLeft = new ArmLeft(); //왼쪽팔을 행성 armLeft와 robot은 생명주기 다름 -> 약한연결
		robot.setArmLeft(armLeft); //왼쪽팔 끼워넣기
		
		
		
		System.out.println(robot.getArmLeft()); 
		System.out.println("Right: " + robot.getArmRight()); 
		
		robot = null; //->로봇객체를 없애는 방법
		
		System.out.println("Add Robot에서 작업");
		
		robot = new Robot();
		
		System.out.println(robot);
		

		System.out.println("프로그램 종료");

	}

}
