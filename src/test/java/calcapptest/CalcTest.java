package calcapptest;

import org.junit.Test;

import calcapp.Calc;

public class CalcTest {
	
	@Test
	public void sumTest() {
		int a = 3;
		int b = 5;
		Calc calc = new Calc();
		assertEquals(8, calc.sum(a,b));
	}

}
