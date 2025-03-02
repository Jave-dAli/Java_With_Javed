package Backtracking;

// time-complexity O(n!).
public class NQueens2 {
    static int count=0;
    static void nQueens(char[][] board, int row) {
        //base
        if (row == board.length) {
//            printBoard(board);
            count++;    // if we want only number of possible ways to solve n-queens.
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);  // function call
                board[row][j] = 'x';      // backtracking step
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // is vertically upwards safe?
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q')
                return false;
        }

        // is diagonally left upwards safe?
        for(int i= row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q')
                return false;
        }

        // is diagonally right upwards safe?
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q')
                return false;
        }
        return true;
    }

    static void printBoard(char[][] board) {
        System.out.println("\n--board--");
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++)
                System.out.print(chars[j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                board[i][j] = 'x';
        }
        nQueens(board, 0);
        System.out.println("Total no of ways to solve "+n+" queens: "+count);
    }
}
