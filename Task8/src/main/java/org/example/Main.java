package org.example;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> h = new HashMap<Integer,String>();
        Mapa map = new Mapa();
        h.put(18,"Даша");
        h.put(21,"Вика");
        h.put(28,"Лёша");
        h.put(16,"Маша");
        h.put(24,"Ксюша");
        HashMap m = map.Map1(h);
        System.out.println(m);



    }
}