package org.example;

public class Multiplication2Numbers {
    public Integer umn(int a, int b) throws MultiplicationException{
        if (a % 2 != 0 || b % 2 != 0){
            throw new MultiplicationException("Одно из чисел нечетное");
        }
        return a*b;
    }
}
