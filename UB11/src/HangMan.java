import java.util.Random;

public class HangMan {
	private final static int MAX_WRONG_GUESSES = 10;

	private  String usedCharacters = "";
	private int wrongGuesses;
	private final String currentWord;


	public HangMan() {
		final String[] words = { "wasserrutsche", "hotelfachangestellte" };
		currentWord = words[new Random().nextInt(words.length)];
	}

	public HangMan(String word) {
		currentWord = word.toLowerCase();
	}

	public boolean makeGuess(char character) {
		if (wrongGuesses == MAX_WRONG_GUESSES) {
			return false; // hier koennte auch eine Exception geworfen werden (VL12)
		}

		if (usedCharacters.indexOf(character) >= 0) {
			++wrongGuesses;
			return false;
		}

		usedCharacters += character;

		if (currentWord.chars().noneMatch(x -> x == character)) {
			++wrongGuesses;
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		String result = ""; // hier koennte auch StringBuilder benutzt werden
		for (Character character : currentWord.toCharArray()) {
			if (usedCharacters.indexOf(character) >= 0) {
				result += character;
			} else {
				result += "_ "; // use extra space here, so that number of characters is better visible
			}
		}
		return result;
	}

	public int wrongTriesLeft() {
		return MAX_WRONG_GUESSES - wrongGuesses;
	}

	public String solution() {
		return currentWord;
	}

	public boolean isWon() {
		return currentWord.chars().allMatch(x -> usedCharacters.indexOf(x) >= 0);
		// oder: return currentWord.equals(toString());
	}

	public boolean isGameOver() {
		return wrongGuesses == MAX_WRONG_GUESSES;
	}
}