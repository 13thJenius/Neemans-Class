import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class JadenStatsLab{
public static void main(String []args){
  Scanner myScan = new Scanner(System.in);
  int number = myScan.nextInt();
  Statistics Stats = new Statistics(number);
  System.out.println("Mean = " + Stats.calcMean(number));
  System.out.println("Max = " + Stats.calcMax()+ "\nMin = " + Stats.calcMin());
  Stats.calcRange();Stats.meanWithoutMin(number);
  
}
}
class Statistics{
  ArrayList<Integer> nums;
  private Random myRand;
  public Statistics(int quantity){
    nums = new ArrayList<Integer>();
    myRand = new Random();
    createRandomArray(quantity);
    displayArray();
  }
  int calcMean(int numberOfValues){
   int sum = 0;
   for (int val:nums)
      sum+=val;
   return sum/numberOfValues;
   
  }
  int calcMax(){
     int max = 0;
     for (int val:nums)
         max = Math.max(val, max);
      return max;
  }
  int calcMin(){
     int min = 100;
     for (int val:nums)
         min = Math.min(val, min);
      return min;
  }
  void calcRange(){
     int range = this.calcMax() - this.calcMin();
     System.out.println("Range = " + range);
  }
  private void createRandomArray(int quantity){
    for (int i =0;i<quantity;i++)
       nums.add(myRand.nextInt(100));
  }
  void displayArray(){
    String go = "Values are:";
    for (int val:nums)
      go += " "+val;
    System.out.println(go);
  }
  void meanWithoutMin(int numVal){
   int sum = 0;
   for (int val:nums)
      sum+=val;
   sum -= this.calcMin();
   numVal--;
   System.out.println("Mean without Min = " + sum/numVal);
  }
}
