package clases.ejemplo01;

public class Book {
    // Atributos
    private String title;
    private String author;
    private int publishYear;
    private String genre;

    // Constructor
    // Cuando se instancia esta clase debemos definir estas propiedades, estamos dando valor
    public Book(String title, String author, int publishYear, String genre) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.genre = genre;
    }

    // Cuando es constructr vacío, Java lo va a definir
    public Book() {}

    // Métodos
    public void read(){
        System.out.println("Reading " + title + " by " + author);
    }

    public void info(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publish Year: " + publishYear);
        System.out.println("Genre: " + genre);
    }
}
