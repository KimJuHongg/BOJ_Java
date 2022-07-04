import java.util.*;

class Main {
  public static void main(String[] args) {
    double a,b;
    Scanner scanner = new Scanner(System.in);
    a = scanner.nextInt();
    b = scanner.nextInt();
    System.out.print(String.format("%.9f", a/b));
  }
}
