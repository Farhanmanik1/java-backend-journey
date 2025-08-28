interface Animals {
    int eyes=2;
    void walk();

}
interface Herbivore{

}

class Goat implements Animals,Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Goat goat = new Goat();
        goat.walk();
    }
}
