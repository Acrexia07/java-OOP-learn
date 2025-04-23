package JavaOOP_ArrayList_Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput_ArrayList {
    public static void main(String[] args) {

        //Initialization: Variable Declaration
        Scanner scn = new Scanner(System.in);

        ArrayList <String> foods = new ArrayList<>();

        String fruit;
        int numOfFoods;

        while(true){
            System.out.print("Enter the number of foods you want: ");
            if(!scn.hasNextInt()){
                System.out.println("Invalid input: Enter a whole number! Please try again.");
                scn.next();
            }
            else {
                numOfFoods = scn.nextInt();
                scn.nextLine();
                if( numOfFoods <= 0){
                    System.out.println("Invalid input: Enter only positive whole number and greater that to 0! Please try again.");
                }
                else{
                    break;
                }
            }
        }
        for (int i = 1; i <= numOfFoods;i++) {
                System.out.print("Enter food #" + i + ": ");
                String food = scn.nextLine();
                foods.add(food);
        }
        System.out.println(foods);






//        System.out.print("Enter fruit: ");
//        fruit = scn.nextLine();
//
//        ArrayList<String> fruitCollection = new ArrayList<>();
//
//        fruitCollection.add(fruit);

//        System.out.println(fruitCollection);
        // Exit: Close Scanner object
        scn.close();
    }
}
