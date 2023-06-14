package oppgave03;

public class Book {

    String title;
    String author;
    int numberOfPages;
    BookGenre genre;

    public Book (String title, String author, int numberOfPages, BookGenre genre) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    private BookGenre getGenre() {
        return genre;
    }

    private void setGenre() {
        this.genre = genre;
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private int getNumberOfPages() {
        return numberOfPages;
    }

    private void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void printObject() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nNumber of pages: " + numberOfPages + "\nGenre: " + genre);
    }


    /************************MAIN*****************************/
    public static void main(String[] args) {
        Book newBook = new Book("Harry Potter", "Inti Khan", 400, BookGenre.ACTION);

        newBook.printObject();
    }

}
