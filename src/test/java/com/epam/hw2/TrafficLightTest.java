package com.epam.hw2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrafficLightTest {
    private TrafficLight trafficLight;

    @Before
    public void setup() {
        trafficLight = new TrafficLight();
    }
    /**
     * Test for method ReturnLight, which output color of traffic light, getting minutes of it's working
     */

    @Test
    public void testReturnLight() {
        Assert.assertEquals("wrong", " red ", trafficLight.returnLight(1));
        Assert.assertEquals("wrong", " yellow ", trafficLight.returnLight(4));
        Assert.assertEquals("wrong", " green ", trafficLight.returnLight(7));
        Assert.assertEquals("wrong", " yellow ", trafficLight.returnLight(63));
    }
}
