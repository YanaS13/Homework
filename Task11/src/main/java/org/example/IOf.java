package org.example;

import  java.io.*;

public class IOf implements Failiki {
    @Override
    public void OdinWrite (String name, String info) {
        try(FileOutputStream fileOutputStream = new FileOutputStream(name);) {
            fileOutputStream.write(info.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String DvaRead (String name) {
        String str = "";
        try(FileInputStream fileInputStream = new FileInputStream(name)) {
            int ch = fileInputStream.read();
            while(ch != -1) {
                str = str + (char)ch;
                ch = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}