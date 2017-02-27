public class Java1053
{
      public static void main (String args[ ])
      {
           Student student1 = new Student("Jessica Schram",17,3.99);
           Student student2 = new Student("John Smith",18,1.21);
           System.out.println(student1);
           System.out.println(student2);
      }
}

class Student

{
      private String name;
      private int age;
      private double gpa;

      pubic Student(String n, int a, double g)
      {
           name = n;
           age = a;
           gpa = g;
      }

}