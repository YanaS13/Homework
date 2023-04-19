package org.example;

import java.io.IOException;
public interface Failiki {
    void OdinWrite (String name, String d) throws IOException;
    String DvaRead(String name);
}
