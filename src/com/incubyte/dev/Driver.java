package com.incubyte.dev;

public class Driver {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
        
			try {
				System.out.println(calculator.AddV5("//;\n-1;-2"));
			} catch (NegativeNumber e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
