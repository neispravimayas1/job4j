package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in1 = 180;
        int expected1 = 3;
        int out1 = Converter.rubleToDollar(in1);
        Assert.assertEquals(expected1, out1);
    }
    // теперь конвертируем валюту в рубли
    @Test
    public void dollarToRuble() {
        int in2 =3;
        int expected2 = 180;
        int out2 = Converter.dollarToRuble(in2);
        Assert.assertEquals(expected2, out2);
    }
    @Test
    public void euroToRuble() {
        int in3 = 2;
        int expected3 = 140;
        int out3 = Converter.euroToRuble(in3);
        Assert.assertEquals(expected3, out3);
    }
}