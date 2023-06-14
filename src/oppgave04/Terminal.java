package oppgave04;

import java.util.ArrayList;

public class Terminal {
    ArrayList<String> options;

    public void addOption(String value){
        options.add(value);
    }

    public void clearOptions() {
        options.clear();
    }

    public void displayMenu(){
        for (int i=0; i<options.size(); i++) {
            System.out.println(i + "\n");
        }
    }
}
