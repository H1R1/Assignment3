package source;

public class Calc {
	CalcMethods calcMeth;
	
	public void setCalcMeth(CalcMethods calcMeth) {
		this.calcMeth = calcMeth;
	}
	
	public int addition(int a, int b) {
		return calcMeth.add(a, b);
	}
	
	public int subtraction(int a, int b) {
		return calcMeth.subtract(a, b);
	}
	
	public int multiply(int a, int b) {
		return calcMeth.multiply(a, b);
	}

	public double division(int a, int b) {
		return calcMeth.divide(a, b);
	}
}
