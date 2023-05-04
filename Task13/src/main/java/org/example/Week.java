package org.example;

@Paint(color = "\u001B[35m", style = "\033[4m")
public class Week {

    @Paint(color = "\u001B[96m", style = "\033[4m")
    public String monday() {return "Понедельник";}

    public String tuesday() {return "Вторник";}
    @Paint(color = "\u001B[32m", style = "\033[4m")
    public String wednesday() {return "Среда";}
    @Paint(color = "\u001B[36m", style = "\033[1m")
    public String thursday() {return "Четверг";}
    @Paint(color = "\u001B[31m", style = "\033[3m")
    public String friday() {return "Пятница";}
    @Paint(color = "\u001B[33m", style = "\033[1m")
    public String saturday() {return "Суббота";}
    @Paint(color = "\u001B[37m", style = "\033[9m")
    public String sunday() {return "Воскресенье";}


}
