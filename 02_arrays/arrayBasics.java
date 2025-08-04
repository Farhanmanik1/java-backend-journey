import java.util.*;

public class arrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // subjects using array

        System.out.println("Enter the total number of subjects");
        int size = sc.nextInt();
        int marks[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the marks for subject: " + (i + 1));
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("The marks of subject " + (i + 1) + " is " + marks[i]);
        }

    }
}
