import java.util.Scanner;

public class ShapeApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shape[] shapes = new Shape[10];

		System.out.println("Bitte geben Sie eine geometrische Form ein. "
				+ "Zur Auswahl stehen:\nDreieck\nQuadrat\nLinie\n\nZum Beenden"
				+ " des Programmes geben Sie \"Ende\" ein.");
		
		loop:
			
		for(int i=0;i<shapes.length;i++) {
			String shapeName =  scanner.nextLine();
			if (shapeName.equals("Ende"))
				break;
			switch (shapeName) {
			
			case "Ende" : {
				break loop;
			}
			case "Quadrat": {
				shapes[i] = new Square();
				break;
			
			}
			case "Linie" : {
				shapes[i] = new Line();
				break;
			}
			
			case "Dreieck" : {
				shapes[i] = new Triangle();
				break;
			}
			}
			
		}
		
		// Scanner schließen
		scanner.close();
		
		for(int i=0;i<shapes.length;i++) {
			if (shapes[i] != null) {
				shapes[i].printShape();
				System.out.println();
			}
		}
		
	}
}
