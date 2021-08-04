package com.interview.assessment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	
	private StringCalculator stringCalculator;
	
	@BeforeEach
	public void init() {
		stringCalculator = new StringCalculator();
	}
	@Test
	void test() throws Exception{
		assertEquals(stringCalculator.add(""), 0);
		assertEquals(stringCalculator.add("1"), 1);
		assertEquals(stringCalculator.add("1\n2,3"), 6);
		assertEquals(stringCalculator.add("//;\n1;2, 7"), 10);
		assertEquals(stringCalculator.add("1\n2,3,1001"), 6);
		assertEquals(stringCalculator.add("//[***]\n1***2***3"),6);
		assertEquals(stringCalculator.add("//[*][%]\n1*2%3"),6);
		assertEquals(stringCalculator.add("//[**][%%]\n1**2%%3"),6);
		assertEquals(stringCalculator.getCalledCount(), 8);
	}

}
