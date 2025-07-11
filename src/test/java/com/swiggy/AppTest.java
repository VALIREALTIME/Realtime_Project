package com.swiggy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	
	String input1 = "madam";
	
	App app  = new App();
	
	boolean excpeted = true;
	@Test
	public void isPalindromeTest() {
		
		assertEquals(excpeted, app.isPalidrome(input1));
	}
	
	@Test
	public void isNotPalindromeTest() {
		
		assertEquals(false, app.isPalidrome("abc"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void isNotPalindromeExceptionTest() {
		
		assertEquals(false, app.isPalidrome(null));
	}
	
	
	
	

}
