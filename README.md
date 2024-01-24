
<h1 align="center" style="border-bottom: none; text-align: center;">🛠️🧰 Java Utils</h1>
<h3 align="center" style="text-align: center;">Check and validate primitives and reference types 
in Java.</h3>
<p align="center" style="text-align: center;">
    <a href="https://github.com/kennedykori/jutils/actions/workflows/ci.yml">
        <img alt="Build status" src="https://github.com/kennedykori/jutils/actions/workflows/ci.yml/badge.svg"/>
    </a>
    <a href="https://codecov.io/gh/kennedykori/jutils">
        <img alt="Codecov coverage status" src="https://codecov.io/gh/kennedykori/jutils/graph/badge.svg?token=4hqGKXW3tX"/>
    </a>
    <a href="https://github.com/semantic-release/semantic-release">
        <img alt="Semantic Release: conventionalcommits" src="https://img.shields.io/badge/semantic--release-conventionalcommits-e10079?logo=semantic-release"/>
    </a>
    <a href="https://github.com/kennedykori/jutils/blob/develop/LICENSE">
        <img alt="GitHub License" src="https://img.shields.io/github/license/kennedykori/jutils?color=blue">
    </a>
</p>
<p align="center" style="text-align: center;">
    <a href="https://central.sonatype.com/artifact/io.github.kennedykori/utils/2.0.0">
        <img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.kennedykori/utils?versionSuffix=2.0.0&style=flat&logo=apachemaven&logoColor=%23C71A36">
    </a>
    <a href="https://javadoc.io/doc/io.github.kennedykori/utils/2.0.0">
        <img alt="Javadoc" src="https://javadoc.io/badge2/io.github.kennedykori/utils/2.0.0/javadoc.svg">
    </a>
</p>

---

This library contains a utility class comprised of static methods, similar to `java.util.Objects`, which can check and validate objects/references and primitives. These utility methods fall into two categories:

* _**Methods that check if a condition holds**_ - These methods return a boolean value and typically have prefixes like _has_, _in_, _is_, etc. They take a value or values and return `true` if the value(s) satisfy a specific condition _(e.g., checking if a number is negative)_, and `false` otherwise.

* _**Methods that validate that a condition holds**_ - These methods throw a `java.lang.IllegalArgumentException` if the condition they check for fails, and all have the prefix _require_. These methods take a value and return it if it meets a given condition _(e.g., validating that a number isn't negative)_. Otherwise, a `java.lang.IllegalArgumentException` is thrown.

The utility methods in this class include methods for checking and validating a `String`'s length, methods for checking and validating if a number is negative, methods for checking and validating if a number is less than or greater than a given base value, and methods for checking and validating if a number falls within a given range.

## Get Started
There are different ways to consume the library depending on your preferred dependency management tool:

#### 1. Maven
Add the following dependency to your `pom` file:
```xml
<dependency>
    <groupId>io.github.kennedykori</groupId>
    <artifactId>utils</artifactId>
    <version>2.0.0</version>
</dependency>
```

#### 2. Gradle
Add the following dependency to your `build.gradle`:

```groovy
implementation 'io.github.kennedykori:utils:2.0.0'
```

Or for Kotlin DSL, add the following to your `build.gradle.kts`:

```kotlin
implementation("io.github.kennedykori:utils:2.0.0")
```

#### 3. Ivy
```xml
<dependency org="io.github.kennedykori" name="utils" rev="2.0.0"/>
```

### Building the library

Alternatively, you can use [gradle](https://gradle.org/) to compile and build the library. Just
follow the steps below:

1. Clone the project from [Github](https://github.com/kennedykori/jutils).
2. From the project root, run the following command:

    ```bash
    ./gradlew build
    ```

3. Add the generated jar _(located at `build/libs` after a successful build)_ to your classpath.
4. You're good to go. :thumbsup:

## Usage

Import the `ObjectsUtils` class in your code and use its static methods to check and validate your code.

**Example 1:**

```java
import static io.github.kennedykori.utils.ObjectUtils.*;

public class Person {

	private final String firstName;
	private final String lastName;
	private final int age;
	
	public Person (String firstName, String lastName, int age) {
		this.firstName = requireMoreThanChars(2, firstName.trim(), "firstName should have atleast two characters.");
		this.lastName = requireCharsInRange(2, 31, lastName.trim(), "lastName should have atleast two characters and atmost 30 characters.");
		this.age = requireInRange(18, 36, age, "Only youths are allowed.");
	}
	
	// Other methods and properties
}
```

**Example 2:**

```java
import static io.github.kennedykori.utils.ObjectUtils.*;

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
	
	// Other methods and properties
}
```

## API Reference

You can find a comprehensive list of all the available functions by referring to the online library 
documentation provided at this [link](https://javadoc.io/doc/io.github.kennedykori/utils).

Alternatively, you can generate the documentation using gradle by running the following 
command from the project root: 

```bash
./gradlew javadoc
```

Then open `build/docs/javadoc/index.html` in your browser of choice.

## License

[MIT License](https://github.com/kennedykori/jutils/blob/develop/LICENSE)

Copyright (c) 2019 Kennedy Kori
