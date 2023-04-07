package org.example;

import java.time.LocalTime;

public class Time implements Command{

    public String execute(){
        LocalTime time = LocalTime.now();
        String time1 = String.valueOf(time);
        return time1;
    }
}
