class Student1{
    String name;
    int age;
    
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student1(){
        System.out.println("Constructor called");
    }
    
}

public class nonPconstructor {
        public static void main(String args[]){
        Student1 s1 = new Student1();
        s1.name="Farahan";
        s1.age=22;

        s1.printinfo();
    }
}
