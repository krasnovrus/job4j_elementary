package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay1() {
        int result = MultipleSwitchWeek.numberOfDay("Понедельник");
        assertThat(result, is(1));
    }
    @Test
    public void numberOfDay2() {
        int result = MultipleSwitchWeek.numberOfDay("Вторник");
        assertThat(result, is(2));
    }
    @Test
    public void numberOfDay3() {
        int result = MultipleSwitchWeek.numberOfDay("Среда");
        assertThat(result, is(3));
    }
    @Test
    public void numberOfDay4() {
        int result = MultipleSwitchWeek.numberOfDay("Четверг");
        assertThat(result, is(4));
    }
    @Test
    public void numberOfDay5() {
        int result = MultipleSwitchWeek.numberOfDay("Пятница");
        assertThat(result, is(5));
    }
    @Test
    public void numberOfDay6() {
        int result = MultipleSwitchWeek.numberOfDay("Суббота");
        assertThat(result, is(6));
    }
    @Test
    public void numberOfDay7() {
        int result = MultipleSwitchWeek.numberOfDay("Воскресенье");
        assertThat(result, is(7));
    }
}