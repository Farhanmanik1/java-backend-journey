import java.util.*;

public class conditional_statements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // System.out.println("Enter your age");
        // if (age > 18) {
        // System.out.println("Adult");
        // } else {
        // System.out.println("Not Adult");
        // }

        // System.out.println("Enter the number");
        // int num = sc.nextInt();

        // if (num % 2 != 0) {
        // System.out.println("Odd");
        // } else {
        // System.out.println("Even");
        // }

        // System.out.println("Enter the first number");
        // int num1 = sc.nextInt();

        // System.out.println("Enter the second number");
        // int num2 = sc.nextInt();

        // if (num1 > num2) {
        // System.out.println(num1 + " is greater than " + num2);
        // }

        // else if (num2 > num1) {
        // System.out.println(num2 + " is greater than " + num1);
        // }

        // else {
        // System.out.println("both are equal");
        // }

        // System.out.println("Press 1 for English, Press 2 for Hindi, Press 3 for
        // French");
        // int button = sc.nextInt();

        // if (button == 1) {
        // System.out.println("Hello");
        // } else if (button == 2) {
        // System.out.println("Namaste");
        // } else if (button == 3) {
        // System.out.println("Bonjour");
        // } else {
        // System.out.println("Invalid Input");
        // }

        // switch (button) {
        // case 1:
        // System.out.println("Hello");
        // break;

        // case 2:
        // System.out.println("Namaste");
        // break;

        // case 3:
        // System.out.println("French");
        // break;

        // default:
        // System.out.println("Error");
        // }
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Press 1 to add, 2 to substract, 3 to multiply, 4 to divide");
        int button = sc.nextInt();
        int ans;
        switch (button) {
            case 1:
                ans = num1 + num2;
                System.out.println("The answer is " + ans);
                break;

            case 2:
                ans = num2 + num1;
                System.out.println("The answer is " + ans);
                break;

            case 3:
                ans = num1 * num2;
                System.out.println("The answer is " + ans);
                break;

            case 4:
                ans = num1 / num2;
                System.out.println("The answer is " + ans);
                break;

            default:
                break;
        }
    }
}
