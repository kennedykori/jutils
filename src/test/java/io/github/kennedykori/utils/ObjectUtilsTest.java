package io.github.kennedykori.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.Serializable;
import java.math.BigDecimal;

import org.junit.jupiter.api.Test;


public class ObjectUtilsTest {
	// ========================================================================
	// NUMBERS UTILITY METHODS TESTS
	// ========================================================================
	@SuppressWarnings(value = "nullness:argument")
	@Test
	public void testIsEqualTo() {
		// Test returns true when number is equal to
		assertTrue(ObjectUtils.isEqualTo(0, -0));
		assertTrue(ObjectUtils.isEqualTo(-435L, -435L));
		assertTrue(ObjectUtils.isEqualTo(-65.78724913F, -65.78724913F));
		assertTrue(ObjectUtils.isEqualTo(0.000000000000001D, 0.000000000000001D));
		assertTrue(ObjectUtils.isEqualTo(new BigDecimal("7"), new BigDecimal("7")));

		// Test returns false when number is not equal to
		assertFalse(ObjectUtils.isEqualTo(0, -1));
		assertFalse(ObjectUtils.isEqualTo(435L, -435L));
		assertFalse(ObjectUtils.isEqualTo(65.78724913F, -65.78724913F));
		assertFalse(ObjectUtils.isEqualTo(0.999999999999999D, 0.1D));
		assertFalse(ObjectUtils.isEqualTo(new BigDecimal("0.9999999999999999"), new BigDecimal("1")));

		// Test that NullPointerException is thrown when null is given
		assertThrows(NullPointerException.class, () -> ObjectUtils.isEqualTo(null, null));
		assertThrows(NullPointerException.class, () -> ObjectUtils.isEqualTo(null, new BigDecimal("1")));
		assertThrows(NullPointerException.class, () -> ObjectUtils.isEqualTo(new BigDecimal("1"), null));
	}

