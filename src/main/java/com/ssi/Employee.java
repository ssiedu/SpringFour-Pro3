package com.ssi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private int eno;
	private String ename;
	private List<String> addresses;
	private Set<String> mobiles;
	private Map<String,String> fmembers;
	private Properties projects;
	private List<Account> accounts;
	
	
	
	
	
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public Map<String, String> getFmembers() {
		return fmembers;
	}
	public void setFmembers(Map<String, String> fmembers) {
		this.fmembers = fmembers;
	}
	public Set<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", addresses="
				+ addresses + ", mobiles=" + mobiles + ", fmembers=" + fmembers
				+ ", projects=" + projects + "]";
	}
	public Properties getProjects() {
		return projects;
	}
	public void setProjects(Properties projects) {
		this.projects = projects;
	}
	
	
	
}
