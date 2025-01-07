
public class SquareApplication {
	public static void main(String[] args) {
		Square quadrat = new Square(3.3,"black", "white");
		
		System.out.println(quadrat.getFuellFarbe());
		System.out.println(quadrat.getKantenLaenge());
		System.out.println(quadrat.getLinienFarbe());
	}
}
