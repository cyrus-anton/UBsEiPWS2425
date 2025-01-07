
public class CrossSum {
	
	public static void main(String[] args) {
		System.out.println(calculateCrossSum(1));
	}
	
	public static int calculateCrossSum (int n) {
		int result = 0;
		if (n <=9) 
			result = n;
		else {
			result = n % 10 + calculateCrossSum(n/10);
		}
		return result;
	}
	
	public static int calculateCrossSum3 (int n) {
		int result = 0;
		while (n != 0) {
			result += n % 10;
			n = n /10;
		}
		
		
		return result;
	}
	
	public static int calculateCrossSum2 (int n) {
		int result = 0;
		for (int j= 1; j<= digits(n); j++) {
			result += specificDigit(n, j);
		}
		
		return result;
	}
	
	static int digits (int y) {
		int m = 0;
		while (y>= Math.pow(10, m)) {
			m++;
		}
		return m;
	}
	
	static int specificDigit (int x, int whichDigit) {
		x = x - x / (int) Math.pow(10, whichDigit) * (int) Math.pow(10, whichDigit);
		x = x / (int)Math.pow(10, whichDigit-1);
		return x;
	}
	
	
}
