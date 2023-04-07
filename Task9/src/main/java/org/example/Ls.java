package org.example;

import java.io.File;

public class Ls implements Command{

    public String execute(){
        final File file = new File("watch");
        String absolutePath = file.getAbsolutePath();
        String filePath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
        String filePath1 = filePath.substring(0,filePath.lastIndexOf(File.separator));
        File directoryPath = new File(filePath1);
        String contents[] = directoryPath.list();
        System.out.println("List of files and directories in the specified directory:");
        String Ls="";
        for(int i=0; i<contents.length; i++) {
            Ls = Ls + contents[i];
            Ls = Ls + " ";
        }
        return Ls;
    }
}
