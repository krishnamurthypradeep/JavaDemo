package com.myapp.oops;

public class BusinessLoanValidator  implements LoanValidator{
	
	private double balance;
	
	
	
	public BusinessLoanValidator(double balance) {
		super();
		this.balance = balance;
	}



	@Override
	public boolean validateLoan(double amount) {
		// TODO Auto-generated method stub
		
		if(balance >=10000.0 && amount >balance )
		return true;
		
		else
			return false;
	}
	
	

}
