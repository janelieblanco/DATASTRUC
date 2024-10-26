import java.util.*;

public class TestStackArray{
   public static void main(String... args){
      StackArray sa = new StackArray();
      sa.push("Janelie");
      sa.push("Sayson");
      sa.push("Blanco");
      sa.push("Maine");
      sa.push("Sung jin woo");
      sa.push("uwu");
      sa.push("Arigato");
      sa.push("Leopard");
      sa.push("Nelly");
      sa.push("Nelstzy");
      
      System.out.println(sa.peek());
      System.out.println();
      
      sa.display();
   }
}
