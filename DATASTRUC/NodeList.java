public class NodeList
{
   Node head;
   Node tail;
   int counter;
   
   public NodeList()
   {
      head = null;
      tail = null;
      counter = 0;
   }
   
   public boolean add (Node item)
   {
      Node newNode = item;
      
      if (head == null)
      {
         newNode.previous = null;
         head = newNode;
         tail = newNode;
      } else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      counter++;
      
      return true;
   }
   
   public boolean delete(int location)
   {
      Node current;
      int currentIndex = 0;
      
      if (isEmpty()){
         return false;
      } else {
         current = head;
         while (current != null && currentIndex < location){
            current = current.next;
            currentIndex++;
         }
      }
      if (current == null)
         return false;
      if (current == head){
         head = head.next; //moves head to the next node
         if (head != null)
            head.previous = null; //update previous of new head
         else 
            tail = null; // if the list becomes empty
      } else if (current == tail){
         tail = tail.previous;
         tail.next = null; //remove the last node
      } else {
         current.previous.next = current.next;
         current.next.previous = current.previous;
      }
      --counter;
      
      return true;
   }
   
   public boolean isEmpty()
   {
      return head == null;
   }
   
   public void display()
   {
      if (isEmpty()){
         System.out.println("List is empty!");
         return;
      }
      
      Node current = head;
      while (current != null){
         System.out.println(current.data + " ");
         current = current.next;
      }
      
      System.out.println(); //print new line after display
   }
   
}
   