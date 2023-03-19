public class Triangle extends Figure implements Drawable {

    public  Triangle(){
        Point.x0 = 1;
        Point.y0 = 0;
        Point.x1 = 4;
        Point.y1 = 8;
        Point.x2 = 5;
        Point.y2 = 6;
    }
    public double area(){

        double s = Math.abs((Point.x1 - Point.x0)*(Point.y2 - Point.y0) - (Point.x2 - Point.x0)* (Point.y1 - Point.y0))/2;
        return s;
    }
    public double perimeter(){
        double ab = Math.sqrt((Point.x1 - Point.x0)*(Point.x1 - Point.x0) + (Point.y1 - Point.y0)*(Point.y1 - Point.y0));
        double ac = Math.sqrt((Point.x2 - Point.x0)*(Point.x2 - Point.x0) + (Point.y2 - Point.y0)*(Point.y2 - Point.y0));
        double cb = Math.sqrt((Point.x2 - Point.x1)*(Point.x2 - Point.x1) + (Point.y2 - Point.y1)*(Point.y2 - Point.y1));
        double per = ab + ac + cb;
        return per;
    }
    public String draw(){
        String a = (" треугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1 + ", y2 = "+ Point.y2  );
        return a;
    }
    public String draw(Color color){
        String a2 = " ";
        if (color == Color.WHITE) {
            a2 = ("Нарисован белый треугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        } else if (color == Color.BLUE) {
            a2 = ("Нарисован синий треугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        } else if (color == Color.BROWN) {
            a2 = ("Нарисован коричневый треугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        }else if (color == Color.GREEN) {
            a2 = ("Нарисован зеленый треугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        } else if (color == Color.YELLOW) {
            a2 = ("Нарисован желтый треугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        }else if (color == Color.RED) {
            a2 = ("Нарисован красный треугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        }
        return a2;
    }
}
