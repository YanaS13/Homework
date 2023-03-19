public class Square extends Figure implements Drawable {

    public  Square(){
        Point.x0 = 0;
        Point.y0 = 2;
        Point.x1 = 5;
        Point.y1 = 4;
    }
    public double area(){
        double aa = Math.sqrt((Point.x1 - Point.x0)*(Point.x1 - Point.x0) + (Point.y1 - Point.y0)*(Point.y1 - Point.y0));
        double s = aa*aa;
        return s;
    }
    public double perimeter(){
        double per = (4*Math.sqrt((Point.x1 - Point.x0)*(Point.x1 - Point.x0) + (Point.y1 - Point.y0)*(Point.y1 - Point.y0)));
        return per;
    }
    public String draw(){
        String a = (" квадрат с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1 );
        return a;
    }
    public String draw(Color color){
        String a2 = " ";
        if (color == Color.WHITE) {
            a2 = ("Нарисован белый квадрат с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1);
        } else if (color == Color.BLUE) {
            a2 = ("Нарисован синий квадрат с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1);
        } else if (color == Color.BROWN) {
            a2 = ("Нарисован коричневый квадрат с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1);
        }else if (color == Color.GREEN) {
            a2 = ("Нарисован зеленый квадрат с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1);
        } else if (color == Color.YELLOW) {
            a2 = ("Нарисован желтый квадрат с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1);
        }else if (color == Color.RED) {
            a2 = ("Нарисован красный квадрат с координатами x0 = " + Point.x0 + ", x1 = "+ Point.x1  + " и y0 = " + Point.y0 + " y1 = "+ Point.y1);
        }
        return a2;
    }
}