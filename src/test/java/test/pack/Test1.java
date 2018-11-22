package test.pack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {
	
	JodaDateTimeUtils jdt = new JodaDateTimeUtils();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
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
