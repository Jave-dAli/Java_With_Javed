package Backtracking;

public class SudokuSolver {
    static boolean solveSudoku(int[][] sudoku, int row, int col) {
        // base case
        if (row == 9)
            return true;
//        else if(row==9)
//            return false;

        // recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (solveSudoku(sudoku, nextRow, nextCol))
                    return true;
                sudoku[row][col] = 0;
            }
            if (sudoku[row][col] != 0) {
                return solveSudoku(sudoku, nextRow, nextCol);
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        //is it safe column-wise
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit)
                return false;
        }

        // is it safe row-wise
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit)
                return false;
        }

        // is it safe in the grid (3X3)
        int startingRow = (row / 3) * 3;
        int startingCol = (col / 3) * 3;

        for (int i = startingRow; i < startingRow + 3; i++) {
            for (int j = startingCol; j < startingCol + 3; j++) {
                if (sudoku[i][j] == digit)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        if (solveSudoku(sudoku, 0, 0)) {
            System.out.println("Solution Exists.");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution doesn't exist.");
        }
    }

    private static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
                if (j == 2 || j == 5)
                    System.out.print("|");
            }
            System.out.println();
            if (i == 2 || i == 5)
                System.out.print("-------------------\n");
        }
    }
}
