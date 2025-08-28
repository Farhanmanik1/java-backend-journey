class Student3{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}

public class compileTimePolymorphism {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.name="Farhan";
        s1.age=22;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
        
    }
}
