abstract class Animal{//cannot use but just exists
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new animal");
    }
    public void eat(){
        System.out.println("Eating...");
    }

}

class Horse extends Animal{
    Horse(){
        System.out.println("You are creating a horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        // horse.walk();
        // horse.eat();
    }
}
