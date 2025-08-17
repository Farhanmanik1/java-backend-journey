public class powerofx {
    // method 1
    public static int power(int x, int n) {
        if (n == 0) {// base case 1
            return 1;
        }
        if (x == 0) {// base case 2
            return 0;
        }

        int xpow1 = power(x, n - 1);// working
        int xpow = x * xpow1;
        return xpow;
    }

    // method 2
    public static int power2(int x, int n) {
        if (n == 0) {// base case 1
            return 1;
        }
        if (x == 0) {// base case 2
            return 0;
        }
        // for even
        if (n % 2 == 0) {
            return power2(x, n / 2) * power2(x, n / 2);
            // for odd
        } else {
            return power2(x, n / 2) * power2(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int pow = power2(2, 5);
        System.out.println(pow);

    }
}
