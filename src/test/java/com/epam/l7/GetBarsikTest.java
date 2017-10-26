package com.epam.l7;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GetBarsikTest {
    private Main main;

    @Before
    public void setup() {
        main = new Main();
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestGetBarsik() {
        Assert.assertEquals("Great, you have input Barsik, you did it correctly!", main.getBarsik("Barsik"));
        Assert.assertEquals("You should input Barsik, but you input: not Barsik", main.getBarsik("not Barsik"));
    }

}
