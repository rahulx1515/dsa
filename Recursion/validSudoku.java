public class validSudoku {
    static boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1'; // Convert char to int (0-8)
                    if (seen[num]) {
                        return false; // Duplicate found in row
                    }
                    seen[num] = true;
                }
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1'; // Convert char to int (0-8)
                    if (seen[num]) {
                        return false; // Duplicate found in column
                    }
                    seen[num] = true;
                }
            }
        }

        // Check 3x3 sub-boxes
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                boolean[] seen = new boolean[9];
                for (int i = boxRow * 3; i < boxRow * 3 + 3; i++) {
                    for (int j = boxCol * 3; j < boxCol * 3 + 3; j++) {
                        if (board[i][j] != '.') {
                            int num = board[i][j] - '1'; // Convert char to int (0-8)
                            if (seen[num]) {
                                return false; // Duplicate found in sub-box
                            }
                            seen[num] = true;
                        }
                    }
                }
            }
        }

        return true; // All checks passed, the board is valid
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '8', '8', '5', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}   };
        System.out.println(isValidSudoku(board)); // Output: false (due to duplicate '8' in the middle row)
    
}



// time and space complexity is O(1) because we are checking a fixed size of 9x9 board, and the operations we perform are constant time.