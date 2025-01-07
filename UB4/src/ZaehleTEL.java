import java.util.Scanner;

public class ZaehleTEL {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zeichenfolge ein: ");
		String eingabe = scanner.nextLine();
		char[] zeichen = eingabe.toCharArray();
		countTEL(zeichen);
		scanner.close();
	}

	public static void countTEL(char[] zeichen) {
		int t = 0;
		int e = 0;
		int l = 0;

		for (int i= 0; i< zeichen.length; i++) {
			if (zeichen [i] == 't' || (zeichen[i])== 'T')
				t++;
			else if (zeichen [i] == 'e' || (zeichen[i])== 'E')
				e++;
			else if (zeichen [i] == 'l' || (zeichen[i])== 'L')
				l++;
		}

		System.out.println("Der Buchstabe \"t\" kommt " + t + " mal vor.");
		System.out.println("Der Buchstabe \"e\" kommt " + e + " mal vor.");
		System.out.println("Der Buchstabe \"l\" kommt " + l + " mal vor.");
	}
}
