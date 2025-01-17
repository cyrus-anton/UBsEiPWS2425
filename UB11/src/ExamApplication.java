public class ExamApplication {
    public static void main(String[] args) {
	Exam exam = new Exam("EiP", 2025);

	exam.addQuestion("test1233",3);
	exam.addQuestion("test12", 1);
    exam.addQuestion("test244444", 2);
        System.out.println(exam.toString());
        exam.orderQuestionsByLength();
        System.out.println("-----------");
        System.out.println(exam.toString());

    }
}
