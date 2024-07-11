package com.myapp.oops.main;

import com.myapp.oops.InvalidStatementException;
import com.myapp.oops.MathOperation;
import com.myapp.oops.PerformOperations;

public class TestMathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PerformOperations operations = new PerformOperations();
		double result =0.0;
		//try {
			result = operations.execute(MathOperation.DIVIDE, 10, 0);
//		} catch (InvalidStatementException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("Result "+result);

	}

}
