public class ratmaze {
    public static void solveMaze(int[][] maze, int n) {
        boolean[][] visited = new boolean[n][n];
        String path = "";
        backtrack(0, 0, maze, n, visited, path);
    }

    private static void backtrack(int row, int col, int[][] maze, int n, boolean[][] visited, String path) {
        // base conditions
        if (row < 0 || col < 0 || row >= n || col >= n) return; // out of bounds
        if (maze[row][col] == 0 || visited[row][col]) return;   // wall or already visited

        // destination reached
        if (row == n - 1 && col == n - 1) {
            System.out.println(path);
            return;
        }

        // mark visited
        visited[row][col] = true;

        // Move Down
        backtrack(row + 1, col, maze, n, visited, path + "D");
        // Move Left
        backtrack(row, col - 1, maze, n, visited, path + "L");
        // Move Right
        backtrack(row, col + 1, maze, n, visited, path + "R");
        // Move Up
        backtrack(row - 1, col, maze, n, visited, path + "U");

        // unmark (backtrack)
        visited[row][col] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int n = maze.length;
        solveMaze(maze, n);
    }
}
