package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(2,10)
                .forEach(x ->IntStream.rangeClosed(1, 9)
                   .forEach(y -> System.out.println(x + " * " +y + " =" + x*y)));


    }
}