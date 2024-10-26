import java.util.Stack;
public class InfixtoPostfix
{
   private String infix;
   
   public InfixtoPostfix(String i){
      infix = i;
   }
   
   private int getPrec(String operator)
   {
      if (operator.equals("*") || operator.equals("/"))
         return 2;
         
      if (operator.equals("+") || operator.equals("-"))
         return 1;
         
      return -1;
   }    
   
   public String convert()
   {
      Stack<String> s = new Stack<>();
      String result = "";
      
      for (int i = 0; i < infix.length(); i++)
      {
         char c = infix.charAt(i);
         
         if (Character.isDigit(c)){
            result = result + c;
         } else if (c == '('){ //corrected c + ""
            s.push(String.valueOf(c));
         } else if (c == ')') {
            while (!s.isEmpty() && !s.peek().equals("(")){
               result = result + s.pop();
            }
            s.pop();
         } else {
            while (!s.isEmpty() && (getPrec(String.valueOf(c)) <= getPrec(s.peek()))) {
                    result += s.pop();
            }
            s.push(String.valueOf(c));
         }
      }
      
      while (!s.isEmpty()){
        result = result + s.pop();
      }
      return result; 
   }
}

