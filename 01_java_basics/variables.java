import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = a + b;
        int diff = b - a;
        int mul = a * b;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println(name);
    }
}