package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int lastWordI = word.length - 1;
        int lastPostI = post.length - 1;
        for (int i = post.length - 1; i >= 0; i--) {
            if (word[lastWordI] != post[lastPostI]){
                return false;
            }
            lastWordI--;
            lastPostI--;
        }
            return result;
        }
    }