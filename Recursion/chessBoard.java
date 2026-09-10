import java.util.*;
public class chessBoard {
    static void solve(char board[][], int row){

        //base case
        if(row == board.length){  //if we have reached the end of the board
            for(int i=0; i<board.length; i++){   //print the board
                for(int j = 0; j< board[0].length; j++){  //iterating through the columns
                    System.out.print(board[i][j] +" ");  //printing the board
                }
                System.out.println();  //new line after each row
            }
            System.out.println("-------NEW BOARD-------");  //separating the boards
            return;
        }

        for(int col = 0; col<board[0].length; col++){  
            board[row][col] = 'Q';  //queen placed
            solve(board, row+1);  //recursive call for next row
            board[row][col] = '.';   //backtrack and remove the queen
        }

    }
    public static void main(String[] args) {
        char board[][] = new char[3][3]; //3*3 chess board

        for(char row[] : board){        //filling the board with '.'
            Arrays.fill(row,'.');
        }
        solve(board, 0); //calling the function to solve the chess board
    }
}
