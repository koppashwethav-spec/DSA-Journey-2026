package Backtracking;

public class NQueens {

    static int N = 4;

    static boolean isSafe(int[][] board, int row, int col) {

        
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

       
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    static boolean solve(int[][] board, int col) {

        if (col >= N)
            return true;

        for (int row = 0; row < N; row++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 1;

                if (solve(board, col + 1))
                    return true;

                board[row][col] = 0;
            }
        }

        return false;
    }

    static void printBoard(int[][] board) {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = new int[N][N];

        if (solve(board, 0)) {

            System.out.println("Solution Found:");
            printBoard(board);

        } else {

            System.out.println("Solution Not Found");
        }
    }
}