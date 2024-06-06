import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Emily", "Michael");
        
      
        System.out.println("Recorrer la lista usando stream:");
        names.stream().forEach(System.out::println);
    }
}

