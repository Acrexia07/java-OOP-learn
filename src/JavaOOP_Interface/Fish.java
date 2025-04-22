package JavaOOP_Interface;

public class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("*The fish is running away*");
    }

    public void hunt(){
        System.out.println("*The fish is hunting*");
    }
}
