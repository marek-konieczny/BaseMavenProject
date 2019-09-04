package pl.marek.konieczny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

	@Test
	public void simpleTest(){
		String test = "test";
		String testExpected = "test";
		Assertions.assertEquals(testExpected, test);
	}
}
