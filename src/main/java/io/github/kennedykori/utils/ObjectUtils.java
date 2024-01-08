/**
 * 
 */
package io.github.kennedykori.utils;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

import java.io.Serializable;
import java.math.BigDecimal;

import org.checkerframework.checker.index.qual.IndexFor;
import org.checkerframework.checker.index.qual.IndexOrHigh;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.common.value.qual.MinLen;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;

/**
 * This class consists of static utility methods<i>(similar to
 * {@link java.util.Objects})</i> for operating on objects, and primitives.
 * These utility methods can be classified into two main categories :-
 * 
 * <ol>
 * <li><i><strong>Methods that check if a certain condition is met</strong></i>
 * - These methods return a {@code boolean} value and typically have the
 * following prefixes: <i>has, in, is, etc.</i> These methods take a value or
 * values and return {@code true} if the value(s) meets a certain condition <i>
 * (e.g. check if a number is negative)</i> and {@code false} otherwise.</li>
 * 
 * <li><i><strong>Methods that validate if a certain condition is
 * met</strong></i> - These methods throw an {@code IllegalArgumentException}
 * if a condition they check for isn't met and are all prefixed with
 * <i>require</i>. These methods take a value and return the value if the value
 * meets a certain condition <i>(e.g. validate a number isn't negative)</i>,
 * otherwise, an {@code IllegalArgumentException} is thrown.</li>
 * </ol>
 * 
 * The utility methods in this class include methods for checking and validating
 * a {@code String}'s length, methods for checking and validating the negativity
 * of a number, methods for checking and validating if a number is less than or
 * greater than a given base value and methods for checking and validating if a
 * number falls in a given range.
 * 
 * <p>
 * <i> <strong>NOTE : </strong> Unless otherwise specified, methods in this
 * class use {@link Float#compare(float, float)} and
 * {@link Double#compare(double, double)} for {@code float} and {@code double}
 * comparisons. </i>
 * </p>
 * 
 * @author <a href="https://github.com/kennedykori"> Kennedy Kori</a>
 *
 * @since Sep 9, 2019, 6:31:47 PM
 * 
 */
public final class ObjectUtils {

	// ========================================================================
	// IS EQUAL CHECKS
	// ========================================================================
	/**
	 * Checks if an {@code int} is equal to a supplied base value. Returns
	 * {@code true} if the given {@code int} is equal to the supplied base value.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * @return {@code true} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@Pure
	public static boolean isEqualTo(int baseValue, int value) {
		return baseValue == value;
	}

	/**
	 * Checks if a {@code long} is equal to a supplied base value. Returns
	 * {@code true} if the given {@code long} is equal to the supplied base value.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * @return {@code true} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@Pure
	public static boolean isEqualTo(long baseValue, long value) {
		return baseValue == value;
	}

	/**
	 * Checks if a {@code float} is equal to a supplied base value. Returns
	 * {@code true} if the given {@code float} is equal to the supplied base
	 * value.<br>
	 * <br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Float#compare(float, float)} to compare the given values. </i>
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * 
	 * @return {@code true} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@Pure
	public static boolean isEqualTo(float baseValue, float value) {
		return Float.compare(value, baseValue) == 0;
	}

	/**
	 * Checks if a {@code double} is equal to a supplied base value. Returns
	 * {@code true} if the given {@code double} is equal to the supplied base value.
	 * <br>
	 * <br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Double#compare(double, double)} to compare the given values. </i>
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * 
	 * @return {@code true} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@Pure
	public static boolean isEqualTo(double baseValue, double value) {
		return Double.compare(value, baseValue) == 0;
	}

	/**
	 * Checks if a {@link BigDecimal} is equal to a supplied base value. Returns
	 * {@code true} if the given {@code BigDecimal} is equal to the supplied base
	 * value.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws NullPointerException if any of the two arguments is/are {@code null}.
	 *
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static boolean isEqualTo(BigDecimal baseValue, BigDecimal value) {
		return requireNonNull(value, "value cannot be null.")
				.compareTo(requireNonNull(baseValue, "baseValue cannot be null.")) == 0;
	}

	// ========================================================================
	// IS GREATER THAN CHECKS
	// ========================================================================
	/**
	 * Checks if an {@code int} is greater than a supplied base value. Returns
	 * {@code true} if the given {@code int} is greater than the supplied base
	 * value.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isGreaterThan(int baseValue, int value) {
		return value > baseValue;
	}

	/**
	 * Checks if a {@code long} is greater than a supplied base value. Returns
	 * {@code true} if the given {@code long} is greater than the supplied base
	 * value.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isGreaterThan(long baseValue, long value) {
		return value > baseValue;
	}

	/**
	 * Checks if a {@code float} is greater than a supplied base value. Returns
	 * {@code true} if the given {@code float} is greater than the supplied base
	 * value.<br>
	 * <br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Float#compare(float, float)} to compare the given values. </i>
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isGreaterThan(float baseValue, float value) {
		return Float.compare(value, baseValue) > 0;
	}

	/**
	 * Checks if a {@code double} is greater than a supplied base value. Returns
	 * {@code true} if the given {@code double} is greater than the supplied base
	 * value. <br>
	 * <br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Double#compare(double, double)} to compare the given values. </i>
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isGreaterThan(double baseValue, double value) {
		return Double.compare(value, baseValue) > 0;
	}

	/**
	 * Checks if a {@link BigDecimal} is greater than a supplied base value. Returns
	 * {@code true} if the given {@code BigDecimal} is greater than the supplied
	 * base value.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * 
	 * @return {@code true} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws NullPointerException if any of the two arguments is/are {@code null}.
	 *
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static boolean isGreaterThan(BigDecimal baseValue, BigDecimal value) {
		return requireNonNull(value, "value cannot be null.")
				.compareTo(requireNonNull(baseValue, "baseValue cannot be null.")) > 0;
	}

	// ========================================================================
	// IS GREATER THAN OR EQUAL TO CHECKS
	// ========================================================================
	/**
	 * Checks if an {@code int} is greater than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code int} is greater than or equal to the
	 * supplied base value.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * 
	 * @return {@code true} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isGreaterThanOrEqualTo(int baseValue, int value) {
		return value >= baseValue;
	}

	/**
	 * Checks if a {@code long} is greater than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code long} is greater than or equal to
	 * the supplied base value.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * 
	 * @return {@code true} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isGreaterThanOrEqualTo(long baseValue, long value) {
		return value >= baseValue;
	}

	/**
	 * Checks if a {@code float} is greater than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code float} is greater than or equal to
	 * the supplied base value. <br>
	 * <br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Float#compare(float, float)} to compare the given values. </i>
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * 
	 * @return {@code true} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isGreaterThanOrEqualTo(float baseValue, float value) {
		return Float.compare(value, baseValue) >= 0;
	}

	/**
	 * Checks if a {@code double} is greater than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code double} is greater than or equal to
	 * the supplied base value. <br>
	 * <br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Double#compare(double, double)} to compare the given values. </i>
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * 
	 * @return {@code true} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isGreaterThanOrEqualTo(double baseValue, double value) {
		return Double.compare(value, baseValue) >= 0;
	}

	/**
	 * Checks if a {@link BigDecimal} is greater than or equal to a supplied base
	 * value. Returns {@code true} if the given {@code BigDecimal} is greater than
	 * or equal to the supplied base value.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * 
	 * @return {@code true} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws NullPointerException if any of the two arguments is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static boolean isGreaterThanOrEqualTo(BigDecimal baseValue, BigDecimal value) {
		return requireNonNull(value, "value cannot be null.")
				.compareTo(requireNonNull(baseValue, "baseValue cannot be null.")) >= 0;
	}

	// ========================================================================
	// IS NEGATIVE CHECKS
	// ========================================================================
	/**
	 * Checks if an integer is negative, i.e, less than 0 and returns
	 * <code>true</code> if the integer is negative, otherwise returns
	 * <code>false</code>
	 * 
	 * @param value the integer to check
	 * @return <code>true</code> if the integer is negative, otherwise returns
	 *         <code>false</code>
	 */
	@Pure
	public static boolean isNegative(int value) {
		return isLessThan(0, value);
	}

	/**
	 * Checks if a long is negative, i.e, less than 0 and returns <code>true</code>
	 * if the long is negative, otherwise returns <code>false</code>
	 * 
	 * @param value the long to check
	 * @return <code>true</code> if the long is negative, otherwise returns
	 *         <code>false</code>
	 */
	@Pure
	public static boolean isNegative(long value) {
		return isLessThan(0L, value);
	}

	/**
	 * Checks if a float is negative, i.e, less than 0 and returns <code>true</code>
	 * if the float is negative, otherwise returns <code>false</code>
	 * 
	 * @param value the float to check
	 * @return <code>true</code> if the float is negative, otherwise returns
	 *         <code>false</code>
	 */
	@Pure
	public static boolean isNegative(float value) {
		return isLessThan(0F, value);
	}

