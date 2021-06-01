package com.rsd.commons;

public class SendMail {
	public static void setMail(String mail,String sub,String msg) {
		//from,password,to,subject,message  
	     Mail.send("saraswaticollege0102@gmail.com","Akola@123",mail,sub,msg);  
	}   
}
