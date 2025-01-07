 public class Point {
	 
    private double x;
    private double y;

   
    
    public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}



	public double getX() {
		return x;
	}



	public void setX(double x) {
		this.x = x;
	}



	public double getY() {
		return y;
	}



	public void setY(double y) {
		this.y = y;
	}



	double distanceTo(Point other) {
        return Pythagoras.calculate(this.x- other.x, this.y - other.y);
    }

    void shift(double xShift, double yShift) {
       this.x += xShift;
       this.y += yShift;
    }
}
