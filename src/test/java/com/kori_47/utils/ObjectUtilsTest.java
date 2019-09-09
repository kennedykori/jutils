package com.kori_47.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObjectUtilsTest {

	@Test
	public void testStringRequireNonNull() {
		assertEquals("name", ObjectUtils.requireNonEmptyString("name", null, null));
	}
}
