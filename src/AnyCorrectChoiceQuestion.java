public class AnyCorrectChoiceQuestion extends Question {
    private String[] correctChoices;

    public AnyCorrectChoiceQuestion(String question, String correctChoices) {
        this.answer = question;
        this.correctChoices = correctChoices.split(" ");
    }

    @Override
    public boolean checkAnswer(String response) {
        for (String choice : correctChoices) {
            if (choice.equalsIgnoreCase(response.trim())) {
                return true;
            }
        }
        return false;
    }
}
