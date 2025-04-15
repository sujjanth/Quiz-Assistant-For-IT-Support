// ITSupportQuiz.java
import java.util.List;
import java.util.Scanner;

public class ITSupportQuiz {
    private List<ITSupportDomain> selectedDomains;

    public ITSupportQuiz(List<ITSupportDomain> selectedDomains) {
        this.selectedDomains = selectedDomains;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting the IT Support Quiz...\n");

        for (ITSupportDomain domain : selectedDomains) {
            System.out.println("Domain: " + domain.getDomainName());

            for (ITSupportQuestion question : domain.getQuestions()) {
                System.out.println(question.getQuery());
                String[] options = question.getOptions();
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + ". " + options[i]);
                }

                System.out.print("Your answer: ");
                int userAnswer = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer

                if (options[userAnswer - 1].equalsIgnoreCase(question.getCorrectAnswer())) {
                    System.out.println("Correct! " + question.getSolutionMessage());
                } else {
                    System.out.println("Incorrect. " + question.getSolutionMessage());
                }

                System.out.println(); // Blank line for separation
            }
        }

        System.out.println("Thank you for completing the IT Support Quiz!");
        scanner.close();
    }
}
