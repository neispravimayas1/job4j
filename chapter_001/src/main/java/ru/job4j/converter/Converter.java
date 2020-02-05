package ru.job4j.converter;
public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value1) {
        return value1 / 60;
    }
// далее перевод в рубли
    public static int euroToRuble(int value2) {
            return value2 * 70;
    }
    public static int dollarToRuble(int value3) {
                return value3 * 60;
    }
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        int in1 = in;
        int expected1 = in1/60;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        // тестируем перевод в рубли
        int in2 = 100;
        int expected2 = 7000;
        int out2 = euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        int expected3 = 6000;
        int out3 = dollarToRuble(in2);
        boolean passed3 = expected3 == out3;

        System.out.println("140 rubles are 2 euros. Test result : " + passed);
        System.out.println("140 rubles are " + expected1+ " dollars. Test result : " + passed1);
        System.out.println("100 euros are 7000 rubles. Test result : " + passed2);
        System.out.println("100 dollars are " + expected3+ " rubles. Test result : " + passed3);
    }

}