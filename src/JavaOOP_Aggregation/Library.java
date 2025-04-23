package JavaOOP_Aggregation;

public class Library {

    String name;
    int establishedYear;
    Book[] books;

    Library(String name, int establishedYear, Book[] books){
        this.name = name;
        this.establishedYear = establishedYear;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.establishedYear + " " + this.name);
        System.out.println("Books Available: ");

        for(Book book: books){
            System.out.println(book.displayInfo());
        }
    }
}
