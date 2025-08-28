class Shape{
    public void area(){
        System.out.println("Displays Area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println((0.5)*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();

        t1.area(4,5);
        c1.area(10);
    }
}
