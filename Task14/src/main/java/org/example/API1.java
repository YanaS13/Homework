package org.example;

import java.util.Scanner;
public class API1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println(processDiv13(b, a -> a % 13 == 0));
    }

    public static Boolean processDiv13(int a, Num<Integer> function) {
       return function.apply(a) ;
    }
}