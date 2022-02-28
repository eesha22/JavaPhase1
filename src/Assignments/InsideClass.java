package Assignments;
class Outer_Demo {
  
   private int num = 175;  
   
   public class Inner_Demo {
      public int number() {
         System.out.println("This is the getnum method of the inner class");
         return num;
      }
   }
}

public class InsideClass {

   public static void main(String args[]) {	      
      Outer_Demo outer = new Outer_Demo();
      Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
      System.out.println(inner.number());
   }
}
