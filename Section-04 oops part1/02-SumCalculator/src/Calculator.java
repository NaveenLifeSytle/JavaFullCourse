
public class Calculator {

	private Double firstNumber;
	private Double secondNumber;
	public Double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(Double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public Double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(Double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAddition() {
		return this.firstNumber+ this.secondNumber;
	}
	public double getSubtraction() {
		return this.firstNumber- this.secondNumber;
	}
	public double getMultiplication() {
		return this.firstNumber* this.secondNumber;
	}
	public double geDevition() {
		if(this.secondNumber!=0) {
		return this.firstNumber/ this.secondNumber;
		}
		else {
			return 0;
		}
	}
	
}
