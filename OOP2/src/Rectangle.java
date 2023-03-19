public class Rectangle extends Figure implements Drawable {

    public  Rectangle(){
        Point.x0 = 1;
        Point.y0 = 1;
        Point.x1 = 5;
        Point.y1 = 6;
        Point.x2 = 7;
        Point.y2 = 8;
    }
    public double area(){
        double ab = Math.sqrt((Point.x1 - Point.x0)*(Point.x1 - Point.x0) + (Point.y1 - Point.y0)*(Point.y1 - Point.y0));
        double ac = Math.sqrt((Point.x2 - Point.x0)*(Point.x2 - Point.x0) + (Point.y2 - Point.y0)*(Point.y2 - Point.y0));
        double s = ab*ac;
        return s;
    }
    public double perimeter(){
        double ab = Math.sqrt((Point.x1 - Point.x0)*(Point.x1 - Point.x0) + (Point.y1 - Point.y0)*(Point.y1 - Point.y0));
        double ac = Math.sqrt((Point.x2 - Point.x0)*(Point.x2 - Point.x0) + (Point.y2 - Point.y0)*(Point.y2 - Point.y0));
        double per = (ab + ac)*2;
        return per;
    }
    public String draw(){
        String a = (" прямоугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        return a;
    }
    public String draw(Color color){
        String a2 = " ";
        if (color == Color.WHITE) {
            a2 = ("Нарисован белый прямоугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  +  " и y0 = " + Point.y0 + ", y1 = "+ Point.y1 + ", y2 = "+ Point.y2 );
        } else if (color == Color.BLUE) {
            a2 = ("Нарисован синий прямоугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  +  " и y0 = " + Point.y0 + ", y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        } else if (color == Color.BROWN) {
            a2 = ("Нарисован коричневый прямоугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  +  " и y0 = " + Point.y0 + ", y1 = "+ Point.y1+ ", y2 = "+ Point.y2 );
        }else if (color == Color.GREEN) {
            a2 = ("Нарисован зеленый прямоугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  +  " и y0 = " + Point.y0 + ", y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        } else if (color == Color.YELLOW) {
            a2 = ("Нарисован желтый прямоугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  +  " и y0 = " + Point.y0 + ", y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        }else if (color == Color.RED) {
            a2 = ("Нарисован красный прямоугольник с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + ", x2 = "+ Point.x2  +  " и y0 = " + Point.y0 + ", y1 = "+ Point.y1 + ", y2 = "+ Point.y2);
        }
        return a2;
    }
}
