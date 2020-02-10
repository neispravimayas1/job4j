package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance (){
        double in = 5;
        double in1 = 2;
        double in2 = 10;
        double in3 = 4;
        double expected = 5.38;
        double out = Point.distance(in,in1,in2,in3);
        Assert.assertEquals(expected,out,0.01);
    }
}
