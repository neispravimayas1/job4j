package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int min = Min.findMin(array);
        assertThat(min,is(0));
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int min = Min.findMin(array);
        assertThat(min,is(3));
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int min = Min.findMin(array);
        assertThat(min,is(2));
        }
}