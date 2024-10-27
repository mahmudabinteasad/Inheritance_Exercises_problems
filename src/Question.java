public class Question {
    protected String answer;

    public boolean checkAnswer(String response) {
        return response.trim().equalsIgnoreCase(answer);
    }
}
