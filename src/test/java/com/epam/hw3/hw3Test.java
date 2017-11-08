package com.epam.hw3;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class hw3Test {
    MallardDuck mallardDuck;
    ModelDuck modelDuck;

    @Before
    public void setUp(){
        mallardDuck = new MallardDuck();
        modelDuck = new ModelDuck();
    }
    @Test
    public void TestPerformFly(){
        Assert.assertEquals("I can't fly!:((((", modelDuck.performFly());
        Assert.assertEquals("I'm flying!!",mallardDuck.performFly());
    }

    @Test
    public void TestPerformQuack(){
        Assert.assertEquals("QUACKKK", modelDuck.performQuack());
        Assert.assertEquals("QUACKKK", mallardDuck.performQuack());
    }

}
