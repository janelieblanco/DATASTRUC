import java.util.*;

public class MainQueueNode
{
   public static void main (String[] args)
   {
      String userChoice = " ";
      Scanner scan = new Scanner(System.in);
      QueueNode qn = new QueueNode();
      
      while(true){
         System.out.println();
         System.out.println("------ QUEUE NODE MENU ------");
         System.out.println("1] Enqueue\n2] Dequeue\n3] Get First\n4] Get Last\n5] Display Queue\nX] Exit Program");
         System.out.print("Please select a choice: ");
         userChoice = scan.nextLine();
                         
         switch(userChoice){
            case "1": //enqueue
               System.out.print("Enter item to be enqueued: ");
               String item = scan.nextLine().trim();
               if (qn.enqueue(item)){
                  System.out.println(item + " has been added");
               } else {
                  System.out.println("Queue is Empty!");
               }
               break;
          
            case "2": //dequeue
               if(qn.dequeue())
                  System.out.println("Dequeued successfully!");
               else 
                  System.out.println("Queue is Empty! There is no element to be dequeued.");
               break;
               
            case "3": //getting the first node
               if(qn.getFirst() == null){
                  System.out.println("Queue is empty!");
               } else {
                  System.out.println(qn.getFirst() + " is the First Node");
               }
               break;

            case "4": //getting the last node
               if(qn.getLast() == null){
                  System.out.println("Queue is empty!");
               } else {
                  System.out.println(qn.getLast() + " is the Last Node");
               }
               break;
               
            case "5": //display the queue
               qn.display();
               break;
            case "x":
            case "X":
               System.out.println("Thank you for using!");
               System.out.println("Exiting...");
               System.exit(0);
               
            default:
               System.out.println("Invalid input. Please try again");
               break;
         }
      }
   }
}