package com.incubyte.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.incubyte.dev.Calculator;
import com.incubyte.dev.NegativeNumber;

public class CalculatorTest {

	@Test
	public void test() throws NegativeNumber {
		Calculator calculator = new Calculator();
		int actual = calculator.AddV6("2,3,1045");
		assertEquals(5, actual);
		actual = calculator.AddV6("//;\n1;1034");
		assertEquals(1, actual);
		actual = calculator.AddV6("");
		assertEquals(0, actual);
	}
	
	
	
}
