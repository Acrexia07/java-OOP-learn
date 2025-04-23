package JavaOOP_Wrapper;

public class Main {

    public static void main(String[] args) {
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be treated as objects. "Wrap them in an object"
        //                   Generally, you don't wrap primitive values unless you need an object.
        //                   Allows use of Collection Framework and static Utility Methods (Great for verification input).

    //    // Autoboxing
    //    Integer a = 123;
    //    Double b = 3.14;
    //    Character c = '$';
    //    Boolean d = true;
    //
    //    // Unboxing
    //    int x = a;
    //    double y = b;
    //    char z = c;
    //    boolean w = d;

//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('@');
//        String d = Boolean.toString(true);
//
//        String x = a + b + c + d;
//        System.out.println(x);

//        // Parsing
//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c = "Pizza".charAt(0);
//        boolean d = Boolean.parseBoolean("true");

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
