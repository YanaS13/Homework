package org.example;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
//import junit.framework.TestCase;

public class Multiplication2NumbersTest {
    @org.junit.Test
    public void testMultiplication2Numbers() throws MultiplicationException {
        Multiplication2Numbers multi = new Multiplication2Numbers();
        int result = multi.umn(8, 8);

        Assert.assertEquals(result,64);
    }
    @org.junit.Test(expected = MultiplicationException.class)
    public void testMultiplication2Numbers1() throws MultiplicationException {
        Multiplication2Numbers multi = new Multiplication2Numbers();
        int result = multi.umn(8, -7);

    }
}