package org.example;

import java.time.LocalDate;

public class Data implements Command{
    public String execute(){
        LocalDate data = LocalDate.now();
        String data1 = String.valueOf(data);
        return data1;
    }

}