	/**
	 * Checks if a double is negative, i.e, less than 0 and returns
	 * <code>true</code> if the double is negative, otherwise returns
	 * <code>false</code>
	 * 
	 * @param value the double to check
	 * @return <code>true</code> if the double is negative, otherwise returns
	 *         <code>false</code>
	 */
	@Pure
	public static boolean isNegative(double value) {
		return isLessThan(0D, value);
	}

	/**
	 * Checks if a {@link BigDecimal} is negative, i.e, less than 0 and returns
	 * <code>true</code>, otherwise returns <code>false</code>
	 * 
	 * @param value the <code>BigDecimal</code> to check
	 * 
	 * @return <code>true</code> if the <code>BigDecimal</code> is negative,
	 *         otherwise returns <code>false</code>
	 * 
	 * @throws NullPointerException if value is <code>null</code>.
	 */
	public static boolean isNegative(BigDecimal value) {
		return requireNonNull(value).signum() < 0;
	}

	// ========================================================================
	// IS LESS THAN CHECKS
	// ========================================================================
	/**
	 * Checks if an {@code int} is less than a supplied base value. Returns
	 * {@code true} if the given {@code int} is less than the supplied base value.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * 
	 * @return {@code true} if {@code value} is less than {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isLessThan(int baseValue, int value) {
		return value < baseValue;
	}

	/**
	 * Checks if a {@code long} is less than a supplied base value. Returns
	 * {@code true} if the given {@code long} is less than the supplied base value.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * 
	 * @return {@code true} if {@code value} is less than {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isLessThan(long baseValue, long value) {
		return value < baseValue;
	}

	/**
	 * Checks if a {@code float} is less than a supplied base value. Returns
	 * {@code true} if the given {@code float} is less than the supplied base value.
	 * <br>
	 * <br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Float#compare(float, float)} to compare the given values. </i>
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * 
	 * @return {@code true} if {@code value} is less than {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isLessThan(float baseValue, float value) {
		return Float.compare(value, baseValue) < 0;
	}

	/**
	 * Checks if a {@code double} is less than a supplied base value. Returns
	 * {@code true} if the given {@code double} is less than the supplied base
	 * value. <br>
	 * <br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Double#compare(double, double)} to compare the given values. </i>
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * 
	 * @return {@code true} if {@code value} is less than {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isLessThan(double baseValue, double value) {
		return Double.compare(value, baseValue) < 0;
	}

	/**
	 * Checks if a {@link BigDecimal} is less than a supplied base value. Returns
	 * {@code true} if the given {@code BigDecimal} is less than the supplied base
	 * value.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * 
	 * @return {@code true} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws NullPointerException if any of the two arguments is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static boolean isLessThan(BigDecimal baseValue, BigDecimal value) {
		return requireNonNull(value, "value cannot be null.")
				.compareTo(requireNonNull(baseValue, "baseValue cannot be null.")) < 0;
	}

	// ========================================================================
	// IS LESS THAN OR EQUAL TO CHECKS
	// ========================================================================
	/**
	 * Checks if an {@code int} is less than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code int} is less than or equal to the
	 * supplied base value.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * 
	 * @return {@code true} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isLessThanOrEqualTo(int baseValue, int value) {
		return value <= baseValue;
	}

	/**
	 * Checks if a {@code long} is less than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code long} is less than or equal to the
	 * supplied base value.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * 
	 * @return {@code true} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isLessThanOrEqualTo(long baseValue, long value) {
		return value <= baseValue;
	}

	/**
	 * Checks if a {@code float} is less than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code float} is less than or equal to the
	 * supplied base value. <br>
	 * <br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Float#compare(float, float)} to compare the given values. </i>
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * 
	 * @return {@code true} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isLessThanOrEqualTo(float baseValue, float value) {
		return Float.compare(value, baseValue) <= 0;
	}

	/**
	 * Checks if a {@code double} is less than or equal to a supplied base value.
	 * Returns {@code true} if the given {@code double} is less than or equal to the
	 * supplied base value. <br>
	 * <br>
	 * <i> <strong>NOTE:</strong> This method uses
	 * {@link Double#compare(double, double)} to compare the given values. </i>
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * 
	 * @return {@code true} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@Pure
	public static boolean isLessThanOrEqualTo(double baseValue, double value) {
		return Double.compare(value, baseValue) <= 0;
	}

	/**
	 * Checks if a {@link BigDecimal} is less than or equal to a supplied base
	 * value. Returns {@code true} if the given {@code BigDecimal} is less than or
	 * equal to the supplied base value.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * 
	 * @return {@code true} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws NullPointerException if any of the two arguments is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static boolean isLessThanOrEqualTo(BigDecimal baseValue, BigDecimal value) {
		return requireNonNull(value, "value cannot be null.")
				.compareTo(requireNonNull(baseValue, "baseValue cannot be null.")) <= 0;
	}

	// ========================================================================
	// IN RANGE CHECKS
	// ========================================================================
	/**
	 * Checks that the specified <code>Integer</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>true</code> if <code>value</code> is greater than or equal to
	 * <code>minValue</code> and less than <code>maxValue</code>, <code>false</code>
	 * otherwise. An {@link IllegalArgumentException} will be thrown if the maximum
	 * value is less than the minimum value.
	 * 
	 * @param minValue the minimum value(inclusive) of the range.
	 * @param maxValue the maximum value(exclusive) of the range.
	 * @param value    the integer to check.
	 * 
	 * @return <code>true</code> if <code>value</code> is greater than or equal to
	 *         <code>minValue</code> and less than <code>maxValue</code>,
	 *         <code>false</code> otherwise.
	 * 
	 * @throws IllegalArgumentException if <code>maxValue</code> is less than
	 *                                  <code>minValue</code>.
	 */
	@SideEffectFree
	public static boolean inRange(int minValue, int maxValue, int value) {
		requireGreaterThanOrEqualTo(minValue, maxValue,
				String.format("maxValue( %d ) cannot be less than minValue( %d ).", maxValue, minValue));
		return isGreaterThanOrEqualTo(minValue, value) && isLessThan(maxValue, value);
	}

	/**
	 * Checks that the specified <code>Long</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>true</code> if <code>value</code> is greater than or equal to
	 * <code>minValue</code> and less than <code>maxValue</code>, <code>false</code>
	 * otherwise. An {@link IllegalArgumentException} will be thrown if the maximum
	 * value is less than the minimum value.
	 * 
	 * @param minValue the minimum value(inclusive) of the range.
	 * @param maxValue the maximum value(exclusive) of the range.
	 * @param value    the long to check.
	 * 
	 * @return <code>true</code> if <code>value</code> is greater than or equal to
	 *         <code>minValue</code> and less than <code>maxValue</code>,
	 *         <code>false</code> otherwise.
	 * 
	 * @throws IllegalArgumentException if <code>maxValue</code> is less than
	 *                                  <code>minValue</code>.
	 */
	@SideEffectFree
	public static boolean inRange(long minValue, long maxValue, long value) {
		requireGreaterThanOrEqualTo(minValue, maxValue,
				String.format("maxValue( %d ) cannot be less than minValue( %d ).", maxValue, minValue));
		return isGreaterThanOrEqualTo(minValue, value) && isLessThan(maxValue, value);
	}

	/**
	 * Checks that the specified <code>Float</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>true</code> if <code>value</code> is greater than or equal to
	 * <code>minValue</code> and less than <code>maxValue</code>, <code>false</code>
	 * otherwise. An {@link IllegalArgumentException} will be thrown if the maximum
	 * value is less than the minimum value.
	 * 
	 * @param minValue the minimum value(inclusive) of the range.
	 * @param maxValue the maximum value(exclusive) of the range.
	 * @param value    the float to check.
	 * 
	 * @return <code>true</code> if <code>value</code> is greater than or equal to
	 *         <code>minValue</code> and less than <code>maxValue</code>,
	 *         <code>false</code> otherwise.
	 * 
	 * @throws IllegalArgumentException if <code>maxValue</code> is less than
	 *                                  <code>minValue</code>.
	 */
	@SideEffectFree
	public static boolean inRange(float minValue, float maxValue, float value) {
		requireGreaterThanOrEqualTo(minValue, maxValue,
				String.format("maxValue( %f ) cannot be less than minValue( %f ).", maxValue, minValue));
		return isGreaterThanOrEqualTo(minValue, value) && isLessThan(maxValue, value);
	}

	/**
	 * Checks that the specified <code>Double</code> is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>true</code> if <code>value</code> is greater than or equal to
	 * <code>minValue</code> and less than <code>maxValue</code>, <code>false</code>
	 * otherwise. An {@link IllegalArgumentException} will be thrown if the maximum
	 * value is less than the minimum value.
	 * 
	 * @param minValue the minimum value(inclusive) of the range.
	 * @param maxValue the maximum value(exclusive) of the range.
	 * @param value    the double to check.
	 * 
	 * @return <code>true</code> if <code>value</code> is greater than or equal to
	 *         <code>minValue</code> and less than <code>maxValue</code>,
	 *         <code>false</code> otherwise.
	 * 
	 * @throws IllegalArgumentException if <code>maxValue</code> is less than
	 *                                  <code>minValue</code>.
	 */
	@SideEffectFree
	public static boolean inRange(double minValue, double maxValue, double value) {
		requireGreaterThanOrEqualTo(minValue, maxValue,
				String.format("maxValue( %f ) cannot be less than minValue( %f ).", maxValue, minValue));
		return isGreaterThanOrEqualTo(minValue, value) && isLessThan(maxValue, value);
	}

