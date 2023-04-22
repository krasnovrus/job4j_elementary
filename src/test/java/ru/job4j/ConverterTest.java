package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import static ru.job4j.Converter.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert240RblThen3Dollar() {
        float in = 240;
        float expected = 3;
        float out = rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}