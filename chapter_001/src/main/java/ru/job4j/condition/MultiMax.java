package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second) {
        int result = first>second ? first : second;
        return result;
    }
    public int max(int first, int second, int  third) {
        int temp1 = second>third ? second : third;
        return first >temp1 ? first : temp1;
          }
}