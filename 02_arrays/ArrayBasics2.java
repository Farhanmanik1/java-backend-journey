import java.util.*;

//2d Array
public class ArrayBasics2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter a number to search: ");
        int search = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == search) {
                    System.out.println("Element found at row " + i + " and col " + j);
                }
            }
            System.out.println();
        }
    }
}
