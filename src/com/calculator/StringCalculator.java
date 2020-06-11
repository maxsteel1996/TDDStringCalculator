package com.calculator;

public class StringCalculator {

	public int add(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}
		String[] splitInputs = input.split(",");
		int sum = 0;
		for (String splString : splitInputs) {
			sum += Integer.parseInt(splString);
		}
		return sum;
	}

}
