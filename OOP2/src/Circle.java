public  class Circle extends Figure implements Drawable {

    public  Circle(){
        Point.x0 = 3;
        Point.y0 = 2;
        Point.r = 3;
    }

    public double area(){
        double s = 3.14*Point.r*Point.r;
        return s;
    }
    public double perimeter(){
        double per = 2* 3.14*Point.r;
        return per;
    }
    public String draw(){
        String a = (" круг с координатами x = " + Point.x0 + " , y = " + Point.y0 + " и радиусом r = "+ Point.r );
        return a;
    }
    public String draw(Color color){
        String a2 = " ";
        if (color == Color.WHITE) {
             a2 = "Нарисован белый круг с координатамис x =  " + Point.x0 + " и y = " + Point.y0 + " и радиусом r = "+ Point.r ;
        } else if (color == Color.BLUE) {
            a2 = "Нарисован синий круг с координатами x = " + Point.x0 + " и y = " + Point.y0 + " и радиусом r = "+ Point.r ;
        } else if (color == Color.BROWN) {
            a2 = "Нарисован коричневый круг с координатами x = " + Point.x0 + " и y = " + Point.y0 + " и радиусом r = "+ Point.r ;
        }else if (color == Color.GREEN) {
            a2 = "Нарисован зеленый круг с координатами x = " + Point.x0 + " и y = " + Point.y0 + " и радиусом r = "+ Point.r ;
        } else if (color == Color.YELLOW) {
            a2 = "Нарисован желтый круг с координатами x = " + Point.x0 + " и y = " + Point.y0 + " и радиусом r = "+ Point.r ;
        }else if (color == Color.RED) {
            a2 = "Нарисован красный круг с координатами x = " + Point.x0 + " и  y = " + Point.y0 + " и радиусом r = "+ Point.r ;
        }
        return a2;
    }
}