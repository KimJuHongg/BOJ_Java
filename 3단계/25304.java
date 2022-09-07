import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = sc.nextInt();
    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {
      int price = sc.nextInt();
      int a = sc.nextInt();

      sum = sum - (price * a);
    }
    if (sum == 0)
      System.out.println("Yes");
    else
      System.out.println("No");
    }
}
