import java.util.*;
//COUNT
class stmethods
 {
   public static void main(String[] args) 
{
      // creating string tokenizer
      StringTokenizer st = new StringTokenizer("Tutorialspoint is the best site");
      // counting tokens
      System.out.println("Total tokens : " + st.countTokens());       
 //has more elements  
// creating string tokenizer
      StringTokenizer s = new StringTokenizer("Come to learn");

      // checking elements
      while (s.hasMoreElements()) {
         System.out.println("Next element : " + s.nextElement());    
      }
//
}
}