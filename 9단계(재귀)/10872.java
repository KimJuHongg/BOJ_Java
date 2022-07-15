import java.util.*;

class Main {
  public static int Factorial(int n) {
    int sum = 1;
    if (n == 0) return 1;
    for(int i = 1; i <= n; i++) {
      sum *= i;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

      System.out.println(Factorial(num));

  }
}
