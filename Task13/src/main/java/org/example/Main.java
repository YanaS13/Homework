package org.example;

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) throws NoSuchMethodException{
        print(new Week());

    }
    public static void print(Week week) throws NoSuchMethodException{

        Method field1w = week.getClass().getDeclaredMethod("monday");
        field1w.setAccessible(true);
        Method field2w = week.getClass().getDeclaredMethod("tuesday");
        field2w.setAccessible(true);
        Method field3w = week.getClass().getDeclaredMethod("wednesday");
        field3w.setAccessible(true);
        Method field4w = week.getClass().getDeclaredMethod("thursday");
        field4w.setAccessible(true);
        Method field5w = week.getClass().getDeclaredMethod("friday");
        field5w.setAccessible(true);
        Method field6w = week.getClass().getDeclaredMethod("saturday");
        field6w.setAccessible(true);
        Method field7w = week.getClass().getDeclaredMethod("sunday");
        field7w.setAccessible(true);

                try {

            if (field1w.isAnnotationPresent(Paint.class)) {
                System.out.println(field1w.getAnnotation(Paint.class).color() + field1w.getAnnotation(Paint.class).style() + field1w.invoke(week));
            } else if (week.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(week.getClass().getAnnotation(Paint.class).color() + week.getClass().getAnnotation(Paint.class).style() + field1w.invoke(week));
            }
            if (field2w.isAnnotationPresent(Paint.class)) {
                System.out.println(field2w.getAnnotation(Paint.class).color() + field2w.getAnnotation(Paint.class).style() + field2w.invoke(week));
            } else if (week.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(week.getClass().getAnnotation(Paint.class).color() + week.getClass().getAnnotation(Paint.class).style() + field2w.invoke(week));
            }
            if (field3w.isAnnotationPresent(Paint.class)) {
                System.out.println(field3w.getAnnotation(Paint.class).color() + field3w.getAnnotation(Paint.class).style() + field3w.invoke(week));
            } else if (week.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(week.getClass().getAnnotation(Paint.class).color() + week.getClass().getAnnotation(Paint.class).style() + field3w.invoke(week));
            }
            if (field4w.isAnnotationPresent(Paint.class)) {
                System.out.println(field4w.getAnnotation(Paint.class).color() + field4w.getAnnotation(Paint.class).style() + field4w.invoke(week));
            } else if (week.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(week.getClass().getAnnotation(Paint.class).color() + week.getClass().getAnnotation(Paint.class).style() + field4w.invoke(week));
            }
            if (field5w.isAnnotationPresent(Paint.class)) {
                System.out.println(field5w.getAnnotation(Paint.class).style() + field5w.getAnnotation(Paint.class).color()  + field5w.invoke(week));
            } else if (week.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(week.getClass().getAnnotation(Paint.class).color() + week.getClass().getAnnotation(Paint.class).style() + field5w.invoke(week));
            }
            if (field6w.isAnnotationPresent(Paint.class)) {
                System.out.println(field6w.getAnnotation(Paint.class).color() + field6w.getAnnotation(Paint.class).style() + field6w.invoke(week));
            } else if (week.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(week.getClass().getAnnotation(Paint.class).color() + week.getClass().getAnnotation(Paint.class).style() + field6w.invoke(week));
            }
            if (field7w.isAnnotationPresent(Paint.class)) {
                System.out.println(field7w.getAnnotation(Paint.class).color() + field7w.getAnnotation(Paint.class).style() + field7w.invoke(week));
            } else if (week.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(week.getClass().getAnnotation(Paint.class).color() + week.getClass().getAnnotation(Paint.class).style() + field7w.invoke(week));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

}
}
