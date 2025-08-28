class StudentDetials{
    static int studentcount=0;
    String name;
    int age;
    double marks;

    public void displayinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);

    }

    StudentDetials(String Name,int Age,double Marks) {
        this.name=Name;
        this.age=Age;
        this.marks=Marks;
        studentcount++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + studentcount);
    }

    
}
public class Studentdata {
    public static void main(String[] args) {
        StudentDetials student1 = new StudentDetials("Farhan", 21, 75);
        StudentDetials student2 = new StudentDetials("Manik", 21, 75);

        student1.displayinfo();
        System.out.println();
        student2.displayinfo();

        StudentDetials.displayTotalStudents();

    }
}
