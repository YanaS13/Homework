package org.example;

import org.junit.Assert;
import java.io.IOException;

public class NIOfTest {
    @org.junit.Test
    public void NIOTest() throws IOException {
        String s = "the sun";
        NIOf file = new NIOf();

        file.OdinWrite("2", s);
        String res = file.DvaRead("2");

        Assert.assertEquals(s, res);
    }
}

