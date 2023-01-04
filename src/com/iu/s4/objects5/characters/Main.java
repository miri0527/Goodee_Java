package com.iu.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
//		Magition magition = new Magition();
//		magition.setMp(0);
//		magition.getMp();
//		magition.setHp(10);
//		magition.setName("마법사");
//		magition.attack();
		
		Archer archer = new Archer();
		
		Character character = null; //추상클래스라 객체 만들 수 없음
		
		character = archer; //archer는 character 타입이다
		
		archer = (Archer)character;  //모든 케릭터가 아쳐는 아니기때문에 아쳐라는 것을 형변환
		
		//군인 : 계급,군번,관등성병
		
		//계급,군번,관등성명
		//이병    ,어리버리,관등성명 ->클래스
		//일병    ,일,관등성명 ->클래스
		//상병    ,갈구기,관등성병 ->클래스
		//병장    ,짱박히기,관등성병 ->클래스
		
		//군인 = 이병; -> 가능 모든 이병은 군인이다
		//군인 = 일병
		//군인 = 상병
		//군인 = 병장
		
		//이병 = (이병)군인 모든 군인이 이병이다 x -> 그렇기에 이병이라는 형변환을 해줘야함
		
		//이병.계급, 이병.군번, 이병.관등성명(), 이병.어리버리()
		
		//군인.계급, 군인.군번, 군인.관등성명() -> 군인으로 접근할 수 있는 것은 공통적인 것만 가능

	}

}
