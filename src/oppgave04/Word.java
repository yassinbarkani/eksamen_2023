package oppgave04;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<String> synonyms;

    public Word(String word) {
        this.word = word;
        this.synonyms = new ArrayList<>();
    }

    public String getWord() {
        return this.word;
    }

    public ArrayList<String> getSynonyms() {
        return this.synonyms;
    }

    public void addSynonyms(String word) {
        synonyms.add(word);
    }

}
