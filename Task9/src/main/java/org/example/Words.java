package org.example;

import java.util.HashMap;

public class Words {
    HashMap <String, String> word = new HashMap<>();
    public HashMap<String, String> rez(){
        // HashMap<String, String> word = new HashMap();
        Data data = new Data();
        String s1 = data.execute();
        // System.out.println(data.execute());
        Time time = new Time();
        String s2 = time.execute();
        Ls ls = new Ls();
        String s3 = ls.execute();
        Cd absolutePath1 = new Cd();
        String s4 = absolutePath1.execute();
        Pwd filePath3 = new Pwd();
        String s5 = filePath3.execute();
        System.out.println(data);
        word.put("DATA", s1);
        word.put("TIME", s2);
        word.put("LS", s3);
        word.put("CD", s4);
        word.put("PWD", s5);

        return (HashMap<String, String>) word;
    }
    public void Search(String S){
        if (word.get(S)!=null){
            System.out.println(word.get(S));
        }else {
            System.out.println("Нет такой команды");
        }
    }
}