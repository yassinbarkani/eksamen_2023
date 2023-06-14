package obliger.oppgave05;

import java.util.Scanner;

public class TerminalPassword {


    /************************MAIN*****************************/
    public static void main(String[] args) {
        String password = "test123";

        int attempts = 0;
        while (attempts <= 2) {
            Scanner newScanner = new Scanner(System.in);
            System.out.println("Enter password");

            String inputFromScanner = newScanner.nextLine();

            if (password == inputFromScanner) {
                System.out.println("Korrekt passord");
            } else {
                System.out.println("Feil passord");
                attempts++;
            }
        }

    }
}
