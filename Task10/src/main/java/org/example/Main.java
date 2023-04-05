package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        Multiplication2Numbers multi = new Multiplication2Numbers();
        try {
            System.out.println("Произведение равно:"+ multi.umn(a,b));
        }
        catch (Exception e){
            System.out.println("Введено нечетное число");
        } finally {
            System.out.println("Ты умничка и солнышко!)");
        }
    }
}