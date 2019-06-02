import java.util.*;
import java.util.function.Consumer;
 
public class LambdaDemo3 {
 
   public static void main(String[] args) {
 
	   List<String> strings = Arrays.asList("proviamo ", "le ", "espressioni ", "lambda"); 

     /**
       *  forEach() è un metodo esposto dall'interfaccia Iterable (implementata da varie collection)
       *  l'implementazione di default è:
       *    default void forEach(Consumer<? super T> action) {
       *            Objects.requireNonNull(action);
       *            for (T t : this) {
       *            	action.accept(t);
       *            }
       *    }
       *    Ovvero esegue il metodo accept su tutti gli elementi della lista, 
       *    il codice del metodo accept si trova nel'oggetto che estende consumer
       *    passato a forEach().
       *    Poichè il metodo accept modificato mi serve solo qui uso una classe anonima
       */
      
      class MyConsumer implements Consumer<String>{
    	 @Override
         public void accept(String s) {
            System.out.print(s);
         }
      }; 
      MyConsumer c=new MyConsumer();
      strings.forEach(c);
      
      
      /* 
       * o anche: 
       */
      System.out.println("\no anche");
      
      Consumer<String> cons = new Consumer<String>() {
    	 @Override
         public void accept(String s) {
            System.out.print(s);
         }
      };
      strings.forEach(cons);
      
      
      
      /* 
       * o anche: 
       */
      System.out.println("\no anche");
      strings.forEach(new Consumer<String>() {
    	 @Override
         public void accept(String s) {
            System.out.print(s);
         }
      });
      
      /* 
       * o anche: 
       */
      System.out.println("\no anche");
      strings.forEach(s->System.out.print(s));
   }
}