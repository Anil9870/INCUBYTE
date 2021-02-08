package com.incubyte.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.incubyte.dev.Calculator;
import com.incubyte.dev.NegativeNumber;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calculator = new Calculator();
		int actual = calculator.Add("2,3");
		assertEquals(5, actual);
		actual = calculator.Add("2");
		assertEquals(2, actual);
		actual = calculator.Add("");
		assertEquals(0, actual);
	}
	@Test
	public void testv2() {
		Calculator calculator = new Calculator();
		int actual = calculator.AddV2("2,3");
		assertEquals(5, actual);
		actual = calculator.AddV2("2");
		assertEquals(2, actual);
		actual = calculator.AddV2("");
		assertEquals(0, actual);
		actual = calculator.AddV2("1,2,3,4");
		assertEquals(10, actual);
	}
	@Test
	public void testv3() {
		Calculator calculator = new Calculator();
		int actual = calculator.AddV3("2\n3");
		assertEquals(5, actual);
		actual = calculator.AddV3("2");
		assertEquals(2, actual);
		actual = calculator.AddV3("");
		assertEquals(0, actual);
		actual = calculator.AddV3("1,2,3\n4");
		assertEquals(10, actual);
	}
	@Test
	public void testv4(){
		Calculator calculator = new Calculator();
		int actual = calculator.AddV4("//;\n3;2");
		assertEquals(5, actual);
		actual = calculator.AddV4("2");
		assertEquals(2, actual);
		actual = calculator.AddV4("//:\n4");
		assertEquals(4, actual);
		actual = calculator.AddV4("1,2,3\n4");
		assertEquals(10, actual);
	}

}
