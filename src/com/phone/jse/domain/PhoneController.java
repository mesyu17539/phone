package com.phone.jse.domain;

import javax.swing.JOptionPane;

public class PhoneController {
	public static void main(String[] args) {
		PhoneBean pBean=null;
		CelPhoneBean celPhoneBean=null;
		IPhoneBean iPhoneBean=null;
		AndroidPhone androidPhone=null;
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴] [0] 종료 [1] 일반전화 [2] 휴대폰 [3] 아이폰 [4] 안드로이드")) {
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
				celPhoneBean.setPortable((JOptionPane.showInputDialog("휴대폰 맞습니까? (맞으면 Y, 틀리면 N").equals("Y"))?true:false);
				celPhoneBean.setComany(JOptionPane.showInputDialog("어디제품?"));
				celPhoneBean.setCall(JOptionPane.showInputDialog("누구에게 겁니까"));
				JOptionPane.showMessageDialog(null, (celPhoneBean.toString()));
				break;
			case "3" :
				iPhoneBean=new IPhoneBean();
				iPhoneBean.setData(JOptionPane.showInputDialog("무슨 문자를 보내시겠습니까"),
						JOptionPane.showInputDialog("이름은 무엇입니까"));
				JOptionPane.showMessageDialog(null, iPhoneBean.toString());
				break;
			case "4":
				/*누구에게 문자 보내나, 뭐라고 보내나
				 *[7인치] 화면사이즈로 [이동] 상태에서 [갤럭시 노트]로 [길동]에게 [안녕]이라고 문자를 보냄*/
				androidPhone=new AndroidPhone();
				androidPhone.setData(JOptionPane.showInputDialog("누구에게?"),
						JOptionPane.showInputDialog("문자를 입력"));
				JOptionPane.showMessageDialog(null, androidPhone.toString());
				break;
			}
		}
	}
}
