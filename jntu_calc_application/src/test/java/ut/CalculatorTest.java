package ut;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import eta_sb.jntu_calc_application.Calculator;

public class CalculatorTest {

	static Calculator cl;

	@BeforeClass
	public static void setUp() {
		cl = new Calculator();
	}

	@AfterClass
	public static void tearDown() {
		System.gc();
	}

	@Test
	public void testAdd() {
		assertEquals(3,(int)(cl.doAdd(1, 2)));
	}	

	@Test
	public void testSub() {
		assertEquals(0,(int)(cl.doSub(1, 1)));
	}

	@Test
	public void testMul() {
		assertEquals(18,(int)(cl.doMul(9, 2)));
	}

	@Test
	public void testDiv() {
		assertEquals(4, (int)(cl.doDiv(8, 2)));
	}

}
