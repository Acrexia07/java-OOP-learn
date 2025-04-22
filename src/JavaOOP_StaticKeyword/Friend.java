package JavaOOP_StaticKeyword;

public class Friend {

    String name;
    static int numberOfFriends;

    // Constructor
    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void showFriends () {
        System.out.println("You have " + numberOfFriends + " total friends");
    }
}
