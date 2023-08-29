package com.example.pojo;

public class Login {
	private String uname;
	private String pwd;
	private String recaptchaResponse;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRecaptchaResponse() {
		return recaptchaResponse;
	}
	public void setRecaptchaResponse(String recaptchaResponse) {
		this.recaptchaResponse = recaptchaResponse;
	}
	@Override
	public String toString() {
		return "Login [uname=" + uname + ", pwd=" + pwd + ", recaptchaResponse=" + recaptchaResponse + "]";
	}

}