	/**
	 * Checks that the specified {@link BigDecimal} is in range of the specified
	 * minimum value (inclusive) and maximum value (exclusive). Returns
	 * <code>true</code> if <code>value</code> is greater than or equal to
	 * <code>minValue</code> and less than <code>maxValue</code>, <code>false</code>
	 * otherwise. An {@link IllegalArgumentException} will be thrown if the maximum
	 * value is less than the minimum value.
	 * 
	 * @param minValue the minimum value(inclusive) of the range.
	 * @param maxValue the maximum value(exclusive) of the range.
	 * @param value    the <code>BigDecimal</code> to check.
	 * 
	 * @return <code>true</code> if <code>value</code> is greater than or equal to
	 *         <code>minValue</code> and less than <code>maxValue</code>,
	 *         <code>false</code> otherwise.
	 * 
	 * @throws NullPointerException     if any of the arguments passed are
	 *                                  <code>null</code>.
	 * @throws IllegalArgumentException if <code>maxValue</code> is less than
	 *                                  <code>minValue</code>.
	 */
	@SideEffectFree
	public static boolean inRange(BigDecimal minValue, BigDecimal maxValue, BigDecimal value) {
		requireGreaterThanOrEqualTo(minValue, maxValue,
				String.format("maxValue( %s ) cannot be less than minValue( %s ).", maxValue, minValue));
		return isGreaterThanOrEqualTo(minValue, value) && isLessThan(maxValue, value);
	}

	// ========================================================================
	// REQUIRE EQUAL TO VALIDATORS
	// ========================================================================
	/**
	 * Validates that an {@code int} is equal to a supplied base value. Returns the
	 * given {@code int} if it is equal to the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * 
	 * @return {@code value} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not equal to
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static int requireEqualTo(int baseValue, int value) {
		return requireEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that an {@code int} is equal to a supplied base value. Returns the
	 * given {@code int} if it is equal to the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not equal to
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static int requireEqualTo(int baseValue, int value, @Nullable String message) {
		if (!isEqualTo(baseValue, value))
			throw new IllegalArgumentException(
					(nonNull(message) ? message : String.format("value(%d) should be equal to %d.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code long} is equal to a supplied base value. Returns the
	 * given {@code long} if it is equal to the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * 
	 * @return {@code value} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not equal to
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static long requireEqualTo(long baseValue, long value) {
		return requireEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@code long} is equal to a supplied base value. Returns the
	 * given {@code long} if it is equal to the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not equal to
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static long requireEqualTo(long baseValue, long value, @Nullable String message) {
		if (!isEqualTo(baseValue, value))
			throw new IllegalArgumentException(
					(nonNull(message) ? message : String.format("value(%d) should be equal to %d.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code long} is equal to a supplied base value. Returns the
	 * given {@code long} if it is equal to the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * 
	 * @return {@code value} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not equal to
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static float requireEqualTo(float baseValue, float value) {
		return requireEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@code float} is equal to a supplied base value. Returns the
	 * given {@code float} if it is equal to the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not equal to
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static float requireEqualTo(float baseValue, float value, @Nullable String message) {
		if (!isEqualTo(baseValue, value))
			throw new IllegalArgumentException(
					(nonNull(message) ? message : String.format("value(%f) should be equal to %f.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code double} is equal to a supplied base value. Returns
	 * the given {@code double} if it is equal to the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * 
	 * @return {@code value} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not equal to
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static double requireEqualTo(double baseValue, double value) {
		return requireEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@code double} is equal to a supplied base value. Returns
	 * the given {@code double} if it is equal to the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not equal to
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static double requireEqualTo(double baseValue, double value, @Nullable String message) {
		if (!isEqualTo(baseValue, value))
			throw new IllegalArgumentException(
					(nonNull(message) ? message : String.format("value(%f) should be equal to %f.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@link BigDecimal} is equal to a supplied base value.
	 * Returns the given {@code BigDecimal} if it is equal to the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * 
	 * @return {@code value} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not equal to
	 *                                  {@code baseValue}.
	 * @throws NullPointerException     if {@code baseValue} or/and {@code value}
	 *                                  is/are {@code null}.
	 * 
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static BigDecimal requireEqualTo(BigDecimal baseValue, BigDecimal value) {
		return requireEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@link BigDecimal} is equal to a supplied base value.
	 * Returns the given {@code BigDecimal} if it is equal to the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for equality to.
	 * @param value     the value to check for equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is equal to {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not equal to
	 *                                  {@code baseValue}.
	 * @throws NullPointerException     if {@code baseValue} or/and {@code value}
	 *                                  is/are {@code null}.
	 * 
	 * @since 1.2.0
	 */
	@SideEffectFree
	public static BigDecimal requireEqualTo(BigDecimal baseValue, BigDecimal value, @Nullable String message) {
		if (!isEqualTo(baseValue, value))
			throw new IllegalArgumentException(
					(nonNull(message) ? message : String.format("value(%s) should be equal to %s.", value, baseValue)));
		return value;
	}

	// ========================================================================
	// REQUIRE GREATER THAN VALIDATORS
	// ========================================================================
	/**
	 * Validates that an {@code int} is greater than a supplied base value. Returns
	 * the given {@code int} if it is greater than the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static int requireGreaterThan(int baseValue, int value) {
		return requireGreaterThan(baseValue, value, null);
	}

	/**
	 * Validates that an {@code int} is greater than a supplied base value. Returns
	 * the given {@code int} if it is greater than the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static int requireGreaterThan(int baseValue, int value, @Nullable String message) {
		if (!isGreaterThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code long} is greater than a supplied base value. Returns
	 * the given {@code long} if it is greater than the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static long requireGreaterThan(long baseValue, long value) {
		return requireGreaterThan(baseValue, value, null);
	}

	/**
	 * Validates that a {@code long} is greater than a supplied base value. Returns
	 * the given {@code long} if it is greater than the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static long requireGreaterThan(long baseValue, long value, @Nullable String message) {
		if (!isGreaterThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code float} is greater than a supplied base value. Returns
	 * the given {@code float} if it is greater than the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static float requireGreaterThan(float baseValue, float value) {
		return requireGreaterThan(baseValue, value, null);
	}

	/**
	 * Validates that a {@code float} is greater than a supplied base value. Returns
	 * the given {@code float} if it is greater than the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static float requireGreaterThan(float baseValue, float value, @Nullable String message) {
		if (!isGreaterThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code double} is greater than a supplied base value.
	 * Returns the given {@code double} if it is greater than the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static double requireGreaterThan(double baseValue, double value) {
		return requireGreaterThan(baseValue, value, null);
	}

	/**
	 * Validates that a {@code double} is greater than a supplied base value.
	 * Returns the given {@code double} if it is greater than the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static double requireGreaterThan(double baseValue, double value, @Nullable String message) {
		if (!isGreaterThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@link BigDecimal} is greater than a supplied base value.
	 * Returns the given {@code BigDecimal} if it is greater than the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * @throws NullPointerException     if {@code baseValue} or/and {@code value}
	 *                                  is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static BigDecimal requireGreaterThan(BigDecimal baseValue, BigDecimal value) {
		return requireGreaterThan(baseValue, value, null);
	}

	/**
	 * Validates that a {@link BigDecimal} is greater than a supplied base value.
	 * Returns the given {@code BigDecimal} if it is greater than the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness against.
	 * @param value     the value to check for greatness.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * @throws NullPointerException     if {@code baseValue} or/and {@code value}
	 *                                  is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static BigDecimal requireGreaterThan(BigDecimal baseValue, BigDecimal value, @Nullable String message) {
		if (!isGreaterThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%s) should be greater than %s.", value, baseValue)));
		return value;
	}

	// ========================================================================
	// REQUIRE GREATER THAN OR EQUAL TO VALIDATORS
	// ========================================================================
	/**
	 * Validates that an {@code int} is greater than or equal to a supplied base
	 * value. Returns the given {@code int} if it is greater than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static int requireGreaterThanOrEqualTo(int baseValue, int value) {
		return requireGreaterThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that an {@code int} is greater than or equal to a supplied base
	 * value. Returns the given {@code int} if it is greater than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static int requireGreaterThanOrEqualTo(int baseValue, int value, @Nullable String message) {
		if (!isGreaterThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than or equal %d.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code long} is greater than or equal to a supplied base
	 * value. Returns the given {@code long} if it is greater than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static long requireGreaterThanOrEqualTo(long baseValue, long value) {
		return requireGreaterThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@code long} is greater than or equal to a supplied base
	 * value. Returns the given {@code long} if it is greater than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static long requireGreaterThanOrEqualTo(long baseValue, long value, @Nullable String message) {
		if (!isGreaterThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than or equal %d.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code float} is greater than or equal to a supplied base
	 * value. Returns the given {@code float} if it is greater than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static float requireGreaterThanOrEqualTo(float baseValue, float value) {
		return requireGreaterThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@code float} is greater than or equal to a supplied base
	 * value. Returns the given {@code float} if it is greater than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static float requireGreaterThanOrEqualTo(float baseValue, float value, @Nullable String message) {
		if (!isGreaterThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than or equal %f.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code double} is greater than or equal to a supplied base
	 * value. Returns the given {@code double} if it is greater than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static double requireGreaterThanOrEqualTo(double baseValue, double value) {
		return requireGreaterThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@code double} is greater than or equal to a supplied base
	 * value. Returns the given {@code double} if it is greater than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static double requireGreaterThanOrEqualTo(double baseValue, double value, @Nullable String message) {
		if (!isGreaterThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than or equal %f.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@link BigDecimal} is greater than or equal to a supplied
	 * base value. Returns the given {@code BigDecimal} if it is greater than or
	 * equal to the given base value, otherwise, an {@code IllegalArgumentException}
	 * is thrown.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * @throws NullPointerException     if {@code baseValue} or/and {@code value}
	 *                                  is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static BigDecimal requireGreaterThanOrEqualTo(BigDecimal baseValue, BigDecimal value) {
		return requireGreaterThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@link BigDecimal} is greater than or equal to a supplied
	 * base value. Returns the given {@code BigDecimal} if it is greater than or
	 * equal to the given base value, otherwise, an {@code IllegalArgumentException}
	 * is thrown.
	 * 
	 * @param baseValue the value to compare for greatness or equality against.
	 * @param value     the value to check for greatness or equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is greater than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is less than
	 *                                  {@code baseValue}.
	 * @throws NullPointerException     if {@code baseValue} or/and {@code value}
	 *                                  is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static BigDecimal requireGreaterThanOrEqualTo(BigDecimal baseValue, BigDecimal value, @Nullable String message) {
		if (!isGreaterThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%s) should be greater than or equal %s.", value, baseValue)));
		return value;
	}

	// ========================================================================
	// REQUIRE IN RANGE VALIDATORS
	// ========================================================================
	/**
	 * Validates that the specified {@code int} is in range of the specified minimum
	 * value <i><strong>(inclusive)</strong></i> and maximum value
	 * <i><strong>(exclusive)</strong></i>. Returns {@code value} if it is in the
	 * specified range, i.e, {@code value} is greater than or equal to
	 * {@code minValue} and less than {@code maxValue}, otherwise, an
	 * {@code IllegalArgumentException} is thrown. An
	 * {@code IllegalArgumentException} will also be thrown if the maximum value is
	 * less than the minimum value.
	 * 
	 * @param minValue the minimum value<i><strong>(inclusive)</strong></i> of the
	 *                 range.
	 * @param maxValue the maximum value<i><strong>(exclusive)</strong></i> of the
	 *                 range.
	 * @param value    the {@code int} to check.
	 * 
	 * @return {@code value} if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not in the specified
	 *                                  range or if {@code maxValue} is less than
	 *                                  {@code minValue}.
	 */
	@SideEffectFree
	public static int requireInRange(int minValue, int maxValue, int value) {
		return requireInRange(minValue, maxValue, value, null);
	}

