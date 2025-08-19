
public class nqueensolutions {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int total=queens(board, 0,0);
        System.out.println("The total number of solutions for this problem are: "+total);
    }

    static int queens(boolean[][] board, int row,int solutions) {
        if (row == board.length) {
            solutions++;
            return 1;
        }

        int count = 0;
        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1,solutions);// recursive call
                board[row][col] = false;// backtrack
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // diagnol left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        // diagnol right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        // true
        return true;
    }
}
