package com.phone.jse.domain;

public class CelPhoneBean extends PhoneBean{
	protected boolean portable;
	protected String move;
	public void setMove(String move) {
		this.move=move;
	}
	public String getMove() {
		return this.move;
	}
	public void setPortable(boolean portable) {
		this.setMove(portable?"이동":"정지");
		this.portable=portable;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s 제품의 %s하며 %s에게 전화 거는중", comany, move, call);
	}
}
