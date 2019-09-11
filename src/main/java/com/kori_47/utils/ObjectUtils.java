/**
 * 
 */
package com.kori_47.utils;

import static java.util.Objects.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Kennedy Kori
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
	/**
	 * Checks if an integer is negative, i.e, less than 0 and returns <code>true</code> 
	 * if the integer is negative, otherwise returns <code>false</code>
	 * 
	 * @param value the integer to check
	 * @return <code>true</code> if the integer is negative, otherwise returns <code>false</code>
	 */
	public final static boolean isNegative(int value) {
		if (value < 0) return true;
		return false;
	}

	/**
	 * Checks if a long is negative, i.e, less than 0 and returns <code>true</code> 
	 * if the long is negative, otherwise returns <code>false</code>
	 * 
	 * @param value the long to check
	 * @return <code>true</code> if the long is negative, otherwise returns <code>false</code>
	 */
	public final static boolean isNegative(long value) {
		if (value < 0l) return true;
		return false;
	}

	/**
	 * Checks if a float is negative, i.e, less than 0 and returns <code>true</code> 
	 * if the float is negative, otherwise returns <code>false</code>
	 * 
	 * @param value the float to check
	 * @return <code>true</code> if the float is negative, otherwise returns <code>false</code>
	 */
	public final static boolean isNegative(float value) {
		if (value < 0f) return true;
		return false;
	}

	/**
	 * Checks if a double is negative, i.e, less than 0 and returns <code>true</code> 
	 * if the double is negative, otherwise returns <code>false</code>
	 * 
	 * @param value the double to check
	 * @return <code>true</code> if the double is negative, otherwise returns <code>false</code>
	 */
	public final static boolean isNegative(double value) {
		if (value < 0.0) return true;
		return false;
	}

	/**
	 * Checks if a {@link BigDecimal} is negative, i.e, less than 0 and returns <code>true</code>, 
	 * otherwise returns <code>false</code>
	 * 
	 * @param value the <code>BigDecimal</code> to check
	 * 
	 * @return <code>true</code> if the <code>BigDecimal</code> is negative, otherwise returns <code>false</code>
	 * 
	 * @throws NullPointerException if value is <code>null</code>.
	 */
	public final static boolean isNegative(BigDecimal value) {
		if (requireNonNull(value).signum() < 0) return true;
		return false;
	}

	/**
	 * Checks that the specified <code>Integer</code> is not negative, i.e less than zero. If the <code>Integer</code> 
	 * is negative, an {@link IllegalArgumentException} is thrown, otherwise, value is returned.
	 * 
	 * @param value the integer to check
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException if value is negative
	 */
	public final static int requireNonNegative(int value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Checks that the specified <code>Integer</code> is not negative, i.e less than zero. If the <code>Integer</code> 
	 * is negative, an {@link IllegalArgumentException} is thrown, otherwise, value is returned. An optional message 
	 * can also be passed to be used as the <code>IllegalArgumentException</code> message.
	 * 
	 * @param value the integer to check
	 * @param message an optional message to be used as as the <code>IllegalArgumentException</code> message
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException if value is negative
	 */
	public final static int requireNonNegative(int value, String message) {
		if (isNegative(value)) throw new IllegalArgumentException(isNull(message)? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Checks that the specified <code>Long</code> is not negative, i.e less than zero. If the <code>Long</code> 
	 * is negative, an {@link IllegalArgumentException} is thrown, otherwise, value is returned.
	 * 
	 * @param value the long to check
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException if value is negative
	 */
	public final static long requireNonNegative(long value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Checks that the specified <code>Long</code> is not negative, i.e less than zero. If the <code>Long</code> 
	 * is negative, an {@link IllegalArgumentException} is thrown, otherwise, value is returned. An optional message 
	 * can also be passed to be used as the <code>IllegalArgumentException</code> message.
	 * 
	 * @param value the long to check
	 * @param message an optional message to be used as as the <code>IllegalArgumentException</code> message
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException if value is negative
	 */
	public final static long requireNonNegative(long value, String message) {
		if (isNegative(value)) throw new IllegalArgumentException(isNull(message)? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Checks that the specified <code>Float</code> is not negative, i.e less than zero. If the <code>Float</code> 
	 * is negative, an {@link IllegalArgumentException} is thrown, otherwise, value is returned.
	 * 
	 * @param value the float to check
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException if value is negative
	 */
	public final static float requireNonNegative(float value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Checks that the specified <code>Float</code> is not negative, i.e less than zero. If the <code>Float</code> 
	 * is negative, an {@link IllegalArgumentException} is thrown, otherwise, value is returned. An optional message 
	 * can also be passed to be used as the <code>IllegalArgumentException</code> message.
	 * 
	 * @param value the float to check
	 * @param message an optional message to be used as as the <code>IllegalArgumentException</code> message
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException if value is negative
	 */
	public final static float requireNonNegative(float value, String message) {
		if (isNegative(value)) throw new IllegalArgumentException(isNull(message)? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Checks that the specified <code>Double</code> is not negative, i.e less than zero. If the <code>Double</code> 
	 * is negative, an {@link IllegalArgumentException} is thrown, otherwise, value is returned.
	 * 
	 * @param value the double to check
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException if value is negative
	 */
	public final static double requireNonNegative(double value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Checks that the specified <code>Double</code> is not negative, i.e less than zero. If the <code>Double</code> 
	 * is negative, an {@link IllegalArgumentException} is thrown, otherwise, value is returned. An optional message 
	 * can also be passed to be used as the <code>IllegalArgumentException</code> message.
	 * 
	 * @param value the double to check
	 * @param message an optional message to be used as as the <code>IllegalArgumentException</code> message
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws IllegalArgumentException if value is negative
	 */
	public final static double requireNonNegative(double value, String message) {
		if (isNegative(value)) throw new IllegalArgumentException(isNull(message)? "value cannot be negative." : message);
		return value;
	}

	/**
	 * Checks that the specified {@link BigDecimal} is not negative, i.e less than zero. If the <code>BigDecimal</code> 
	 * is negative, an {@link IllegalArgumentException} is thrown, otherwise, value is returned.
	 * 
	 * @param value the <code>BigDecimal</code> to check
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws NullPointerException if value is <code>null</code>
	 * @throws IllegalArgumentException if value is negative
	 * 
	 * @see BigDecimal
	 */
	public final static BigDecimal requireNonNegative(BigDecimal value) {
		return requireNonNegative(value, null);
	}

	/**
	 * Checks that the specified {@link BigDecimal} is not negative, i.e less than zero. If the <code>BigDecimal</code> 
	 * is negative, an {@link IllegalArgumentException} is thrown, otherwise, value is returned. An optional message 
	 * can also be passed to be used as the <code>IllegalArgumentException</code> message.
	 * 
	 * @param value the <code>BigDecimal</code> to check
	 * @param message an optional message to be used as as the <code>IllegalArgumentException</code> message
	 * 
	 * @return value if it is <b>NOT</b> negative
	 * 
	 * @throws NullPointerException if value is <code>null</code>
	 * @throws IllegalArgumentException if value is negative
	 * 
	 * 
	 * @see BigDecimal
	 */
	public final static BigDecimal requireNonNegative(BigDecimal value, String message) {
		if (isNegative(value)) throw new IllegalArgumentException(isNull(message)? "value cannot be negative." : message);
		return value;
	}

	/*-------------------------------------------------------------------------------------
	 * 
	 * SERIALIZABLES
	 *
	 * ------------------------------------------------------------------------------------
	 */
	/**
	 * Checks if a given instance is serializable, i.e implements the {@link Serializable} interface. Returns
	 * <code>true</code> if the instance is serializable, otherwise returns <code>false</code>.
	 * 
	 * @param <T> the type of the instance to be checked for serializability
	 * 
	 * @param value the instance to check for serializability
	 * @return <code>true</code> if value is serializable or <code>false</code> otherwise.
	 * 
	 * @throws NullPointerException if value is null.
	 * 
	 * @see Serializable
	 */
	public final static <T> boolean isSerializable(T value) {
		if (Serializable.class.isInstance(requireNonNull(value)))
			return true;
		return false;
	}

	/**
	 * Checks if a given instance is serializable, i.e implements the {@link Serializable} interface. If the
	 * given instance is serializable, the method returns the instance. Otherwise, an {@link IllegalArgumentException} 
	 * is thrown. Also a {@link NullPointerException} will also be thrown if the supplied instance is <code>null</code>.
	 * 
	 * @param <T> the type of the instance to be checked for serializability
	 * 
	 * @param value the instance to check for serializability
	 * 
	 * @return value if it's not <i>null <b>AND</b> is serializable</i>.
	 * 
	 * @throws NullPointerException if value is null.
	 * @throws IllegalArgumentException if value is not serializable.
	 * 
	 * @see #requireSerializable(Object, String)
	 * @see Serializable
	 */
	public final static <T> T requireSerializable(T value) {
		return requireSerializable(value, null);
	}

	/**
	 * Checks if a given instance is serializable, i.e implements the {@link Serializable} interface. If the
	 * given instance is serializable, the method returns the instance. Otherwise, an {@link IllegalArgumentException} 
	 * is thrown. Also a {@link NullPointerException} will also be thrown if the supplied instance is <code>null</code>.
	 * A message can optionally be passed to be used in the construction of the <code>IllegalArgumentException</code>.
	 * 
	 * @param <T> the type of the instance to be checked for serializability
	 * 
	 * @param value the instance to check for serializability
	 * @param message an optional message to be used in the construction of the <code>IllegalArgumentException</code>
	 * 
	 * @return value if it's not <i>null <b>AND</b> is serializable</i>.
	 * 
	 * @throws NullPointerException if value is null.
	 * @throws IllegalArgumentException if value is not serializable.
	 * 
	 * @see Serializable
	 */
	public final static <T> T requireSerializable(T value, String message) {
		if (!isSerializable(value))
			throw new IllegalArgumentException(isNull(message)?
					value.toString() + " must be serializable." : message);
		return value;
	}

	/*-------------------------------------------------------------------------------------
	 * 
	 * STRINGS
	 *
	 * ------------------------------------------------------------------------------------
	 */
	/**
	 * Checks that the supplied string is not empty or null. If the string is null, 
	 * a {@link NullPointerException} is thrown and if the string is empty, a 
	 * {@link IllegalArgumentException} is thrown. An invocation to this method behaves
	 * exactly like an invocation to {@link #requireNonEmptyString(String, String) requireNonEmptyString(value, null)}.
	 * 
	 * @param value the string to be checked for validity.
	 * @return value if it's not <i>null <b>AND/OR</b> empty</i>.
	 * 
	 * @throws NullPointerException if value is null.
	 * @throws IllegalArgumentException if value is empty.
	 * 
	 * @see #requireNonEmptyString(String, String)
	 */
	public static final String requireNonEmptyString(String value) {
		return requireNonEmptyString(value, null);
	}
	
	/**
	 * Checks that the supplied string is not empty or null. If the string is null, 
	 * a {@link NullPointerException} is thrown and if the string is empty, a 
	 * {@link IllegalArgumentException} is thrown. The name of the string variable to be 
	 * checked is passed as the last argument and is used in construction of the exception 
	 * message. Consider the following:
	 * <pre> 
	 * 		String firstName = "";
	 * 		requireNonEmptyString(firstName, "firstName");
	 * </pre>
	 * An {@code IllegalArgumentException} would be thrown with the following message:
	 * <pre>
	 * 		<i>"firstName cannot be empty"</i>
	 * </pre>
	 * if a null value is passed in place of name, the string "value" is used instead. 
	 * In the example above, the message would be:
	 * <pre>
	 * 		<i>"value cannot be empty"</i>
	 * </pre>
	 * 
	 * @param value the string to be checked for validity.
	 * @param name the name of the string variable to be checked for validity.
	 * @return value if it's not <i>null <b>AND/OR</b> empty</i>.
	 * 
	 * @throws NullPointerException if value is null.
	 * @throws IllegalArgumentException if value is empty.
	 * 
	 * @see #requireNonEmptyString(String, String, String)
	 */
	public static final String requireNonEmptyString(String value, String name) {
		name = (isNull(name))? "value" : name;
		return requireNonEmptyString(value, name + " cannot be null.", name + " cannot be empty.");
	}

	/**
	 * Checks that the supplied string is not empty or null. If the string is null, 
	 * a {@link NullPointerException} is thrown and if the string is empty, a 
	 * {@link IllegalArgumentException} is thrown. Optional messages can be passed 
	 * as the second and third arguments to be used in the construction of exceptions.
	 * 
	 * @param value the string to be checked for validity
	 * @param nullMessage the message to be used when raising the <code>NullPointerException</code> or <code>null</code>
	 * @param emptyMessage the message to be used when raising the <code>IllegalArgumentException</code> or <code>null</code>
	 * @return value if it's not <i>null <b>AND/OR</b> empty</i>.
	 * 
	 * @throws NullPointerException if value is null.
	 * @throws IllegalArgumentException if value is empty.
	 */
	public static final String requireNonEmptyString(String value, String nullMessage, String emptyMessage) {
		// Check if messages are null and set a defaults
		nullMessage = (isNull(nullMessage))? "value cannot be null." : nullMessage;
		emptyMessage = (isNull(emptyMessage))? "value cannot be empty." : emptyMessage;
		if (requireNonNull(value, nullMessage).isEmpty()) // Start by checking if the string is null
			throw new IllegalArgumentException(emptyMessage);
		return value;
	}

	private ObjectUtils() {}

}
