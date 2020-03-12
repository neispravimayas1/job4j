package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {-1, 0, 5, 10};
        //int start = array[1];
        //int finish = array [3];
        int min = MinDiapason.findMin(array, 1, 3);
        assertThat(min, is(0));
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3, 1};
        int min = MinDiapason.findMin(array, 1, 3+1);
        assertThat(min,is(1));
        }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5, 1};
      //  int start = array[0];
       // int finish = array [2];
        int min = MinDiapason.findMin(array, 0, 2);
        assertThat(min,is(2));
    }
}