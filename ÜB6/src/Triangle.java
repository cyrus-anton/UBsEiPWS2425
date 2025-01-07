public class Triangle {
	
    Point A;
    Point B;
    Point C;
    
    
    

    public Triangle(Point A, Point B, Point C) {
		
		this.A = A;
		this.B = B;
		this.C = C;
	}

	private double sideAB() {
        return A.distanceTo(B);
    }

    private double sideAC() {
    	return A.distanceTo(C);
    }

    private double sideBC() {
    	return B.distanceTo(C);
    }

    boolean isEquilateral() {
      /*  return Math.abs(sideAB()- sideBC()) < 0.00001 && Math.abs(sideAB()- sideAC())< 0.00001 
        		&& Math.abs(sideAC()- sideBC()) < 0.00001;
        */
    	return sideAC() == sideAB() && sideAB() == sideBC();
    	
        
    }

    boolean isIsosceles() {
        return sideAB() == sideAC() || sideAC()== sideBC() || sideAB() == sideBC();
    }
    
    private boolean angleIsAcute (Point a, Point b, Point c) {
    	return Math.pow(a.distanceTo(b), 2) + Math.pow(a.distanceTo(c), 2) > Math.pow(b.distanceTo(c), 2);
    			
    }
    boolean isAcute() {
        return Pythagoras.calculate(sideAB(), sideAC()) > sideBC() &&
        		Pythagoras.calculate(sideAC(), sideBC()) > sideAB() &&
        		Pythagoras.calculate(sideAB(), sideBC()) > sideAC()
        		;
        		
        		
    	
    	// return angleIsAcute(A, B, C) && angleIsAcute(B, C, A) && angleIsAcute(C, A, B);
    }

    boolean isRight() {
    	return Pythagoras.calculate(sideAB(), sideAC()) == sideBC() ||
        		Pythagoras.calculate(sideAC(), sideBC()) == sideAB() ||
        		Pythagoras.calculate(sideAB(), sideBC()) == sideAC()
        		;
    	
    }

    boolean isObtuse() {
        // return !isAcute() && !isRight();
    	return Pythagoras.calculate(sideAB(), sideAC()) < sideBC() ||
		Pythagoras.calculate(sideAC(), sideBC()) < sideAB() ||
		Pythagoras.calculate(sideAB(), sideBC()) < sideAC()
		;
    }
    public boolean almostEquals(double tolerance, double first, double second) {
    	double c = Math.abs(first- second);
    	return c <= tolerance;
    	
    }
}
