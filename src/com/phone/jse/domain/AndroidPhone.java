package com.phone.jse.domain;

public class AndroidPhone extends IPhoneBean {
	private static String BRAND = "안드로이드폰";
	private String size;
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public void setData(String name, String data) {
		setSize("7인치");
		setComany(BRAND);
		setPortable(true);
		setCall(name);
		this.data = data;
	}
	@Override
	public String toString() {
		//[7인치] 화면사이즈로 [이동] 상태에서 [갤럭시 노트]로 [길동]에게 [안녕]이라고 문자를 보냄
		return String.format("[%s] 화면사이즈로 [%s] 상태에서 [%s]로 [%s]에게 [%s]이라고 문자를 보냄",
				size, move, comany, call, data);
	}
}
