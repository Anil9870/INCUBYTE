package com.incubyte.dev;

public class Driver {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
        
			try {
				System.out.println(calculator.AddV6("//;\n1;2;3;1045"));
			} catch (NegativeNumber e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
