import java.util.Scanner;

public class NumberGuesser {

    public static void guess(int maxNumber) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = 0;
        int pivot = 0;
        String s;
        do {
        	pivot = (minNumber + maxNumber) /2;
        	System.out.println("Ist die gedachte Zahl groesser als " + pivot + "?");
        	s = scanner.nextLine();
        	if (s.equalsIgnoreCase("ja")) {
        		minNumber = pivot + 1;
        	}
        	else {
        		maxNumber = pivot;
        	}
        } while (minNumber < maxNumber);
        scanner.close();
        System.out.println("Die gedachte Zahl ist: " + maxNumber);
    }
    
    
  
}
