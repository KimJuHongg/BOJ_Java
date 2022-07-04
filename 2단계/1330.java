import java.util.*;

class Main {
  public static void main(String[] args) {
    int a, b;
    Scanner scanner = new Scanner(System.in);

    a = scanner.nextInt();
    b = scanner.nextInt();

    if (a > b)
      System.out.print(">");
    else if (a == b)
      System.out.print("==");
    else
      System.out.print("<");
  }
}
