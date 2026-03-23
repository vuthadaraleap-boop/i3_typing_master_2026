import java.util.Scanner;

public class TypingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Display the UI
        System.out.println("---------- Typing Test Level 1 ----------");
        System.out.println("Type the following paragraph(s) to test your typing speed and quality (press");
        System.out.println("ENTER to end the test and display the result):");
        System.out.println();
        
        System.out.println("ffff jjjj dddd kkkk ssss llll aaaa ;;;; fdsa jkl; fdsa jkl; asdf jkl; asdf");
        System.out.println("jkl; sad dad had lad ask all fall hall flask shall gash hash flash glass glad");
        System.out.println("flag sag hash lash. Ask a glad lad all a salad.");
        System.out.println();
        
        System.out.print("Start typing here: ");
        String userInput = scanner.nextLine(); 

        System.out.println("\n[Test Completed]");
        
        scanner.close();
    }
}