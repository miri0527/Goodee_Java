package com.iu.s4.objects6;

public class Robot { //로봇은 left,right에 의존적이다 -> 로봇은 left,right가 없으면 일을 할 수 없기 때문(defendency)
	//left,right를 robot에 집어넣는 과정 : inject -> defendency inject : 의존성 주입(DI)
	
	private ArmLeft armLeft;
	private ArmRight armRight;
	
	public Robot() {
		this.armRight = new ArmRight(); //팔 끼워넣는 것을 getter setter로 해도되고 클래스 내부에서 생성자를 이용하여도 가능
		//로봇이 생설될때 armRight도 같이 생성, 로봇이 소멸되면 armRight도 같이 소멸 -> 생성주기 같음
		//강한연결
		//setter가 필요가 없을꺼같아서 없애버리면 나중에 팔을 갈아끼우려고 할 때 setter가 없기 때문에 다시 갈아끼우지 못한다
	}
	
	public Robot(ArmRight armRight) {
		this.armRight = armRight; //매개변수가 있기 때문에 외부에서 가져온거라서 약한결합
		//생성자가 여러개 있을 수 있으니까 두가지 방법 다 사용해도 가능
	}
	
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) {
		this.armRight = armRight;
	}
	
}
