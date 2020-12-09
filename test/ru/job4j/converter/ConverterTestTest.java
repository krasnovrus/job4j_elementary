package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Converter;

public class ConverterTestTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int inE = 140; //Входное значение//
        int expectedE = 2; //Ожидаемое значение//
        int outE = Converter.rubleToEuro(inE); //Результат работы программы//
        Assert.assertEquals(expectedE, outE);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        int inD = 180; //Входное значение//
        int expectedD = 3; //Ожидаемое значение//
        int outD = Converter.rubleToDollar(inD); //Результат работы программы//
        Assert.assertEquals(expectedD, outD);
    }
}