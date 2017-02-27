import java.applet.*;
import java.awt.*;
public class ExampleFillScreenObject extends Applet{
   public void paint(Graphics g){
      Point[] points = new Point[1000*650];
      int count=0;
      
      for(int row = 0;row<650;row++){
         for(int col=0;col<1000;col++){
         points[count]=new Point(col, row);
         points[count].draw(g);
         count++;
         }
      }
   }
}
class Point {
   private int x, y;
   public Point(int x, int y){
      this.x =x;this.y=y;
   }
   public void draw(Graphics g){
      g.setColor(new Color((int)Math.random()*255,(int)Math.random()*255,(int)Math.random()*255));
      g.fillOval(x,y,1,1);
   }
}