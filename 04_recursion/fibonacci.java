public class fibonacci {
    public static void fibonacciCal(int n, int a, int b) {
        // for series
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        // a becomes b and b becomes c and as we got the 3rd number we deduct n to n-1
        fibonacciCal(n - 1, b, c);
    }

    // for the number
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;
        fibonacciCal(n - 2, 0, 1);
        int ans = fib(n);
        System.out.println(ans);
    }
}
