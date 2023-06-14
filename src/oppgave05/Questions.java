package oppgave05;

import java.util.ArrayList;
import java.util.Scanner;

public class Questions {

    /************************MAIN*****************************/
    public static void main(String[] args) {
        ArrayList<String> questions = new ArrayList<>();
        String question1 = "Hvor gammel er du?";
        String question2 = "Liker du programmering?";
        String question3 = "Er du sulten?";

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

        for (String question : questions) {
            System.out.println(question);
            Scanner newScanner = new Scanner(System.in);

            String inputFromScanner = newScanner.nextLine();
            System.out.println(inputFromScanner);
        }
    }
}
