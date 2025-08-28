class Student2{
    String name;
    int age;
    
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student2(String Name, int Age){//parameters passed in here itself
        this.name=Name;
        this.age=Age;
    } 
}

public class Pconstructor {
        public static void main(String args[]){
        Student2 s1 = new Student2("Farhan",22);
        s1.printinfo();
    }
}
