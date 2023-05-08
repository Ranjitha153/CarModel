package com.EducationalLoanl.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loanapplicationmodel")
public class LoanApplicationModel {
	@Id
	private int loanId;
	private String loanType;
	private String applicationName;
	private String applicationAddress;
	private String applicationMobile;
	private String applicationEmail;
	private String applicationAadhar;
	private String applicationPan;
	private String applicatioSalary;
	private String loanAmountRequired;
	private String loanRepaymentMonths;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getApplicationAddress() {
		return applicationAddress;
	}
	public void setApplicationAddress(String applicationAddress) {
		this.applicationAddress = applicationAddress;
	}
	public String getApplicationMobile() {
		return applicationMobile;
	}
	public void setApplicationMobile(String applicationMobile) {
		this.applicationMobile = applicationMobile;
	}
	public String getApplicationEmail() {
		return applicationEmail;
	}
	public void setApplicationEmail(String applicationEmail) {
		this.applicationEmail = applicationEmail;
	}
	public String getApplicationAadhar() {
		return applicationAadhar;
	}
	public void setApplicationAadhar(String applicationAadhar) {
		this.applicationAadhar = applicationAadhar;
	}
	public String getApplicationPan() {
		return applicationPan;
	}
	public void setApplicationPan(String applicationPan) {
		this.applicationPan = applicationPan;
	}
	public String getApplicatioSalary() {
		return applicatioSalary;
	}
	public void setApplicatioSalary(String applicatioSalary) {
		this.applicatioSalary = applicatioSalary;
	}
	public String getLoanAmountRequired() {
		return loanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return loanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
	@Override
	public String toString() {
		return "LoanApplicationModel [loanId=" + loanId + ", loanType=" + loanType + ", applicationName="
				+ applicationName + ", applicationAddress=" + applicationAddress + ", applicationMobile="
				+ applicationMobile + ", applicationEmail=" + applicationEmail + ", applicationAadhar="
				+ applicationAadhar + ", applicationPan=" + applicationPan + ", applicatioSalary=" + applicatioSalary
				+ ", loanAmountRequired=" + loanAmountRequired + ", loanRepaymentMonths=" + loanRepaymentMonths + "]";
	}

}
