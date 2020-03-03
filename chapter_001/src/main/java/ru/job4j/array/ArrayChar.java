package ru.job4j.array;

public class ArrayChar {

    public static boolean myMet(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < pref.length; i++) {
                    if (word[1] == pref[1]) {
                        return true;
            }
        }
        return result;
    }
    }