# Java Utils v1.2.0

## Introduction

The following notes describe important changes and information about this release.

## Upgrade Instructions

For [gradle](https://gradle.org/) users, switch to version 1.2.0 by updating your `build.gradle` 
dependencies to:

```gradle
dependencies {
    api 'com.kori_47:utils:1.2.0'
    // other dependencies
}
```

For maven users, update your `pom` file to:

```xml
<dependency>
    <groupId>com.kori_47</groupId>
    <artifactId>utils</artifactId>
    <version>1.2.0</version>
    <type>pom</type>
</dependency>
```

### Compatibility Notes

This release was tested on Java 8 and is expected to work well on Java 8 and later versions. 
It may or may not work on earlier versions of Java.

This version was tested with [junit 5](https://junit.org/junit5/).

## What's New

The following static utility methods were added in these release:

* Methods for checking if a number is equal to a given base value.
* Methods for validating if a number is equal to a given base value.

The utility methods above can be divided into _checkers_ and _validators_.

### Checkers

These are methods that take a value and check if it meets a given condition and if so, 
returns `true`, else, returns `false`. These methods are:

1. *__isEqualTo__*

    This are methods that check if a number is equal to a given baseValue. These methods 
    have the following form:

    ```java
    public final static boolean isEqualTo(<type> baseValue, <type> value){ /* method body */ };
    ```

    There are five variants of the method above, where `<type>` can be one of the following: `int`, 
    `long`, `float`, `double` or `java.math.BigDecimal`.

### Validators

These are methods that take a value and validate if it meets a given condition and if so, 
returns the value, else, throws a `java.lang.IllegalArgumentException`. These methods are:

1. *__requireEqualTo__*
    
    This are methods that validate if a number is equal to a given baseValue. These methods 
    have the following form:

    ```java
    public final static <type> requireEqualTo(<type> baseValue, <type> value){ /* method body */ };
    ```

    There are five variants of the method above, where `<type>` can be one of the following: `int`, 
    `long`, `float`, `double` or `java.math.BigDecimal`.

## Reporting Problems

If you find a problem with this release, please file a bug on [GitHub Issues](https://github.com/kennedykori/JavaUtils/issues).
