package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = post.length - 1; i >= 0; i--) {
            if (word[i + word.length - 2] != post[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

}
