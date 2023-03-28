package org.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
public class Task2 {
    public static void main(String[] args) {
        String s;
        Map<String, Integer> r = new HashMap<String, Integer>();
        String filePath = "C:\\Users\\Yana\\IdeaProjects\\Task8\\failik.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))) {
            s = Files.readString(Path.of(filePath));
            String si="";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)==' '){
                    int co=0;
                    if (r.get(si) == null){
                        co=1;
                        r.put(si, co);
                    }else{
                        co = r.get(si);
                        co+=1;
                        r.put(si,co);
                    }
                    si="";
                }else{
                    si = si + s.charAt(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String key : r.keySet()) {
            System.out.println(key + " - " + r.get(key));
        }
    }
}