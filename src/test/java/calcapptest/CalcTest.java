package calcapptest;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import calcapp.Calc;

public class CalcTest {

	Calc calc;

	@Before
	public void before() {
		calc = new Calc();
	}

	@Test
	public void addingTest() {
		int a = 3;
		int b = 5;

		assertEquals(8, calc.sum(a, b));
	}

	@Test
	public void divisionSimpleTest() {
		int a = 4;
		int b = 2;
		assertEquals(2, calc.division(a, b));
	}

	@Test(expected = IllegalArgumentException.class)
	public void divisionZeroTest() {
		int a = 4;
		int b = 0;
		assertEquals(IllegalArgumentException.class, calc.division(a, b));
	}
	
	@Test
	public void divisionHardTest() {
		int a = 5;
		int b = 2;
		assertEquals(2, calc.division(a, b));
	}
	
	@Test
	public void randomNumberTest() {
		//Random rand = new RandomStub([1,2,3,4,5,6]);
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void sqrtValueMinusTest() {
		int a = -9;
		assertEquals(ArithmeticException.class, calc.sqrtValue(a));
	}
}
