import java.util.*;

class Main {
  public static int Fibo(int n) {
    if( n <= 1 )
      return n;
    else
      return Fibo(n-2) + Fibo(n-1);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    System.out.println(Fibo(num));

  }
}
