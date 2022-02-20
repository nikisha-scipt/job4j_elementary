package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        for (char[] chars : board) {
            if (chars[row] == 'X') {
                result = true;
                break;
            }
        }
        return result;
    }

}
