
public class Fraction {
	private int nominator;
	private int denominator;
	
	public Fraction (int nominator, int denominator) {
		this.nominator = nominator;
		
		if (denominator == 0) {
			this.denominator = 1;
		}
		else {
			this.denominator = denominator;
		}
	}
	
	public Fraction (int nominator) {
		this.nominator = nominator; 
		denominator = 1;
	}
	
	public void multiply(Fraction factor) {
		this.nominator *= factor.nominator;
		this.denominator *= factor.denominator;
	}
	
	public void add (Fraction summand) {
		int i = this.denominator;
		
		this.denominator *= summand.denominator;
		this.nominator *= summand.denominator;
		this.nominator += summand.nominator * i;
	}
	
	public String toString() {
		return nominator + "/" + denominator;
		
	}
	
	public double asDouble() {
		return (double)this.nominator/ this.denominator;
	}
}
