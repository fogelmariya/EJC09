package com.epam.hw2;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTrafficLight {
    TrafficLight trafficLight = new TrafficLight();
    @Before
    public  void before(){
        System.out.println("New Test");
    }
    @Test
    public void testForTrafficLight(){
        Assert.assertEquals("wrong",  " red ", trafficLight.returnLight(1));
        Assert.assertEquals("wrong",  " yellow ", trafficLight.returnLight(4));
        Assert.assertEquals("wrong", " green ", trafficLight.returnLight(7));
        Assert.assertEquals("wrong", " yellow ", trafficLight.returnLight(12));
    }
    @After
    public void after (){
        System.out.println("End of the test");
    }
}
