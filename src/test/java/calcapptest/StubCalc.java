package calcapptest;

import calcapp.Calc;

public class StubCalc extends Calc{

	private int randomNumberToReturn;
	
	
	public StubCalc(int randomNumberToReturn){
		this.randomNumberToReturn = randomNumberToReturn;
	}
	
	@Override
	public int randomNumber() {
	
		return randomNumberToReturn;
		
	}
	
}