	/**
	 * Validates that the specified {@code int} is in range of the specified minimum
	 * value <i><strong>(inclusive)</strong></i> and maximum value
	 * <i><strong>(exclusive)</strong></i>. Returns {@code value} if it is in the
	 * specified range, i.e, {@code value} is greater than or equal to
	 * {@code minValue} and less than {@code maxValue}, otherwise, an
	 * {@code IllegalArgumentException} is thrown. An
	 * {@code IllegalArgumentException} will also be thrown if the maximum value is
	 * less than the minimum value. An optional message can also be given to be used
	 * as the exception message.
	 * 
	 * @param minValue the minimum value<i><strong>(inclusive)</strong></i> of the
	 *                 range.
	 * @param maxValue the maximum value<i><strong>(exclusive)</strong></i> of the
	 *                 range.
	 * @param value    the {@code int} to check.
	 * @param message  an optional message to be used as as the
	 *                 {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not in the specified
	 *                                  range or if {@code maxValue} is less than
	 *                                  {@code minValue}.
	 */
	@SideEffectFree
	public static int requireInRange(int minValue, int maxValue, int value, @Nullable String message) {
		if (!inRange(minValue, maxValue, value))
			throw new IllegalArgumentException((nonNull(message)) ? message
					: String.format("value(%d) should be more than or equal to %d and less than %d.", value, minValue,
							maxValue));
		return value;
	}

	/**
	 * Validates that the specified {@code long} is in range of the specified
	 * minimum value <i><strong>(inclusive)</strong></i> and maximum value
	 * <i><strong>(exclusive)</strong></i>. Returns {@code value} if it is in the
	 * specified range, i.e, {@code value} is greater than or equal to
	 * {@code minValue} and less than {@code maxValue}, otherwise, an
	 * {@code IllegalArgumentException} is thrown. An
	 * {@code IllegalArgumentException} will also be thrown if the maximum value is
	 * less than the minimum value.
	 * 
	 * @param minValue the minimum value<i><strong>(inclusive)</strong></i> of the
	 *                 range.
	 * @param maxValue the maximum value<i><strong>(exclusive)</strong></i> of the
	 *                 range.
	 * @param value    the {@code long} to check.
	 * 
	 * @return {@code value} if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not in the specified
	 *                                  range or if {@code maxValue} is less than
	 *                                  {@code minValue}.
	 */
	@SideEffectFree
	public static long requireInRange(long minValue, long maxValue, long value) {
		return requireInRange(minValue, maxValue, value, null);
	}

	/**
	 * Validates that the specified {@code long} is in range of the specified
	 * minimum value <i><strong>(inclusive)</strong></i> and maximum value
	 * <i><strong>(exclusive)</strong></i>. Returns {@code value} if it is in the
	 * specified range, i.e, {@code value} is greater than or equal to
	 * {@code minValue} and less than {@code maxValue}, otherwise, an
	 * {@code IllegalArgumentException} is thrown. An
	 * {@code IllegalArgumentException} will also be thrown if the maximum value is
	 * less than the minimum value. An optional message can also be given to be used
	 * as the exception message.
	 * 
	 * @param minValue the minimum value<i><strong>(inclusive)</strong></i> of the
	 *                 range.
	 * @param maxValue the maximum value<i><strong>(exclusive)</strong></i> of the
	 *                 range.
	 * @param value    the {@code long} to check.
	 * @param message  an optional message to be used as as the
	 *                 {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not in the specified
	 *                                  range or if {@code maxValue} is less than
	 *                                  {@code minValue}.
	 */
	@SideEffectFree
	public static long requireInRange(long minValue, long maxValue, long value, @Nullable String message) {
		if (!inRange(minValue, maxValue, value))
			throw new IllegalArgumentException((nonNull(message)) ? message
					: String.format("value(%d) should be more than or equal to %d and less than %d.", value, minValue,
							maxValue));
		return value;
	}

	/**
	 * Validates that the specified {@code float} is in range of the specified
	 * minimum value <i><strong>(inclusive)</strong></i> and maximum value
	 * <i><strong>(exclusive)</strong></i>. Returns {@code value} if it is in the
	 * specified range, i.e, {@code value} is greater than or equal to
	 * {@code minValue} and less than {@code maxValue}, otherwise, an
	 * {@code IllegalArgumentException} is thrown. An
	 * {@code IllegalArgumentException} will also be thrown if the maximum value is
	 * less than the minimum value.
	 * 
	 * @param minValue the minimum value<i><strong>(inclusive)</strong></i> of the
	 *                 range.
	 * @param maxValue the maximum value<i><strong>(exclusive)</strong></i> of the
	 *                 range.
	 * @param value    the {@code float} to check.
	 * 
	 * @return {@code value} if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not in the specified
	 *                                  range or if {@code maxValue} is less than
	 *                                  {@code minValue}.
	 */
	@SideEffectFree
	public static float requireInRange(float minValue, float maxValue, float value) {
		return requireInRange(minValue, maxValue, value, null);
	}

	/**
	 * Validates that the specified {@code float} is in range of the specified
	 * minimum value <i><strong>(inclusive)</strong></i> and maximum value
	 * <i><strong>(exclusive)</strong></i>. Returns {@code value} if it is in the
	 * specified range, i.e, {@code value} is greater than or equal to
	 * {@code minValue} and less than {@code maxValue}, otherwise, an
	 * {@code IllegalArgumentException} is thrown. An
	 * {@code IllegalArgumentException} will also be thrown if the maximum value is
	 * less than the minimum value. An optional message can also be given to be used
	 * as the exception message.
	 * 
	 * @param minValue the minimum value<i><strong>(inclusive)</strong></i> of the
	 *                 range.
	 * @param maxValue the maximum value<i><strong>(exclusive)</strong></i> of the
	 *                 range.
	 * @param value    the {@code float} to check.
	 * @param message  an optional message to be used as as the
	 *                 {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not in the specified
	 *                                  range or if {@code maxValue} is less than
	 *                                  {@code minValue}.
	 */
	@SideEffectFree
	public static float requireInRange(float minValue, float maxValue, float value, @Nullable String message) {
		if (!inRange(minValue, maxValue, value))
			throw new IllegalArgumentException((nonNull(message)) ? message
					: String.format("value(%f) should be more than or equal to %f and less than %f.", value, minValue,
							maxValue));
		return value;
	}

