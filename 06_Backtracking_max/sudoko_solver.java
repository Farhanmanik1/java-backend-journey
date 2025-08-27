class Solution {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // check row & column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char)(number + '0')) return false;
            if (board[row][i] == (char)(number + '0')) return false;
        }

        // check 3x3 subgrid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char)(number + '0')) return false;
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == 9) return true; // solved

        int nrow, ncol;
        if (col != 8) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    }
                    board[row][col] = '.'; // backtrack
                }
            }
            return false; // no number worked
        }
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
