/**
 * 
 */
package com.kori_47.utils;

import static java.util.Objects.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * This class consists of static utility methods for operating on objects,
 * similar to {@link Objects} and static utility methods for operating on
 * primitives. These utilities include methods for checking a
 * <code>String</code>'s length, methods for checking the negativity of a number
 * and methods for checking if a number falls in a given range.
 * 
 * @author <a href="https://github.com/kennedykori"> Kennedy Kori</a>
 *
 * @since Sep 9, 2019, 6:31:47 PM
 */
public final class ObjectUtils {

	/*-------------------------------------------------------------------------------------
	 * 
	 * NUMBERS
	 *
	 * ------------------------------------------------------------------------------------
	 */
	/*
	 * ------------------------------------ IS GREATER THAN
	 * ------------------------------------
	 */
	/**
	 * Checks if an {@code int} is greater than a supplied base value. Returns
	 * {@code true} if the given {@code int} is greater than the supplied base
	 * value.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 */
	public final static boolean isGreaterThan(int baseValue, int value) {
		return value > baseValue;
	}

	/**
	 * Checks if a {@code long} is greater than a supplied base value. Returns
	 * {@code true} if the given {@code long} is greater than the supplied base
	 * value.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 */
	public final static boolean isGreaterThan(long baseValue, long value) {
		return value > baseValue;
	}

	/**
	 * Checks if a {@code float} is greater than a supplied base value. Returns
	 * {@code true} if the given {@code float} is greater than the supplied base
	 * value. </br>
	 * </br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Float#compare(float, float)} to compare the given values. </i>
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 */
	public final static boolean isGreaterThan(float baseValue, float value) {
		return Float.compare(value, baseValue) > 0;
	}

	/**
	 * Checks if a {@code double} is greater than a supplied base value. Returns
	 * {@code true} if the given {@code double} is greater than the supplied base
	 * value. </br>
	 * </br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Double#compare(double, double)} to compare the given values. </i>
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 */
	public final static boolean isGreaterThan(double baseValue, double value) {
		return Double.compare(value, baseValue) > 0;
	}

	/**
	 * Checks if a {@link BigDecimal} is greater than a supplied base value. Returns
	 * {@code true} if the given {@code BigDecimal} is greater than the supplied
	 * base value.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws NullPointerException
	 *             if any of the two arguments is/are {@code null}.
	 */
	public final static boolean isGreaterThan(BigDecimal baseValue, BigDecimal value) {
		return requireNonNull(value, "value cannot be null.")
				.compareTo(requireNonNull(baseValue, "baseValue cannot be null.")) > 0;
	}

	/*
	 * ------------------------------------ IS GREATER THAN OR EQUAL TO
	 * ------------------------------------
	 */
	/**
	 * Checks if an {@code int} is greater than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code int} is greater than or equal to the
	 * supplied base value.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * 
	 * @return {@code true} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 */
	public final static boolean isGreaterThanOrEqualTo(int baseValue, int value) {
		return value >= baseValue;
	}

	/**
	 * Checks if a {@code long} is greater than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code long} is greater than or equal to
	 * the supplied base value.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * 
	 * @return {@code true} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 */
	public final static boolean isGreaterThanOrEqualTo(long baseValue, long value) {
		return value >= baseValue;
	}

	/**
	 * Checks if a {@code float} is greater than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code float} is greater than or equal to
	 * the supplied base value. </br>
	 * </br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Float#compare(float, float)} to compare the given values. </i>
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * 
	 * @return {@code true} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 */
	public final static boolean isGreaterThanOrEqualTo(float baseValue, float value) {
		return Float.compare(value, baseValue) >= 0;
	}

	/**
	 * Checks if a {@code double} is greater than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code double} is greater than or equal to
	 * the supplied base value. </br>
	 * </br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Double#compare(double, double)} to compare the given values. </i>
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * 
	 * @return {@code true} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 */
	public final static boolean isGreaterThanOrEqualTo(double baseValue, double value) {
		return Double.compare(value, baseValue) >= 0;
	}

	/**
	 * Checks if a {@link BigDecimal} is greater than or equal to a supplied base
	 * value. Returns {@code true} if the given {@code BigDecimal} is greater than
	 * or equal to the supplied base value.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * 
	 * @return {@code true} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws NullPointerException
	 *             if any of the two arguments is/are {@code null}.
	 */
	public final static boolean isGreaterThanOrEqualTo(BigDecimal baseValue, BigDecimal value) {
		return requireNonNull(value, "value cannot be null.")
				.compareTo(requireNonNull(baseValue, "baseValue cannot be null.")) >= 0;
	}

	/*
	 * ------------------------------------ IS NEGATIVE
	 * ------------------------------------
	 */
	/**
	 * Checks if an integer is negative, i.e, less than 0 and returns
	 * <code>true</code> if the integer is negative, otherwise returns
	 * <code>false</code>
	 * 
	 * @param value
	 *            the integer to check
	 * @return <code>true</code> if the integer is negative, otherwise returns
	 *         <code>false</code>
	 */
	public final static boolean isNegative(int value) {
		if (value < 0)
			return true;
		return false;
	}

	/**
	 * Checks if a long is negative, i.e, less than 0 and returns <code>true</code>
	 * if the long is negative, otherwise returns <code>false</code>
	 * 
	 * @param value
	 *            the long to check
	 * @return <code>true</code> if the long is negative, otherwise returns
	 *         <code>false</code>
	 */
	public final static boolean isNegative(long value) {
		if (value < 0l)
			return true;
		return false;
	}

	/**
	 * Checks if a float is negative, i.e, less than 0 and returns <code>true</code>
	 * if the float is negative, otherwise returns <code>false</code>
	 * 
	 * @param value
	 *            the float to check
	 * @return <code>true</code> if the float is negative, otherwise returns
	 *         <code>false</code>
	 */
	public final static boolean isNegative(float value) {
		if (value < 0f)
			return true;
		return false;
	}

	/**
	 * Checks if a double is negative, i.e, less than 0 and returns
	 * <code>true</code> if the double is negative, otherwise returns
	 * <code>false</code>
	 * 
	 * @param value
	 *            the double to check
	 * @return <code>true</code> if the double is negative, otherwise returns
	 *         <code>false</code>
	 */
	public final static boolean isNegative(double value) {
		if (value < 0.0)
			return true;
		return false;
	}

	/**
	 * Checks if a {@link BigDecimal} is negative, i.e, less than 0 and returns
	 * <code>true</code>, otherwise returns <code>false</code>
	 * 
	 * @param value
	 *            the <code>BigDecimal</code> to check
	 * 
	 * @return <code>true</code> if the <code>BigDecimal</code> is negative,
	 *         otherwise returns <code>false</code>
	 * 
	 * @throws NullPointerException
	 *             if value is <code>null</code>.
	 */
	public final static boolean isNegative(BigDecimal value) {
		if (requireNonNull(value).signum() < 0)
			return true;
		return false;
	}

	/*
	 * ------------------------------------ IS LESS THAN
	 * ------------------------------------
	 */
	/**
	 * Checks if an {@code int} is less than a supplied base value. Returns
	 * {@code true} if the given {@code int} is less than the supplied base value.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * 
	 * @return {@code true} if {@code value} is less than {@code baseValue}.
	 */
	public final static boolean isLessThan(int baseValue, int value) {
		return value < baseValue;
	}

	/**
	 * Checks if a {@code long} is less than a supplied base value. Returns
	 * {@code true} if the given {@code long} is less than the supplied base value.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * 
	 * @return {@code true} if {@code value} is less than {@code baseValue}.
	 */
	public final static boolean isLessThan(long baseValue, long value) {
		return value < baseValue;
	}

