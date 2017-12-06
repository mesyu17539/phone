package com.phone.jse.domain;

public class CelPhoneBean extends PhoneBean{
	protected String move;
	public void setMove(String move) {
		this.move=move;
	}
	public String getMove() {
		return this.move;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s 제품의 %s하며 %s에게 전화 거는중", comany, move, call);
	}
}
