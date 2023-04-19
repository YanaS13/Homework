package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String s, name1, name2;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        IOf iofIie = new IOf();
        NIOf nioFile = new NIOf();

        System.out.println("Введите текст: ");
        s = scanner.nextLine();

        System.out.println("Имя первого файла: ");
        name1 = scanner.nextLine();
        iofIie.OdinWrite(name1, s);

        System.out.println("Имя второго файла: ");
        name2 = scanner.nextLine();
        nioFile.OdinWrite(name2, s);

        System.out.println(iofIie.DvaRead(name1));
        System.out.println(nioFile.DvaRead(name2));
    }
}