	/**
	 * Checks if a {@code float} is less than a supplied base value. Returns
	 * {@code true} if the given {@code float} is less than the supplied base value.
	 * </br>
	 * </br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Float#compare(float, float)} to compare the given values. </i>
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * 
	 * @return {@code true} if {@code value} is less than {@code baseValue}.
	 */
	public final static boolean isLessThan(float baseValue, float value) {
		return Float.compare(value, baseValue) < 0;
	}

	/**
	 * Checks if a {@code double} is less than a supplied base value. Returns
	 * {@code true} if the given {@code double} is less than the supplied base
	 * value. </br>
	 * </br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Double#compare(double, double)} to compare the given values. </i>
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * 
	 * @return {@code true} if {@code value} is less than {@code baseValue}.
	 */
	public final static boolean isLessThan(double baseValue, double value) {
		return Double.compare(value, baseValue) < 0;
	}

	/**
	 * Checks if a {@link BigDecimal} is less than a supplied base value. Returns
	 * {@code true} if the given {@code BigDecimal} is less than the supplied base
	 * value.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * 
	 * @return {@code true} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws NullPointerException
	 *             if any of the two arguments is/are {@code null}.
	 */
	public final static boolean isLessThan(BigDecimal baseValue, BigDecimal value) {
		return requireNonNull(value, "value cannot be null.")
				.compareTo(requireNonNull(baseValue, "baseValue cannot be null.")) < 0;
	}

	/*
	 * ------------------------------------ IS LESS THAN OR EQUAL TO
	 * ------------------------------------
	 */
	/**
	 * Checks if an {@code int} is less than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code int} is less than or equal to the
	 * supplied base value.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * 
	 * @return {@code true} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 */
	public final static boolean isLessThanOrEqualTo(int baseValue, int value) {
		return value <= baseValue;
	}

	/**
	 * Checks if a {@code long} is less than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code long} is less than or equal to the
	 * supplied base value.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * 
	 * @return {@code true} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 */
	public final static boolean isLessThanOrEqualTo(long baseValue, long value) {
		return value <= baseValue;
	}

	/**
	 * Checks if a {@code float} is less than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code float} is less than or equal to the
	 * supplied base value. </br>
	 * </br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Float#compare(float, float)} to compare the given values. </i>
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * 
	 * @return {@code true} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 */
	public final static boolean isLessThanOrEqualTo(float baseValue, float value) {
		return Float.compare(value, baseValue) <= 0;
	}

	/**
	 * Checks if a {@code double} is less than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code double} is less than or equal to the
	 * supplied base value. </br>
	 * </br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Double#compare(double, double)} to compare the given values. </i>
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * 
	 * @return {@code true} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 */
	public final static boolean isLessThanOrEqualTo(double baseValue, double value) {
		return Double.compare(value, baseValue) <= 0;
	}

	/**
	 * Checks if a {@link BigDecimal} is less than or equal to a supplied base
	 * value. Returns {@code true} if the given {@code BigDecimal} is less than or
	 * equal to the supplied base value.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * 
	 * @return {@code true} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws NullPointerException
	 *             if any of the two arguments is/are {@code null}.
	 */
	public final static boolean isLessThanOrEqualTo(BigDecimal baseValue, BigDecimal value) {
		return requireNonNull(value, "value cannot be null.")
				.compareTo(requireNonNull(baseValue, "baseValue cannot be null.")) <= 0;
	}

	/*
	 * ------------------------------------ IN RANGE
	 * ------------------------------------
	 */
	/**
	 * Checks that the specified <code>Integer</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>true</code> if <code>value</code> is greater than or equal to
	 * <code>minValue</code> and less than <code>maxValue</code>, <code>false</code>
	 * otherwise. An {@link IllegalArgumentException} will be thrown if the maximum
	 * value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the integer to check.
	 * 
	 * @return <code>true</code> if <code>value</code> is greater than or equal to
	 *         <code>minValue</code> and less than <code>maxValue</code>,
	 *         <code>false</code> otherwise.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>maxValue</code> is less than <code>minValue</code>.
	 */
	public final static boolean inRange(int minValue, int maxValue, int value) {
		if (maxValue < minValue)
			throw new IllegalArgumentException(
					"maxValue(" + maxValue + ") cannot be less than minValue(" + minValue + ").");
		return value >= minValue && value < maxValue;
	}

	/**
	 * Checks that the specified <code>Long</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>true</code> if <code>value</code> is greater than or equal to
	 * <code>minValue</code> and less than <code>maxValue</code>, <code>false</code>
	 * otherwise. An {@link IllegalArgumentException} will be thrown if the maximum
	 * value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the long to check.
	 * 
	 * @return <code>true</code> if <code>value</code> is greater than or equal to
	 *         <code>minValue</code> and less than <code>maxValue</code>,
	 *         <code>false</code> otherwise.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>maxValue</code> is less than <code>minValue</code>.
	 */
	public final static boolean inRange(long minValue, long maxValue, long value) {
		if (maxValue < minValue)
			throw new IllegalArgumentException(
					"maxValue(" + maxValue + ") cannot be less than minValue(" + minValue + ").");
		return value >= minValue && value < maxValue;
	}

	/**
	 * Checks that the specified <code>Float</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>true</code> if <code>value</code> is greater than or equal to
	 * <code>minValue</code> and less than <code>maxValue</code>, <code>false</code>
	 * otherwise. An {@link IllegalArgumentException} will be thrown if the maximum
	 * value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the float to check.
	 * 
	 * @return <code>true</code> if <code>value</code> is greater than or equal to
	 *         <code>minValue</code> and less than <code>maxValue</code>,
	 *         <code>false</code> otherwise.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>maxValue</code> is less than <code>minValue</code>.
	 */
	public final static boolean inRange(float minValue, float maxValue, float value) {
		if (maxValue < minValue)
			throw new IllegalArgumentException(
					"maxValue(" + maxValue + ") cannot be less than minValue(" + minValue + ").");
		return value >= minValue && value < maxValue;
	}

	/**
	 * Checks that the specified <code>Double</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>true</code> if <code>value</code> is greater than or equal to
	 * <code>minValue</code> and less than <code>maxValue</code>, <code>false</code>
	 * otherwise. An {@link IllegalArgumentException} will be thrown if the maximum
	 * value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the double to check.
	 * 
	 * @return <code>true</code> if <code>value</code> is greater than or equal to
	 *         <code>minValue</code> and less than <code>maxValue</code>,
	 *         <code>false</code> otherwise.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>maxValue</code> is less than <code>minValue</code>.
	 */
	public final static boolean inRange(double minValue, double maxValue, double value) {
		if (maxValue < minValue)
			throw new IllegalArgumentException(
					"maxValue(" + maxValue + ") cannot be less than minValue(" + minValue + ").");
		return value >= minValue && value < maxValue;
	}

	/**
	 * Checks that the specified {@link BigDecimal} is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>true</code> if <code>value</code> is greater than or equal to
	 * <code>minValue</code> and less than <code>maxValue</code>, <code>false</code>
	 * otherwise. An {@link IllegalArgumentException} will be thrown if the maximum
	 * value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the <code>BigDecimal</code> to check.
	 * 
	 * @return <code>true</code> if <code>value</code> is greater than or equal to
	 *         <code>minValue</code> and less than <code>maxValue</code>,
	 *         <code>false</code> otherwise.
	 * 
	 * @throws NullPointerException
	 *             if any of the arguments passed are <code>null</code>.
	 * @throws IllegalArgumentException
	 *             if <code>maxValue</code> is less than <code>minValue</code>.
	 */
	public final static boolean inRange(BigDecimal minValue, BigDecimal maxValue, BigDecimal value) {
		if (requireNonNull(maxValue).compareTo(requireNonNull(minValue)) < 0)
			throw new IllegalArgumentException(
					"maxValue(" + maxValue + ") cannot be less than minValue(" + minValue + ").");
		return requireNonNull(value).compareTo(minValue) >= 0 && value.compareTo(maxValue) < 0;
	}

