# Java Utils v1.1.0

## Introduction

The following notes describe important changes and information about this release.

## Upgrade Instructions

Switch to version 1.1.0 by updating your `build.gradle` dependency to:

```gradle
dependencies {
    api 'com.kori_47:utils:1.1.0'
    // other dependencies
}
```

### Compatibility Notes

This release was tested on Java 8 and is expected to work well on Java 8 and later versions. 
It may or may not work on earlier versions of Java.

This version was tested with [junit 5](https://junit.org/junit5/).

## What's New

The following static utility methods were added in these release:

* Methods for checking and validating if a number is less than a given base value.
* Methods for checking and validating if a number is less than or equal to a given base value.
* Methods for checking and validating if a number is greater than a given base value.
* Methods for checking and validating if a number is greater than or equal a given base value.

The utility methods above can be divided into _checkers_ and _validators_.

### Checkers

These are methods that take a value and check if it meets a given condition and if so, 
returns `true`, else, returns `false`. These methods are:

1. *__isLessThan__*
    
    This are methods that check if a number is less than a given baseValue. These methods 
    have the following form:

    ```java
    public final static boolean isLessThan(<type> baseValue, <type> value){ /* method body */ };
    ```

    There are five variants of the method above, where `<type>` can be one of the following: `int`, 
    `long`, `float`, `double` or `java.math.BigDecimal`.

2. *__isLessThanOrEqualTo__*
    
    This are methods that check if a number is less than or equal to a given baseValue.
    These methods have the following form:

    ```java
    public final static boolean isLessThanOrEqualTo(<type> baseValue, <type> value){ /* method body */ };
    ```

    There are five variants of the method above, where `<type>` can be one of the following: `int`, 
    `long`, `float`, `double` or `java.math.BigDecimal`.

3. *__isGreaterThan__*
    
    This are methods that check if a number is greater than a given baseValue. These methods 
    have the following form:

    ```java
    public final static boolean isGreaterThan(<type> baseValue, <type> value){ /* method body */ };
    ```

    There are five variants of the method above, where `<type>` can be one of the following: `int`, 
    `long`, `float`, `double` or `java.math.BigDecimal`.

2. *__isGreaterThanOrEqualTo__*
    
    This are methods that check if a number is greater than or equal to a given baseValue.
    These methods have the following form:

    ```java
    public final static boolean isGreaterThanOrEqualTo(<type> baseValue, <type> value){ /* method body */ };
    ```

    There are five variants of the method above, where `<type>` can be one of the following: `int`, 
    `long`, `float`, `double` or `java.math.BigDecimal`.

### Validators

These are methods that take a value and validate if it meets a given condition and if so, 
returns the value, else, throws a `java.lang.IllegalArgumentException`. These methods are:

1. *__requireLessThan__*
    
    This are methods that validate if a number is less than a given baseValue. These methods 
    have the following form:

    ```java
    public final static <type> requireLessThan(<type> baseValue, <type> value){ /* method body */ };
    ```

    There are five variants of the method above, where `<type>` can be one of the following: `int`, 
    `long`, `float`, `double` or `java.math.BigDecimal`.

2. *__requireLessThanOrEqualTo__*
    
    This are methods that validate if a number is less than or equal to a given baseValue. These methods 
    have the following form:

    ```java
    public final static <type> requireLessThanOrEqualTo(<type> baseValue, <type> value){ /* method body */ };
    ```

    There are five variants of the method above, where `<type>` can be one of the following: `int`, 
    `long`, `float`, `double` or `java.math.BigDecimal`.

3. *__requireGreaterThan__*
    
    This are methods that validate if a number is greater than a given baseValue. These methods 
    have the following form:

    ```java
    public final static <type> requireGreaterThan(<type> baseValue, <type> value){ /* method body */ };
    ```

    There are five variants of the method above, where `<type>` can be one of the following: `int`, 
    `long`, `float`, `double` or `java.math.BigDecimal`.

4. *__requireGreaterThanOrEqualTo__*
    
    This are methods that validate if a number is greater than or equal to a given baseValue. These methods 
    have the following form:

    ```java
    public final static <type> requireGreaterThanOrEqualTo(<type> baseValue, <type> value){ /* method body */ };
    ```

    There are five variants of the method above, where `<type>` can be one of the following: `int`, 
    `long`, `float`, `double` or `java.math.BigDecimal`.


## Improvements

All the utility methods have been refactored to use `java.lang.Float.compare(float, float)` and 
`java.lang.Double.compare(double, double)` when performing `float` and `double` comparisons instead 
of the standard comparisons operators in java.
