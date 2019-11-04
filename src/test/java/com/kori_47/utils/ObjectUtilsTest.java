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
	public void testIsGreaterThan() {
		// Test returns true when a number is greater than
		assertTrue(ObjectUtils.isGreaterThan(0, 2));
		assertTrue(ObjectUtils.isGreaterThan(67391l, 283927399l));
		assertTrue(ObjectUtils.isGreaterThan(-454.012f, 2.57f));
		assertTrue(ObjectUtils.isGreaterThan(-372873039919832.83d, -778564921.87344524d));
		assertTrue(ObjectUtils.isGreaterThan(new BigDecimal("56.74"), new BigDecimal("56.75")));

		// Test returns false when a number is less than
		assertFalse(ObjectUtils.isGreaterThan(123, 11));
		assertFalse(ObjectUtils.isGreaterThan(1L, -1L));
		assertFalse(ObjectUtils.isGreaterThan(-373233.09F, -373234.08F));
		assertFalse(ObjectUtils.isGreaterThan(6767.6767676767D, -7676.7676767676D));
		assertFalse(ObjectUtils.isGreaterThan(new BigDecimal("56.75"), new BigDecimal("56.74")));
	}

	@Test
	public void testIsGreaterThanOrEqualTo() {
		// Test returns true when a number is greater than
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(0, 2));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(67391l, 283927399l));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(-454.012f, 2.57f));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(-372873039919832.83d, -778564921.87344524d));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(new BigDecimal("56.74"), new BigDecimal("56.75")));

		// Test returns true when a number is equal to
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(2, 2));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(283927399l, 283927399l));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(-454.012f, -454.012f));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(-372873039919832.83d, -372873039919832.83d));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(new BigDecimal("56.74"), new BigDecimal("56.74")));

		// Test returns false when a number is less than
		assertFalse(ObjectUtils.isGreaterThanOrEqualTo(123, 11));
		assertFalse(ObjectUtils.isGreaterThanOrEqualTo(1L, -1L));
		assertFalse(ObjectUtils.isGreaterThanOrEqualTo(-373233.09F, -373234.08F));
		assertFalse(ObjectUtils.isGreaterThanOrEqualTo(6767.6767676767D, -7676.7676767676D));
		assertFalse(ObjectUtils.isGreaterThanOrEqualTo(new BigDecimal("56.75"), new BigDecimal("56.74")));
	}

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
	public void testIsLessThan() {
		// Test returns true when a number is greater than
		assertTrue(ObjectUtils.isLessThan(123, 11));
		assertTrue(ObjectUtils.isLessThan(1L, -1L));
		assertTrue(ObjectUtils.isLessThan(-373233.09F, -373234.06F));
		assertTrue(ObjectUtils.isLessThan(6767.6767676767D, -7676.7676767676D));
		assertTrue(ObjectUtils.isLessThan(new BigDecimal("56.75"), new BigDecimal("56.74")));

		// Test returns false when a number is less than
		assertFalse(ObjectUtils.isLessThan(0, 2));
		assertFalse(ObjectUtils.isLessThan(67391L, 283927399L));
		assertFalse(ObjectUtils.isLessThan(-454.012F, 2.57F));
		assertFalse(ObjectUtils.isLessThan(-372873039919832.83D, -778564921.87344524D));
		assertFalse(ObjectUtils.isLessThan(new BigDecimal("56.74"), new BigDecimal("56.75")));
	}

	@Test
	public void testIsLessThanOrEqualTo() {
		// Test returns true when a number is greater than
		assertTrue(ObjectUtils.isLessThanOrEqualTo(123, 11));
		assertTrue(ObjectUtils.isLessThanOrEqualTo(1L, -1L));
		assertTrue(ObjectUtils.isLessThanOrEqualTo(-373233.09F, -373234.06F));
		assertTrue(ObjectUtils.isLessThanOrEqualTo(6767.6767676767D, -7676.7676767676D));
		assertTrue(ObjectUtils.isLessThanOrEqualTo(new BigDecimal("56.75"), new BigDecimal("56.74")));

		// Test returns true when a number is equal to
		assertTrue(ObjectUtils.isLessThanOrEqualTo(123, 123));
		assertTrue(ObjectUtils.isLessThanOrEqualTo(1L, 1L));
		assertTrue(ObjectUtils.isLessThanOrEqualTo(-373233.09F, -373233.09F));
		assertTrue(ObjectUtils.isLessThanOrEqualTo(-7676.7676767676D, -7676.7676767676D));
		assertTrue(ObjectUtils.isLessThanOrEqualTo(new BigDecimal("56.74"), new BigDecimal("56.74")));

		// Test returns false when a number is less than
		assertFalse(ObjectUtils.isLessThanOrEqualTo(0, 2));
		assertFalse(ObjectUtils.isLessThanOrEqualTo(67391L, 283927399L));
		assertFalse(ObjectUtils.isLessThanOrEqualTo(-454.012F, 2.57F));
		assertFalse(ObjectUtils.isLessThanOrEqualTo(-372873039919832.83D, -778564921.87344524D));
		assertFalse(ObjectUtils.isLessThanOrEqualTo(new BigDecimal("56.74"), new BigDecimal("56.75")));
	}

	@Test
	public void testInRange() {
		// Test returns true when number is in range
		assertTrue(ObjectUtils.inRange(2, 3, 2));
		assertTrue(ObjectUtils.inRange(10l, 3792l, 223l));
		assertTrue(ObjectUtils.inRange(-100.90f, 0.00f, -32.99f));
		assertTrue(ObjectUtils.inRange(-1.8673763d, 1.6d, -1.788738737d));
		assertTrue(ObjectUtils.inRange(new BigDecimal("45.09"), new BigDecimal("45.11"), new BigDecimal("45.10")));

		// Test returns false when number is not in range and value < minValue
		assertFalse(ObjectUtils.inRange(-30, -13, -43));
		assertFalse(ObjectUtils.inRange(-300l, 0l, -2898898l));
		assertFalse(ObjectUtils.inRange(1278.0000f, 1278.0000f, 1277.9999f));
		assertFalse(ObjectUtils.inRange(7.175456d, 7.175457d, 7.175455d));
		assertFalse(ObjectUtils.inRange(new BigDecimal("-0.01"), new BigDecimal("0.01"), new BigDecimal("-0.10")));

		// Test returns false when number is not in range and value > maxValue
		assertFalse(ObjectUtils.inRange(-30, -13, -12));
		assertFalse(ObjectUtils.inRange(-300l, 0l, 2898898l));
		assertFalse(ObjectUtils.inRange(1278.0000f, 1278.0000f, 1278.0001f));
		assertFalse(ObjectUtils.inRange(7.175456d, 7.175457d, 7.175458d));
		assertFalse(ObjectUtils.inRange(new BigDecimal("-0.01"), new BigDecimal("0.01"), new BigDecimal("0.01")));
	}

	@Test
	public void testInRangeExceptions() {
		assertThrows(IllegalArgumentException.class, () -> assertFalse(ObjectUtils.inRange(-13, -30, -43)));
		assertThrows(IllegalArgumentException.class, () -> assertFalse(ObjectUtils.inRange(0l, -300l, -2898898l)));
		assertThrows(IllegalArgumentException.class,
				() -> assertFalse(ObjectUtils.inRange(1279.0000f, 1278.0000f, 1278.0001f)));
		assertThrows(IllegalArgumentException.class,
				() -> assertFalse(ObjectUtils.inRange(8.175456d, 7.175457d, 7.175455d)));
		assertThrows(IllegalArgumentException.class, () -> assertFalse(
				ObjectUtils.inRange(new BigDecimal("0.015"), new BigDecimal("0.01"), new BigDecimal("0.01"))));
		assertThrows(NullPointerException.class,
				() -> assertFalse(ObjectUtils.inRange(null, new BigDecimal("0.01"), new BigDecimal("0.01"))));
		assertThrows(NullPointerException.class,
				() -> assertFalse(ObjectUtils.inRange(new BigDecimal("0.01"), null, new BigDecimal("0.01"))));
		assertThrows(NullPointerException.class,
				() -> assertFalse(ObjectUtils.inRange(new BigDecimal("0.01"), new BigDecimal("0.015"), null)));
	}

	@Test
	public void testRequireInRangeReturnValues() {
		assertEquals(2, ObjectUtils.requireInRange(2, 3, 2));
		assertEquals(223l, ObjectUtils.requireInRange(10l, 3792l, 223l));
		assertEquals(-32.99f, ObjectUtils.requireInRange(-100.90f, 0.00f, -32.99f));
		assertEquals(-1.788738737d, ObjectUtils.requireInRange(-1.8673763d, 1.6d, -1.788738737d));
		assertEquals(new BigDecimal("45.10"),
				ObjectUtils.requireInRange(new BigDecimal("45.09"), new BigDecimal("45.11"), new BigDecimal("45.10")));

		assertEquals(2, ObjectUtils.requireInRange(2, 3, 2, null));
		assertEquals(223l, ObjectUtils.requireInRange(10l, 3792l, 223l, null));
		assertEquals(-32.99f, ObjectUtils.requireInRange(-100.90f, 0.00f, -32.99f, null));
		assertEquals(-1.788738737d, ObjectUtils.requireInRange(-1.8673763d, 1.6d, -1.788738737d, null));
		assertEquals(new BigDecimal("45.10"), ObjectUtils.requireInRange(new BigDecimal("45.09"),
				new BigDecimal("45.11"), new BigDecimal("45.10"), null));
	}

	@Test
	public void testRequireInRangeExceptions() {
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(0, 1, 3));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(10l, 3792l, 2l));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(-100.90f, 0.00f, 32.99f));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(-1.8673763d, 1.6d, 1.788738737d));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(new BigDecimal("45.09"),
				new BigDecimal("45.11"), new BigDecimal("45.15")));

		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(0, 1, 3, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(10l, 3792l, 2l, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(-100.90f, 0.00f, 32.99f, null));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireInRange(-1.8673763d, 1.6d, 1.788738737d, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(new BigDecimal("45.09"),
				new BigDecimal("45.11"), new BigDecimal("45.15"), null));
	}

	@Test
	public void testRequireInRangeExceptionMessages() {
		IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireInRange(0, 1, 3, "Error: 3 is greater than 1"));
		assertEquals("Error: 3 is greater than 1", ex1.getMessage());
		IllegalArgumentException ex2 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireInRange(10l, 3792l, 2l, "Error: 2 is less than 10"));
		assertEquals("Error: 2 is less than 10", ex2.getMessage());
		IllegalArgumentException ex3 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireInRange(-100.90f, 0.00f, 32.99f, "Error: 32.99 is greater than 0.00"));
		assertEquals("Error: 32.99 is greater than 0.00", ex3.getMessage());
		IllegalArgumentException ex4 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils
				.requireInRange(-1.8673763d, 1.6d, 1.788738737d, "Error: 1.788738737 is greater than 1.6"));
		assertEquals("Error: 1.788738737 is greater than 1.6", ex4.getMessage());
		IllegalArgumentException ex5 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireInRange(new BigDecimal("45.09"), new BigDecimal("45.11"),
						new BigDecimal("45.15"), "Error: 45.15 is greater than 45.09"));
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
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonNegative(new BigDecimal("-872.23"), null));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonNegative(null, null));
	}

	@Test
	public void testNonNegativeExceptionMessages() {
		IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonNegative(-36, "given integer must not be negative."));
		assertEquals("given integer must not be negative.", ex1.getMessage());
		IllegalArgumentException ex2 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonNegative(-64l, "given long must not be negative."));
		assertEquals("given long must not be negative.", ex2.getMessage());
		IllegalArgumentException ex3 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonNegative(-56f, "given float must not be negative."));
		assertEquals("given float must not be negative.", ex3.getMessage());
		IllegalArgumentException ex4 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonNegative(-98.09d, "given decimal must not be negative."));
		assertEquals("given decimal must not be negative.", ex4.getMessage());
		IllegalArgumentException ex5 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils
				.requireNonNegative(new BigDecimal("-872.23"), "given BigDecimal must not be negative."));
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
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireSerializable(instance, "instance must be serializable."));
		assertEquals("instance must be serializable.", ex.getMessage());
	}

	/*-------------------------------------------------------------------------------------
	 * 
	 * STRINGS
	 *
	 * ------------------------------------------------------------------------------------
	 */

	@Test
	public void testHasCharsInRange() {
		assertTrue(ObjectUtils.hasCharsInRange(2, 3, "Hi")); // 2 chars
		assertTrue(ObjectUtils.hasCharsInRange(0, 1, "")); // 0 chars
		assertTrue(ObjectUtils.hasCharsInRange(10, 20, "Hello World!")); // 12 chars
		assertTrue(ObjectUtils.hasCharsInRange(3, 5, "    ")); // 4 chars

		assertFalse(ObjectUtils.hasCharsInRange(3, 4, "Hi")); // 2 chars
		assertFalse(ObjectUtils.hasCharsInRange(1, 10, "")); // 0 chars
		assertFalse(ObjectUtils.hasCharsInRange(7, 9, "Hello World!")); // 12 chars
		assertFalse(ObjectUtils.hasCharsInRange(2, 4, "    ")); // 4 chars
	}

	@Test
	public void testHasCharsInRangeExceptions() {
		// Test throws IllegalArgumentException when minChar is negative
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.hasCharsInRange(-1, 1, "Hello World!"));
		// Test throws IllegalArgumentException when maxChar is negative
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.hasCharsInRange(1, -1, "Hello World!"));
		// Test throws IllegalArgumentException when maxChar is less than minChar
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.hasCharsInRange(2, 1, "Hello World!"));
		// Test throws IllegalArgumentException when maxChar is equal to minChar
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.hasCharsInRange(1, 1, "Hello World!"));

		// Test throws NullPointerException when value is null
		assertThrows(NullPointerException.class, () -> ObjectUtils.hasCharsInRange(0, 1, null));
	}

	@Test
	public void testHasLessThanChars() {
		assertTrue(ObjectUtils.hasLessThanChars(3, "Hi")); // 2 chars
		assertTrue(ObjectUtils.hasLessThanChars(1, "")); // 0 chars
		assertTrue(ObjectUtils.hasLessThanChars(20, "Hello World!")); // 12 chars
		assertTrue(ObjectUtils.hasLessThanChars(5, "    ")); // 4 chars

		assertFalse(ObjectUtils.hasLessThanChars(2, "Hi")); // 2 chars
		assertFalse(ObjectUtils.hasLessThanChars(0, "")); // 0 chars
		assertFalse(ObjectUtils.hasLessThanChars(10, "Hello World!")); // 12 chars
		assertFalse(ObjectUtils.hasLessThanChars(3, "    ")); // 4 chars
	}

	@Test
	public void testHasLessThanCharsExceptions() {
		// Test throws when maxChar is negative
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.hasLessThanChars(-3, "Hi"));

		// Test throws NullPointerException when value is null
		assertThrows(NullPointerException.class, () -> ObjectUtils.hasLessThanChars(3, null));
	}

	@Test
	public void testHasMoreThanChars() {
		assertTrue(ObjectUtils.hasMoreThanChars(1, "Hi")); // 2 chars
		assertTrue(ObjectUtils.hasMoreThanChars(0, "")); // 0 chars
		assertTrue(ObjectUtils.hasMoreThanChars(10, "Hello World!")); // 12 chars
		assertTrue(ObjectUtils.hasMoreThanChars(3, "    ")); // 4 chars

		assertFalse(ObjectUtils.hasMoreThanChars(3, "Hi")); // 2 chars
		assertFalse(ObjectUtils.hasMoreThanChars(2, "")); // 0 chars
		assertFalse(ObjectUtils.hasMoreThanChars(20, "Hello World!")); // 12 chars
		assertFalse(ObjectUtils.hasMoreThanChars(5, "    ")); // 4 chars
	}

	@Test
	public void testHasMoreThanCharsExceptions() {
		// Test throws when maxChar is negative
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.hasMoreThanChars(-3, "Hi"));

		// Test throws NullPointerException when value is null
		assertThrows(NullPointerException.class, () -> ObjectUtils.hasMoreThanChars(3, null));
	}

	@Test
	public void testRequireCharsInRangeReturnValues() {
		// Test the methods returns the expected value
		assertEquals("name", ObjectUtils.requireCharsInRange(0, 20, "name"));
		assertEquals("name", ObjectUtils.requireCharsInRange(0, 20, "name", null));
	}

	@Test
	public void testRequireCharsInRangeExceptions() {
		// Test the methods throw a NullPointerException when a null string is passed
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireCharsInRange(0, 20, null));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireCharsInRange(0, 20, null, null));

		// Test the methods throw a IllegalArgumentException when a null string is
		// passed
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireCharsInRange(0, 1, "Hi"));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireCharsInRange(0, 1, "Hi", null));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireCharsInRange(3, 7, "Hi", "greating must have 3 to 6 characters."));
	}

	@Test
	public void testRequireCharsInRangeExceptionMessages() {
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireCharsInRange(2, 5, "Hello World!!", "value must have at most 4 characters."));
		assertEquals("value must have at most 4 characters.", ex.getMessage());
		IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireCharsInRange(3, 7, "Hi", "greating must have 3 to 6 characters."));
		assertEquals("greating must have 3 to 6 characters.", ex1.getMessage());
	}

	@Test
	public void testRequireLessThanCharsReturnValues() {
		// Test the methods returns the expected value
		assertEquals("name", ObjectUtils.requireLessThanChars(20, "name"));
		assertEquals("name", ObjectUtils.requireLessThanChars(20, "name", null));
	}

	@Test
	public void testRequireLessThanCharsExceptions() {
		// Test the methods throw a NullPointerException when a null string is passed
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireLessThanChars(20, null));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireLessThanChars(20, null, null));

		// Test the methods throw a IllegalArgumentException when a null string is
		// passed
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireLessThanChars(1, "Hi"));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireLessThanChars(2, "Hi", null));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThanChars(2, "Hi", "greating must have less than 3 characters."));
	}

	@Test
	public void testRequireLessThanCharsExceptionMessages() {
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThanChars(5, "Hello World!!", "value must have at most 4 characters."));
		assertEquals("value must have at most 4 characters.", ex.getMessage());
		IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThanChars(1, "Hi", "greating must have at most 1 character."));
		assertEquals("greating must have at most 1 character.", ex1.getMessage());
	}

	@Test
	public void testRequireMoreThanCharsReturnValues() {
		// Test the methods returns the expected value
		assertEquals("name", ObjectUtils.requireMoreThanChars(4, "name"));
		assertEquals("name", ObjectUtils.requireMoreThanChars(3, "name", null));
	}

	@Test
	public void testRequireMoreThanCharsExceptions() {
		// Test the methods throw a NullPointerException when a null string is passed
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireMoreThanChars(20, null));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireMoreThanChars(20, null, null));

		// Test the methods throw a IllegalArgumentException when a null string is
		// passed
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireMoreThanChars(4, "Hi"));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireMoreThanChars(4, "Hi", null));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireMoreThanChars(25, "Hi", "greating must have atleast 25 characters."));
	}

	@Test
	public void testRequireMoreThanCharsExceptionMessages() {
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireMoreThanChars(35, "Hello World!!", "value must have at least 35 characters."));
		assertEquals("value must have at least 35 characters.", ex.getMessage());
		IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireMoreThanChars(10, "Hi", "greating must have at least 10 character."));
		assertEquals("greating must have at least 10 character.", ex1.getMessage());
	}

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

		// Test the methods throw an IllegalArgumentException when an empty string is
		// passed
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonEmptyString(""));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonEmptyString("", null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonEmptyString("", null, null));
	}

	@Test
	public void testStringRequireNonNullExceptionMessages() {
		// Test the methods throw a NullPointerException with the right message.
		NullPointerException ex1 = assertThrows(NullPointerException.class,
				() -> ObjectUtils.requireNonEmptyString(null, null));
		assertEquals("value cannot be null.", ex1.getMessage());
		NullPointerException ex2 = assertThrows(NullPointerException.class,
				() -> ObjectUtils.requireNonEmptyString(null, "firstName"));
		assertEquals("firstName cannot be null.", ex2.getMessage());

		NullPointerException ex3 = assertThrows(NullPointerException.class,
				() -> ObjectUtils.requireNonEmptyString(null, null, null));
		assertEquals("value cannot be null.", ex3.getMessage());
		NullPointerException ex4 = assertThrows(NullPointerException.class,
				() -> ObjectUtils.requireNonEmptyString(null, "firstName cannot be null.", null));
		assertEquals("firstName cannot be null.", ex4.getMessage());

		// Test the methods throw an IllegalArgumentException with the right message.
		IllegalArgumentException ex5 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonEmptyString("", null));
		assertEquals("value cannot be empty.", ex5.getMessage());
		IllegalArgumentException ex6 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonEmptyString("", "firstName"));
		assertEquals("firstName cannot be empty.", ex6.getMessage());

		IllegalArgumentException ex7 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonEmptyString("", null, null));
		assertEquals("value cannot be empty.", ex7.getMessage());
		IllegalArgumentException ex8 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonEmptyString("", null, "firstName cannot be empty."));
		assertEquals("firstName cannot be empty.", ex8.getMessage());
	}

	static class NonSerializableClass {
	}

	static class SerializableClass implements Serializable {

		/**
		 * SUID
		 */
		private static final long serialVersionUID = -8077617538474793989L;

	}
}
