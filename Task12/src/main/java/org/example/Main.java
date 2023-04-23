package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) throws  NoSuchFieldException, IllegalAccessException{
        mapToProductDto m = new mapToProductDto();

        Pet cat = new Pet("Барсик", Status.AVAILABLE,
                List.of(new Photo("Барсик с цветочком", "https://placekitten.com/200/300"),
                new Photo("Барсик на ручках", "https://placekitten.com/500/605")
        ));

        Animal animal = m.mapToProductDto(cat);
        System.out.println(animal);
    }
}