import java.util.*;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();

      if ( a == b && b == c)
        System.out.print(10000 + a*1000);
      else if ( a == b || a == c)
        System.out.print(1000 + a*100);
      else if ( b == c)
        System.out.print(1000 + b*100);
      else
        System.out.print((Math.max(Math.max(a, b), c)*100));
  }
}
