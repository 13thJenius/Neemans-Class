import java.util.ArrayList;

public class ExString{
   public static void main (String [] args){
   ArrayList<String> names = new ArrayList<String>();
      
      //add some elements
      names.add("Joe");
      
      
      //direct access using get() method
      System.out.println("direct access using get() method:  "+ names.get(0));
      
      //print using for (and size() method)
      System.out.print("Printing using 'for' loop:  ");

         
      //print using enhanced for
      System.out.print("\nPrinting using 'for-each' loop:  ");

         
      
      //print using built in toString method!!
      System.out.print("\nPrinting using built in toString():  ");

         
      //other methods - set(), add() overloaded, remove()


   }
}