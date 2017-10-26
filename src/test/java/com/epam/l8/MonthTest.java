package com.epam.l8;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonthTest {
    private Main main;

    @Before
    public void setup() {
        main = new Main();
    }

    @Test(expected = Exception.class)
    public void TestReturnMonth() {
        Assert.assertEquals("January", main.returnMonth(1));
        Assert.assertEquals("February", main.returnMonth(2));
        Assert.assertEquals("March", main.returnMonth(3));
        Assert.assertEquals("April", main.returnMonth(4));
        Assert.assertEquals("May", main.returnMonth(5));
        Assert.assertEquals("June", main.returnMonth(6));
        Assert.assertEquals("July", main.returnMonth(7));
        Assert.assertEquals("August", main.returnMonth(8));
        Assert.assertEquals("September", main.returnMonth(9));
        Assert.assertEquals("October", main.returnMonth(10));
        Assert.assertEquals("November", main.returnMonth(11));
        Assert.assertEquals("December", main.returnMonth(12));
        Assert.assertEquals("Something is wrong -13", main.returnMonth(-13));
    }
}
