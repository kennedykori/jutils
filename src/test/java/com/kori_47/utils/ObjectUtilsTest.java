package com.kori_47.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObjectUtilsTest {

	@Test
	public void testStringRequireNonNullReturnValue() {
		// Test the methods returns the expected value
		assertEquals("name", ObjectUtils.requireNonEmptyString("name"));
		assertEquals("name", ObjectUtils.requireNonEmptyString("name", null));
		assertEquals("name", ObjectUtils.requireNonEmptyString("name", null, null));
	}

	@Test
	public void testStringRequireNonNullExceptions() {
		// Test the methods throw a NullPointerException when a null string is passed
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonEmptyString(null));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonEmptyString(null, null));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonEmptyString(null, null, null));
		
		// Test the methods throw an IllegalArgumentException when an empty string is passed
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonEmptyString(""));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonEmptyString("", null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonEmptyString("", null, null));
	}
	
	@Test
	public void testStringRequireNonNullExceptionMessages() {
		// Test the methods throw a NullPointerException with the right message.
		NullPointerException ex1 = assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonEmptyString(null, null));
		assertEquals("value cannot be null.", ex1.getMessage());
		NullPointerException ex2 = assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonEmptyString(null, "firstName"));
		assertEquals("firstName cannot be null.", ex2.getMessage());
		
		NullPointerException ex3 = assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonEmptyString(null, null, null));
		assertEquals("value cannot be null.", ex3.getMessage());
		NullPointerException ex4 = assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonEmptyString(null, "firstName cannot be null.", null));
		assertEquals("firstName cannot be null.", ex4.getMessage());
		
		// Test the methods throw an IllegalArgumentException with the right message.
		IllegalArgumentException ex5 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonEmptyString("", null));
		assertEquals("value cannot be empty.", ex5.getMessage());
		IllegalArgumentException ex6 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonEmptyString("", "firstName"));
		assertEquals("firstName cannot be empty.", ex6.getMessage());
		
		IllegalArgumentException ex7 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonEmptyString("", null, null));
		assertEquals("value cannot be empty.", ex7.getMessage());
		IllegalArgumentException ex8 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonEmptyString("", null, "firstName cannot be empty."));
		assertEquals("firstName cannot be empty.", ex8.getMessage());
	}
}
