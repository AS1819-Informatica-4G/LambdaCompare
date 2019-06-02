 
import java.util.*;
 
public class LambdaDemo {
 
   public static void main(String[] args) {
 
      List strings = Arrays.asList("proviamo ", "le ", "espressioni ", "lambda");
 
      for (int i = 0; i < strings.size(); i++) {
         System.out.print(strings.get(i));
      }
   }
}
