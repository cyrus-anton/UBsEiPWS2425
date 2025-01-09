public class Rectangle {
    private Point lowLeft;
    private Point upRight;

    public Rectangle(Point lowLeft, Point upRight) {
       /* Original:
       this.lowLeft = lowLeft;
       this.upRight = upRight;
        */

        /*
        this.lowLeft = lowLeft.clone();
        this.upRight = upRight.clone();

         */
        this.lowLeft = new Point(lowLeft.getX(), lowLeft.getY());
        this.upRight = new Point(upRight.getX(), upRight.getY());
    }

    public Point getLowLeft() {
        return lowLeft;
    }

    public Point getUpRight() {
        return upRight;
    }

    public double width() {
        return Math.abs(lowLeft.getX() - upRight.getX());
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 4);
        Rectangle r1 = new Rectangle(p1, p2);
        Rectangle r2 = new Rectangle(p1, p2);
        // Zeile 5
        System.out.println(r1.width());
        System.out.println(r2.width());
        r1.getUpRight().shift(2, 0);
        System.out.println("---");
        System.out.println(r1.width());
        System.out.println(r2.width());
    }
}
