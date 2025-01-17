import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        HangMan hangMan = new HangMan();
        Scanner scanner = new Scanner(System.in);

        while (!hangMan.isGameOver() && !hangMan.isWon()) {
            System.out.println("Gesucht ist: " + hangMan);
            String input = scanner.next();

            if (!hangMan.makeGuess(input.charAt(0))) {
                System.out.println(
                        "Ist nicht im Wort enthalten " +
                                "oder wurde bereits getippt, noch "
                                + hangMan.wrongTriesLeft() +
                                " falsche Versuche..."
                );
            } else {
                System.out.println("Ist im Wort enthalten.");
            }
        }

        if (hangMan.isWon()) {
            System.out.println("Herzlichen Glueckwunsch!");
        } else {
            System.out.println("Leider nicht erraten. Loesung ist: " + hangMan.solution());
        }
        scanner.close();
    }
}