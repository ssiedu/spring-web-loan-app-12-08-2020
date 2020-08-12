package com.ssi;

public class LoanService {
	//method to compute installment
	
	public void computeInstallment(LoanModel model) {
		int interest=(model.getLoanAmount()*model.getTime()*model.getRate())/100;
		int total=model.getLoanAmount()+interest;
		int installment=total/(model.getTime()*12);
		model.setInstallment(installment);
	}
	
}
