package com.bean;

public class SignupBean {
	String fName,lName,uName,uEmail,uPwd;

	public SignupBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SignupBean(String fName, String lName, String uName, String uEmail, String uPwd) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.uName = uName;
		this.uEmail = uEmail;
		this.uPwd = uPwd;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuPwd() {
		return uPwd;
	}

	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}

	@Override
	public String toString() {
		return "SignupBean [fName=" + fName + ", lName=" + lName + ", uName=" + uName + ", uEmail=" + uEmail + ", uPwd="
				+ uPwd + "]";
	}
	

}
