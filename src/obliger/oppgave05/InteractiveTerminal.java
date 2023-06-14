package obliger.oppgave05;

import java.util.Scanner;

public class InteractiveTerminal {

    /************************MAIN*****************************/
    public static void main(String[] args) {
        System.out.println("Dette er menyen. Du kan velge mellom: ");
        System.out.println("1. Biff");
        System.out.println("2. Suppe");
        System.out.println("3. Tapas");

    Scanner newScanner = new Scanner(System.in);
    String choice = newScanner.nextLine();

    switch(choice) {
        case "1":
            System.out.println("Du valgte " + choice + ", biff");
            break;
        case "2":
            System.out.println("Du valgte " + choice + ", suppe");
            break;
        case "3":
            System.out.println("Du har valgt " + choice + ", Tapas");
            break;
        default:
            System.out.println("Du må  det som er presentert.");

    }
}
}
