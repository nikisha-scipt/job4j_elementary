package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        int count = 0;
        for (char c : word) {
            for (char value : pref) {
                if (c == value) {
                    count++;
                }
            }
        }
        if (pref.length == count) {
            result = true;
        }
        return result;
    }

}
