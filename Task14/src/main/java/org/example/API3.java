package org.example;

public class API3 {
    public static void main(String[] args) {

        Diskr dis = (a,b,c) -> (b*b - 4*a*c);
        double a = 1.3;
        double b = 2.8;
        double c = 3.5;

        System.out.println(dis.apply(a,b,c));
    }
}
