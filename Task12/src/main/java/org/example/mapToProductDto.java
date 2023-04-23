package org.example;

import java.lang.reflect.Field;
import java.util.*;
public class mapToProductDto {
    public Animal mapToProductDto(Pet cat) throws NoSuchFieldException, IllegalAccessException {
        Animal animal = new Animal();
        try {
            Field field1p = cat.getClass().getDeclaredField("photosList");
            field1p.setAccessible(true);
            Field field2p = cat.getClass().getDeclaredField("name");
            field2p.setAccessible(true);
            Field field3p = cat.getClass().getDeclaredField("status");
            field3p.setAccessible(true);

            Field field1a = animal.getClass().getDeclaredField("title");
            field1a.setAccessible(true);
            Field field2a = animal.getClass().getDeclaredField("isAvailable");
            field2a.setAccessible(true);
            Field field3a = animal.getClass().getDeclaredField("isSold");
            field3a.setAccessible(true);
            Field field4a = animal.getClass().getDeclaredField("photosMap");
            field4a.setAccessible(true);

            List<Photo> photoList = (List<Photo>) field1p.get(cat);
            String name = (String) field2p.get(cat);

            Status status = (Status) field3p.get(cat);
            HashMap<String, String> photoMap = new HashMap<>();
            for (Photo photo: photoList){
                photoMap.put(photo.getName(),photo.getURL());
            }

            field1a.set(animal, name);
            field2a.set(animal, status == Status.AVAILABLE);
            field3a.set(animal, status == Status.SOLD);
            field4a.set(animal, photoMap);

        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }
        return animal;
    }
}
