package JavaOOP_SuperKeyword;

public class Person {

    String firstName;
    String lastName;

    // Constructor
    Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method
    void showName () {
        System.out.println(this.firstName + " " + this.lastName);
    }
}
