package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Converter;

public class ConverterTestTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in_e = 140; //Входное значение//
        int expected_e = 2; //Ожидаемое значение//
        int out_e = Converter.rubleToEuro(in_e); //Результат работы программы//
        Assert.assertEquals(expected_e, out_e);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        int in_d = 180; //Входное значение//
        int expected_d = 3; //Ожидаемое значение//
        int out_d = Converter.rubleToDollar(in_d); //Результат работы программы//
        Assert.assertEquals(expected_d, out_d);
    }
}