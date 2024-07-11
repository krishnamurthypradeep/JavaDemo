package com.myapp.oops.main;

import com.myapp.oops.BusinessLoanValidator;
import com.myapp.oops.LoanRequestHandler;

public class ApplyLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LoanRequestHandler handler = new LoanRequestHandler(6000.0);
		
		boolean status = handler.applyLoan(new BusinessLoanValidator(5000.0));
		
		if(status) {
			System.out.println("Loan Approved");
		}
		else
			System.out.println("Loan rejected");
	}

}