	@Test
	public void testIsGreaterThan() {
		// Test returns true when a number is greater than
		assertTrue(ObjectUtils.isGreaterThan(0, 2));
		assertTrue(ObjectUtils.isGreaterThan(67391L, 283927399L));
		assertTrue(ObjectUtils.isGreaterThan(-454.012F, 2.57F));
		assertTrue(ObjectUtils.isGreaterThan(-372873039919832.83D, -778564921.87344524D));
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
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(67391L, 283927399L));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(-454.012F, 2.57F));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(-372873039919832.83D, -778564921.87344524D));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(new BigDecimal("56.74"), new BigDecimal("56.75")));

		// Test returns true when a number is equal to
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(2, 2));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(283927399L, 283927399L));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(-454.012F, -454.012F));
		assertTrue(ObjectUtils.isGreaterThanOrEqualTo(-372873039919832.83D, -372873039919832.83D));
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
		assertTrue(ObjectUtils.isNegative(-9L));
		assertTrue(ObjectUtils.isNegative(-78.0F));
		assertTrue(ObjectUtils.isNegative(-123.676673893277843D));
		assertTrue(ObjectUtils.isNegative(new BigDecimal("-94.45")));

		// Test returns false when a number is positive
		assertFalse(ObjectUtils.isNegative(56));
		assertFalse(ObjectUtils.isNegative(1L));
		assertFalse(ObjectUtils.isNegative(85.56F));
		assertFalse(ObjectUtils.isNegative(213.6539643849432438547D));
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
		assertTrue(ObjectUtils.inRange(10L, 3792L, 223L));
		assertTrue(ObjectUtils.inRange(-100.90F, 0.00F, -32.99F));
		assertTrue(ObjectUtils.inRange(-1.8673763D, 1.6D, -1.788738737D));
		assertTrue(ObjectUtils.inRange(new BigDecimal("45.09"), new BigDecimal("45.11"), new BigDecimal("45.10")));

		// Test returns false when number is not in range and value < minValue
		assertFalse(ObjectUtils.inRange(-30, -13, -43));
		assertFalse(ObjectUtils.inRange(-300L, 0L, -2898898L));
		assertFalse(ObjectUtils.inRange(1278.0000F, 1278.0000F, 1277.9999F));
		assertFalse(ObjectUtils.inRange(7.175456D, 7.175457D, 7.175455D));
		assertFalse(ObjectUtils.inRange(new BigDecimal("-0.01"), new BigDecimal("0.01"), new BigDecimal("-0.10")));

		// Test returns false when number is not in range and value > maxValue
		assertFalse(ObjectUtils.inRange(-30, -13, -12));
		assertFalse(ObjectUtils.inRange(-300L, 0L, 2898898L));
		assertFalse(ObjectUtils.inRange(1278.0000F, 1278.0000F, 1278.0001F));
		assertFalse(ObjectUtils.inRange(7.175456D, 7.175457D, 7.175458D));
		assertFalse(ObjectUtils.inRange(new BigDecimal("-0.01"), new BigDecimal("0.01"), new BigDecimal("0.01")));
	}

	@SuppressWarnings(value = "nullness:argument")
	@Test
	public void testInRangeExceptions() {
		assertThrows(IllegalArgumentException.class, () -> assertFalse(ObjectUtils.inRange(-13, -30, -43)));
		assertThrows(IllegalArgumentException.class, () -> assertFalse(ObjectUtils.inRange(0L, -300L, -2898898L)));
		assertThrows(IllegalArgumentException.class,
				() -> assertFalse(ObjectUtils.inRange(1279.0000F, 1278.0000F, 1278.0001F)));
		assertThrows(IllegalArgumentException.class,
				() -> assertFalse(ObjectUtils.inRange(8.175456D, 7.175457D, 7.175455D)));
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
	public void testRequireEqualTo() {
		// Test returns value when equal
		assertEquals(0, ObjectUtils.requireEqualTo(0, -0));
		assertEquals(-47L, ObjectUtils.requireEqualTo(-47L, -47L));
		assertEquals(-34.4535623F, ObjectUtils.requireEqualTo(-34.4535623F, -34.4535623F));
		assertEquals(0.999999999999999999D, ObjectUtils.requireEqualTo(0.999999999999999999D, 0.999999999999999999D));
		assertEquals(new BigDecimal("0.9999999999999999"),
				ObjectUtils.requireEqualTo(new BigDecimal("0.9999999999999999"), new BigDecimal("0.9999999999999999")));

		// Test throws IllegalArgumentException when not equal to
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireEqualTo(0, -1));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireEqualTo(78L, -3L));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireEqualTo(7.99999F, 8F));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireEqualTo(0.99999999999999D, 1));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireEqualTo(new BigDecimal("-1"), new BigDecimal("-1.00000000001")));

		// Test exception message
		final String errMessage = "value must be equal to base value."; // generic error message
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireEqualTo(11, 123, errMessage))
						.getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireEqualTo(-1L, 1L, errMessage))
						.getMessage());
		assertEquals(errMessage, assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireEqualTo(-373234.08F, -373233.09F, errMessage)).getMessage());
		assertEquals(errMessage, assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireEqualTo(6767.6767676767D, 7676.7676767676D, errMessage)).getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class,
						() -> ObjectUtils.requireEqualTo(new BigDecimal("56.74"), new BigDecimal("56.75"), errMessage))
								.getMessage());
	}

	@Test
	public void testRequireInRangeReturnValues() {
		assertEquals(2, ObjectUtils.requireInRange(2, 3, 2));
		assertEquals(223L, ObjectUtils.requireInRange(10L, 3792L, 223L));
		assertEquals(-32.99F, ObjectUtils.requireInRange(-100.90F, 0.00F, -32.99F));
		assertEquals(-1.788738737D, ObjectUtils.requireInRange(-1.8673763D, 1.6D, -1.788738737D));
		assertEquals(new BigDecimal("45.10"),
				ObjectUtils.requireInRange(new BigDecimal("45.09"), new BigDecimal("45.11"), new BigDecimal("45.10")));

		assertEquals(2, ObjectUtils.requireInRange(2, 3, 2, null));
		assertEquals(223L, ObjectUtils.requireInRange(10L, 3792L, 223L, null));
		assertEquals(-32.99F, ObjectUtils.requireInRange(-100.90F, 0.00F, -32.99F, null));
		assertEquals(-1.788738737D, ObjectUtils.requireInRange(-1.8673763D, 1.6D, -1.788738737D, null));
		assertEquals(new BigDecimal("45.10"), ObjectUtils.requireInRange(new BigDecimal("45.09"),
				new BigDecimal("45.11"), new BigDecimal("45.10"), null));
	}

	@Test
	public void testRequireInRangeExceptions() {
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(0, 1, 3));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(10L, 3792L, 2L));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(-100.90F, 0.00F, 32.99F));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(-1.8673763D, 1.6D, 1.788738737D));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(new BigDecimal("45.09"),
				new BigDecimal("45.11"), new BigDecimal("45.15")));

		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(0, 1, 3, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(10L, 3792L, 2L, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(-100.90F, 0.00F, 32.99F, null));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireInRange(-1.8673763D, 1.6D, 1.788738737D, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireInRange(new BigDecimal("45.09"),
				new BigDecimal("45.11"), new BigDecimal("45.15"), null));
	}

	@Test
	public void testRequireInRangeExceptionMessages() {
		IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireInRange(0, 1, 3, "Error: 3 is greater than 1"));
		assertEquals("Error: 3 is greater than 1", ex1.getMessage());
		IllegalArgumentException ex2 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireInRange(10L, 3792L, 2L, "Error: 2 is less than 10"));
		assertEquals("Error: 2 is less than 10", ex2.getMessage());
		IllegalArgumentException ex3 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireInRange(-100.90F, 0.00F, 32.99F, "Error: 32.99 is greater than 0.00"));
		assertEquals("Error: 32.99 is greater than 0.00", ex3.getMessage());
		IllegalArgumentException ex4 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils
				.requireInRange(-1.8673763D, 1.6D, 1.788738737D, "Error: 1.788738737 is greater than 1.6"));
		assertEquals("Error: 1.788738737 is greater than 1.6", ex4.getMessage());
		IllegalArgumentException ex5 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireInRange(new BigDecimal("45.09"), new BigDecimal("45.11"),
						new BigDecimal("45.15"), "Error: 45.15 is greater than 45.09"));
		assertEquals("Error: 45.15 is greater than 45.09", ex5.getMessage());
	}

	@Test
	public void testRequireGreaterThan() {
		// Test returns value when a number is greater than the base
		assertEquals(2, ObjectUtils.requireGreaterThan(0, 2));
		assertEquals(283927399L, ObjectUtils.requireGreaterThan(67391L, 283927399L));
		assertEquals(2.57F, ObjectUtils.requireGreaterThan(-454.012F, 2.57F));
		assertEquals(-778564921.87344524D, ObjectUtils.requireGreaterThan(-372873039919832.83D, -778564921.87344524D));
		assertEquals(new BigDecimal("56.75"),
				ObjectUtils.requireGreaterThan(new BigDecimal("56.74"), new BigDecimal("56.75")));

		// Test throws IllegalArgumentException when number is not greater than
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireGreaterThan(123, 11));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireGreaterThan(1L, -1L));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireGreaterThan(-373233.09F, -373234.08F));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireGreaterThan(6767.6767676767D, -7676.7676767676D));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireGreaterThan(new BigDecimal("56.75"), new BigDecimal("56.74")));

		// Test exception message
		final String errMessage = "value must be greater than base value."; // generic error message
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireGreaterThan(123, 11, errMessage))
						.getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireGreaterThan(1L, -1L, errMessage))
						.getMessage());
		assertEquals(errMessage, assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireGreaterThan(-373233.09F, -373234.08F, errMessage)).getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class,
						() -> ObjectUtils.requireGreaterThan(6767.6767676767D, -7676.7676767676D, errMessage))
								.getMessage());
		assertEquals(errMessage, assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireGreaterThan(new BigDecimal("56.75"), new BigDecimal("56.74"), errMessage))
						.getMessage());
	}

	@Test
	public void testRequireGreaterThanOrEqualTo() {
		// Test returns value when a number is greater than the base
		assertEquals(2, ObjectUtils.requireGreaterThanOrEqualTo(0, 2));
		assertEquals(283927399L, ObjectUtils.requireGreaterThanOrEqualTo(67391L, 283927399L));
		assertEquals(2.57F, ObjectUtils.requireGreaterThanOrEqualTo(-454.012F, 2.57F));
		assertEquals(-778564921.87344524D,
				ObjectUtils.requireGreaterThanOrEqualTo(-372873039919832.83D, -778564921.87344524D));
		assertEquals(new BigDecimal("56.75"),
				ObjectUtils.requireGreaterThanOrEqualTo(new BigDecimal("56.74"), new BigDecimal("56.75")));

		// Test returns value when a number is equal to base
		assertEquals(0, ObjectUtils.requireGreaterThanOrEqualTo(0, 0));
		assertEquals(61L, ObjectUtils.requireGreaterThanOrEqualTo(61L, 61L));
		assertEquals(-454.012F, ObjectUtils.requireGreaterThanOrEqualTo(-454.012F, -454.012F));
		assertEquals(-778564921.87344524D,
				ObjectUtils.requireGreaterThanOrEqualTo(-778564921.87344524D, -778564921.87344524D));
		assertEquals(new BigDecimal("56.75"),
				ObjectUtils.requireGreaterThanOrEqualTo(new BigDecimal("56.75"), new BigDecimal("56.75")));

		// Test throws IllegalArgumentException when number is not greater than or equal
		// to
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireGreaterThanOrEqualTo(123, 11));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireGreaterThanOrEqualTo(1L, -1L));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireGreaterThanOrEqualTo(-373233.09F, -373234.08F));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireGreaterThanOrEqualTo(6767.6767676767D, -7676.7676767676D));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireGreaterThanOrEqualTo(new BigDecimal("56.75"), new BigDecimal("56.74")));

		// Test exception message
		final String errMessage = "value must be greater than or equal to base value."; // generic error message
		assertEquals(errMessage, assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireGreaterThanOrEqualTo(123, 11, errMessage)).getMessage());
		assertEquals(errMessage, assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireGreaterThanOrEqualTo(1L, -1L, errMessage)).getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class,
						() -> ObjectUtils.requireGreaterThanOrEqualTo(-373233.09F, -373234.08F, errMessage))
								.getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class,
						() -> ObjectUtils.requireGreaterThanOrEqualTo(6767.6767676767D, -7676.7676767676D, errMessage))
								.getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class, () -> ObjectUtils
						.requireGreaterThanOrEqualTo(new BigDecimal("56.75"), new BigDecimal("56.74"), errMessage))
								.getMessage());
	}

	@Test
	public void testRequireLessThan() {
		// Test returns value when a number is less than the base
		assertEquals(2, ObjectUtils.requireLessThan(3, 2));
		assertEquals(283927399L, ObjectUtils.requireLessThan(41263896377267391L, 283927399L));
		assertEquals(-2.57F, ObjectUtils.requireLessThan(454.012F, -2.57F));
		assertEquals(-372873039919832.83D, ObjectUtils.requireLessThan(-778564921.87344524D, -372873039919832.83D));
		assertEquals(new BigDecimal("56.73"),
				ObjectUtils.requireLessThan(new BigDecimal("56.74"), new BigDecimal("56.73")));

		// Test throws IllegalArgumentException when number is not greater than
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireLessThan(11, 123));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireLessThan(-1L, 1L));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireLessThan(-373234.08F, -373233.09F));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThan(-7676.7676767676D, 6767.6767676767D));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThan(new BigDecimal("56.74"), new BigDecimal("56.75")));

		// Test exception message
		final String errMessage = "value must be less than base value."; // generic error message
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireLessThan(11, 123, errMessage))
						.getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireLessThan(-1L, 1L, errMessage))
						.getMessage());
		assertEquals(errMessage, assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThan(-373234.08F, -373233.09F, errMessage)).getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class,
						() -> ObjectUtils.requireLessThan(6767.6767676767D, 7676.7676767676D, errMessage))
								.getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class,
						() -> ObjectUtils.requireLessThan(new BigDecimal("56.74"), new BigDecimal("56.75"), errMessage))
								.getMessage());
	}

	@Test
	public void testRequireLessThanOrEqualTo() {
		// Test returns value when a number is less than the base
		assertEquals(0, ObjectUtils.requireLessThanOrEqualTo(2, 0));
		assertEquals(67391L, ObjectUtils.requireLessThanOrEqualTo(283927399L, 67391L));
		assertEquals(-454.012F, ObjectUtils.requireLessThanOrEqualTo(2.57F, -454.012F));
		assertEquals(-372873039919832.83D,
				ObjectUtils.requireLessThanOrEqualTo(-778564921.87344524D, -372873039919832.83D));
		assertEquals(new BigDecimal("56.74"),
				ObjectUtils.requireLessThanOrEqualTo(new BigDecimal("56.75"), new BigDecimal("56.74")));

		// Test returns value when a number is equal to base
		assertEquals(0, ObjectUtils.requireLessThanOrEqualTo(0, 0));
		assertEquals(61L, ObjectUtils.requireLessThanOrEqualTo(61L, 61L));
		assertEquals(-454.012F, ObjectUtils.requireLessThanOrEqualTo(-454.012F, -454.012F));
		assertEquals(-778564921.87344524D,
				ObjectUtils.requireLessThanOrEqualTo(-778564921.87344524D, -778564921.87344524D));
		assertEquals(new BigDecimal("56.75"),
				ObjectUtils.requireLessThanOrEqualTo(new BigDecimal("56.75"), new BigDecimal("56.75")));

		// Test throws IllegalArgumentException when number is not less than or equal to
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireLessThanOrEqualTo(11, 123));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireLessThanOrEqualTo(-1L, 1L));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThanOrEqualTo(-373234.08F, -373233.09F));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThanOrEqualTo(-7676.7676767676D, 6767.6767676767D));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThanOrEqualTo(new BigDecimal("56.74"), new BigDecimal("56.75")));

		// Test exception message
		final String errMessage = "value must be less than or equal to base value."; // generic error message
		assertEquals(errMessage, assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThanOrEqualTo(11, 123, errMessage)).getMessage());
		assertEquals(errMessage, assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThanOrEqualTo(-1L, 1L, errMessage)).getMessage());
		assertEquals(errMessage, assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireLessThanOrEqualTo(-373234.08F, -373233.09F, errMessage)).getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class,
						() -> ObjectUtils.requireLessThanOrEqualTo(-7676.7676767676D, 6767.6767676767D, errMessage))
								.getMessage());
		assertEquals(errMessage,
				assertThrows(IllegalArgumentException.class, () -> ObjectUtils
						.requireLessThanOrEqualTo(new BigDecimal("56.74"), new BigDecimal("56.75"), errMessage))
								.getMessage());
	}

	@Test
	public void testNonNegativeReturnValues() {
		assertEquals(36, ObjectUtils.requireNonNegative(36));
		assertEquals(64L, ObjectUtils.requireNonNegative(64L));
		assertEquals(56F, ObjectUtils.requireNonNegative(56F));
		assertEquals(98.09D, ObjectUtils.requireNonNegative(98.09D));
		assertEquals(new BigDecimal("872.23"), ObjectUtils.requireNonNegative(new BigDecimal("872.23")));

		assertEquals(574, ObjectUtils.requireNonNegative(574, null));
		assertEquals(934L, ObjectUtils.requireNonNegative(934L, null));
		assertEquals(2.56F, ObjectUtils.requireNonNegative(2.56F, null));
		assertEquals(490.50D, ObjectUtils.requireNonNegative(490.50D, null));
		assertEquals(new BigDecimal("0.50"), ObjectUtils.requireNonNegative(new BigDecimal("0.50"), null));
	}

	@SuppressWarnings(value = {"lowerbound:argument", "nullness:argument"})
	@Test
	public void testNonNegativeExceptions() {
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-36));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-64L));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-56F));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-98.09D));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(new BigDecimal("-872.23")));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonNegative(null));

		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-36, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-64L, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-56F, null));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireNonNegative(-98.09D, null));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonNegative(new BigDecimal("-872.23"), null));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireNonNegative(null, null));
	}

	@SuppressWarnings(value = "lowerbound:argument")
	@Test
	public void testNonNegativeExceptionMessages() {
		IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonNegative(-36, "given integer must not be negative."));
		assertEquals("given integer must not be negative.", ex1.getMessage());
		IllegalArgumentException ex2 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonNegative(-64L, "given long must not be negative."));
		assertEquals("given long must not be negative.", ex2.getMessage());
		IllegalArgumentException ex3 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonNegative(-56F, "given float must not be negative."));
		assertEquals("given float must not be negative.", ex3.getMessage());
		IllegalArgumentException ex4 = assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireNonNegative(-98.09D, "given decimal must not be negative."));
		assertEquals("given decimal must not be negative.", ex4.getMessage());
		IllegalArgumentException ex5 = assertThrows(IllegalArgumentException.class, () -> ObjectUtils
				.requireNonNegative(new BigDecimal("-872.23"), "given BigDecimal must not be negative."));
		assertEquals("given BigDecimal must not be negative.", ex5.getMessage());
	}

	// ========================================================================
	// SERIALIZABLE UTILITY METHODS TESTS
	// ========================================================================
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

	// ========================================================================
	// STRINGS UTILITY METHODS TESTS
	// ========================================================================
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

	@SuppressWarnings(value = {"lowerbound:argument", "nullness:argument"})
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

	@SuppressWarnings(value = {"lowerbound:argument", "nullness:argument"})
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
		assertTrue(ObjectUtils.hasMoreThanChars(10, "Hello World!")); // 12 chars
		assertTrue(ObjectUtils.hasMoreThanChars(3, "    ")); // 4 chars

		assertFalse(ObjectUtils.hasMoreThanChars(0, "")); // 0 chars
		assertFalse(ObjectUtils.hasMoreThanChars(2, "")); // 0 chars
		assertFalse(ObjectUtils.hasMoreThanChars(3, "Hi")); // 2 chars
		assertFalse(ObjectUtils.hasMoreThanChars(20, "Hello World!")); // 12 chars
		assertFalse(ObjectUtils.hasMoreThanChars(5, "    ")); // 4 chars
	}

	@SuppressWarnings(value = {"lowerbound:argument", "nullness:argument"})
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

	@SuppressWarnings(value = {"index:argument", "nullness:argument"})
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

	@SuppressWarnings(value = "index:argument")
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

	@SuppressWarnings(value = "nullness:argument")
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
		assertEquals("Hi", ObjectUtils.requireMoreThanChars(1, "Hi"));
		assertEquals("name", ObjectUtils.requireMoreThanChars(3, "name", null));
	}

	@SuppressWarnings(value = {"index:argument", "nullness:argument"})
	@Test
	public void testRequireMoreThanCharsExceptions() {
		// Test the methods throw a NullPointerException when a null string is passed
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireMoreThanChars(20, null));
		assertThrows(NullPointerException.class, () -> ObjectUtils.requireMoreThanChars(20, null, null));

		// Test the methods throw a IllegalArgumentException when a null string is
		// passed
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireMoreThanChars(4, "Hi"));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireMoreThanChars(4, "name"));
		assertThrows(IllegalArgumentException.class, () -> ObjectUtils.requireMoreThanChars(4, "name", null));
		assertThrows(IllegalArgumentException.class,
				() -> ObjectUtils.requireMoreThanChars(25, "Hi", "greating must have atleast 25 characters."));
	}

	@SuppressWarnings(value = "index:argument")
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

	@SuppressWarnings(value = {"value:argument", "nullness:argument"})
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

	@SuppressWarnings(value = {"value:argument", "nullness:argument"})
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
