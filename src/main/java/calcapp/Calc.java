package calcapp;

import java.util.Random;

public class Calc {

	public int sum(int a, int b) {
		int suma = a + b;
		return suma;

	}

	public int division(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Nie mozna dzielic przez 0");
		}
		int divide = a / b;
		return divide;
	}

	public int sqrtValue(int a) {
		if (a < 0) {
			throw new ArithmeticException("Wartosc nie moze byc ujemna");
		}
		int sqrtVal = (int) Math.sqrt(a);	
		return sqrtVal;
	}
	
	public int randomNumber() {
		Random rand = new Random();
		int a = rand.nextInt(10);
		return a;
		
	}

}
