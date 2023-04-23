package org.example;
import java.util.Map;
public class Animal {
    private String title;
    private boolean isAvailable;
    private boolean isSold;
    private Map<String, String> photosMap;

    @Override
    public String toString() {
        return "Animal{" + " titel = "+ title + ", isAvailable = "+ isAvailable
                + ", isSold = " + isSold + ", photosMap  = " + photosMap;
    }
}
