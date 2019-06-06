package com.ssi;

public class Customer {
	private String code;
	private String cname;
	private Account account;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Customer [code=" + code + ", cname=" + cname + ", account="
				+ account + "]";
	}
	
	
}
