import java.util.*;


public class Main {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    
      String str = scanner.nextLine();
     
      
      StringTokenizer s = new StringTokenizer(str, " ");
      
      System.out.print(s.countTokens());
  }
}
