package com.caizhidao.model;

import org.apache.commons.lang3.StringUtils;

public class RegisterResult {

	private String resultCode;
	private String resultBankCode;
	private Customer customer;
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultBankCode() {
		return resultBankCode;
	}
	public void setResultBankCode(String resultBankCode) {
		this.resultBankCode = resultBankCode;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public RegisterResult() {
	}
	
	public RegisterResult(String resultCode) {
		this.resultCode = resultCode;
	}
	
	public RegisterResult(String resultCode,Customer customer) {
		this.resultCode = resultCode;
		this.customer = customer;
	}
	
	
	public RegisterResult(String[] results) {
		this.resultCode = results[0];
		this.resultBankCode = results[1];
	}

	public boolean isSuccess() {
		if ((this.getResultCode().equals("1") && StringUtils.isBlank(this
				.getResultBankCode()))
				|| (this.getResultCode().equals("1")
						&& StringUtils.isNotBlank(this.getResultBankCode()) && this
						.getResultBankCode().equals("1"))) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "RegisterResult [resultCode=" + resultCode + ", resultBankCode="
				+ resultBankCode + ", customer=" + customer + "]";
	}
	
}
