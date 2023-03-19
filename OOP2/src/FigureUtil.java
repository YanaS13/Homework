public class FigureUtil {
    private FigureUtil() {
    }
    public static double area(Figure figure){
        double s = figure.area();
        return s;
    }
    public static double perimeter(Figure figure){
        double per = figure.perimeter();
        return per;
    }
    public static void draw(Drawable figure){
        String a = figure.draw();
        System.out.println("нарисован черный " + a);
    }
    public static void draw(Drawable figure, Figure.Color color){
        String aa = figure.draw(color);
        System.out.println(aa);
    }
}