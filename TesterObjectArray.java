import java.awt.*;
import java.applet.*;

public class TesterObjectArray extends Applet{
   public void init(){
      //construct each object in the array
      for(int i =0, i<shapes.length; i++)
         shapes[i] = new Ball();
   }
   public void paint(Graphics g){
      //declare the array
      Ball [] shapes = new Ball[10];
      
      
      
         
      //draw
      
      
   }//close paint
   
   public static void delay (int n){
   	try{Thread.sleep(n);}
   	catch (InterruptedException e){}
   }//close delay
   
}//close class

class Ball{
   //attributes
   //color or velocity?
   private int x, y, size, xv, yv;
   
   public Ball(){
      //random size, position is random on screen
      size = (int)(Math.random()*41)+10;
      x = (int)(Math.random()*(1000-size));
      y = (int)(Math.random()*(650-size));
      xv = (int)(Math.random()*11) -5;
   }//close constructor

   public void draw(Graphics g){
      g.setColor(Color.black);
      g.fillOval(x, y, size, size);
   }//close draw
   
   //move method?
   
}//close class