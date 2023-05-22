package org.example;

import java.util.Scanner;

public class API2 {
    public static void main(String[] args) {
        Str strFunc= (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }
        };
        System.out.println(strFunc.apply("Бегемотик", "Слоник"));
    }

}