	/**
	 * Validates that the specified {@code double} is in range of the specified
	 * minimum value <i><strong>(inclusive)</strong></i> and maximum value
	 * <i><strong>(exclusive)</strong></i>. Returns {@code value} if it is in the
	 * specified range, i.e, {@code value} is greater than or equal to
	 * {@code minValue} and less than {@code maxValue}, otherwise, an
	 * {@code IllegalArgumentException} is thrown. An
	 * {@code IllegalArgumentException} will also be thrown if the maximum value is
	 * less than the minimum value.
	 * 
	 * @param minValue the minimum value<i><strong>(inclusive)</strong></i> of the
	 *                 range.
	 * @param maxValue the maximum value<i><strong>(exclusive)</strong></i> of the
	 *                 range.
	 * @param value    the {@code double} to check.
	 * 
	 * @return {@code value} if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not in the specified
	 *                                  range or if {@code maxValue} is less than
	 *                                  {@code minValue}.
	 */
	@SideEffectFree
	public static double requireInRange(double minValue, double maxValue, double value) {
		return requireInRange(minValue, maxValue, value, null);
	}

	/**
	 * Validates that the specified {@code double} is in range of the specified
	 * minimum value <i><strong>(inclusive)</strong></i> and maximum value
	 * <i><strong>(exclusive)</strong></i>. Returns {@code value} if it is in the
	 * specified range, i.e, {@code value} is greater than or equal to
	 * {@code minValue} and less than {@code maxValue}, otherwise, an
	 * {@code IllegalArgumentException} is thrown. An
	 * {@code IllegalArgumentException} will also be thrown if the maximum value is
	 * less than the minimum value. An optional message can also be given to be used
	 * as the exception message.
	 * 
	 * @param minValue the minimum value<i><strong>(inclusive)</strong></i> of the
	 *                 range.
	 * @param maxValue the maximum value<i><strong>(exclusive)</strong></i> of the
	 *                 range.
	 * @param value    the {@code double} to check.
	 * @param message  an optional message to be used as as the
	 *                 {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not in the specified
	 *                                  range or if {@code maxValue} is less than
	 *                                  {@code minValue}.
	 */
	@SideEffectFree
	public static double requireInRange(double minValue, double maxValue, double value, @Nullable String message) {
		if (!inRange(minValue, maxValue, value))
			throw new IllegalArgumentException((nonNull(message)) ? message
					: String.format("value(%f) should be more than or equal to %f and less than %f.", value, minValue,
							maxValue));
		return value;
	}

	/**
	 * Validates that the specified {@link BigDecimal} is in range of the specified
	 * minimum value <i><strong>(inclusive)</strong></i> and maximum value
	 * <i><strong>(exclusive)</strong></i>. Returns {@code value} if it is in the
	 * specified range, i.e, {@code value} is greater than or equal to
	 * {@code minValue} and less than {@code maxValue}, otherwise, an
	 * {@code IllegalArgumentException} is thrown. An
	 * {@code IllegalArgumentException} will also be thrown if the maximum value is
	 * less than the minimum value.
	 * 
	 * @param minValue the minimum value<i><strong>(inclusive)</strong></i> of the
	 *                 range.
	 * @param maxValue the maximum value<i><strong>(exclusive)</strong></i> of the
	 *                 range.
	 * @param value    the {@code BigDecimal} to check.
	 * 
	 * @return {@code value} if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not in the specified
	 *                                  range or if {@code maxValue} is less than
	 *                                  {@code minValue}.
	 * @throws NullPointerException     if any of the arguments is/are {@code null}.
	 * 
	 * @see BigDecimal
	 */
	@SideEffectFree
	public static BigDecimal requireInRange(BigDecimal minValue, BigDecimal maxValue, BigDecimal value) {
		return requireInRange(minValue, maxValue, value, null);
	}

	/**
	 * Validates that the specified {@link BigDecimal} is in range of the specified
	 * minimum value <i><strong>(inclusive)</strong></i> and maximum value
	 * <i><strong>(exclusive)</strong></i>. Returns {@code value} if it is in the
	 * specified range, i.e, {@code value} is greater than or equal to
	 * {@code minValue} and less than {@code maxValue}, otherwise, an
	 * {@code IllegalArgumentException} is thrown. An
	 * {@code IllegalArgumentException} will also be thrown if the maximum value is
	 * less than the minimum value. An optional message can also be given to be used
	 * as the exception message.
	 * 
	 * @param minValue the minimum value<i><strong>(inclusive)</strong></i> of the
	 *                 range.
	 * @param maxValue the maximum value<i><strong>(exclusive)</strong></i> of the
	 *                 range.
	 * @param value    the {@code BigDecimal} to check.
	 * @param message  an optional message to be used as as the
	 *                 {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if it is in the specified range.
	 * 
	 * @throws IllegalArgumentException if {@code value} is not in the specified
	 *                                  range or if {@code maxValue} is less than
	 *                                  {@code minValue}.
	 * @throws NullPointerException     if any of the first three arguments is/are
	 *                                  {@code null}.
	 * 
	 * @see BigDecimal
	 */
	@SideEffectFree
	public static BigDecimal requireInRange(BigDecimal minValue, BigDecimal maxValue, BigDecimal value,
											@Nullable String message) {
		if (!inRange(minValue, maxValue, value))
			throw new IllegalArgumentException((nonNull(message)) ? message
					: String.format("value(%s) should be more than or equal to %s and less than %s.", value, minValue,
							maxValue));
		return value;
	}

