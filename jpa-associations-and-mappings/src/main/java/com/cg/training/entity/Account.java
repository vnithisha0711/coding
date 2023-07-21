package com.cg.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="accounts")

public class Account {

	private static final long serialVersionUID = -2182895928846403372L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long accountId;
	private String accountType;
	private double minLimit;
	private double maxLimit;
	private String bankName;
	
	//@OneToOne(mappedBy = "account")
	//private Account account;

	private Employee employee;
	public Account() {}

	public Account(String accountType, double minLimit, double maxLimit, String bankName) {
		super();
		this.accountType = accountType;
		this.minLimit = minLimit;
		this.maxLimit = maxLimit;
		this.bankName = bankName;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(double minLimit) {
		this.minLimit = minLimit;
	}

	public double getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(double maxLimit) {
		this.maxLimit = maxLimit;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	

//	public Account getAccount() {
//		return account;
//	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}

	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", minLimit=" + minLimit
				+ ", maxLimit=" + maxLimit + ", bankName=" + bankName + "]";
	}

	
	
	
	
}
