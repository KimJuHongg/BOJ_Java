import java.util.*;


public class Main {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      int a_r = (a / 100) + ((a % 100) / 10) * 10 + (a % 10) * 100;
      int b_r = (b / 100) + ((b % 100) / 10) * 10 + (b % 10) * 100;
      System.out.print(Math.max(a_r, b_r));
  }
}
