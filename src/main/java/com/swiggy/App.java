package com.swiggy;

public class App {

	public boolean isPalidrome(String input) {

		if (input == null) {

			throw new IllegalArgumentException("input should not be null");
		}

		if (input.equals(reverse(input))) {

			return true;
		} else {
			return false;
		}

	}

	private String reverse(String input) {
		String rev = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			rev = rev + input.charAt(i);

		}
		return rev;

	}

	

}
