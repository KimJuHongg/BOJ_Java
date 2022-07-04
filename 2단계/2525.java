import java.util.*;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();

      int i = a * 60 + b + c;
      a = i / 60;
      b = i % 60;

      if ( a >= 24)
        a = a - 24;
      System.out.print(a + " " + b);
      
  }
}
