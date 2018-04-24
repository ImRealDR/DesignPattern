package com.java.simpleFactory;

public class OperationFactory {

	public CalcOperation CreateOpreation(String sign,float a,float b){
		CalcOperation calcOperation = null;
		switch(sign){
			case "+":
				calcOperation = new AddOperation(a, b);
				break;
			case "-":
				calcOperation = new MinusOperation(a, b);
				break;
			case "*":
				calcOperation = new MultOperation(a, b);
				break;
			case "/":
				calcOperation = new DvdOperation(a, b);
				break;
		}
		return calcOperation;
	}

}
