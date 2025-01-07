public class Quadratwurzel {
	
	public static double quadratwurzel(double x, int n){
		/*if (n > 0) {
			double x1 = quadratwurzel(x, n-1);
			return 0.5* ((x1 +x/x1));
		}
		else {
			return (x+1)/2;
		}
		*/
		if (n == 0) 
			return (x+1)/2;
		else {
			return (0.5 * (quadratwurzel(x, n-1)) + (x/quadratwurzel(x, n-1)));
		}
	}
	static int factorial(int n) {
		if (n == 0 || n==1)
			return 1;
		return n * factorial(n-1);
	}
	
	static void loop1() {
		loop1();
	}
	
	static void loop2() {
		while (true) {
			
		}
	}
	public static void main(String[] args) {
		loop1();
	}
}