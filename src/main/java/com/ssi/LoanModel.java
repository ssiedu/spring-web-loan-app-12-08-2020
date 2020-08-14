package com.ssi;

public class LoanModel {
	private int loanAmount;
	private int time;
	private int rate=10;
	private int installment;
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getInstallment() {
		return installment;
	}
	public void setInstallment(int installment) {
		this.installment = installment;
	}
	@Override
	public String toString() {
		return "LoanModel [loanAmount=" + loanAmount + ", time=" + time + ", rate=" + rate + ", installment="
				+ installment + "]";
	}
	
}
