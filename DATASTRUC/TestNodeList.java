public class TestNodeList
{
   public static void main(String...args){
      NodeList list = new NodeList();
      Node newNode1 = new Node();
      Node newNode2 = new Node();
      Node newNode3 = new Node();
      
      newNode1.data = "Janelie";
      newNode2.data = "Sayson";
      newNode3.data = "Blanco";
      System.out.println(list.isEmpty());
      
      list.add(newNode1);
      list.add(newNode2);
      list.add(newNode3);
      list.display();
      
      System.out.println(list.isEmpty());
      list.delete(2);
      list.display();
      
      System.out.println(list.isEmpty());
      list.delete(1);
      list.display();
   }
}