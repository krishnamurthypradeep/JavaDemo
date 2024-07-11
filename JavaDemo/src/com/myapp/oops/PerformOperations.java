package com.myapp.oops;

public class PerformOperations {
	
	public int execute(MathOperation operation,int leftVal, int rightVal) /*throws InvalidStatementException*/ {
		
		int result = 0;
		
		switch (operation) {
		case ADD: {
			result = leftVal + rightVal;
			break;
		}
		
		case SUBTRACT: {
			result = leftVal - rightVal;
			break;
		}
		case MULTIPLY: {
			result = leftVal * rightVal;
			break;
		}
		
		case DIVIDE: {
			if(rightVal == 0) {
				throw new InvalidStatementException("Cant divide a number by zero");
			}
			
			result = leftVal / rightVal;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
			
		}
		return result;
	}

}
