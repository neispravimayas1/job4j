package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
@Test
public void whenFirstMax() {
    MultiMax check = new MultiMax();
    int result1 = check.max(4, 1, 2);
    assertThat(result1, is(4));
}@Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));

    }@Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result2 = check.max(2, 1, 4);
        assertThat(result2, is(4));
}@Test
    public void whenAllMax() {
        MultiMax check = new MultiMax();
        int result3 = check.max(4, 4, 4);
        assertThat(result3, is(4));
}
}