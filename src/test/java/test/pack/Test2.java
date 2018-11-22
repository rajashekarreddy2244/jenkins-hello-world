package test.pack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test2 {
	
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
	void dateTest() {
		Assert.assertEquals("22-11-2018", jdt.jGetDateOfMonth() + "-" + jdt.jGetMonthOfYear() + "-" + jdt.jGetYear());

	}

}
