public class chessSafety {

    static boolean isSafe(int[][] board, int row, int col) {

        // Check upper column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; 
             i >= 0 && j < board.length; 
             i--, j++) {

            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static boolean solve(int[][] board, int row) {

        if (row == board.length) {
            return true;  // All queens placed
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 1;   // Place queen

                if (solve(board, row + 1)) {
                    return true;
                }

                board[row][col] = 0;   // Backtrack
            }
        }

        return false;
    }

    static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;   // 4x4 board
        int[][] board = new int[n][n];

        if (solve(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No Solution Exists");
        }
    }
}
