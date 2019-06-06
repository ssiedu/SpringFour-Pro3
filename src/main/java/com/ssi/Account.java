package com.ssi;

public class Account {
	private String ano;
	private String atype;
	private String bank;
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", atype=" + atype + ", bank=" + bank
				+ "]";
	}
	
}
