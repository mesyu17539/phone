package com.phone.jse.domain;

public class IPhoneBean extends CelPhoneBean{
	protected String data; //default : dynamic ram 에 담는다
	private final static String KIND="스마트폰",BRAND="아이폰";//final불변 상수, 상속불가 static 공용 //static : HDD 담는다
	@Override
	public String toString() {
		//Area
		return String.format("%s이기 때문에 %s에서 %s으로 %s에게 "
				+ "%s 이라고 문자를 보냄",
				KIND, move, BRAND, call,data);
	}
	public String getData() {
		return data;
	}
	void setData(String data) {
		setMove("이동");
		this.data = data;
	}
}
