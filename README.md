# Java Utils

[![Build Status](https://travis-ci.org/kennedykori/JavaUtils.svg?branch=master)](https://travis-ci.org/kennedykori/JavaUtils) [![codecov](https://codecov.io/gh/kennedykori/JavaUtils/branch/master/graph/badge.svg)](https://codecov.io/gh/kennedykori/JavaUtils) [![Download](https://api.bintray.com/packages/kori-47/kori_47/utils/images/download.svg)](https://bintray.com/kori-47/kori_47/utils/_latestVersion)

This library contains a utility class that is composed of static methods that can be used for checking and validation of both objects and primitives.

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
    api 'com.kori_47:utils:{latest_version}'
}
```

Or alternatively, you can use [gradle](https://gradle.org/) to compile and build the library. Just follow the steps bellow:

* Clone the project from github
* CD into the project root and run:

```bash
./gradlew build
```
* Add the generated jar (will be located at `build/libs` after a successful build), in your classpath.

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
		this.recipient = requireLessThanChars(51, requireMoreThanChars(2, recipient.trim(), "recipient should have atleast two characters."), "recipient should have atmost 50 characters."); // equal to: this.recipient = requireCharsInRange(2, 51, recipient.trim());
		this.box = requireNonNegative(box, "box shouldn't be negative.");
		this.city = requireNonEmptyString(city, "city");
		this.zipCode = requireNonNegative(zipCode);
	}
	
	// Other methods and attributes
}
```

## API Reference

To get the documentation for this project, CD in to the project root and run:

```bash
./gradlew javadoc
```

After this, just open `build/docs/javadoc/index.html` in your browser of choice.

## Tests

To run tests, CD in to the project root and run:

```bash
./gradlew test
```

To view the test coverage report, be sure to be in the project root, and then run:

```bash
./gradlew jacocoTestReport
```

After, open `build/reports/jacoco/test/html/index.html` in your browser to view the report.

## License

MIT License

Copyright (c) 2019 Kennedy Kori
