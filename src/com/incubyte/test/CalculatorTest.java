package com.incubyte.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.incubyte.dev.Calculator;
import com.incubyte.dev.NegativeNumber;

public class CalculatorTest {

	@Test
	public void test() throws NegativeNumber {
		Calculator calculator = new Calculator();
		int actual = calculator.AddV5("2,3");
		assertEquals(5, actual);
		actual = calculator.AddV5("2");
		assertEquals(2, actual);
		actual = calculator.AddV5("");
		assertEquals(0, actual);
	}
	@Test(expected = NegativeNumber.class)
	public void testException() throws NegativeNumber {
		Calculator calculator = new Calculator();
		 calculator.AddV5("2,-3");
         calculator.AddV5("//;\n-1;2");
	}
	
	
}
