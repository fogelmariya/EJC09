package com.epam.hw2;
/**
 * Test for method ReturnLight, which output color of traffic light, getting minutes of it's working
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrafficLightTest {
    TrafficLight trafficLight = new TrafficLight();

    @Before
    public void before() {
        System.out.println("New Test");
    }

    @Test
    public void testFor1MinuteRedColor() {
        Assert.assertEquals("wrong", " red ", trafficLight.returnLight(1));
    }

    @Test
    public void testFor4MinuteYellowColor() {
        Assert.assertEquals("wrong", " yellow ", trafficLight.returnLight(4));
    }

    @Test
    public void testFor7MinuteGreenColor() {
        Assert.assertEquals("wrong", " green ", trafficLight.returnLight(7));
    }

    @Test
    public void testFor63MinuteYellowColor() {
        Assert.assertEquals("wrong", " yellow ", trafficLight.returnLight(63));
    }

    @After
    public void after() {
        System.out.println("End of the test");
    }
}
