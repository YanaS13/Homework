package org.example;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOf implements Failiki{
    @Override
    public void OdinWrite(String name, String info) throws IOException {
        try {
            FileChannel file = FileChannel.open(Paths.get(name), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            int ch = 0;
            ByteBuffer buffer = ByteBuffer.allocate(10);
            while (ch <info.length()){
                buffer.put(String.valueOf(info.charAt(ch)).getBytes(StandardCharsets.UTF_8));
                buffer.flip();
                file.write(buffer);
                buffer.clear();
                ch++;
            }
            file.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public String DvaRead (String name) {
        String str = "";
        try {
            str = new String(Files.readAllBytes(Paths.get(name)));
            return str;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
