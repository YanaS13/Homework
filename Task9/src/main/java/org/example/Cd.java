package org.example;

import java.io.File;

public class Cd implements Command{

    public String execute(){
        final File file = new File("watch");
        String absolutePath1 = file.getAbsolutePath();
        return absolutePath1;
    }

}