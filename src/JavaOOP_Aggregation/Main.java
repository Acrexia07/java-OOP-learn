package JavaOOP_Aggregation;

public class Main {
    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently

        Book book1 = new Book("The fellowship of the ring", 423);
        Book book2 = new Book("The two towers", 352);
        Book book3 = new Book("The return of the king", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();
    }
}
