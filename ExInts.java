import java.util.ArrayList;

public class ExInts{
   public static void main (String [] args){
      //declare the array
      
      //add some elements
      //what we can do (auto-boxing, unboxing)
      
      //display
      System.out.println("our data: " );
      
      //add them up
      int sum = 0;

       
      //display sum   
      System.out.println("sum = " + sum);      
      
      
      
      //what is actually happening
      ArrayList <Integer> nums2 = new ArrayList <Integer> ();
      nums2.add(new Integer(100));//the explicit 'boxing' or wrapping
      nums2.add(new Integer(95));
      
      int sum2 = 0;
      for(int i = 0; i<nums2.size(); i++)
         sum2+=nums2.get(i).intValue(); //the explicit 'unboxing'
         
      System.out.println("the sum is: " + sum2);
   }
}