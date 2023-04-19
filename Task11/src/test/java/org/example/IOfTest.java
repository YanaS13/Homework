package org.example;


import org.junit.Assert;
import java.io.IOException;
public class IOfTest extends IOException{
        @org.junit.Test
        public void IOTest() throws IOException {
            String s = "you are the sun!";
            IOf file = new IOf();

            file.OdinWrite("T1", s);
            String res = file.DvaRead("T1");

            Assert.assertEquals(s, res);
        }

}