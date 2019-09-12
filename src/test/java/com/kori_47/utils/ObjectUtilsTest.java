package com.kori_47.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.io.Serializable;
import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class ObjectUtilsTest {
	/*-------------------------------------------------------------------------------------
	 * 
	 * NUMBERS
	 *
	 * ------------------------------------------------------------------------------------
	 */
	@Test
	public void testIsNegative() {
		// Test returns true when a number is negative
		assertTrue(ObjectUtils.isNegative(-5));
		assertTrue(ObjectUtils.isNegative(-9l));
		assertTrue(ObjectUtils.isNegative(-78.0f));
		assertTrue(ObjectUtils.isNegative(-123.676673893277843d));
		assertTrue(ObjectUtils.isNegative(new BigDecimal("-94.45")));
		
		// Test returns false when a number is positive
		assertFalse(ObjectUtils.isNegative(56));
		assertFalse(ObjectUtils.isNegative(1l));
		assertFalse(ObjectUtils.isNegative(85.56f));
		assertFalse(ObjectUtils.isNegative(213.6539643849432438547d));
		assertFalse(ObjectUtils.isNegative(new BigDecimal("344.78")));
	}

	@Test
	public void testInRange() {
		// Test returns true when number is in range
		assertTrue(ObjectUtils.inRange(2, 2, 3));
		assertTrue(ObjectUtils.inRange(223l, 10l, 3792l));
		assertTrue(ObjectUtils.inRange(-32.99f, -100.90f, 0.00f));
		assertTrue(ObjectUtils.inRange(-1.788738737d, -1.8673763d, 1.6d));
		assertTrue(ObjectUtils.inRange(new BigDecimal("45.10"), new BigDecimal("45.09"), new BigDecimal("45.11")));
		
		// Test returns false when number is not in range and value < minValue
		assertFalse(ObjectUtils.inRange(-43, -30, -13));
		assertFalse(ObjectUtils.inRange(-2898898l, -300l, 0l));		
		assertFalse(ObjectUtils.inRange(1277.9999f, 1278.0000f, 1278.0000f));
		assertFalse(ObjectUtils.inRange(7.175455d, 7.175456d, 7.175457d));
		assertFalse(ObjectUtils.inRange(new BigDecimal("-0.10"), new BigDecimal("-0.01"), new BigDecimal("0.01")));
		
		// Test returns false when number is not in range and value > maxValue
		assertFalse(ObjectUtils.inRange(-12, -30, -13));
		assertFalse(ObjectUtils.inRange(2898898l, -300l, 0l));
		assertFalse(ObjectUtils.inRange(1278.0001f, 1278.0000f, 1278.0000f));
		assertFalse(ObjectUtils.inRange(7.175458d, 7.175456d, 7.175457d));
		assertFalse(ObjectUtils.inRange(new BigDecimal("0.01"), new BigDecimal("-0.01"), new BigDecimal("0.01")));
	}

	@Test
	public void testInRangeExceptions() {
		assertThrows(IllegalArgumentException.class, () -> assertFalse(ObjectUtils.inRange(-43, -13, -30)));
		assertThrows(IllegalArgumentException.class, () -> assertFalse(ObjectUtils.inRange(-2898898l, 0l, -300l)));
		assertThrows(IllegalArgumentException.class, () -> assertFalse(ObjectUtils.inRange(1278.0001f, 1279.0000f, 1278.0000f)));
		assertThrows(IllegalArgumentException.class, () -> assertFalse(ObjectUtils.inRange(7.175455d, 8.175456d, 7.175457d)));
		assertThrows(IllegalArgumentException.class, () -> assertFalse(ObjectUtils.inRange(new BigDecimal("0.01"), new BigDecimal("0.015"), new BigDecimal("0.01"))));
		assertThrows(NullPointerException.class, () -> assertFalse(ObjectUtils.inRange(null, new BigDecimal("0.01"), new BigDecimal("0.01"))));
		assertThrows(NullPointerException.class, () -> assertFalse(ObjectUtils.inRange(new BigDecimal("0.01"), null, new BigDecimal("0.01"))));
		assertThrows(NullPointerException.class, () -> assertFalse(ObjectUtils.inRange(new BigDecimal("0.01"), new BigDecimal("0.015"), null)));
	}

	@Test
	public void testRequireInRangeReturnValues() {
		assertEquals(2, ObjectUtils.requireInRange(2, 2, 3));
		assertEquals(223l, ObjectUtils.requireInRange(223l, 10l, 3792l));
		assertEquals(-32.99f, ObjectUtils.requireInRange(-32.99f, -100.90f, 0.00f));
		assertEquals(-1.788738737d, ObjectUtils.requireInRange(-1.788738737d, -1.8673763d, 1.6d));
		assertEquals(new BigDecimal("45.10"), ObjectUtils.requireInRange(new BigDecimal("45.10"), new BigDecimal("45.09"), new BigDecimal("45.11")));
		
		assertEquals(2, ObjectUtils.requireInRange(2, 2, 3, null));
		assertEquals(223l, ObjectUtils.requireInRange(223l, 10l, 3792l, null));
		assertEquals(-32.99f, ObjectUtils.requireInRange(-32.99f, -100.90f, 0.00f, null));
		assertEquals(-1.788738737d, ObjectUtils.requireInRange(-1.788738737d, -1.8673763d, 1.6d, null));
		assertEquals(new BigDecimal("45.10"), ObjectUtils.requireInRange(new BigDecimal("45.10"), new BigDecimal("45.09"), new BigDecimal("45.11"), null));
	}
	
	@Test
	public void testRequireInRangeExceptions() {
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(3, 0, 1));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(2l, 10l, 3792l));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(32.99f, -100.90f, 0.00f));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(1.788738737d, -1.8673763d, 1.6d));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(new BigDecimal("45.15"), new BigDecimal("45.09"), new BigDecimal("45.11")));
		
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(3, 0, 1, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(2l, 10l, 3792l, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(32.99f, -100.90f, 0.00f, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(1.788738737d, -1.8673763d, 1.6d, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(new BigDecimal("45.15"), new BigDecimal("45.09"), new BigDecimal("45.11"), null));
	}
	
	@Test
	public void testRequireInRangeExceptionMessages() {
		IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(3, 0, 1, "Error: 3 is greater than 1"));
		assertEquals("Error: 3 is greater than 1", ex1.getMessage());
		IllegalArgumentException ex2 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(2l, 10l, 3792l, "Error: 2 is less than 10"));
		assertEquals("Error: 2 is less than 10", ex2.getMessage());
		IllegalArgumentException ex3 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(32.99f, -100.90f, 0.00f, "Error: 32.99 is greater than 0.00"));
		assertEquals("Error: 32.99 is greater than 0.00", ex3.getMessage());
		IllegalArgumentException ex4 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(1.788738737d, -1.8673763d, 1.6d, "Error: 1.788738737 is greater than 1.6"));
		assertEquals("Error: 1.788738737 is greater than 1.6", ex4.getMessage());
		IllegalArgumentException ex5 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(new BigDecimal("45.15"), new BigDecimal("45.09"), new BigDecimal("45.11"), "Error: 45.15 is greater than 45.09"));
		assertEquals("Error: 45.15 is greater than 45.09", ex5.getMessage());
	}

	@Test
	public void testNonNegativeReturnValues() {
		assertEquals(36, ObjectUtils.requireNonNegative(36));
		assertEquals(64l, ObjectUtils.requireNonNegative(64l));
		assertEquals(56f, ObjectUtils.requireNonNegative(56f));
		assertEquals(98.09d, ObjectUtils.requireNonNegative(98.09d));
		assertEquals(new BigDecimal("872.23"), ObjectUtils.requireNonNegative(new BigDecimal("872.23")));
		
		assertEquals(574, ObjectUtils.requireNonNegative(574, null));
		assertEquals(934l, ObjectUtils.requireNonNegative(934l, null));
		assertEquals(2.56f, ObjectUtils.requireNonNegative(2.56f, null));
		assertEquals(490.50d, ObjectUtils.requireNonNegative(490.50d, null));
		assertEquals(new BigDecimal("0.50"), ObjectUtils.requireNonNegative(new BigDecimal("0.50"), null));
	}

	@Test
	public void testNonNegativeExceptions() {
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-36));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-64l));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-56f));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-98.09d));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(new BigDecimal("-872.23")));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonNegative(null));
		
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-36, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-64l, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-56f, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-98.09d, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(new BigDecimal("-872.23"), null));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonNegative(null, null));
	}

	@Test
	public void testNonNegativeExceptionMessages() {
		IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-36, "given integer must not be negative."));
		assertEquals("given integer must not be negative.", ex1.getMessage());
		IllegalArgumentException ex2 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-64l, "given long must not be negative."));
		assertEquals("given long must not be negative.", ex2.getMessage());
		IllegalArgumentException ex3 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-56f, "given float must not be negative."));
		assertEquals("given float must not be negative.", ex3.getMessage());
		IllegalArgumentException ex4 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-98.09d, "given decimal must not be negative."));
		assertEquals("given decimal must not be negative.", ex4.getMessage());
		IllegalArgumentException ex5 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(new BigDecimal("-872.23"), "given BigDecimal must not be negative."));
		assertEquals("given BigDecimal must not be negative.", ex5.getMessage());
	}

	/*-------------------------------------------------------------------------------------
	 * 
	 * SERIALIZABLES
	 *
	 * ------------------------------------------------------------------------------------
	 */
	@Test
	public void testIsSerializable() {
		assertFalse(ObjectUtils.isSerializable(new NonSerializableClass()));
		assertTrue(ObjectUtils.isSerializable(new SerializableClass()));
	}

	@Test
	public void testRequireSerializableReturnValues() {
		// Test the methods returns the expected value
		SerializableClass instance = new SerializableClass();
		assertEquals(instance, ObjectUtils.requireSerializable(instance));
		assertEquals(instance, ObjectUtils.requireSerializable(instance, null));
	}

	@Test
	public void testRequireSerializableExceptions() {
		NonSerializableClass instance = new NonSerializableClass();
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireSerializable(instance));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireSerializable(instance, null));
	}

	@Test
	public void testRequireSerializableExceptionMessages() {
		NonSerializableClass instance = new NonSerializableClass();
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireSerializable(instance, "instance must be serializable."));
		assertEquals("instance must be serializable.", ex.getMessage());
	}

	/*-------------------------------------------------------------------------------------
	 * 
	 * STRINGS
	 *
	 * ------------------------------------------------------------------------------------
	 */
	@Test
	public void testStringRequireNonNullReturnValues() {
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
	
	static class NonSerializableClass {}
	
	static class SerializableClass implements Serializable {

		/**
		 * SUID
		 */
		private static final long serialVersionUID = -8077617538474793989L;
		
	}
}
