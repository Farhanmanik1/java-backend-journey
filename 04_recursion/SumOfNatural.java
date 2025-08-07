import java.util.*;

public class SumOfNatural {
    public static void sumOfNumbers(int n, int i, int sum) {
        // int i = 1;
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        sumOfNumbers(n, i + 1, sum);
    }

    public static void main(String[] args) {
        sumOfNumbers(5, 1, 0);
    }
}
