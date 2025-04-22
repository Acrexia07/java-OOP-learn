package JavaOOP_Interface;

import javax.swing.text.rtf.RTFEditorKit;

public class Main {
    public static void main(String[] args) {

        // Interface = A blueprint for class that specifies a set of abstract methods
        //             that implementing class MUST define.
        //             Supports multiple inheritance-like behavior.


        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();


        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();

    }
}
