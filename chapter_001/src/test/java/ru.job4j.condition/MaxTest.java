package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax2To1Then2() {
        double result = Max.max(2,1);
        assertThat(result, is(2));
    }@Test
    public void whenMax1To2Then2() {
        double result1 = Max.max(1,2);
        assertThat(result1, is(2));
    }@Test
    public void whenMax2To2Then2() {
        double result2 = Max.max(2,2);
        assertThat(result2, is(2));
}
}
