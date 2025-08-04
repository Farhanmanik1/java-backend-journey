import java.util.*;

// linear search
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search");
        int search = sc.nextInt();
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == search) {
                System.out.println("array found at index: " + i);
            }
        }
    }
}
