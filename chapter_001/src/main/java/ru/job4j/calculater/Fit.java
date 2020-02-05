package ru.job4j.calculater;
public class Fit {
    public static double manWeight(double height) {
        return (height-100)*1.15;
    }
    public static double womanWeight(double height) {
        return (height-110)*1.15;
    }
    public static void main(String[] args) {
        double man = manWeight(200);
        double woman = womanWeight(170);
        System.out.println("Man 200 is " + man + "kg.");
        System.out.println("Woman 170 is " + + woman + "kg");
    }
}
