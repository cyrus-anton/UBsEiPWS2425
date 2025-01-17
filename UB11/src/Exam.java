import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exam {
	private String name;
	private int year;
	private ArrayList<Question> questions;

	public Exam(String name, int year) {
		this.name = name;
		this.year = year;
		questions = new ArrayList<>();
	}

	public void addQuestion (String text, int points){
		questions.add(new Question(text, points));
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public int numberOfQuestions(){
		return questions.size();
	}

	public int sumOfPoints() {
		int sum = 0;
		for (Question q : questions) {
			sum += q.getPoints();
		}
		return sum;
	}

	public void orderQuestionsByLength() {
		questions.sort(Comparator.comparingInt(q -> -(q.getText().length())));
	//questions.sort((o1, o2) -> -Integer.compare(o1.getText().length(),o2.getText().length()));
	}

	public void orderQuestionsByPoints() {
		// Aufsteigende sortierung : questions.sort(Comparator.comparingInt(q -> q.getText().length()));
		questions.sort((o1, o2) -> -Integer.compare(o1.getPoints(),o2.getPoints()));
	}


	@Override
	public String toString(){
//		String str = name + " (" + year + ")";
//		for (Question q : questions) {
//			str += "\n"+ q;
//		}
//		return str;

		StringBuilder sb = new StringBuilder(name + " (" + year + ")\n" );
		questions.forEach(question -> sb.append(question.toString()+"\n"));
		return sb.toString();
	}


}
