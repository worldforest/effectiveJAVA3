package com.serim.item03.singleton;

public class finalfield {
	//public이나 protected 생성자가 없으므로 finalfield클래스가 하나임이 보장
	public static final finalfield INSTANCE = new finalfield();
	
	//finalfield.INSTANTCE를 초기화할 때 딱 한 번 호출
	private finalfield() {
		
	}
	public void leaveTheBuilding(){
		
	}
}
