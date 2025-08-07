public class factorial {
    // first way
    public static void factorialOfNumber(int n, int fact) {
        if (n == 0) {
            System.out.println(fact);
            return;
        }
        fact = fact * n;
        factorialOfNumber(n - 1, fact);

    }

    // second way
    public static int factorialOfNumber2(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int factnum1 = factorialOfNumber2(n - 1);
        int fact = n * factnum1;
        return fact;
    }

    public static void main(String[] args) {
        int fact = factorialOfNumber2(3);
        System.out.println(fact);
    }
}
