# Java Utils

This is library a composed of utility classes that can be used for checking and validation 
of both objects and primitives.

## Get Started

Use [gradle](https://gradle.org/) to compile and build the project. CD into the project and run:

```bash
./gradlew build
```
A jar will be generated at `build/libs`, Just add the generated jar in your classpath and start using the library.

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

  