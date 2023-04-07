package org.example;

import java.io.File;

public class Pwd implements Command{

    public String execute(){
        final File file = new File("watch");
        String absolutePath2 = file.getAbsolutePath();
        String filePath2 = absolutePath2.substring(0,absolutePath2.lastIndexOf(File.separator));
        String filePath3 = filePath2.substring(0,filePath2.lastIndexOf(File.separator));
        return filePath3;
    }
}