	// ========================================================================
	// REQUIRE NON NEGATIVE VALIDATORS
	// ========================================================================
	/**
	 * Validates that the specified {@code int} is not negative, i.e less than zero.
	 * If {@code value} is negative, an {@code IllegalArgumentException} is thrown,
	 * otherwise, {@code value} is returned.
	 * 
	 * @param value the {@code int} to check.
	 * 
	 * @return {@code value} if it is <i><strong>NOT</strong></i> negative.
	 * 
	 * @throws IllegalArgumentException if {@code value} is negative.
	 */
	@Pure
	public static @NonNegative int requireNonNegative(@NonNegative int value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Validates that the specified {@code int} is not negative, i.e less than zero.
	 * If {@code value} is negative, an {@code IllegalArgumentException} is thrown,
	 * otherwise, {@code value} is returned. An optional message can also be passed
	 * to be used as the {@code IllegalArgumentException} message.
	 * 
	 * @param value   the {@code int} to check.
	 * @param message an optional message to be used as as the
	 *                {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if it is <i><strong>NOT</strong></i> negative.
	 * 
	 * @throws IllegalArgumentException if {@code value} is negative
	 */
	@Pure
	public static @NonNegative int requireNonNegative(@NonNegative int value, @Nullable String message) {
		if (isNegative(value))
			throw new IllegalArgumentException(isNull(message) ? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Validates that the specified {@code long} is not negative, i.e less than
	 * zero. If {@code value} is negative, an {@code IllegalArgumentException} is
	 * thrown, otherwise, {@code value} is returned.
	 * 
	 * @param value the {@code long} to check.
	 * 
	 * @return {@code value} if it is <i><strong>NOT</strong></i> negative.
	 * 
	 * @throws IllegalArgumentException if {@code value} is negative.
	 */
	@Pure
	public static long requireNonNegative(long value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Validates that the specified {@code long} is not negative, i.e less than
	 * zero. If {@code value} is negative, an {@code IllegalArgumentException} is
	 * thrown, otherwise, {@code value} is returned. An optional message can also be
	 * passed to be used as the {@code IllegalArgumentException} message.
	 * 
	 * @param value   the {@code long} to check.
	 * @param message an optional message to be used as as the
	 *                {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if it is <i><strong>NOT</strong></i> negative.
	 * 
	 * @throws IllegalArgumentException if {@code value} is negative
	 */
	@Pure
	public static long requireNonNegative(long value, @Nullable String message) {
		if (isNegative(value))
			throw new IllegalArgumentException(isNull(message) ? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Validates that the specified {@code float} is not negative, i.e less than
	 * zero. If {@code value} is negative, an {@code IllegalArgumentException} is
	 * thrown, otherwise, {@code value} is returned.
	 * 
	 * @param value the {@code float} to check.
	 * 
	 * @return {@code value} if it is <i><strong>NOT</strong></i> negative.
	 * 
	 * @throws IllegalArgumentException if {@code value} is negative.
	 */
	@Pure
	public static float requireNonNegative(float value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Validates that the specified {@code float} is not negative, i.e less than
	 * zero. If {@code value} is negative, an {@code IllegalArgumentException} is
	 * thrown, otherwise, {@code value} is returned. An optional message can also be
	 * passed to be used as the {@code IllegalArgumentException} message.
	 * 
	 * @param value   the {@code float} to check.
	 * @param message an optional message to be used as as the
	 *                {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if it is <i><strong>NOT</strong></i> negative.
	 * 
	 * @throws IllegalArgumentException if {@code value} is negative
	 */
	@Pure
	public static float requireNonNegative(float value, @Nullable String message) {
		if (isNegative(value))
			throw new IllegalArgumentException(isNull(message) ? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Validates that the specified {@code double} is not negative, i.e less than
	 * zero. If {@code value} is negative, an {@code IllegalArgumentException} is
	 * thrown, otherwise, {@code value} is returned.
	 * 
	 * @param value the {@code double} to check.
	 * 
	 * @return {@code value} if it is <i><strong>NOT</strong></i> negative.
	 * 
	 * @throws IllegalArgumentException if {@code value} is negative.
	 */
	@Pure
	public static double requireNonNegative(double value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Validates that the specified {@code double} is not negative, i.e less than
	 * zero. If {@code value} is negative, an {@code IllegalArgumentException} is
	 * thrown, otherwise, {@code value} is returned. An optional message can also be
	 * passed to be used as the {@code IllegalArgumentException} message.
	 * 
	 * @param value   the {@code double} to check.
	 * @param message an optional message to be used as as the
	 *                {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if it is <i><strong>NOT</strong></i> negative.
	 * 
	 * @throws IllegalArgumentException if {@code value} is negative
	 */
	@Pure
	public static double requireNonNegative(double value, @Nullable String message) {
		if (isNegative(value))
			throw new IllegalArgumentException(isNull(message) ? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Validates that the specified {@link BigDecimal} is not negative, i.e less
	 * than zero. If {@code value} is negative, an {@code IllegalArgumentException}
	 * is thrown, otherwise, {@code value} is returned.
	 * 
	 * @param value the {@code BigDecimal} to check.
	 * 
	 * @return {@code value} if it is <i><strong>NOT</strong></i> negative.
	 * 
	 * @throws IllegalArgumentException if {@code value} is negative.
	 * @throws NullPointerException     if value is {@code null}.
	 * 
	 * @see BigDecimal
	 */
	public static BigDecimal requireNonNegative(BigDecimal value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Validates that the specified {@link BigDecimal} is not negative, i.e less
	 * than zero. If {@code value} is negative, an {@code IllegalArgumentException}
	 * is thrown, otherwise, {@code value} is returned. An optional message can also
	 * be passed to be used as the {@code IllegalArgumentException} message.
	 * 
	 * @param value   the {@code BigDecimal} to check.
	 * @param message an optional message to be used as as the
	 *                {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if it is <i><strong>NOT</strong></i> negative.
	 * 
	 * @throws IllegalArgumentException if {@code value} is negative
	 * @throws NullPointerException     if value is {@code null}.
	 * 
	 * @see BigDecimal
	 */
	public static BigDecimal requireNonNegative(BigDecimal value, @Nullable String message) {
		if (isNegative(value))
			throw new IllegalArgumentException(isNull(message) ? "value cannot be negative." : message);
		return value;
	}

	// ========================================================================
	// REQUIRE LESS THAN VALIDATORS
	// ========================================================================
	/**
	 * Validates that an {@code int} is less than a supplied base value. Returns the
	 * given {@code int} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static int requireLessThan(int baseValue, int value) {
		return requireLessThan(baseValue, value, null);
	}

	/**
	 * Validates that an {@code int} is less than a supplied base value. Returns the
	 * given {@code int} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static int requireLessThan(int baseValue, int value, @Nullable String message) {
		if (!isLessThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code long} is less than a supplied base value. Returns the
	 * given {@code long} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static long requireLessThan(long baseValue, long value) {
		return requireLessThan(baseValue, value, null);
	}

	/**
	 * Validates that a {@code long} is less than a supplied base value. Returns the
	 * given {@code long} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static long requireLessThan(long baseValue, long value, @Nullable String message) {
		if (!isLessThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be greater than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code float} is less than a supplied base value. Returns
	 * the given {@code float} if it is less than the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static float requireLessThan(float baseValue, float value) {
		return requireLessThan(baseValue, value, null);
	}

	/**
	 * Validates that a {@code float} is less than a supplied base value. Returns
	 * the given {@code float} if it is less than the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static float requireLessThan(float baseValue, float value, @Nullable String message) {
		if (!isLessThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code double} is less than a supplied base value. Returns
	 * the given {@code long} if it is less than the given base value, otherwise, an
	 * {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static double requireLessThan(double baseValue, double value) {
		return requireLessThan(baseValue, value, null);
	}

	/**
	 * Validates that a {@code double} is less than a supplied base value. Returns
	 * the given {@code double} if it is less than the given base value, otherwise,
	 * an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static double requireLessThan(double baseValue, double value, @Nullable String message) {
		if (!isLessThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be greater than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@link BigDecimal} is less than a supplied base value.
	 * Returns the given {@code BigDecimal} if it is less than the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * @throws NullPointerException     if {@code baseValue} or/and {@code value}
	 *                                  is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static BigDecimal requireLessThan(BigDecimal baseValue, BigDecimal value) {
		return requireLessThan(baseValue, value, null);
	}

	/**
	 * Validates that a {@link BigDecimal} is less than a supplied base value.
	 * Returns the given {@code BigDecimal} if it is less than the given base value,
	 * otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness against.
	 * @param value     the value to check for smallness.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * @throws NullPointerException     if {@code baseValue} or/and {@code value}
	 *                                  is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static BigDecimal requireLessThan(BigDecimal baseValue, BigDecimal value, @Nullable String message) {
		if (!isLessThan(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%s) should be greater than %s.", value, baseValue)));
		return value;
	}

	// ========================================================================
	// REQUIRE LESS THAN OR EQUAL TO VALIDATORS
	// ========================================================================
	/**
	 * Validates that an {@code int} is less than or equal to a supplied base value.
	 * Returns the given {@code int} if it is less than or equal to the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static int requireLessThanOrEqualTo(int baseValue, int value) {
		return requireLessThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that an {@code int} is less than or equal to a supplied base value.
	 * Returns the given {@code int} if it is less than or equal to the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static int requireLessThanOrEqualTo(int baseValue, int value, @Nullable String message) {
		if (!isLessThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be less than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code long} is less than or equal to a supplied base value.
	 * Returns the given {@code long} if it is less than or equal to the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static long requireLessThanOrEqualTo(long baseValue, long value) {
		return requireLessThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@code long} is less than or equal to a supplied base value.
	 * Returns the given {@code long} if it is less than or equal to the given base
	 * value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static long requireLessThanOrEqualTo(long baseValue, long value, @Nullable String message) {
		if (!isLessThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%d) should be less than %d.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code float} is less than or equal to a supplied base
	 * value. Returns the given {@code float} if it is less than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static float requireLessThanOrEqualTo(float baseValue, float value) {
		return requireLessThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that an {@code float} is less than or equal to a supplied base
	 * value. Returns the given {@code float} if it is less than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static float requireLessThanOrEqualTo(float baseValue, float value, @Nullable String message) {
		if (!isLessThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be less than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@code double} is less than or equal to a supplied base
	 * value. Returns the given {@code double} if it is less than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static double requireLessThanOrEqualTo(double baseValue, double value) {
		return requireLessThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@code double} is less than or equal to a supplied base
	 * value. Returns the given {@code double} if it is less than or equal to the
	 * given base value, otherwise, an {@code IllegalArgumentException} is thrown.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static double requireLessThanOrEqualTo(double baseValue, double value, @Nullable String message) {
		if (!isLessThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%f) should be less than %f.", value, baseValue)));
		return value;
	}

	/**
	 * Validates that a {@link BigDecimal} is less than or equal to a supplied base
	 * value. Returns the given {@code BigDecimal} if it is less than or equal to
	 * the given base value, otherwise, an {@code IllegalArgumentException} is
	 * thrown.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * @throws NullPointerException     if {@code baseValue} or/and {@code value}
	 *                                  is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static BigDecimal requireLessThanOrEqualTo(BigDecimal baseValue, BigDecimal value) {
		return requireLessThanOrEqualTo(baseValue, value, null);
	}

	/**
	 * Validates that a {@link BigDecimal} is less than or equal to a supplied base
	 * value. Returns the given {@code BigDecimal} if it is less than or equal to
	 * the given base value, otherwise, an {@code IllegalArgumentException} is
	 * thrown.
	 * 
	 * @param baseValue the value to compare for smallness or equality against.
	 * @param value     the value to check for smallness or equality.
	 * @param message   an optional message to be used as as the
	 *                  {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value} is less than or equal to
	 *         {@code baseValue}.
	 * 
	 * @throws IllegalArgumentException if {@code value} is greater than
	 *                                  {@code baseValue}.
	 * @throws NullPointerException     if {@code baseValue} or/and {@code value}
	 *                                  is/are {@code null}.
	 * 
	 * @since 1.1.0
	 */
	@SideEffectFree
	public static BigDecimal requireLessThanOrEqualTo(BigDecimal baseValue, BigDecimal value, @Nullable String message) {
		if (!isLessThanOrEqualTo(baseValue, value))
			throw new IllegalArgumentException((nonNull(message) ? message
					: String.format("value(%s) should be greater than %s.", value, baseValue)));
		return value;
	}

	// ========================================================================
	// SERIALIZABLE UTILS
	// ========================================================================
	/**
	 * Checks if a given instance is serializable, i.e implements the
	 * {@link Serializable} interface. Returns <code>true</code> if the instance is
	 * serializable, otherwise returns <code>false</code>.
	 * 
	 * @param <T>   the type of the instance to be checked for serializability
	 * 
	 * @param value the instance to check for serializability
	 * @return <code>true</code> if value is serializable or <code>false</code>
	 *         otherwise.
	 *
	 * @see Serializable
	 */
	@Pure
	@EnsuresNonNullIf(expression = "#1", result = true)
	public static <T> boolean isSerializable(@Nullable T value) {
        return value instanceof Serializable;
    }

	/**
	 * Validates that a given instance is serializable, i.e implements the
	 * {@link Serializable} interface. If the given instance is serializable, the
	 * method returns the instance. Otherwise, an {@code IllegalArgumentException}
	 * is thrown. Also a {@code NullPointerException} will also be thrown if the
	 * supplied instance is {@code null}.
	 * 
	 * @param <T>   the type of the instance to be checked for serializability.
	 * 
	 * @param value the instance to check for serializability.
	 * 
	 * @return {@code value} if it's not <i>null <b>AND</b> is serializable</i>.
	 * 
	 * @throws NullPointerException     if {@code value} is {@code null}.
	 * @throws IllegalArgumentException if {@code value} is not serializable.
	 * 
	 * @see #requireSerializable(Object, String)
	 * @see Serializable
	 */
	@Pure
	public static <T> T requireSerializable(@Nullable T value) {
		return requireSerializable(value, null);
	}

	/**
	 * Validates that a given instance is serializable, i.e implements the
	 * {@link Serializable} interface. If the given instance is serializable, the
	 * method returns the instance. Otherwise, an {@code IllegalArgumentException}
	 * is thrown. Also a {@code NullPointerException} will also be thrown if the
	 * supplied instance is {@code null}. A message can optionally be passed to be
	 * used in the construction of the {@code IllegalArgumentException}.
	 * 
	 * @param <T>     the type of the instance to be checked for serializability.
	 * 
	 * @param value   the instance to check for serializability.
	 * @param message an optional message to be used as the
	 *                {@code IllegalArgumentException} message.
	 * 
	 * @return value if it's not <i>null <b>AND</b> is serializable</i>.
	 * 
	 * @throws NullPointerException     if {@code value} is {@code null}.
	 * @throws IllegalArgumentException if {@code value} is not serializable.
	 * 
	 * @see Serializable
	 */
	@Pure
	public static <T> T requireSerializable(@Nullable T value, @Nullable String message) {
		if (!isSerializable(value))
			throw new IllegalArgumentException(isNull(message) ? value + " must be serializable." : message);
		return value;
	}

	// ========================================================================
	// STRING UTILS
	// ========================================================================
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
	 * @param minChars the minimum number of characters (inclusive) that the given
	 *                 <code>String</code> should have.
	 * @param maxChars the maximum number of characters (exclusive) that the given
	 *                 <code>String</code> should have.
	 * @param value    the <code>String</code> to check.
	 * 
	 * @return <code>true</code> if the given <code>String</code>'s length falls
	 *         within the specified range, <code>false</code> otherwise.
	 * 
	 * @throws NullPointerException     if <code>value</code> is <code>null</code>.
	 * @throws IllegalArgumentException if any of the conditions stated above are/is
	 *                                  met.
	 */
	public static boolean hasCharsInRange(@NonNegative int minChars, @NonNegative int maxChars, String value) {
		requireGreaterThan(requireNonNegative(minChars), requireNonNegative(maxChars),
				String.format("maxChars(%d) cannot be less than or equal to minChars(%d).", maxChars, minChars));
		return inRange(minChars, maxChars, requireNonNull(value).length());
	}

	/**
	 * Checks that the given <code>String</code> has less characters than the stated
	 * maximum chars (exclusive). Returns <code>true</code> if the given
	 * <code>String</code>'s length (number of characters) is less than the given
	 * <code>maxChars</code>, else returns <code>false</code>. An
	 * {@link IllegalArgumentException} will be thrown if <code>maxChars</code> is
	 * negative.
	 * 
	 * @param maxChars the maximum number of characters (exclusive) that the given
	 *                 <code>String</code> should have.
	 * @param value    the <code>String</code> to check.
	 * 
	 * @return <code>true</code> if the given <code>String</code>'s length is less
	 *         than <code>maxChars</code>, <code>false</code> otherwise.
	 * 
	 * @throws IllegalArgumentException if <code>maxChars</code> is negative.
	 */
	public static boolean hasLessThanChars(@NonNegative int maxChars, String value) {
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
	 * @param minChars the minimum number of characters (inclusive) that the given
	 *                 <code>String</code> should have.
	 * @param value    the <code>String</code> to check.
	 * 
	 * @return <code>true</code> if the given <code>String</code>'s length is
	 *         greater than or equal to <code>minChars</code>, <code>false</code>
	 *         otherwise.
	 * 
	 * @throws IllegalArgumentException if <code>minChars</code> is negative.
	 */
	public static boolean hasMoreThanChars(@NonNegative int minChars, String value) {
		return isGreaterThan(requireNonNegative(minChars), requireNonNull(value).length());
	}

	/**
	 * Validates that the given {@code String} has characters between the given <i>
	 * minimum chars <strong>(inclusive)</strong> </i> and the given <i>maximum
	 * chars <strong>(exclusive)</strong> </i>. Returns {@code value} if the given
	 * {@code String}'s length <i>(no of characters)</i> falls within the given
	 * range, otherwise, an {@link IllegalArgumentException} will be thrown. <br>
	 * <i><strong>NOTE:</strong> This method internally uses
	 * {@link #hasCharsInRange(int, int, String)}, so an
	 * {@code IllegalArgumentException} might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param minChars the minimum number of characters
	 *                 <i><strong>(inclusive)</strong></i> that the given
	 *                 {@code String} should have.
	 * @param maxChars the maximum number of characters
	 *                 <i><strong>(exclusive)</strong></i> that the given
	 *                 {@code String} should have.
	 * @param value    the {@code String} to check.
	 * 
	 * @return {@code value} if {@code value}'s length falls within the specified
	 *         range.
	 * 
	 * @throws NullPointerException     if {@code value} is {@code null}.
	 * @throws IllegalArgumentException if any of the conditions stated above are/is
	 *                                  met.
	 * 
	 * @see #hasCharsInRange(int, int, String)
	 */
	public static String requireCharsInRange(
			@IndexOrHigh(value = "#3") int minChars, @NonNegative int maxChars, String value) {
		return requireCharsInRange(minChars, maxChars, value, null);
	}

	/**
	 * Validates that the given {@code String} has characters between the given <i>
	 * minimum chars <strong>(inclusive)</strong> </i> and the given <i>maximum
	 * chars <strong>(exclusive)</strong> </i>. Returns {@code value} if the given
	 * {@code String}'s length <i>(no of characters)</i> falls within the given
	 * range, otherwise, an {@link IllegalArgumentException} will be thrown. An
	 * optional message may be passed to be used in the construction of the
	 * {@code IllegalArgumentException}. <br>
	 * <br>
	 * <i><strong>NOTE:</strong> This method internally uses
	 * {@link #hasCharsInRange(int, int, String)}, so an
	 * {@code IllegalArgumentException} might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param minChars the minimum number of characters
	 *                 <i><strong>(inclusive)</strong></i> that the given
	 *                 {@code String} should have.
	 * @param maxChars the maximum number of characters
	 *                 <i><strong>(exclusive)</strong></i> that the given
	 *                 {@code String} should have.
	 * @param value    the {@code String} to check.
	 * @param message  an optional message to be used as as the
	 *                 {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value}'s length falls within the specified
	 *         range.
	 * 
	 * @throws NullPointerException     if {@code value} is {@code null}.
	 * @throws IllegalArgumentException if any of the conditions stated above are/is
	 *                                  met.
	 * 
	 * @see #hasCharsInRange(int, int, String)
	 */
	public static String requireCharsInRange(
			@IndexOrHigh(value = "#3") int minChars, @NonNegative int maxChars, String value, @Nullable String message) {
		if (!hasCharsInRange(minChars, maxChars, value))
			throw new IllegalArgumentException(nonNull(message) ? message
					: String.format("The length of value(%d) must be greater than or equal to %d and less than %d.",
							value.length(), minChars, maxChars));
		return value;
	}

	/**
	 * Validates that the given {@code String} has less characters than the stated
	 * <i>maximum chars <strong>(exclusive)</strong></i>. Returns {@code value} if
	 * the given {@code String}'s length <i>(number of characters)</i> is less than
	 * the given {@code maxChars}, otherwise an {@code IllegalArgumentException}
	 * will be thrown. <br>
	 * <br>
	 * <i><strong>NOTE:</strong> This method internally uses
	 * {@link #hasLessThanChars(int, String)}, so an
	 * {@code IllegalArgumentException}might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param maxChars the maximum number of characters
	 *                 <i><strong>(exclusive)</strong></i> that the given
	 *                 {@code String} should have.
	 * @param value    the {@code String} to check.
	 * 
	 * @return {@code value} if {@code value}'s length is less than
	 *         {@code maxChars}.
	 * 
	 * @throws NullPointerException     if {@code value} is {@code null}.
	 * @throws IllegalArgumentException if any of the conditions stated above are/is
	 *                                  met.
	 * 
	 * @see #hasLessThanChars(int, String)
	 */
	public static String requireLessThanChars(@NonNegative int maxChars, String value) {
		return requireLessThanChars(maxChars, value, null);
	}

	/**
	 * Validates that the given {@code String} has less characters than the stated
	 * <i>maximum chars <strong>(exclusive)</strong></i>. Returns {@code value} if
	 * the given {@code String}'s length <i>(number of characters)</i> is less than
	 * the given {@code maxChars}, otherwise an {@code IllegalArgumentException}
	 * will be thrown. An optional message may be passed to be used in the
	 * construction of the {@code IllegalArgumentException}. <br>
	 * <br>
	 * <i><strong>NOTE:</strong> This method internally uses
	 * {@link #hasLessThanChars(int, String)}, so an
	 * {@code IllegalArgumentException}might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param maxChars the maximum number of characters
	 *                 <i><strong>(exclusive)</strong></i> that the given
	 *                 {@code String} should have.
	 * @param value    the {@code String} to check.
	 * @param message  an optional message to be used as as the
	 *                 {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value}'s length is less than
	 *         {@code maxChars}.
	 * 
	 * @throws NullPointerException     if {@code value} is {@code null}.
	 * @throws IllegalArgumentException if any of the conditions stated above are/is
	 *                                  met.
	 * 
	 * @see #hasLessThanChars(int, String)
	 */
	public static String requireLessThanChars(@NonNegative int maxChars, String value, @Nullable String message) {
		if (!hasLessThanChars(maxChars, value))
			throw new IllegalArgumentException(nonNull(message) ? message
					: String.format("value's length (%d) must be less than %d.", value.length(), maxChars));
		return value;
	}

	/**
	 * Validates that the given {@code String} has more characters than the stated
	 * <i>minimum chars <strong>(inclusive)</strong></i>. Returns {@code value} if
	 * the given {@code String}'s length <i>(number of characters)</i> is greater
	 * than or equal to the given {@code minChars}, otherwise an
	 * {@code IllegalArgumentException} will be thrown. <br>
	 * <br>
	 * <i><strong>NOTE:</strong> This method internally uses
	 * {@link #hasMoreThanChars(int, String)}, so an
	 * {@code IllegalArgumentException}might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param minChars the minimum number of characters
	 *                 <i><strong>(inclusive)</strong></i> that the given
	 *                 {@code String} should have.
	 * @param value    the {@code String} to check.
	 * 
	 * @return {@code value} if {@code value}'s length is greater than or equal to
	 *         {@code minChars}.
	 * 
	 * @throws NullPointerException     if {@code value} is {@code null}.
	 * @throws IllegalArgumentException if any of the conditions stated above are/is
	 *                                  met.
	 * 
	 * @see #hasMoreThanChars(int, String)
	 */
	public static String requireMoreThanChars(@IndexFor(value = "#2") int minChars, String value) {
		return requireMoreThanChars(minChars, value, null);
	}

	/**
	 * Validates that the given {@code String} has more characters than the stated
	 * <i>minimum chars <strong>(inclusive)</strong></i>. Returns {@code value} if
	 * the given {@code String}'s length <i>(number of characters)</i> is greater
	 * than or equal to the given {@code minChars}, otherwise an
	 * {@code IllegalArgumentException} will be thrown. An optional message may be
	 * passed to be used in the construction of the
	 * {@code IllegalArgumentException}. <br>
	 * <br>
	 * <i><strong>NOTE:</strong> This method internally uses
	 * {@link #hasMoreThanChars(int, String)}, so an
	 * {@code IllegalArgumentException}might be thrown if any of that methods
	 * requirements are not met.</i>
	 * 
	 * @param minChars the minimum number of characters
	 *                 <i><strong>(inclusive)</strong></i> that the given
	 *                 {@code String} should have.
	 * @param value    the {@code String} to check.
	 * @param message  an optional message to be used as as the
	 *                 {@code IllegalArgumentException} message.
	 * 
	 * @return {@code value} if {@code value}'s length is greater than or equal to
	 *         {@code minChars}.
	 * 
	 * @throws NullPointerException     if {@code value} is {@code null}.
	 * @throws IllegalArgumentException if any of the conditions stated above are/is
	 *                                  met.
	 * 
	 * @see #hasMoreThanChars(int, String)
	 */
	public static String requireMoreThanChars(
			@IndexFor(value = "#2") int minChars, String value, @Nullable String message) {
		if (!hasMoreThanChars(minChars, value))
			throw new IllegalArgumentException(nonNull(message) ? message
					: String.format("value's length (%d) must be greater than or equal to %d.", value.length(),
							minChars));
		return value;
	}

	/**
	 * Validates that the supplied {@code String} is not empty<i>(has a length of
	 * zero)</i> or {@code null}. If the {@code String} is {@code null}, a
	 * {@code NullPointerException} is thrown and if the {@code String} is empty, an
	 * {@code IllegalArgumentException} is thrown. An invocation to this method
	 * behaves exactly like an invocation to
	 * {@link #requireNonEmptyString(String, String) requireNonEmptyString(value,
	 * null)}.
	 * 
	 * @param value the {@code String} to be checked for validity.
	 *
	 * @return value if it's not <i>null <b>AND/OR</b> empty</i>.
	 * 
	 * @throws NullPointerException     if value is null.
	 * @throws IllegalArgumentException if value is empty<i>(has a length of
	 *                                  zero)</i>.
	 * 
	 * @see #requireNonEmptyString(String, String)
	 */
	@SideEffectFree
	public static @MinLen(value = 1) String requireNonEmptyString(@MinLen(value = 1) String value) {
		return requireNonEmptyString(value, null);
	}

	/**
	 * Validates that the supplied {@code String} is not empty<i>(has a length of
	 * zero)</i> or {@code null}. If the {@code String} is {@code null}, a
	 * {@code NullPointerException} is thrown and if the {@code String} is empty, an
	 * {@code IllegalArgumentException} is thrown. The name of the {@code String}
	 * variable to be checked is passed as the last argument and is used in the
	 * construction of the exception message. Consider the following:
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
	 * if a null value is passed in place of {@code name}, the {@code String}
	 * "value" is used instead. In the example above, the message would be:
	 * 
	 * <pre>
	 * 		<i>"value cannot be empty"</i>
	 * </pre>
	 * 
	 * @param value the {@code String} to be checked for validity.
	 * @param name  the name of the {@code String} variable to be checked for
	 *              validity.
	 *
	 * @return value if it's not <i>null <b>AND/OR</b> empty</i>.
	 * 
	 * @throws NullPointerException     if value is null.
	 * @throws IllegalArgumentException if value is empty<i>(has a length of
	 *                                  zero)</i>.
	 * 
	 * @see #requireNonEmptyString(String, String, String)
	 */
	@SideEffectFree
	public static @MinLen(value = 1) String requireNonEmptyString(
			@MinLen(value = 1) String value, @Nullable String name) {
		name = (isNull(name)) ? "value" : name;
		return requireNonEmptyString(value, name + " cannot be null.", name + " cannot be empty.");
	}

	/**
	 * Validates that the supplied {@code String} is not empty<i>(has a length of
	 * zero)</i> or {@code null}. If the {@code String} is {@code null}, a
	 * {@code NullPointerException} is thrown and if the {@code String} is empty, an
	 * {@code IllegalArgumentException} is thrown. Optional messages can be passed
	 * as the second and third arguments to be used in the construction of
	 * exceptions.
	 * 
	 * @param value        the {@code String} to be checked for validity.
	 * @param nullMessage  an optional message to be used when raising the
	 *                     {@code NullPointerException}.
	 * @param emptyMessage an optional message to be used when raising the
	 *                     {@code IllegalArgumentException}.
	 * @return value if it's not <i>null <b>AND/OR</b> empty</i>.
	 * 
	 * @throws NullPointerException     if value is null.
	 * @throws IllegalArgumentException if value is empty<i>(has a length of
	 *                                  zero)</i>.
	 */
	@SideEffectFree
	public static @MinLen(value = 1) String requireNonEmptyString(
			@MinLen(value = 1) String value, @Nullable String nullMessage, @Nullable String emptyMessage) {
		// Check if messages are null and set defaults
		nullMessage = (isNull(nullMessage)) ? "value cannot be null." : nullMessage;
		emptyMessage = (isNull(emptyMessage)) ? "value cannot be empty." : emptyMessage;
		if (requireNonNull(value, nullMessage).isEmpty()) // Start by checking if the string is null
			throw new IllegalArgumentException(emptyMessage);
		return value;
	}

	// private constructor to prevent initialization
	@SideEffectFree
	private ObjectUtils() {
	}
}
