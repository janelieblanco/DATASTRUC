/*This is the class of my MainStackMenu*/
public class ClassStackMenu{
   private String[] sm;
   private int count;
   
   public ClassStackMenu(int size){
      if (size <= 0)
         sm = new String[10];
      else
         sm = new String[size];
         count = 0;
   }
   public ClassStackMenu(){
      this(10);
   }
   private boolean isEmpty(){
      return count == 0;
   }
   private boolean isFull(){
      return count == sm.length;
   }
   public boolean push(String val){
      if(!isFull()){
         sm[count++] = val;
         return true;
      } 
      return false;  
   }
   public boolean pop(){
      if(!isEmpty()){
         sm[count - 1] = null;
         count--;
         return true;
      }
       return false; 
   }
   public String peek(){
      if(!isEmpty()){
         return sm[count-1];
      }
      return null;
   }
   public void display(){
      if(!isEmpty()){
         for(int i = count - 1; i >= 0; i--){
            System.out.println("[" + sm[i] + "]");
         }
      } else 
         System.out.println("Stack is empty");
   }
}