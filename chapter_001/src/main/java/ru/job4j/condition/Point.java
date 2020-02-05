package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        double first = Math.pow((x2-x1),2);
        double second = Math.pow((y2-y1),2);
        return Math.sqrt(first + second);
    }
    public static void main(String[] args) {
        double result = Point.distance(5, 2, 10, 4);
        System.out.println("result (5, 10) to (4, 2) " + result);
    }
}