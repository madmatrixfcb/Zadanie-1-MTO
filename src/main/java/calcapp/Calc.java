package calcapp;

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



}
