package com.myapp.oops;

public class PersonalLoanValidator  implements LoanValidator{
	
	private double balance;
	
	
	
	public PersonalLoanValidator(double balance) {
		super();
		this.balance = balance;
	}



	@Override
	public boolean validateLoan(double amount) {
		// TODO Auto-generated method stub
		
		if(balance >=5000.0 && amount >balance )
		return true;
		
		else
			return false;
	}
	
	

}
