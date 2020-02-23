package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, double salary, double percent) {
        int year = 0;
        percent=percent/100;
        while (amount > 0) {
          double kOplate = amount+(amount*percent);
          amount= kOplate-salary;
            year++;
        }
        return year;
}
}
