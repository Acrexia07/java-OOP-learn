package JavaOOP_ArrayList;


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("coconut");

//        fruits.remove(1);
//        fruits.set(0, "Pineapple");
//        System.out.println(fruits.get(1));
//        System.out.println(fruits.size());

//        Collections.sort(fruits);
//
        for (String fruit : fruits ){
            System.out.println(fruit);
        }

    }
}
