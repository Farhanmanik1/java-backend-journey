class Students{
    String name;
    static String school;//will be same for all students
}

public class statickeyword {
    public static void main(String[] args) {
        Students.school="GEC";
        Students student1 = new Students();
        student1.name = "Farhan";
        Students student2 = new Students();
        student1.name = "Manik";
        System.out.println(student2.school);
    }
}