	/*
	 * ------------------------------------ REQUIRE GREATER THAN
	 * ------------------------------------
	 */

	/**
	 * Checks if an {@code int} is greater than a supplied base value. Returns the
	 * given {@code int} if it is greater than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static int requireGreaterThan(int baseValue, int value) {
		return requireGreaterThan(baseValue, value, null);
	}

	/**
	 * Checks if an {@code int} is greater than a supplied base value. Returns the
	 * given {@code int} if it is greater than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static int requireGreaterThan(int baseValue, int value, String message) {
		if (!isGreaterThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code long} is greater than a supplied base value. Returns the
	 * given {@code long} if it is greater than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static long requireGreaterThan(long baseValue, long value) {
		return requireGreaterThan(baseValue, value, null);
	}

	/**
	 * Checks if a {@code long} is greater than a supplied base value. Returns the
	 * given {@code long} if it is greater than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static long requireGreaterThan(long baseValue, long value, String message) {
		if (!isGreaterThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code float} is greater than a supplied base value. Returns the
	 * given {@code float} if it is greater than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static float requireGreaterThan(float baseValue, float value) {
		return requireGreaterThan(baseValue, value, null);
	}

	/**
	 * Checks if a {@code float} is greater than a supplied base value. Returns the
	 * given {@code float} if it is greater than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static float requireGreaterThan(float baseValue, float value, String message) {
		if (!isGreaterThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code double} is greater than a supplied base value. Returns the
	 * given {@code double} if it is greater than the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static double requireGreaterThan(double baseValue, double value) {
		return requireGreaterThan(baseValue, value, null);
	}

	/**
	 * Checks if a {@code double} is greater than a supplied base value. Returns the
	 * given {@code double} if it is greater than the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static double requireGreaterThan(double baseValue, double value, String message) {
		if (!isGreaterThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@link BigDecimal} is greater than a supplied base value. Returns
	 * the given {@code BigDecimal} if it is greater than the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 * @throws NullPointerException
	 *             if {@code baseValue} or/and {@code value} is/are {@code null}.
	 */
	public final static BigDecimal requireGreaterThan(BigDecimal baseValue, BigDecimal value) {
		return requireGreaterThan(baseValue, value, null);
	}

	/**
	 * Checks if a {@link BigDecimal} is greater than a supplied base value. Returns
	 * the given {@code BigDecimal} if it is greater than the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness against.
	 * @param value
	 *            the value to check for greatness.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 * @throws NullPointerException
	 *             if {@code baseValue} or/and {@code value} is/are {@code null}.
	 */
	public final static BigDecimal requireGreaterThan(BigDecimal baseValue, BigDecimal value, String message) {
		if (!isGreaterThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%s) should be greater than %s.", value, baseValue)));
		return value;
	}

	/*
	 * ------------------------------------ REQUIRE GREATER THAN OR EQUAL TO
	 * ------------------------------------
	 */

