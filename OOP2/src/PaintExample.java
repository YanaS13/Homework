import java.util.Scanner;
public  class PaintExample {
   public static void main(String[] args){
       Rectangle r = new Rectangle();
       System.out.println(FigureUtil.area(r));
       System.out.println(FigureUtil.perimeter(r));
       FigureUtil.draw(r);
       FigureUtil.draw(r, Figure.Color.BLUE);

       Circle c = new Circle();
       System.out.println(FigureUtil.area(c));
       System.out.println(FigureUtil.perimeter(c));
       FigureUtil.draw(c);
       FigureUtil.draw(c, Figure.Color.YELLOW);

       Triangle t = new Triangle();
       System.out.println(FigureUtil.area(t));
       System.out.println(FigureUtil.perimeter(t));
       FigureUtil.draw(t);
       FigureUtil.draw(t, Figure.Color.RED);

       Square s = new Square();
       System.out.println(FigureUtil.area(s));
       System.out.println(FigureUtil.perimeter(s));
       FigureUtil.draw(s);
       FigureUtil.draw(s, Figure.Color.BROWN);

   }
}