package oppgave04;

import oppgave03.Book;
import oppgave03.BookGenre;

import java.util.ArrayList;

public class Program {

    public void runProgram() {
        System.out.println("Programmet starter ...");
    }

    /************************MAIN*****************************/
    public static void main(String[] args) {
        Program newProgram = new Program();
        newProgram.runProgram();

        Word heiOrd = new Word("Hei");
        heiOrd.addSynonyms("Heisann");
        heiOrd.addSynonyms("Hallo");

        Word hadeOrd = new Word("Hade");
        hadeOrd.addSynonyms("Bye");
        hadeOrd.addSynonyms("Snakkes");

        Word takkOrd = new Word("Skole");
        takkOrd.addSynonyms("Utdanning");

        ArrayList<Word> words = new ArrayList<>();

        words.add(heiOrd);
        words.add(hadeOrd);
        words.add(takkOrd);

        for (Word word : words) {
            System.out.print(word.getWord() + ": ");

            for (String synonym : word.getSynonyms()) {
                System.out.print(synonym + " ");
            }

            System.out.println("");
        }
    }

}
