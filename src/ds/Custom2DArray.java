package ds;

import java.util.Arrays;

public class Custom2DArray {
    public static void main(String[] args) {
        final short ROWS = 3;
        final short COLUMNS = 3;
        char[][] board = new char[ROWS][COLUMNS];

        for (int i = 0; i < ROWS; i++){
            for (int j = 0; j < COLUMNS; j++){
                board[i][j] = i == j ? 'X' : 'O';
            }
        }

        for (char[] row: board){
            System.out.println(Arrays.toString(row));
        }
    }
}