	/**
	 * Checks if an {@code int} is greater than or equal to a supplied base value.
	 * Returns the given {@code int} if it is greater than or equal to the given
	 * base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static int requireGreaterThanOrEqualTo(int baseValue, int value) {
		return requireGreaterThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Checks if an {@code int} is greater than or equal to a supplied base value.
	 * Returns the given {@code int} if it is greater than or equal to the given
	 * base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static int requireGreaterThanOrEqualTo(int baseValue, int value, String message) {
		if (!isGreaterThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than or equal %d.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code long} is greater than or equal to a supplied base value.
	 * Returns the given {@code long} if it is greater than or equal to the given
	 * base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static long requireGreaterThanOrEqualTo(long baseValue, long value) {
		return requireGreaterThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Checks if a {@code long} is greater than or equal to a supplied base value.
	 * Returns the given {@code long} if it is greater than or equal to the given
	 * base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static long requireGreaterThanOrEqualTo(long baseValue, long value, String message) {
		if (!isGreaterThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than or equal %d.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code float} is greater than or equal to a supplied base value.
	 * Returns the given {@code float} if it is greater than or equal to the given
	 * base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static float requireGreaterThanOrEqualTo(float baseValue, float value) {
		return requireGreaterThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Checks if a {@code float} is greater than or equal to a supplied base value.
	 * Returns the given {@code float} if it is greater than or equal to the given
	 * base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static float requireGreaterThanOrEqualTo(float baseValue, float value, String message) {
		if (!isGreaterThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than or equal %f.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code double} is greater than or equal to a supplied base value.
	 * Returns the given {@code double} if it is greater than or equal to the given
	 * base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static double requireGreaterThanOrEqualTo(double baseValue, double value) {
		return requireGreaterThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Checks if a {@code double} is greater than or equal to a supplied base value.
	 * Returns the given {@code double} if it is greater than or equal to the given
	 * base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 */
	public final static double requireGreaterThanOrEqualTo(double baseValue, double value, String message) {
		if (!isGreaterThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than or equal %f.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@link BigDecimal} is greater than or equal to a supplied base
	 * value. Returns the given {@code BigDecimal} if it is greater than or equal to
	 * the given base value, otherwise, an {@code IllegalArgumentException} is
	 * thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 * @throws NullPointerException
	 *             if {@code baseValue} or/and {@code value} is/are {@code null}.
	 */
	public final static BigDecimal requireGreaterThanOrEqualTo(BigDecimal baseValue, BigDecimal value) {
		return requireGreaterThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Checks if a {@link BigDecimal} is greater than or equal to a supplied base
	 * value. Returns the given {@code BigDecimal} if it is greater than or equal to
	 * the given base value, otherwise, an {@code IllegalArgumentException} is
	 * thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for greatness or equality against.
	 * @param value
	 *            the value to check for greatness or equality.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is less than {@code baseValue}.
	 * @throws NullPointerException
	 *             if {@code baseValue} or/and {@code value} is/are {@code null}.
	 */
	public final static BigDecimal requireGreaterThanOrEqualTo(BigDecimal baseValue, BigDecimal value, String message) {
		if (!isGreaterThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%s) should be greater than or equal %s.", value, baseValue)));
		return value;
	}

	/*
	 * ------------------------------------ REQUIRE IN RANGE
	 * ------------------------------------
	 */
	/**
	 * Checks that the specified <code>Integer</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>value</code> if it is in the specified range, i.e, <code>value</code>
	 * is greater than or equal to <code>minValue</code> and less than
	 * <code>maxValue</code>, otherwise, an {@link IllegalArgumentException} is
	 * thrown. An {@link IllegalArgumentException} will also be thrown if the
	 * maximum value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the integer to check.
	 * 
	 * @return value if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>value</code> is not in the specified range or if
	 *             <code>maxValue</code> is less than <code>minValue</code>
	 */
	public final static int requireInRange(int minValue, int maxValue, int value) {
		return requireInRange(minValue, maxValue, value, null);
	}

	/**
	 * Checks that the specified <code>Integer</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>value</code> if it is in the specified range, i.e, <code>value</code>
	 * is greater than or equal to <code>minValue</code> and less than
	 * <code>maxValue</code>, otherwise, an {@link IllegalArgumentException} is
	 * thrown. An optional message can also be given to be used as the expection
	 * message. An {@link IllegalArgumentException} will also be thrown if the
	 * maximum value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the integer to check.
	 * @param message
	 *            an optional message to be used as as the
	 *            <code>IllegalArgumentException</code> message.
	 * 
	 * @return value if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>value</code> is not in the specified range or if
	 *             <code>maxValue</code> is less than <code>minValue</code>
	 */
	public final static int requireInRange(int minValue, int maxValue, int value, String message) {
		if (!inRange(minValue, maxValue, value))
			throw new IllegalArgumentException((nonNull(message)) ? message
					: String.format("value(%d) should be more than or equal to %d and less than %d.", value, minValue,
							maxValue));
		return value;
	}

	/**
	 * Checks that the specified <code>Long</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>value</code> if it is in the specified range, i.e, <code>value</code>
	 * is greater than or equal to <code>minValue</code> and less than
	 * <code>maxValue</code>, otherwise, an {@link IllegalArgumentException} is
	 * thrown. An {@link IllegalArgumentException} will also be thrown if the
	 * maximum value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the long to check.
	 * 
	 * @return value if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>value</code> is not in the specified range or if
	 *             <code>maxValue</code> is less than <code>minValue</code>
	 */
	public final static long requireInRange(long minValue, long maxValue, long value) {
		return requireInRange(minValue, maxValue, value, null);
	}

	/**
	 * Checks that the specified <code>Long</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>value</code> if it is in the specified range, i.e, <code>value</code>
	 * is greater than or equal to <code>minValue</code> and less than
	 * <code>maxValue</code>, otherwise, an {@link IllegalArgumentException} is
	 * thrown. An optional message can also be given to be used as the expection
	 * message. An {@link IllegalArgumentException} will also be thrown if the
	 * maximum value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the long to check.
	 * @param message
	 *            an optional message to be used as as the
	 *            <code>IllegalArgumentException</code> message.
	 * 
	 * @return value if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>value</code> is not in the specified range or if
	 *             <code>maxValue</code> is less than <code>minValue</code>
	 */
	public final static long requireInRange(long minValue, long maxValue, long value, String message) {
		if (!inRange(minValue, maxValue, value))
			throw new IllegalArgumentException((nonNull(message)) ? message
					: String.format("value(%d) should be more than or equal to %d and less than %d.", value, minValue,
							maxValue));
		return value;
	}

	/**
	 * Checks that the specified <code>Float</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>value</code> if it is in the specified range, i.e, <code>value</code>
	 * is greater than or equal to <code>minValue</code> and less than
	 * <code>maxValue</code>, otherwise, an {@link IllegalArgumentException} is
	 * thrown. An {@link IllegalArgumentException} will also be thrown if the
	 * maximum value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the float to check.
	 * 
	 * @return value if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>value</code> is not in the specified range or if
	 *             <code>maxValue</code> is less than <code>minValue</code>
	 */
	public final static float requireInRange(float minValue, float maxValue, float value) {
		return requireInRange(minValue, maxValue, value, null);
	}

	/**
	 * Checks that the specified <code>Float</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>value</code> if it is in the specified range, i.e, <code>value</code>
	 * is greater than or equal to <code>minValue</code> and less than
	 * <code>maxValue</code>, otherwise, an {@link IllegalArgumentException} is
	 * thrown. An optional message can also be given to be used as the expection
	 * message. An {@link IllegalArgumentException} will also be thrown if the
	 * maximum value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the float to check.
	 * @param message
	 *            an optional message to be used as as the
	 *            <code>IllegalArgumentException</code> message.
	 * 
	 * @return value if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>value</code> is not in the specified range or if
	 *             <code>maxValue</code> is less than <code>minValue</code>
	 */
	public final static float requireInRange(float minValue, float maxValue, float value, String message) {
		if (!inRange(minValue, maxValue, value))
			throw new IllegalArgumentException((nonNull(message)) ? message
					: String.format("value(%f) should be more than or equal to %f and less than %f.", value, minValue,
							maxValue));
		return value;
	}

	/**
	 * Checks that the specified <code>Double</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>value</code> if it is in the specified range, i.e, <code>value</code>
	 * is greater than or equal to <code>minValue</code> and less than
	 * <code>maxValue</code>, otherwise, an {@link IllegalArgumentException} is
	 * thrown. An {@link IllegalArgumentException} will also be thrown if the
	 * maximum value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the double to check.
	 * 
	 * @return value if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>value</code> is not in the specified range or if
	 *             <code>maxValue</code> is less than <code>minValue</code>
	 */
	public final static double requireInRange(double minValue, double maxValue, double value) {
		return requireInRange(minValue, maxValue, value, null);
	}

	/**
	 * Checks that the specified <code>Double</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>value</code> if it is in the specified range, i.e, <code>value</code>
	 * is greater than or equal to <code>minValue</code> and less than
	 * <code>maxValue</code>, otherwise, an {@link IllegalArgumentException} is
	 * thrown. An optional message can also be given to be used as the expection
	 * message. An {@link IllegalArgumentException} will also be thrown if the
	 * maximum value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the double to check.
	 * @param message
	 *            an optional message to be used as as the
	 *            <code>IllegalArgumentException</code> message.
	 * 
	 * @return value if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>value</code> is not in the specified range or if
	 *             <code>maxValue</code> is less than <code>minValue</code>
	 */
	public final static double requireInRange(double minValue, double maxValue, double value, String message) {
		if (!inRange(minValue, maxValue, value))
			throw new IllegalArgumentException((nonNull(message)) ? message
					: String.format("value(%f) should be more than or equal to %f and less than %f.", value, minValue,
							maxValue));
		return value;
	}

	/**
	 * Checks that the specified {@link BigDecimal} is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>value</code> if it is in the specified range, i.e, <code>value</code>
	 * is greater than or equal to <code>minValue</code> and less than
	 * <code>maxValue</code>, otherwise, an {@link IllegalArgumentException} is
	 * thrown. An {@link IllegalArgumentException} will also be thrown if the
	 * maximum value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the <code>BigDecimal</code> to check.
	 * 
	 * @return value if it is in the specified range.
	 * 
	 * @throws NullPointerException
	 *             if any of the first three arguments are <code>null</code>.
	 * @throws IllegalArgumentException
	 *             if <code>value</code> is not in the specified range or if
	 *             <code>maxValue</code> is less than <code>minValue</code>
	 * 
	 * @see BigDecimal
	 */
	public final static BigDecimal requireInRange(BigDecimal minValue, BigDecimal maxValue, BigDecimal value) {
		return requireInRange(minValue, maxValue, value, null);
	}

	/**
	 * Checks that the specified {@link BigDecimal} is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>value</code> if it is in the specified range, i.e, <code>value</code>
	 * is greater than or equal to <code>minValue</code> and less than
	 * <code>maxValue</code>, otherwise, an {@link IllegalArgumentException} is
	 * thrown. An optional message can also be given to be used as the expection
	 * message. An {@link IllegalArgumentException} will also be thrown if the
	 * maximum value is less than the minimum value.
	 * 
	 * @param minValue
	 *            the minimum value(inclusive) of the range.
	 * @param maxValue
	 *            the maximum value(exclusive) of the range.
	 * @param value
	 *            the <code>BigDecimal</code> to check.
	 * @param message
	 *            an optional message to be used as as the
	 *            <code>IllegalArgumentException</code> message.
	 * 
	 * @return value if it is in the specified range.
	 * 
	 * @throws NullPointerException
	 *             if any of the first three arguments are <code>null</code>.
	 * @throws IllegalArgumentException
	 *             if <code>value</code> is not in the specified range or if
	 *             <code>maxValue</code> is less than <code>minValue</code>
	 * 
	 * @see BigDecimal
	 */
	public final static BigDecimal requireInRange(BigDecimal minValue, BigDecimal maxValue, BigDecimal value,
			String message) {
		if (!inRange(minValue, maxValue, value))
			throw new IllegalArgumentException((nonNull(message)) ? message
					: String.format("value(%s) should be more than or equal to %s and less than %s.", value, minValue,
							maxValue));
		return value;
	}

	/*
	 * ------------------------------------ REQUIRE NON NEGATIVE
	 * ------------------------------------
	 */
	/**
	 * Checks that the specified <code>Integer</code> is not negative, i.e less than
	 * zero. If the <code>Integer</code> is negative, an
	 * {@link IllegalArgumentException} is thrown, otherwise, value is returned.
	 * 
	 * @param value
	 *            the integer to check
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException
	 *             if value is negative
	 */
	public final static int requireNonNegative(int value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Checks that the specified <code>Integer</code> is not negative, i.e less than
	 * zero. If the <code>Integer</code> is negative, an
	 * {@link IllegalArgumentException} is thrown, otherwise, value is returned. An
	 * optional message can also be passed to be used as the
	 * <code>IllegalArgumentException</code> message.
	 * 
	 * @param value
	 *            the integer to check
	 * @param message
	 *            an optional message to be used as as the
	 *            <code>IllegalArgumentException</code> message
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException
	 *             if value is negative
	 */
	public final static int requireNonNegative(int value, String message) {
		if (isNegative(value))
			throw new IllegalArgumentException(isNull(message) ? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Checks that the specified <code>Long</code> is not negative, i.e less than
	 * zero. If the <code>Long</code> is negative, an
	 * {@link IllegalArgumentException} is thrown, otherwise, value is returned.
	 * 
	 * @param value
	 *            the long to check
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException
	 *             if value is negative
	 */
	public final static long requireNonNegative(long value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Checks that the specified <code>Long</code> is not negative, i.e less than
	 * zero. If the <code>Long</code> is negative, an
	 * {@link IllegalArgumentException} is thrown, otherwise, value is returned. An
	 * optional message can also be passed to be used as the
	 * <code>IllegalArgumentException</code> message.
	 * 
	 * @param value
	 *            the long to check
	 * @param message
	 *            an optional message to be used as as the
	 *            <code>IllegalArgumentException</code> message
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException
	 *             if value is negative
	 */
	public final static long requireNonNegative(long value, String message) {
		if (isNegative(value))
			throw new IllegalArgumentException(isNull(message) ? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Checks that the specified <code>Float</code> is not negative, i.e less than
	 * zero. If the <code>Float</code> is negative, an
	 * {@link IllegalArgumentException} is thrown, otherwise, value is returned.
	 * 
	 * @param value
	 *            the float to check
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException
	 *             if value is negative
	 */
	public final static float requireNonNegative(float value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Checks that the specified <code>Float</code> is not negative, i.e less than
	 * zero. If the <code>Float</code> is negative, an
	 * {@link IllegalArgumentException} is thrown, otherwise, value is returned. An
	 * optional message can also be passed to be used as the
	 * <code>IllegalArgumentException</code> message.
	 * 
	 * @param value
	 *            the float to check
	 * @param message
	 *            an optional message to be used as as the
	 *            <code>IllegalArgumentException</code> message
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException
	 *             if value is negative
	 */
	public final static float requireNonNegative(float value, String message) {
		if (isNegative(value))
			throw new IllegalArgumentException(isNull(message) ? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Checks that the specified <code>Double</code> is not negative, i.e less than
	 * zero. If the <code>Double</code> is negative, an
	 * {@link IllegalArgumentException} is thrown, otherwise, value is returned.
	 * 
	 * @param value
	 *            the double to check
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException
	 *             if value is negative
	 */
	public final static double requireNonNegative(double value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Checks that the specified <code>Double</code> is not negative, i.e less than
	 * zero. If the <code>Double</code> is negative, an
	 * {@link IllegalArgumentException} is thrown, otherwise, value is returned. An
	 * optional message can also be passed to be used as the
	 * <code>IllegalArgumentException</code> message.
	 * 
	 * @param value
	 *            the double to check
	 * @param message
	 *            an optional message to be used as as the
	 *            <code>IllegalArgumentException</code> message
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException
	 *             if value is negative
	 */
	public final static double requireNonNegative(double value, String message) {
		if (isNegative(value))
			throw new IllegalArgumentException(isNull(message) ? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Checks that the specified {@link BigDecimal} is not negative, i.e less than
	 * zero. If the <code>BigDecimal</code> is negative, an
	 * {@link IllegalArgumentException} is thrown, otherwise, value is returned.
	 * 
	 * @param value
	 *            the <code>BigDecimal</code> to check
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws NullPointerException
	 *             if value is <code>null</code>
	 * @throws IllegalArgumentException
	 *             if value is negative
	 * 
	 * @see BigDecimal
	 */
	public final static BigDecimal requireNonNegative(BigDecimal value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Checks that the specified {@link BigDecimal} is not negative, i.e less than
	 * zero. If the <code>BigDecimal</code> is negative, an
	 * {@link IllegalArgumentException} is thrown, otherwise, value is returned. An
	 * optional message can also be passed to be used as the
	 * <code>IllegalArgumentException</code> message.
	 * 
	 * @param value
	 *            the <code>BigDecimal</code> to check
	 * @param message
	 *            an optional message to be used as as the
	 *            <code>IllegalArgumentException</code> message
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws NullPointerException
	 *             if value is <code>null</code>
	 * @throws IllegalArgumentException
	 *             if value is negative
	 * 
	 * 
	 * @see BigDecimal
	 */
	public final static BigDecimal requireNonNegative(BigDecimal value, String message) {
		if (isNegative(value))
			throw new IllegalArgumentException(isNull(message) ? "value cannot be negative." : message);
		return value;
	}

	/*
	 * ------------------------------------ REQUIRE LESS THAN
	 * ------------------------------------
	 */

	/**
	 * Checks if an {@code int} is less than a supplied base value. Returns the
	 * given {@code int} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static int requireLessThan(int baseValue, int value) {
		return requireLessThan(baseValue, value, null);
	}

	/**
	 * Checks if an {@code int} is less than a supplied base value. Returns the
	 * given {@code int} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static int requireLessThan(int baseValue, int value, String message) {
		if (!isLessThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code long} is less than a supplied base value. Returns the
	 * given {@code long} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static long requireLessThan(long baseValue, long value) {
		return requireLessThan(baseValue, value, null);
	}

	/**
	 * Checks if a {@code long} is less than a supplied base value. Returns the
	 * given {@code long} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static long requireLessThan(long baseValue, long value, String message) {
		if (!isLessThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code float} is less than a supplied base value. Returns the
	 * given {@code float} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static float requireLessThan(float baseValue, float value) {
		return requireLessThan(baseValue, value, null);
	}

	/**
	 * Checks if a {@code float} is less than a supplied base value. Returns the
	 * given {@code float} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static float requireLessThan(float baseValue, float value, String message) {
		if (!isLessThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code double} is less than a supplied base value. Returns the
	 * given {@code long} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static double requireLessThan(double baseValue, double value) {
		return requireLessThan(baseValue, value, null);
	}

	/**
	 * Checks if a {@code double} is less than a supplied base value. Returns the
	 * given {@code double} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static double requireLessThan(double baseValue, double value, String message) {
		if (!isLessThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@link BigDecimal} is less than a supplied base value. Returns
	 * the given {@code BigDecimal} if it is less than the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 * @throws NullPointerException
	 *             if {@code baseValue} or/and {@code value} is/are {@code null}.
	 */
	public final static BigDecimal requireLessThan(BigDecimal baseValue, BigDecimal value) {
		return requireLessThan(baseValue, value, null);
	}

	/**
	 * Checks if a {@link BigDecimal} is less than a supplied base value. Returns
	 * the given {@code BigDecimal} if it is less than the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness against.
	 * @param value
	 *            the value to check for smallness.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 * @throws NullPointerException
	 *             if {@code baseValue} or/and {@code value} is/are {@code null}.
	 */
	public final static BigDecimal requireLessThan(BigDecimal baseValue, BigDecimal value, String message) {
		if (!isLessThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%s) should be greater than %s.", value, baseValue)));
		return value;
	}

	/*
	 * ------------------------------------ REQUIRE LESS THAN OR EQUAL TO
	 * ------------------------------------
	 */

	/**
	 * Checks if an {@code int} is less than or equal to a supplied base value.
	 * Returns the given {@code int} if it is less than or equal to the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static int requireLessThanOrEqualTo(int baseValue, int value) {
		return requireLessThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Checks if an {@code int} is less than or equal to a supplied base value.
	 * Returns the given {@code int} if it is less than or equal to the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static int requireLessThanOrEqualTo(int baseValue, int value, String message) {
		if (!isLessThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be less than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code long} is less than or equal to a supplied base value.
	 * Returns the given {@code long} if it is less than or equal to the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static long requireLessThanOrEqualTo(long baseValue, long value) {
		return requireLessThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Checks if a {@code long} is less than or equal to a supplied base value.
	 * Returns the given {@code long} if it is less than or equal to the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static long requireLessThanOrEqualTo(long baseValue, long value, String message) {
		if (!isLessThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be less than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code float} is less than or equal to a supplied base value.
	 * Returns the given {@code float} if it is less than or equal to the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static float requireLessThanOrEqualTo(float baseValue, float value) {
		return requireLessThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Checks if an {@code float} is less than or equal to a supplied base value.
	 * Returns the given {@code float} if it is less than or equal to the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static float requireLessThanOrEqualTo(float baseValue, float value, String message) {
		if (!isLessThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be less than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@code double} is less than or equal to a supplied base value.
	 * Returns the given {@code double} if it is less than or equal to the given
	 * base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static double requireLessThanOrEqualTo(double baseValue, double value) {
		return requireLessThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Checks if a {@code double} is less than or equal to a supplied base value.
	 * Returns the given {@code double} if it is less than or equal to the given
	 * base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 */
	public final static double requireLessThanOrEqualTo(double baseValue, double value, String message) {
		if (!isLessThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be less than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Checks if a {@link BigDecimal} is less than or equal to a supplied base
	 * value. Returns the given {@code BigDecimal} if it is less than or equal to
	 * the given base value, otherwise, an {@code IllegalArgumentException} is
	 * thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 * @throws NullPointerException
	 *             if {@code baseValue} or/and {@code value} is/are {@code null}.
	 */
	public final static BigDecimal requireLessThanOrEqualTo(BigDecimal baseValue, BigDecimal value) {
		return requireLessThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Checks if a {@link BigDecimal} is less than or equal to a supplied base
	 * value. Returns the given {@code BigDecimal} if it is less than or equal to
	 * the given base value, otherwise, an {@code IllegalArgumentException} is
	 * thrown.
	 * 
	 * @param baseValue
	 *            the value to compare for smallness or equality against.
	 * @param value
	 *            the value to check for smallness or equality.
	 * @param message
	 *            an optional message to be used as as the
	 *            {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code value} is greater than {@code baseValue}.
	 * @throws NullPointerException
	 *             if {@code baseValue} or/and {@code value} is/are {@code null}.
	 */
	public final static BigDecimal requireLessThanOrEqualTo(BigDecimal baseValue, BigDecimal value, String message) {
		if (!isLessThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%s) should be greater than %s.", value, baseValue)));
		return value;
	}

	/*-------------------------------------------------------------------------------------
	 * 
	 * SERIALIZABLES
	 *
	 * ------------------------------------------------------------------------------------
	 */
	/**
	 * Checks if a given instance is serializable, i.e implements the
	 * {@link Serializable} interface. Returns <code>true</code> if the instance is
	 * serializable, otherwise returns <code>false</code>.
	 * 
	 * @param <T>
	 *            the type of the instance to be checked for serializability
	 * 
	 * @param value
	 *            the instance to check for serializability
	 * @return <code>true</code> if value is serializable or <code>false</code>
	 *         otherwise.
	 * 
	 * @throws NullPointerException
	 *             if value is null.
	 * 
	 * @see Serializable
	 */
	public final static <T> boolean isSerializable(T value) {
		if (Serializable.class.isInstance(requireNonNull(value)))
			return true;
		return false;
	}

	/**
	 * Checks if a given instance is serializable, i.e implements the
	 * {@link Serializable} interface. If the given instance is serializable, the
	 * method returns the instance. Otherwise, an {@link IllegalArgumentException}
	 * is thrown. Also a {@link NullPointerException} will also be thrown if the
	 * supplied instance is <code>null</code>.
	 * 
	 * @param <T>
	 *            the type of the instance to be checked for serializability
	 * 
	 * @param value
	 *            the instance to check for serializability
	 * 
	 * @return value if it's not <i>null <b>AND</b> is serializable</i>.
	 * 
	 * @throws NullPointerException
	 *             if value is null.
	 * @throws IllegalArgumentException
	 *             if value is not serializable.
	 * 
	 * @see #requireSerializable(Object, String)
	 * @see Serializable
	 */
	public final static <T> T requireSerializable(T value) {
		return requireSerializable(value, null);
	}

	/**
	 * Checks if a given instance is serializable, i.e implements the
	 * {@link Serializable} interface. If the given instance is serializable, the
	 * method returns the instance. Otherwise, an {@link IllegalArgumentException}
	 * is thrown. Also a {@link NullPointerException} will also be thrown if the
	 * supplied instance is <code>null</code>. A message can optionally be passed to
	 * be used in the construction of the <code>IllegalArgumentException</code>.
	 * 
	 * @param <T>
	 *            the type of the instance to be checked for serializability
	 * 
	 * @param value
	 *            the instance to check for serializability
	 * @param message
	 *            an optional message to be used in the construction of the
	 *            <code>IllegalArgumentException</code>
	 * 
	 * @return value if it's not <i>null <b>AND</b> is serializable</i>.
	 * 
	 * @throws NullPointerException
	 *             if value is null.
	 * @throws IllegalArgumentException
	 *             if value is not serializable.
	 * 
	 * @see Serializable
	 */
	public final static <T> T requireSerializable(T value, String message) {
		if (!isSerializable(value))
			throw new IllegalArgumentException(isNull(message) ? value.toString() + " must be serializable." : message);
		return value;
	}

	/*-------------------------------------------------------------------------------------
	 * 
	 * STRINGS
	 *
	 * ------------------------------------------------------------------------------------
	 */
	/**
	 * Checks that the given <code>String</code> has characters between the given
	 * minimum chars (inclusive) and the given maximum chars (exclusive). Returns
	 * <code>true</code> if the given <code>String</code>'s length (no of
	 * characters) falls within the given range, otherwise, returns
	 * <code>false</code>. An {@link IllegalArgumentException} will be thrown if:
	 * <ul>
	 * <li><code>minChars</code> is negative.</li>
	 * <li><code>maxChars</code> is negative.</li>
	 * <li><code>maxChars</code> is less than <code>minChars</code>.</li>
	 * <li><code>maxChars</code> is equal to <code>minChars</code></li>
	 * </ul>
	 * 
	 * @param minChars
	 *            the minimum number of characters (inclusive) that the given
	 *            <code>String</code> should have.
	 * @param maxChars
	 *            the maximum number of characters (exclusive) that the given
	 *            <code>String</code> should have.
	 * @param value
	 *            the <code>String</code> to check.
	 * 
	 * @return <code>true</code> if the given <code>String</code>'s length falls
	 *         within the specified range, <code>false</code> otherwise.
	 * 
	 * @throws NullPointerException
	 *             if <code>value</code> is <code>null</code>.
	 * @throws IllegalArgumentException
	 *             if any of the conditions stated above are/is met.
	 */
	public final static boolean hasCharsInRange(int minChars, int maxChars, String value) {
		if (requireNonNegative(maxChars) <= requireNonNegative(minChars))
			throw new IllegalArgumentException(
					String.format("maxChars(%d) cannot be less than or equal to minChars(%d).", maxChars, minChars));
		return requireNonNull(value).length() >= minChars && value.length() < maxChars;
	}

	/**
	 * Checks that the given <code>String</code> has less characters than the stated
	 * maximum chars (exclusive). Returns <code>true</code> if the given
	 * <code>String</code>'s length (number of characters) is less than the given
	 * <code>maxChars</code>, else returns <code>false</code>. An
	 * {@link IllegalArgumentException} will be thrown if <code>maxChars</code> is
	 * negative.
	 * 
	 * @param maxChars
	 *            the maximum number of characters (exclusive) that the given
	 *            <code>String</code> should have.
	 * @param value
	 *            the <code>String</code> to check.
	 * 
	 * @return <code>true</code> if the given <code>String</code>'s length is less
	 *         than <code>maxChars</code>, <code>false</code> otherwise.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>maxChars</code> is negative.
	 */
	public final static boolean hasLessThanChars(int maxChars, String value) {
		return requireNonNull(value).length() < requireNonNegative(maxChars);
	}

	/**
	 * Checks that the given <code>String</code> has more characters than the stated
	 * minimum chars (inclusive). Returns <code>true</code> if the given
	 * <code>String</code>'s length (number of characters) is greater than or equal
	 * to the given <code>minChars</code>, else returns <code>false</code>. An
	 * {@link IllegalArgumentException} will be thrown if <code>minChars</code> is
	 * negative.
	 * 
	 * @param minChars
	 *            the minimum number of characters (inclusive) that the given
	 *            <code>String</code> should have.
	 * @param value
	 *            the <code>String</code> to check.
	 * 
	 * @return <code>true</code> if the given <code>String</code>'s length is
	 *         greater than or equal to <code>minChars</code>, <code>false</code>
	 *         otherwise.
	 * 
	 * @throws IllegalArgumentException
	 *             if <code>minChars</code> is negative.
	 */
	public final static boolean hasMoreThanChars(int minChars, String value) {
		return requireNonNull(value).length() >= requireNonNegative(minChars);
	}

	/**
	 * Checks that the given <code>String</code> has characters between the given
	 * minimum chars (inclusive) and the given maximum chars (exclusive). Returns
	 * <code>value</code> if the given <code>String</code>'s length (no of
	 * characters) falls within the given range, otherwise, an
	 * {@link IllegalArgumentException} will be thrown.<br>
	 * <br>
	 * <i><b>NOTE:</b> This method internally uses
	 * {@link #hasCharsInRange(int, int, String)}, so an
	 * <code>IllegalArgumentException</code> might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param minChars
	 *            the minimum number of characters (inclusive) that the given
	 *            <code>String</code> should have.
	 * @param maxChars
	 *            the maximum number of characters (exclusive) that the given
	 *            <code>String</code> should have.
	 * @param value
	 *            the <code>String</code> to check.
	 * 
	 * @return <code>value</code> if <code>value</code>'s length falls within the
	 *         specified range.
	 * 
	 * @throws NullPointerException
	 *             if <code>value</code> is <code>null</code>.
	 * @throws IllegalArgumentException
	 *             if any of the conditions stated above are/is met.
	 * 
	 * @see #hasCharsInRange(int, int, String)
	 */
	public final static String requireCharsInRange(int minChars, int maxChars, String value) {
		return requireCharsInRange(minChars, maxChars, value, null);
	}

	/**
	 * Checks that the given <code>String</code> has characters between the given
	 * minimum chars (inclusive) and the given maximum chars (exclusive). Returns
	 * <code>value</code> if the given <code>String</code>'s length (no of
	 * characters) falls within the given range, otherwise, an
	 * {@link IllegalArgumentException} will be thrown. An optional message may be
	 * passed to be used in the construction of the
	 * <code>IllegalArgumentException</code>. <br>
	 * <br>
	 * <i><b>NOTE:</b> This method internally uses
	 * {@link #hasCharsInRange(int, int, String)}, so an
	 * <code>IllegalArgumentException</code> might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param minChars
	 *            the minimum number of characters (inclusive) that the given
	 *            <code>String</code> should have.
	 * @param maxChars
	 *            the maximum number of characters (exclusive) that the given
	 *            <code>String</code> should have.
	 * @param value
	 *            the <code>String</code> to check.
	 * @param message
	 *            an optional message to be used as as the IllegalArgumentException
	 *            message.
	 * 
	 * @return <code>value</code> if <code>value</code>'s length falls within the
	 *         specified range.
	 * 
	 * @throws NullPointerException
	 *             if <code>value</code> is <code>null</code>.
	 * @throws IllegalArgumentException
	 *             if any of the conditions stated above are/is met.
	 * 
	 * @see #hasCharsInRange(int, int, String)
	 */
	public final static String requireCharsInRange(int minChars, int maxChars, String value, String message) {
		if (!hasCharsInRange(minChars, maxChars, value))
			throw new IllegalArgumentException(nonNull(message) ? message
					: String.format("The length of value(%d) must be greater than or equal to %d and less than %d.",
							value.length(), minChars, maxChars));
		return value;
	}

	/**
	 * Checks that the given <code>String</code> has less characters than the stated
	 * maximum chars (exclusive). Returns <code>value</code> if the given
	 * <code>String</code>'s length (number of characters) is less than the given
	 * <code>maxChars</code>, otherwise an {@link IllegalArgumentException} will be
	 * thrown. <br>
	 * <br>
	 * <i><b>NOTE:</b> This method internally uses
	 * {@link #hasLessThanChars(int, String)}, so an
	 * <code>IllegalArgumentException</code> might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param maxChars
	 *            the maximum number of characters (exclusive) that the given
	 *            <code>String</code> should have.
	 * @param value
	 *            the <code>String</code> to check.
	 * 
	 * @return <code>value</code> if <code>value</code>'s length is less than
	 *         <code>maxChars</code>.
	 * 
	 * @throws NullPointerException
	 *             if <code>value</code> is <code>null</code>.
	 * @throws IllegalArgumentException
	 *             if any of the conditions stated above are/is met.
	 * 
	 * @see #hasLessThanChars(int, String)
	 */
	public final static String requireLessThanChars(int maxChars, String value) {
		return requireLessThanChars(maxChars, value, null);
	}

	/**
	 * Checks that the given <code>String</code> has less characters than the stated
	 * maximum chars (exclusive). Returns <code>value</code> if the given
	 * <code>String</code>'s length (number of characters) is less than the given
	 * <code>maxChars</code>, otherwise an {@link IllegalArgumentException} will be
	 * thrown. An optional message may be passed to be used in the construction of
	 * the <code>IllegalArgumentException</code>. <br>
	 * <br>
	 * <i><b>NOTE:</b> This method internally uses
	 * {@link #hasLessThanChars(int, String)}, so an
	 * <code>IllegalArgumentException</code> might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param maxChars
	 *            the maximum number of characters (exclusive) that the given
	 *            <code>String</code> should have.
	 * @param value
	 *            the <code>String</code> to check.
	 * @param message
	 *            an optional message to be used as as the IllegalArgumentException
	 *            message.
	 * 
	 * @return <code>value</code> if <code>value</code>'s length is less than
	 *         <code>maxChars</code>.
	 * 
	 * @throws NullPointerException
	 *             if <code>value</code> is <code>null</code>.
	 * @throws IllegalArgumentException
	 *             if any of the conditions stated above are/is met.
	 * 
	 * @see #hasLessThanChars(int, String)
	 */
	public final static String requireLessThanChars(int maxChars, String value, String message) {
		if (!hasLessThanChars(maxChars, value))
			throw new IllegalArgumentException(nonNull(message) ? message
					: String.format("value's length (%d) must be less than %d.", value.length(), maxChars));
		return value;
	}

	/**
	 * Checks that the given <code>String</code> has more characters than the stated
	 * minimum chars (inclusive). Returns <code>value</code> if the given
	 * <code>String</code>'s length (number of characters) is greater than or equal
	 * to the given <code>minChars</code>, otherwise, an
	 * {@link IllegalArgumentException} will be thrown. <br>
	 * <br>
	 * <i><b>NOTE:</b> This method internally uses
	 * {@link #hasMoreThanChars(int, String)}, so an
	 * <code>IllegalArgumentException</code> might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param minChars
	 *            the minimum number of characters (inclusive) that the given
	 *            <code>String</code> should have.
	 * @param value
	 *            the <code>String</code> to check.
	 * 
	 * @return <code>value</code> if <code>value</code>'s length is greater than or
	 *         equal to <code>minChars</code>.
	 * 
	 * @throws NullPointerException
	 *             if value is null.
	 * @throws IllegalArgumentException
	 *             if any of the conditions stated above are/is met.
	 * 
	 * @see #hasMoreThanChars(int, String)
	 */
	public final static String requireMoreThanChars(int minChars, String value) {
		return requireMoreThanChars(minChars, value, null);
	}

	/**
	 * Checks that the given <code>String</code> has more characters than the stated
	 * minimum chars (inclusive). Returns <code>value</code> if the given
	 * <code>String</code>'s length (number of characters) is greater than or equal
	 * to the given <code>minChars</code>, otherwise, an
	 * {@link IllegalArgumentException} will be thrown. An optional message may be
	 * passed to be used in the construction of the
	 * <code>IllegalArgumentException</code>. <br>
	 * <br>
	 * <i><b>NOTE:</b> This method internally uses
	 * {@link #hasMoreThanChars(int, String)}, so an
	 * <code>IllegalArgumentException</code> might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param minChars
	 *            the minimum number of characters (inclusive) that the given
	 *            <code>String</code> should have.
	 * @param value
	 *            the <code>String</code> to check.
	 * @param message
	 *            an optional message to be used as as the IllegalArgumentException
	 *            message.
	 * 
	 * @return <code>value</code> if <code>value</code>'s length is greater than or
	 *         equal to <code>minChars</code>.
	 * 
	 * @throws NullPointerException
	 *             if value is null.
	 * @throws IllegalArgumentException
	 *             if any of the conditions stated above are/is met.
	 * 
	 * @see #hasMoreThanChars(int, String)
	 */
	public final static String requireMoreThanChars(int minChars, String value, String message) {
		if (!hasMoreThanChars(minChars, value))
			throw new IllegalArgumentException(nonNull(message) ? message
					: String.format("value's length (%d) must be greater than or equal to %d.", value.length(),
							minChars));
		return value;
	}

	/**
	 * Checks that the supplied string is not empty or null. If the string is null,
	 * a {@link NullPointerException} is thrown and if the string is empty, a
	 * {@link IllegalArgumentException} is thrown. An invocation to this method
	 * behaves exactly like an invocation to
	 * {@link #requireNonEmptyString(String, String) requireNonEmptyString(value,
	 * null)}.
	 * 
	 * @param value
	 *            the string to be checked for validity.
	 * @return value if it's not <i>null <b>AND/OR</b> empty</i>.
	 * 
	 * @throws NullPointerException
	 *             if value is null.
	 * @throws IllegalArgumentException
	 *             if value is empty.
	 * 
	 * @see #requireNonEmptyString(String, String)
	 */
	public static final String requireNonEmptyString(String value) {
		return requireNonEmptyString(value, null);
	}

	/**
	 * Checks that the supplied string is not empty or null. If the string is null,
	 * a {@link NullPointerException} is thrown and if the string is empty, a
	 * {@link IllegalArgumentException} is thrown. The name of the string variable
	 * to be checked is passed as the last argument and is used in construction of
	 * the exception message. Consider the following:
	 * 
	 * <pre>
	 * 
	 * String firstName = "";
	 * requireNonEmptyString(firstName, "firstName");
	 * </pre>
	 * 
	 * An {@code IllegalArgumentException} would be thrown with the following
	 * message:
	 * 
	 * <pre>
	 * 		<i>"firstName cannot be empty"</i>
	 * </pre>
	 * 
	 * if a null value is passed in place of name, the string "value" is used
	 * instead. In the example above, the message would be:
	 * 
	 * <pre>
	 * 		<i>"value cannot be empty"</i>
	 * </pre>
	 * 
	 * @param value
	 *            the string to be checked for validity.
	 * @param name
	 *            the name of the string variable to be checked for validity.
	 * @return value if it's not <i>null <b>AND/OR</b> empty</i>.
	 * 
	 * @throws NullPointerException
	 *             if value is null.
	 * @throws IllegalArgumentException
	 *             if value is empty.
	 * 
	 * @see #requireNonEmptyString(String, String, String)
	 */
	public static final String requireNonEmptyString(String value, String name) {
		name = (isNull(name)) ? "value" : name;
		return requireNonEmptyString(value, name + " cannot be null.", name + " cannot be empty.");
	}

	/**
	 * Checks that the supplied string is not empty or null. If the string is null,
	 * a {@link NullPointerException} is thrown and if the string is empty, a
	 * {@link IllegalArgumentException} is thrown. Optional messages can be passed
	 * as the second and third arguments to be used in the construction of
	 * exceptions.
	 * 
	 * @param value
	 *            the string to be checked for validity
	 * @param nullMessage
	 *            the message to be used when raising the
	 *            <code>NullPointerException</code> or <code>null</code>
	 * @param emptyMessage
	 *            the message to be used when raising the
	 *            <code>IllegalArgumentException</code> or <code>null</code>
	 * @return value if it's not <i>null <b>AND/OR</b> empty</i>.
	 * 
	 * @throws NullPointerException
	 *             if value is null.
	 * @throws IllegalArgumentException
	 *             if value is empty.
	 */
	public static final String requireNonEmptyString(String value, String nullMessage, String emptyMessage) {
		// Check if messages are null and set defaults
		nullMessage = (isNull(nullMessage)) ? "value cannot be null." : nullMessage;
		emptyMessage = (isNull(emptyMessage)) ? "value cannot be empty." : emptyMessage;
		if (requireNonNull(value, nullMessage).isEmpty()) // Start by checking if the string is null
			throw new IllegalArgumentException(emptyMessage);
		return value;
	}

	private ObjectUtils() {
	}
}
