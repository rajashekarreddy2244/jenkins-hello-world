package test.pack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1 {
	
	JodaDateTimeUtils jdt = new JodaDateTimeUtils();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void yearTest() {

		Assert.assertEquals(2018, jdt.jGetYear());
	}

	@Test
	public void monthTest() {
		Assert.assertEquals(11, jdt.jGetMonthOfYear());
	}

	@Test
	public void dayTest() {
		Assert.assertEquals(21, jdt.jGetDateOfMonth());
	}

	
}
