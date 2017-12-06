package com.phone.jse.domain;

public class PhoneBean {
	protected String comany;
	protected String call;
	public String getComany() {
		return comany;
	}
	public void setComany(String comany) {
		this.comany = comany;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	@Override
	public String toString() {
		return String.format("%s 제품으로 %s에게 전화를 걸다", comany, call);
	}
}
