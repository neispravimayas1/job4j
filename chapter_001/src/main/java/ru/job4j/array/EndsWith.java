package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int i = 0; i < post.length; i++) {
            if (word[i] == post[i]) {
            }
            return true;
        }
        return result;
    }
}