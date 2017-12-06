package com.phone.jse.domain;

import javax.swing.JOptionPane;

public class PhoneController {
	public static void main(String[] args) {
		PhoneBean pBean=null;
		CelPhoneBean celPhoneBean=null;
		IPhoneBean iPhoneBean=null;
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴] [0] 종료 [1] 일반전화 [2] 휴대폰 [3] 아이폰")) {
			case "0": return;
			case "1": 
				//[금성] 전화기로, [홍길동]에게 전화를 걸다
				pBean=new PhoneBean();
				pBean.setComany(JOptionPane.showInputDialog("어디 제품?"));
				pBean.setCall((JOptionPane.showInputDialog("누구에게 거시겠습니까")));
				JOptionPane.showMessageDialog(null, pBean.getComany()+"의 "+pBean.getCall());
				break;
			case "2":
				//[이동] 상태에서 [노키아 휴대폰]으로 [홍길동]에게 전화를 걸다
				celPhoneBean=new CelPhoneBean();
//				if(JOptionPane.showInputDialog("휴대폰 맞습니까? (맞으면 1, 틀리면 0").equals("1")) {
//					celPhoneBean.setPortable(true);
//				}else {
//					celPhoneBean.setPortable(false);
//				}
				celPhoneBean.setMove((JOptionPane.showInputDialog("휴대폰 맞습니까? (맞으면 Y, 틀리면 N").equals("Y"))?"이동 상태에서":"정지 상태에서");
				celPhoneBean.setComany(JOptionPane.showInputDialog("어디제품?"));
				celPhoneBean.setCall(JOptionPane.showInputDialog("누구에게 겁니까"));
				JOptionPane.showMessageDialog(null, (celPhoneBean.toString()));
				break;
			case "3" :
				iPhoneBean=new IPhoneBean();
				iPhoneBean.setCall(JOptionPane.showInputDialog("누구에게 겁니까"));
				iPhoneBean.setData(JOptionPane.showInputDialog("무슨 문자를 보내시겠습니까"));
				JOptionPane.showMessageDialog(null, iPhoneBean.toString());
				break;
			}
		}
	}
}
