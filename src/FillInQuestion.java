public class FillInQuestion {
    private String question;
    private String answer;

    public FillInQuestion(String question, String answer) {
        this.question = question.replace(answer, "_____");
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(String response) {
        return response.trim().equalsIgnoreCase(answer);
    }
}
