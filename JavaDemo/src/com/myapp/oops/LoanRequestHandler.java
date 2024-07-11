package com.myapp.oops;

public class LoanRequestHandler {

	
	
	private double balance;
	
	
	
	
	public LoanRequestHandler(double balance) {
		super();
		this.balance = balance;
	}




	public boolean applyLoan(LoanValidator loanValidator) {
		return loanValidator.validateLoan(balance);
	}
}
