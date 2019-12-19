# Java Utils

[![Build Status](https://travis-ci.org/kennedykori/JavaUtils.svg?branch=master)](https://travis-ci.org/kennedykori/JavaUtils) 
[![codecov](https://codecov.io/gh/kennedykori/JavaUtils/branch/master/graph/badge.svg)](https://codecov.io/gh/kennedykori/JavaUtils) 
[![Download](https://api.bintray.com/packages/kori-47/kori_47/utils/images/download.svg)](https://bintray.com/kori-47/kori_47/utils/_latestVersion) 
[![javadoc](https://javadoc.io/badge2/com.kori_47/utils/javadoc.svg)](https://javadoc.io/doc/com.kori_47/utils)

This library contains a utility class that is composed of static methods, similar to `java.util.Objects`, that can be used for checking and 
validation of both objects and primitives. These utility methods can be classified into two main categories :-
 
 * _**Methods that check if a certain condition is met**_ - These methods return a boolean value and typically have the following
  prefixes: _has, in, is, etc._ These methods take a value or values and return `true` if the value(s) meets a certain condition _(e.g. check
  if a number is negative)_ and  `false` otherwise.
 
 * _**Methods that validate if a certain condition is met**_ - These methods throw a `java.lang.IllegalArgumentException` if a condition they
  check for isn't met and are all prefixed with _require_. These methods take a value and return the value if the value meets a certain condition
  _(e.g. validate a number isn't negative)_, otherwise, a `java.lang.IllegalArgumentException` is thrown.


The utility methods in this class include methods for checking and validating a `String`'s length, methods for checking and validating the negativity
of a number, methods for checking and validating if a number is less than or greater than a given base value and methods for checking and validating if a
number falls in a given range.

## Get Started

To use the library, make sure you have jcenter in your repositories closure:

```gradle
repositories {
    jcenter()
}
```

Then add the following dependency to your `build.gradle`:

```gradle
dependencies {
    api 'com.kori_47:utils:1.1.0'
}
```

Or alternatively, you can use [gradle](https://gradle.org/) to compile and build the library. Just follow the steps bellow:

* Clone the project from [github](https://github.com/kennedykori/JavaUtils).
* CD into the project root and run:

```bash
./gradlew build
```
* Add the generated jar _(will be located at `build/libs` after a successful build)_, in your classpath.
* You're good to go. :thumbsup:

## Usage

Import the ObjectsUtils class in your code and use it's static methods to check and validate your code.

**Example 1:**

```java
import static com.kori_47.utils.ObjectUtils.*;

public class Person {

	private final String firstName;
	private final String lastName;
	private final int age;
	
	public Person (String firstName, String lastName, int age) {
		this.firstName = requireMoreThanChars(2, firstName.trim(), "firstName should have atleast two characters.");
		this.lastName = requireCharsInRange(2, 31, lastName.trim(), "lastName should have atleast two characters and atmost 30 characters.");
		this.age = requireInRange(18, 36, age, "Only youths are allowed.");
	}
	
	// Other methods and attributes
}
```

**Example 2:**

```java
import static com.kori_47.utils.ObjectUtils.*;

public class Address {
	
	private final String recipient;
	private final int box;
	private final String city;
	private final int zipCode;
	
	public Address (String recipient, int box, String city, int zipCode) {
		this.recipient = requireCharsInRange(2, 51, recipient.trim(), "recipient should have between 2 to 50 characters."); // equal to: this.recipient = requireLessThanChars(51, requireMoreThanChars(2, recipient.trim()));
		this.box = requireNonNegative(box, "box shouldn't be negative.");
		this.city = requireNonEmptyString(city, "city");
		this.zipCode = requireNonNegative(zipCode);
	}
	
	// Other methods and attributes
}
```

## API Reference

You can access the documentation of this project from [here](https://javadoc.io/doc/com.kori_47/utils).

Alternatively, you can generate the documentation using gradle by running the following 
command from the project root: 

```bash
./gradlew javadoc
```

Then open `build/docs/javadoc/index.html` in your browser of choice.

## Tests

To run tests, CD in to the project root and run:

```bash
./gradlew test
```

To view the test coverage report, be sure to be in the project root, and then run:

```bash
./gradlew jacocoTestReport
```

Then open `build/reports/jacoco/test/html/index.html` in your browser to view the report.

## License

MIT License

Copyright (c) 2019 Kennedy Kori
