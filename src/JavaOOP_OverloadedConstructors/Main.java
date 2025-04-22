package JavaOOP_OverloadedConstructors;

public class Main {
    public static void main(String[] args) {

        // Overloaded constructors = Allow class to have multiple constructors
        //                           with different parameters lists.
        //                           Enable objects to be initialized in various ways


        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "pstar@aol.com");
        User user3 = new User("Sandy", "scheeks@gmail.com", 27);
        User user4 = new User();


        // Attributes: user1 information
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        // Attributes: user2 information
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        // Attributes: user3 information
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        // Attributes: user4 information
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
