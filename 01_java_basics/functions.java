import java.util.*;

public class functions {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void calculateFactorial(int n) {
        int fact = 1;
        if (n == 1 || n == 0) {
            System.out.println("Factorial is 1");
        } else if (n < 0) {
            System.out.println("Please enter a positive number");
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial is " + fact);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int b = sc.nextInt();

        calculateFactorial(n);
    }
}
