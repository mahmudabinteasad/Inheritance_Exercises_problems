public class MultiChoiceQuestion extends AnyCorrectChoiceQuestion {

    public MultiChoiceQuestion(String question, String correctChoices) {
        super(question, correctChoices);
    }

    @Override
    public boolean checkAnswer(String response) {
        String[] responses = response.split(" ");
        for (String resp : responses) {
            if (!super.checkAnswer(resp)) {
                return false;
            }
        }
        return true;
    }
}
