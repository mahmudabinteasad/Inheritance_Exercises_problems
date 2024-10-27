public class NumericQuestion {
    private double expectedAnswer;

    public NumericQuestion(double expectedAnswer) {
        this.expectedAnswer = expectedAnswer;
    }

    public boolean checkAnswer(double response) {
        return Math.abs(response - expectedAnswer) <= 0.01;
    }
}
