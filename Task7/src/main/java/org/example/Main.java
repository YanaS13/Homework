package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Просто список");
        LinkedList l = new LinkedList();
        l.add("Женя");
        l.add("Сережа");
        l.add("Ира");
        System.out.println("Число элементов равно: ");
        System.out.println(+ l.size());
        l.add("Маша");
        System.out.println("Число элементов равно: ");
        System.out.println(+ l.size());

        System.out.println("Введите номер элемента: ");
        int ind = in.nextInt();
        System.out.println("Значение элемента: ");
        System.out.println(l.get(ind));

        System.out.println();

        System.out.println("Список с Generics");
        OOPLinkedList <String> lOOP= new OOPLinkedList();
        lOOP.add("Катя");
        lOOP.add("Сеня");
        System.out.println("Число элементов равно: ");
        System.out.println(+ lOOP.size());
        lOOP.add("Лиза");
        System.out.println("Число элементов равно: ");
        System.out.println(+ lOOP.size());

        System.out.println("Введите номер элемента: ");
        int index = in.nextInt();
        System.out.println("Значение элемента: ");
        System.out.println(lOOP.get(index));
    }
}