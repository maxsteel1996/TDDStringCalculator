package com.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.calculator.StringCalculator;

class CalculatorTest {

	@Test
	void addEmptyTest() {
		StringCalculator stringCalculator = new StringCalculator();
		String input = "";
		int sum = stringCalculator.add(input);
		assertEquals(sum, 0);
	}

	@Test
	void addOneInputTest() {
		StringCalculator stringCalculator = new StringCalculator();
		String input = "1";
		int sum = stringCalculator.add(input);
		assertEquals(sum, 1);
	}

	@Test
	void addMultipleInputTest() {
		StringCalculator stringCalculator = new StringCalculator();
		String input = "1,2";
		int sum = stringCalculator.add(input);
		assertEquals(sum, 3);
	}

}
