package org.example;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String str="";
        Words word = new Words();
        word.rez();
        while (str!="Exit"){
            System.out.print(">");
            str = scaner.nextLine();
            str = str.toUpperCase();
            word.Search(str);
        }

    }
}