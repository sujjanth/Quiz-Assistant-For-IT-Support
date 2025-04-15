// ITSupportQuestion.java
public class ITSupportQuestion {
    private String query;
    private String[] options;
    private String correctAnswer;
    private String solutionMessage;

    public ITSupportQuestion(String query, String[] options, String correctAnswer, String solutionMessage) {
        this.query = query;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.solutionMessage = solutionMessage;
    }

    public String getQuery() {
        return query;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getSolutionMessage() {
        return solutionMessage;
    }
}
