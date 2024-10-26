public class StackArrayMain{
   public static void main(String... args){
      StackArray s = new StackArray();
      
      s.push("21");
      s.push("10");
      s.display();
      System.out.println(s.pop() + " popped from stack");
      
   }
}