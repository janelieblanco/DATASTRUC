import java.util.*;

public class QueueArrayMenu
{
   public static void main (String[] args)
   {
      String userChoice = " ";
      Scanner scan = new Scanner(System.in);
      QueueArray qa;
      
      System.out.print("Enter size: ");
      int size = scan.nextInt();
      qa = new QueueArray(size);
      scan.nextLine();
      
      if (size <= 0)
         System.out.println("Size is being set to 10");
         
      while(true){
         System.out.println();
         System.out.println("------ QUEUE ARRAY MENU ------");
         System.out.println("1] Enqueue\n2] Dequeue\n3] Front\n4] Display Queue\nX] Exit Program");
         System.out.print("Please select a choice: ");
         userChoice = scan.nextLine();
                         
         switch(userChoice){
            case "1": //enqueue
               System.out.print("Enter item to be enqueued: ");
               String item = scan.nextLine().trim();
               if (qa.enqueue(item)){
                  System.out.println(item + " has been added");
               } else {
                  System.out.println("Queue is Full!");
               }
               break;
          
            case "2": //dequeue
               if(qa.dequeue())
                  System.out.println("Dequeued successfully!");
               else 
                  System.out.println("Queue is Empty!");
               break;
               
            case "3": //front
               if(qa.front() == null){
                  System.out.println("Queue is empty!");
               } else {
                  System.out.println(qa.front() + " is the front");
               }
               break;
               
            case "4": //display the queue
               qa.display();
               break;
            case "x":
            case "X":
               System.out.println("The program has stopped.");
               System.exit(0);
               
            default:
               System.out.println("Invalid input. Please try again");
               break;
         }
      }
   }
}
