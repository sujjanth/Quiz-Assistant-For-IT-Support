// ITSupport.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ITSupport {
    public static void main(String[] args) {
        // Networking Questions
        ITSupportQuestion[] networkingQuestions = {
            new ITSupportQuestion(
                "Your internet is slow. What should you try first?",
                new String[]{"A. Restart the router", "B. Call the ISP", "C. Run a speed test", "D. Check cable connections"},
                "A",
                "Restarting the router is usually a quick fix for slow internet. It's like turning your phone off and on when something is wrong - it resets the connection and fixes most simple issues."
            ),
            new ITSupportQuestion(
                "What is the function of a router in a network?",
                new String[]{"A. Encrypt data", "B. Route traffic", "C. Monitor network speed", "D. Store user data"},
                "B",
                "A router directs internet traffic between your devices and the internet. It's like a traffic cop making sure data goes to the right places."
            )
        };

        // Hardware Questions
        ITSupportQuestion[] hardwareQuestions = {
            new ITSupportQuestion(
                "Your computer won't power on. What's the first thing to check?",
                new String[]{"A. Power supply", "B. Keyboard", "C. Monitor", "D. Mouse"},
                "A",
                "Always check the power supply first. It's like checking if your TV is plugged in when it doesn't turn on. No power means no working device."
            ),
            new ITSupportQuestion(
                "You hear a clicking sound from your hard drive. What could be the issue?",
                new String[]{"A. Overheating", "B. Hard drive failure", "C. Malware", "D. Loose cables"},
                "B",
                "A clicking sound from your hard drive usually means it's failing. This is like a car engine making weird noises - it needs immediate attention."
            )
        };

        // Software Questions
        ITSupportQuestion[] softwareQuestions = {
            new ITSupportQuestion(
                "Your application keeps crashing. What should you try first?",
                new String[]{"A. Restart the application", "B. Reinstall the OS", "C. Close background applications", "D. Update the software"},
                "A",
                "Restarting the application fixes most issues. It's like restarting your phone when an app freezes."
            ),
            new ITSupportQuestion(
                "How do you fix a missing DLL error in Windows?",
                new String[]{"A. Download the DLL", "B. Reinstall the application", "C. Check for system updates", "D. All of the above"},
                "D",
                "A missing DLL can be fixed by any of these methods. It's like missing a puzzle piece - you can replace it or get a new set."
            )
        };

        // Operating Systems Questions
        ITSupportQuestion[] osQuestions = {
            new ITSupportQuestion(
                "How do you reset a forgotten Windows password?",
                new String[]{"A. Use password reset disk", "B. Contact IT support", "C. Reinstall Windows", "D. Use another account"},
                "A",
                "A password reset disk is the fastest way to regain access. It's like using a spare key when you're locked out."
            ),
            new ITSupportQuestion(
                "How do you update the OS on a Windows computer?",
                new String[]{"A. Download the update manually", "B. Use Windows Update", "C. Reinstall the OS", "D. None of the above"},
                "B",
                "The easiest way is to use Windows Update. It's like updating an app on your phone."
            )
        };

        // Create domain objects
        ITSupportDomain networking = new ITSupportDomain("Networking", networkingQuestions);
        ITSupportDomain hardware = new ITSupportDomain("Hardware", hardwareQuestions);
        ITSupportDomain software = new ITSupportDomain("Software", softwareQuestions);
        ITSupportDomain operatingSystems = new ITSupportDomain("Operating Systems", osQuestions);

        // List of all domains
        ITSupportDomain[] allDomains = {networking, hardware, software, operatingSystems};

        // Let user select at least 2 domains
        Scanner scanner = new Scanner(System.in);
        List<ITSupportDomain> selectedDomains = new ArrayList<>();

        System.out.println("Please select at least 2 domains from the following options:");
        for (int i = 0; i < allDomains.length; i++) {
            System.out.println((i + 1) + ". " + allDomains[i].getDomainName());
        }

        while (selectedDomains.size() < 2) {
            System.out.print("Enter the number of the domain you want to select: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            if (choice >= 1 && choice <= allDomains.length) {
                selectedDomains.add(allDomains[choice - 1]);
            } else {
                System.out.println("Invalid choice. Please select a valid domain.");
            }
        }

        // Start the quiz
        ITSupportQuiz quiz = new ITSupportQuiz(selectedDomains);
        quiz.start();
        scanner.close();
    }
}
