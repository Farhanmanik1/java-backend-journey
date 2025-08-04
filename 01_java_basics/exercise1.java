import java.util.*;

public class exercise1 {
    // avg of 3 numbers
    public static int averageOfThree(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    // sum of odd numbers
    public static int sumOfOdd(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                num = num + i;
            }
        }
        return num;
    }

    // greatest of 2 numbers
    public static void greatestOfTwo(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater");
        } else if (a == b) {
            System.out.println("Both are equal");
        } else {
            System.out.println(b + " is greater");
        }
    }

    // circumference of circle
    public static double circumferenceOfCircle(double r) {
        double circumference = 2 * 3.14 * r;
        return circumference;
    }

    public static void canVote(int n) {
        if (n >= 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("Cannot vote");
        }
    }

    // power of a number
    public static int raisedToPower(int x, int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * x;
        }
        return ans;
    }

    // Greatest comman divisor
    public static void GCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }

    // finding fibonacci series
    public static void calculateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            int ans = a + b;
            a = b;
            b = ans;
            System.out.print(ans + " ");
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = averageOfThree(a, b, c);
        // System.out.println("The average of 3 nos is " + avg);

        // int n = sc.nextInt();
        // int num = sumOfOdd(n);
        // System.out.println("The sum of odd numbers is " + num);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // greatestOfTwo(a, b);

        // int r = sc.nextInt();
        // double circumference = circumferenceOfCircle(r);
        // System.out.println("The circumference of circle is " + circumference);

        // int n = 1;
        // do {
        // System.out.println("Hi");
        // n++;
        // } while (n > 1);

        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // int ans = raisedToPower(x, n);
        // System.out.println(ans);

        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // int ans = raisedToPower(x, n);
        // System.out.println(ans);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // GCD(a, b);

        int n = sc.nextInt();
        calculateFibonacci(n);

    }
}
