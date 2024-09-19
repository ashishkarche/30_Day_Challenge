package Day_27.DSA;

import java.util.ArrayList;
import java.util.List;

class n_queen {

    public static void helper(char[][] board, List<List<String>> allBoards, int col) {

        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        // row of board
        for (int i = 0; i < board.length; i++) {
            if (isSafe(i, col, board)) {
                board[i][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[i][col] = '.'; // Backtrack
            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] board) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Vertical
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower left

        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // down Right

        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> boards = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            boards.add(row);
        }
        allBoards.add(boards);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBorads = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBorads, 0);
        return allBorads;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n)); 
    }
}
